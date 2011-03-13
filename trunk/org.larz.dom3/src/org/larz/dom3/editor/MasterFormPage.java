/* This file is part of dom3Editor.
 *
 * dom3Editor is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * dom3Editor is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with dom3Editor.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.larz.dom3.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.events.ExpansionAdapter;
import org.eclipse.ui.forms.events.ExpansionEvent;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.larz.dom3.Activator;
import org.larz.dom3.dm.dm.Dom3Mod;
import org.larz.dom3.dm.ui.editor.DmXtextEditor;
import org.larz.dom3.dm.ui.internal.DmActivator;
import org.larz.dom3.image.ImageConverter;
import org.larz.dom3.image.ImageLoader;


public class MasterFormPage extends FormPage {
	public SummaryList block;
	private XtextEditor doc;
	
	enum General {
		MODNAME(Messages.getString("ScrolledPropertiesBlock.modname")), 
		ICON(Messages.getString("ScrolledPropertiesBlock.icon")), 
		VERSION(Messages.getString("ScrolledPropertiesBlock.version")), 
		DOMVERSION(Messages.getString("ScrolledPropertiesBlock.domversion"));
		private String label;
		General (String label) {
			this.label = label;
		}
	}
	
	/**
	 * @param editor
	 * @param doc
	 */
	public MasterFormPage(FormEditor editor, XtextEditor doc) {
		super(editor, "MasterDetails", Messages.getString("MasterDetailsPage.details.label")); //$NON-NLS-1$ //$NON-NLS-2$
		block = new SummaryList(this, doc);
		this.doc = doc;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.editor.FormPage#createFormContent(org.eclipse.ui.forms.IManagedForm)
	 */
	protected void createFormContent(final IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		form.setText(Messages.getString("MasterDetailsPage.title")); //$NON-NLS-1$
		form.setBackgroundImage(Activator.getImageDescriptor("icons/form_banner.gif").createImage());
		FormToolkit toolkit = managedForm.getToolkit();
		
		Section expandable = toolkit.createSection(form.getBody(), Section.TWISTIE|Section.TITLE_BAR|Section.EXPANDED);
		expandable.setText(Messages.getString("MasterDetailsPage.general.title"));
		expandable.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false));
		expandable.addExpansionListener(new ExpansionAdapter() {
			public void expansionStateChanged(ExpansionEvent e) {
				form.reflow(true);
			}
		});
		
		Composite header1 = toolkit.createComposite(expandable);
		header1.setLayout(new GridLayout(2, true));

		Composite header = toolkit.createComposite(header1);
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		header.setLayout(layout);
		expandable.setClient(header1);
		expandable.setExpanded(false);
		
		
		for (final General general : General.values()) {
			toolkit.createLabel(header, general.label); //$NON-NLS-1$
			
			final Text modname = toolkit.createText(header, getGeneral(general, doc), SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
			modname.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					setGeneral(general, doc, modname.getText());
				}			
			});
			modname.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.character == '\r') {
						setGeneral(general, doc, modname.getText());
					}
				}
			});
			GridData data = new GridData(SWT.FILL, SWT.FILL, true, true);
			data.widthHint = 400;
			modname.setLayoutData(data);
		}
		
		String iconPath = getGeneral(General.ICON, doc);
		
		String path = ((DmXtextEditor)doc).getPath();
		path = path.substring(0, path.lastIndexOf('/')+1);
		if (iconPath.startsWith("./")) {
			iconPath = iconPath.substring(2);
		}
		path += iconPath;
		
		final File file = new File(path);
		
		try {
			ImageLoader loader = new ImageLoader() {
				@Override
				public InputStream getStream() throws IOException {
					return new FileInputStream(file);
				}
			};
			Image image = new Image(null, ImageConverter.convertToSWT(loader.loadImage()));
			Label label = toolkit.createLabel(header1, "");
			
			label.setImage(image);			
		} catch (Exception e) {
			e.printStackTrace();
		}

		block.createContent(managedForm);
	}
	
	private String getGeneral(final General general, XtextEditor editor) {
		final IXtextDocument myDocument = editor.getDocument();
		return myDocument.readOnly( new IUnitOfWork<String, XtextResource>() {
			@Override
			public String exec(XtextResource state) throws Exception {
				Dom3Mod dom3Mod = (Dom3Mod)state.getContents().get(0);
				switch (general) {
				case MODNAME:
					return dom3Mod.getModname();
				case ICON:
					return dom3Mod.getIcon();
				case VERSION:
					return dom3Mod.getVersion();
				case DOMVERSION:
					return dom3Mod.getDomversion();
				}
				return null;
			}   
		});
	}
	
	private void setGeneral(final General general, final XtextEditor editor, final String newName) {
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				switch (general) {
				case MODNAME:
					dom3Mod.setModname(newName);
					break;
				case ICON:
					dom3Mod.setIcon(newName);
					break;
				case VERSION:
					dom3Mod.setVersion(newName);
					break;
				case DOMVERSION:
					dom3Mod.setDomversion(newName);
					break;
				}
			}  
		}, myDocument);
	}


}