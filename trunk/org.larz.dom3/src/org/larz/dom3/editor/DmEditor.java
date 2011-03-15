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

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.RegistryFactory;
import org.eclipse.emf.common.ui.viewer.IViewerProvider;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.forms.editor.FormEditor;
import org.eclipse.ui.ide.IGotoMarker;
import org.eclipse.xtext.ui.editor.XtextEditor;


public class DmEditor extends FormEditor implements IMenuListener, IViewerProvider, IGotoMarker {
	
	protected IEditorPart sourcePage;
	
	/**
	 * This keeps track of the active content viewer, which may be either one of the viewers in the pages or the content outline viewer.
	 */
	protected Viewer currentViewer;

	/**
	 * This creates a model editor.
	 */
	public DmEditor() {
		super();
	}

	/**
	 * This returns the viewer as required by the {@link IViewerProvider} interface.
	 */
	public Viewer getViewer() {
		return currentViewer;
	}

	/**
	 * This is the method used by the framework to install your own controls.
	 */
	@Override
	public void addPages() {
		IExtensionPoint ep = RegistryFactory.getRegistry().getExtensionPoint("org.eclipse.ui.editors");
		IExtension[ ] extensions = ep.getExtensions();
		IExtension ex;
		final MasterFormPage masterDetailsPage;
		IConfigurationElement confElem = null;
		for (int i = 0; i < extensions.length; i++) {
			ex = extensions[i];
			if (ex.getContributor().getName().equals("org.larz.dom3.dm.ui")) {
				for (IConfigurationElement c : ex.getConfigurationElements()) {
					if (c.getName().equals("editor")) {
						confElem = c;
						break;
					}
				}
			}
		}
		try {
			// create the xtext editor
			sourcePage = (IEditorPart) confElem.createExecutableExtension("class");

			masterDetailsPage = new MasterFormPage(this, (XtextEditor)sourcePage);
			addPage(masterDetailsPage);

			int index = addPage(sourcePage, getEditorInput());
			setPageText(index, Messages.getString("MasterDetailsPage.source.label"));

			// Hack to get errors to show
			((XtextEditor)sourcePage).doRevertToSaved();

		} catch (CoreException e1) {
			e1.printStackTrace();
			return;
		}

		getSite().getShell().getDisplay().asyncExec
		(new Runnable() {
			public void run() {
				setActivePage(0);
			}
		});

		this.addPageChangedListener(new IPageChangedListener() {

			@Override
			public void pageChanged(PageChangedEvent event) {
				if (masterDetailsPage.block != null && masterDetailsPage.block.viewer != null) {
					masterDetailsPage.block.viewer.refresh();
					if (((SummaryList)masterDetailsPage.block).getDetailsPart() != null) {
						if (((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage() != null) {
							if (((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage() instanceof ArmorDetailsPage) {
								((ArmorDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).update();

								Object one = ((ArmorDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).getInput();
								Object two = ((AbstractElementWrapper)((IStructuredSelection)masterDetailsPage.block.viewer.getSelection()).getFirstElement()).getElement();
								if (one != two) {
									masterDetailsPage.block.viewer.setSelection(null);
								}
							} else if (((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage() instanceof WeaponDetailsPage) {
								((WeaponDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).update();

								Object one = ((WeaponDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).getInput();
								Object two = ((AbstractElementWrapper)((IStructuredSelection)masterDetailsPage.block.viewer.getSelection()).getFirstElement()).getElement();
								if (one != two) {
									masterDetailsPage.block.viewer.setSelection(null);
								}
							} else if (((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage() instanceof MonsterDetailsPage) {
								((MonsterDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).update();

								Object one = ((MonsterDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).getInput();
								Object two = ((AbstractElementWrapper)((IStructuredSelection)masterDetailsPage.block.viewer.getSelection()).getFirstElement()).getElement();
								if (one != two) {
									masterDetailsPage.block.viewer.setSelection(null);
								}
							} else if (((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage() instanceof NationDetailsPage) {
								((NationDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).update();

								Object one = ((NationDetailsPage)((SummaryList)masterDetailsPage.block).getDetailsPart().getCurrentPage()).getInput();
								Object two = ((AbstractElementWrapper)((IStructuredSelection)masterDetailsPage.block.viewer.getSelection()).getFirstElement()).getElement();
								if (one != two) {
									masterDetailsPage.block.viewer.setSelection(null);
								}
							}
						}
					}
				}
			}
		});
	}
	
	/**
	 * This is how the framework determines which interfaces we implement.
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IGotoMarker.class)) {
			return this;
		}
		else {
			return super.getAdapter(key);
		}
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply tests the command stack.
	 */
	@Override
	public boolean isDirty() {
		return sourcePage.isDirty();
	}

	/**
	 * This is for implementing {@link IEditorPart} and simply saves the model file.
	 */
	@Override
	public void doSave(IProgressMonitor progressMonitor) {
		sourcePage.doSave(progressMonitor);
	}

	/**
	 * This always returns true because it is not currently supported.
	 */
	@Override
	public boolean isSaveAsAllowed() {
		return true;
	}

	/**
	 * This also changes the editor's input.
	 */
	@Override
	public void doSaveAs() {
		sourcePage.doSaveAs();
	}

	public void gotoMarker(IMarker marker) {
		IGotoMarker gotoMarker = (IGotoMarker)sourcePage.getAdapter(IGotoMarker.class);
		gotoMarker.gotoMarker(marker);
	}

	/**
	 * This is called during startup.
	 */
	@Override
	public void init(IEditorSite site, IEditorInput editorInput) {
		setSite(site);
		setInputWithNotify(editorInput);
		setPartName(editorInput.getName());
	}

	/**
	 * This implements {@link org.eclipse.jface.action.IMenuListener} to help fill the context menus with contributions from the Edit menu.
	 */
	public void menuAboutToShow(IMenuManager menuManager) {
		((IMenuListener)getEditorSite().getActionBarContributor()).menuAboutToShow(menuManager);
	}

}
