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
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
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
	
	enum General2 {
		POPPERGOLD(Messages.getString("ScrolledPropertiesBlock.poppergold")),
		RESOURCEMULT(Messages.getString("ScrolledPropertiesBlock.resourcemult")),
		SUPPLYMULT(Messages.getString("ScrolledPropertiesBlock.supplymult")),
		UNRESTHALFINC(Messages.getString("ScrolledPropertiesBlock.unresthalfinc")),
		UNRESTHALFRES(Messages.getString("ScrolledPropertiesBlock.unresthalfres")),
		EVENTISRARE(Messages.getString("ScrolledPropertiesBlock.eventisrare")),
		TURMOILINCOME(Messages.getString("ScrolledPropertiesBlock.turmoilincome")),
		TURMOILEVENTS(Messages.getString("ScrolledPropertiesBlock.turmoilevents")),
		DEATHINCOME(Messages.getString("ScrolledPropertiesBlock.deathincome")),
		DEATHSUPPLY(Messages.getString("ScrolledPropertiesBlock.deathsupply")),
		DEATHDEATH(Messages.getString("ScrolledPropertiesBlock.deathdeath")),
		SLOTHINCOME(Messages.getString("ScrolledPropertiesBlock.slothincome")),
		SLOTHRESOURCES(Messages.getString("ScrolledPropertiesBlock.slothresources")),
		COLDINCOME(Messages.getString("ScrolledPropertiesBlock.coldincome")),
		COLDSUPPLY(Messages.getString("ScrolledPropertiesBlock.coldsupply")),
		MISFORTUNE(Messages.getString("ScrolledPropertiesBlock.misfortune")),
		LUCKEVENTS(Messages.getString("ScrolledPropertiesBlock.luckevents")),
		RESEARCHSCALE(Messages.getString("ScrolledPropertiesBlock.researchscale"));
		
		private String label;
		General2 (String label) {
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
		
		Composite general2Comp = toolkit.createComposite(header1);
		layout = new GridLayout(12, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		general2Comp.setLayout(layout);
		GridData gd = new GridData(SWT.FILL, SWT.FILL, true, true);
		gd.horizontalSpan = 2;
		general2Comp.setLayoutData(gd);
		
		for (final General2 general2 : General2.values()) {
			final Button check = toolkit.createButton(general2Comp, general2.label, SWT.CHECK);

			final Text modname = toolkit.createText(general2Comp, getGeneral2(general2, doc) != null ? getGeneral2(general2, doc).toString() : null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
			modname.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					setGeneral2(general2, doc, modname.getText());
				}			
			});
			modname.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.character == '\r') {
						setGeneral2(general2, doc, modname.getText());
					}
				}
			});
			GridData data = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
			data.widthHint = 30;
			modname.setLayoutData(data);
			if (getGeneral2(general2, doc) == null) {
				modname.setEnabled(false);
			}
			
			check.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (check.getSelection()) {
						setGeneral2(general2, doc, "10");
						modname.setEnabled(true);
						modname.setText("10");
					} else {
						removeInst2(general2, doc);
						modname.setEnabled(false);
						modname.setText("");
					}
				}

			});

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
	
	private Integer getGeneral2(final General2 general, XtextEditor editor) {
		final IXtextDocument myDocument = editor.getDocument();
		return myDocument.readOnly( new IUnitOfWork<Integer, XtextResource>() {
			@Override
			public Integer exec(XtextResource state) throws Exception {
				Dom3Mod dom3Mod = (Dom3Mod)state.getContents().get(0);
				switch (general) {
				case POPPERGOLD:
					return dom3Mod.getPoppergold() != 0 ? Integer.valueOf(dom3Mod.getPoppergold()) : null;
				case RESOURCEMULT:
					return dom3Mod.getResourcemult() != 0 ? Integer.valueOf(dom3Mod.getResourcemult()) : null;
				case SUPPLYMULT:
					return dom3Mod.getSupplymult() != 0 ? Integer.valueOf(dom3Mod.getSupplymult()) : null;
				case UNRESTHALFINC:
					return dom3Mod.getUnresthalfinc() != 0 ? Integer.valueOf(dom3Mod.getUnresthalfinc()) : null;
				case UNRESTHALFRES:
					return dom3Mod.getUnresthalfres() != 0 ? Integer.valueOf(dom3Mod.getUnresthalfres()) : null;
				case EVENTISRARE:
					return dom3Mod.getEventisrare() != 0 ? Integer.valueOf(dom3Mod.getEventisrare()) : null;
				case TURMOILINCOME:
					return dom3Mod.getTurmoilincome() != 0 ? Integer.valueOf(dom3Mod.getTurmoilincome()) : null;
				case TURMOILEVENTS:
					return dom3Mod.getTurmoilevents() != 0 ? Integer.valueOf(dom3Mod.getTurmoilevents()) : null;
				case DEATHINCOME:
					return dom3Mod.getDeathincome() != 0 ? Integer.valueOf(dom3Mod.getDeathincome()) : null;
				case DEATHSUPPLY:
					return dom3Mod.getDeathsupply() != 0 ? Integer.valueOf(dom3Mod.getDeathsupply()) : null;
				case DEATHDEATH:
					return dom3Mod.getDeathdeath() != 0 ? Integer.valueOf(dom3Mod.getDeathdeath()) : null;
				case SLOTHINCOME:
					return dom3Mod.getSlothincome() != 0 ? Integer.valueOf(dom3Mod.getSlothincome()) : null;
				case SLOTHRESOURCES:
					return dom3Mod.getSlothresources() != 0 ? Integer.valueOf(dom3Mod.getSlothresources()) : null;
				case COLDINCOME:
					return dom3Mod.getColdincome() != 0 ? Integer.valueOf(dom3Mod.getColdincome()) : null;
				case COLDSUPPLY:
					return dom3Mod.getColdsupply() != 0 ? Integer.valueOf(dom3Mod.getColdsupply()) : null;
				case MISFORTUNE:
					return dom3Mod.getMisfortune() != 0 ? Integer.valueOf(dom3Mod.getMisfortune()) : null;
				case LUCKEVENTS:
					return dom3Mod.getLuckevents() != 0 ? Integer.valueOf(dom3Mod.getLuckevents()) : null;
				case RESEARCHSCALE:
					return dom3Mod.getResearchscale() != 0 ? Integer.valueOf(dom3Mod.getResearchscale()) : null;
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

	private void setGeneral2(final General2 general2, final XtextEditor editor, final String newName) {
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				switch (general2) {
				case POPPERGOLD:
					dom3Mod.setPoppergold(Integer.parseInt(newName));
					break;
				case RESOURCEMULT:
					dom3Mod.setResourcemult(Integer.parseInt(newName));
					break;
				case SUPPLYMULT:
					dom3Mod.setSupplymult(Integer.parseInt(newName));
					break;
				case UNRESTHALFINC:
					dom3Mod.setUnresthalfinc(Integer.parseInt(newName));
					break;
				case UNRESTHALFRES:
					dom3Mod.setUnresthalfres(Integer.parseInt(newName));
					break;
				case EVENTISRARE:
					dom3Mod.setEventisrare(Integer.parseInt(newName));
					break;
				case TURMOILINCOME:
					dom3Mod.setTurmoilincome(Integer.parseInt(newName));
					break;
				case TURMOILEVENTS:
					dom3Mod.setTurmoilevents(Integer.parseInt(newName));
					break;
				case DEATHINCOME:
					dom3Mod.setDeathincome(Integer.parseInt(newName));
					break;
				case DEATHSUPPLY:
					dom3Mod.setDeathsupply(Integer.parseInt(newName));
					break;
				case DEATHDEATH:
					dom3Mod.setDeathdeath(Integer.parseInt(newName));
					break;
				case SLOTHINCOME:
					dom3Mod.setSlothincome(Integer.parseInt(newName));
					break;
				case SLOTHRESOURCES:
					dom3Mod.setSlothresources(Integer.parseInt(newName));
					break;
				case COLDINCOME:
					dom3Mod.setColdincome(Integer.parseInt(newName));
					break;
				case COLDSUPPLY:
					dom3Mod.setColdsupply(Integer.parseInt(newName));
					break;
				case MISFORTUNE:
					dom3Mod.setMisfortune(Integer.parseInt(newName));
					break;
				case LUCKEVENTS:
					dom3Mod.setLuckevents(Integer.parseInt(newName));
					break;
				case RESEARCHSCALE:
					dom3Mod.setResearchscale(Integer.parseInt(newName));
					break;
				}
			}  
		}, myDocument);
	}
	
	private void removeInst2(final General2 inst2, final XtextEditor editor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				switch (inst2) {
				case POPPERGOLD:
					dom3Mod.setPoppergold(0);
					break;
				case RESOURCEMULT:
					dom3Mod.setResourcemult(0);
					break;
				case SUPPLYMULT:
					dom3Mod.setSupplymult(0);
					break;
				case UNRESTHALFINC:
					dom3Mod.setUnresthalfinc(0);
					break;
				case UNRESTHALFRES:
					dom3Mod.setUnresthalfres(0);
					break;
				case EVENTISRARE:
					dom3Mod.setEventisrare(0);
					break;
				case TURMOILINCOME:
					dom3Mod.setTurmoilincome(0);
					break;
				case TURMOILEVENTS:
					dom3Mod.setTurmoilevents(0);
					break;
				case DEATHINCOME:
					dom3Mod.setDeathincome(0);
					break;
				case DEATHSUPPLY:
					dom3Mod.setDeathsupply(0);
					break;
				case DEATHDEATH:
					dom3Mod.setDeathdeath(0);
					break;
				case SLOTHINCOME:
					dom3Mod.setSlothincome(0);
					break;
				case SLOTHRESOURCES:
					dom3Mod.setSlothresources(0);
					break;
				case COLDINCOME:
					dom3Mod.setColdincome(0);
					break;
				case COLDSUPPLY:
					dom3Mod.setColdsupply(0);
					break;
				case MISFORTUNE:
					dom3Mod.setMisfortune(0);
					break;
				case LUCKEVENTS:
					dom3Mod.setLuckevents(0);
					break;
				case RESEARCHSCALE:
					dom3Mod.setResearchscale(0);
					break;
				}
					
			}  
		},
		myDocument);

	}

}