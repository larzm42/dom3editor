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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.xtext.ui.editor.XtextEditor;

public abstract class AbstractDetailsPage implements IDetailsPage {
	protected IManagedForm mform;
	protected XtextEditor doc;
	protected TableViewer viewer;
	protected Object input;

	protected static Font boldFont;
	protected static Font normalFont;
	
	static {
		normalFont = Display.getDefault().getSystemFont();
		FontData[] fontData = normalFont.getFontData();
		fontData[0].setStyle(SWT.BOLD);
		boldFont = new Font(Display.getDefault(), fontData);
	}
	
	
	/**
	 * @param doc
	 * @param viewer
	 */
	public AbstractDetailsPage(XtextEditor doc, TableViewer viewer) {
		this.doc = doc;
		this.viewer = viewer;
	}

	/**
	 * @param toolkit
	 * @param parent
	 * @param span
	 */
	protected void createSpacer(FormToolkit toolkit, Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
		GridData gd = new GridData(SWT.BEGINNING, SWT.DEFAULT, false, false);
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);
	}
	
	/**
	 * @return
	 */
	public Object getInput() {
		return input;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#inputChanged(org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		setInputFromSelection((IStructuredSelection)selection);
		update();
	}
	
	/**
	 * Refresh the table and set the new input.
	 */
	public void updateSelection() {
		viewer.refresh();
		setInputFromSelection((IStructuredSelection)viewer.getSelection());
	}

	/**
	 * @param selection
	 */
	private void setInputFromSelection(IStructuredSelection selection) {
		if (selection.size()==1) {
			input = ((AbstractElementWrapper)selection.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	/**
	 * Update the details UI.
	 */
	public abstract void update();

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#isDirty()
	 */
	public boolean isDirty() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#isStale()
	 */
	public boolean isStale() {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#refresh()
	 */
	public void refresh() {
		update();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#setFormInput(java.lang.Object)
	 */
	public boolean setFormInput(Object input) {
		return false;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#initialize(org.eclipse.ui.forms.IManagedForm)
	 */
	public void initialize(IManagedForm mform) {
		this.mform = mform;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#dispose()
	 */
	public void dispose() {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#commit(boolean)
	 */
	public void commit(boolean onSave) {
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IFormPart#setFocus()
	 */
	public void setFocus() {
	}

}
