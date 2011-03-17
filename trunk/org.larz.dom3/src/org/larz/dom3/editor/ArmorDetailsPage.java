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

import java.util.EnumMap;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.VerifyEvent;
import org.eclipse.swt.events.VerifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IFormPart;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.larz.dom3.db.ArmorDB;
import org.larz.dom3.db.Database;
import org.larz.dom3.dm.dm.Armor;
import org.larz.dom3.dm.dm.ArmorInst1;
import org.larz.dom3.dm.dm.ArmorInst2;
import org.larz.dom3.dm.dm.ArmorMods;
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.SelectArmorById;
import org.larz.dom3.dm.dm.SelectArmorByName;
import org.larz.dom3.dm.ui.internal.DmActivator;

public class ArmorDetailsPage implements IDetailsPage {
	private IManagedForm mform;
	private Armor input;
	private XtextEditor doc;
	private TableViewer viewer;

	private Text name;

	enum Inst2 {
		TYPE (Messages.getString("ArmorDetailsSection.mod.type"), "4"), 
		PROT (Messages.getString("ArmorDetailsSection.mod.prot"), "1"),
		DEF (Messages.getString("ArmorDetailsSection.mod.def"), "1"), 
		ENC (Messages.getString("ArmorDetailsSection.mod.enc"), "0"), 
		RCOST (Messages.getString("ArmorDetailsSection.mod.rcost"), "10"); 
		
		private String label;
		private String defaultValue;
		
		Inst2(String label, String defaultValue) {
			this.label = label;
			this.defaultValue = defaultValue;
		}
		
	}
	
	class Inst2Fields {
		private Text value;
		private Button check;
		private Label defaultLabel;
	}
	
	EnumMap<Inst2, Inst2Fields> inst2Map = new EnumMap<Inst2, Inst2Fields>(Inst2.class);
	
	public ArmorDetailsPage(XtextEditor doc, TableViewer viewer) {
		this.doc = doc;
		this.viewer = viewer;
		inst2Map.put(Inst2.TYPE, new Inst2Fields());
		inst2Map.put(Inst2.PROT, new Inst2Fields());
		inst2Map.put(Inst2.DEF, new Inst2Fields());
		inst2Map.put(Inst2.ENC, new Inst2Fields());
		inst2Map.put(Inst2.RCOST, new Inst2Fields());
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#initialize(org.eclipse.ui.forms.IManagedForm)
	 */
	public void initialize(IManagedForm mform) {
		this.mform = mform;
	}
	
	/**
	 * @return
	 */
	public Armor getInput() {
		return input;
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#createContents(org.eclipse.swt.widgets.Composite)
	 */
	public void createContents(Composite parent) {
		TableWrapLayout layout = new TableWrapLayout();
		layout.topMargin = 5;
		layout.leftMargin = 5;
		layout.rightMargin = 2;
		layout.bottomMargin = 2;
		parent.setLayout(layout);

		FormToolkit toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		s1.marginWidth = 10;
		s1.setText(Messages.getString("ArmorDetailsSection.name")); //$NON-NLS-1$
		TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
		td.grabHorizontal = true;
		s1.setLayoutData(td);
		
		Composite client = toolkit.createComposite(parent);
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.numColumns = 3;
		client.setLayout(glayout);
		
		Composite nameComp = toolkit.createComposite(client);
		nameComp.setLayout(new GridLayout(2, false));
		GridData gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.horizontalSpan = 3;
		nameComp.setLayoutData(gd);

		toolkit.createLabel(nameComp, Messages.getString("ArmorDetailsSection.mod.name")); //$NON-NLS-1$
		
		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setArmorname(doc, input, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setArmorname(doc, input, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 200;
		name.setLayoutData(gd);
		
		for (final Map.Entry<Inst2, Inst2Fields> fields : inst2Map.entrySet()) {
			final Inst2 key = fields.getKey();
			final Button check = toolkit.createButton(client, key.label, SWT.CHECK);
			final Text value = toolkit.createText(client, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
			Label defaultLabel = toolkit.createLabel(client, "");
			defaultLabel.setEnabled(false);
			
			value.addVerifyListener(new VerifyListener() {
				
				@Override
				public void verifyText(VerifyEvent e) {
					if (Character.isLetter(e.character)) {
						e.doit = false;
					}
				}
			});
			check.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (check.getSelection()) {
						value.setEnabled(true);
						value.setText(key.defaultValue);
						addInst2(key, doc, input, key.defaultValue);
					} else {
						value.setEnabled(false);
						value.setText("");
						removeInst2(key, doc, input);
					}
				}

			});
			value.addFocusListener(new FocusAdapter() {
				@Override
				public void focusLost(FocusEvent e) {
					setInst2(key, doc, input, value.getText());
				}			
			});
			value.addKeyListener(new KeyAdapter() {
				@Override
				public void keyPressed(KeyEvent e) {
					if (e.character == '\r') {
						setInst2(key, doc, input, value.getText());
					}
				}
				
			});
			value.setEnabled(false);
			gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
			gd.widthHint = 30;
			value.setLayoutData(gd);
			fields.getValue().check = check;
			fields.getValue().value = value;
			fields.getValue().defaultLabel = defaultLabel;
		}

		createSpacer(toolkit, client, 2);
	}
	
	private void createSpacer(FormToolkit toolkit, Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);
	}
	
	public void update() {
		if (input != null) {
			if (input instanceof SelectArmorByName || input instanceof SelectArmorById) {
				String str = getSelectArmorname(input);
				name.setText(str!= null?str:"");
				name.setEnabled(false);
			} else {
				String str = getArmorname(input);
				name.setText(str!=null?str:"");
			}
		}
		ArmorDB armorDB = new ArmorDB();
		if (input instanceof SelectArmorById) {
			armorDB = Database.getArmor(((SelectArmorById)input).getValue());
		} else if (input instanceof SelectArmorByName) {
			armorDB = Database.getArmor(((SelectArmorByName)input).getValue());
		}
		for (Map.Entry<Inst2, Inst2Fields> fields : inst2Map.entrySet()) {
			Integer val = getInst2(fields.getKey(), input);
			if (val != null) {
				fields.getValue().value.setText(val.toString());
				fields.getValue().value.setEnabled(true);
				fields.getValue().check.setSelection(true);
			} else {
				fields.getValue().value.setText("");
				fields.getValue().value.setEnabled(false);
				fields.getValue().check.setSelection(false);
			}
			if (input instanceof SelectArmorByName || input instanceof SelectArmorById) {
				switch (fields.getKey()) {
				case DEF:
					if (armorDB.def != null) {
						fields.getValue().defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", armorDB.def.toString()));
						Inst2.DEF.defaultValue = armorDB.def.toString();
					}
					break;
				case ENC:
					if (armorDB.enc != null) {
						fields.getValue().defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", armorDB.enc.toString()));
						Inst2.ENC.defaultValue = armorDB.enc.toString();
					}
					break;
				case PROT:
					if (armorDB.prot != null) {
						fields.getValue().defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", armorDB.prot.toString()));
						Inst2.PROT.defaultValue = armorDB.prot.toString();
					}
					break;
				case RCOST:
					if (armorDB.res != null) {
						fields.getValue().defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", armorDB.res.toString()));
						Inst2.RCOST.defaultValue = armorDB.res.toString();
					}
					break;
				case TYPE:
					if (armorDB.type != null) {
						fields.getValue().defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", armorDB.type.toString()));
						Inst2.TYPE.defaultValue = armorDB.type.toString();
					}
					break;
				}
			}
		}
		name.getParent().getParent().layout(true);
	}
	
	private String getArmorname(Armor armor) {
		EList<ArmorMods> list = armor.getMods();
		for (ArmorMods mod : list) {
			if (mod instanceof ArmorInst1) {
				if (((ArmorInst1)mod).isName()) {
					return ((ArmorInst1)mod).getValue();
				}
			}
		}
		return null;
	}
	
	private String getSelectArmorname(Armor armor) {
		if (armor instanceof SelectArmorByName) {
			return ((SelectArmorByName)armor).getValue();
		} else {
			int id = ((SelectArmorById)armor).getValue();
			return Database.getArmorName(id);
		}
	}
	
	private void setArmorname(final XtextEditor editor, final Armor armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Armor armorToEdit = input;
				EList<ArmorMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (ArmorMods mod : mods) {
					if (mod instanceof ArmorInst1) {
						if (((ArmorInst1)mod).isName()) {
							((ArmorInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					ArmorInst1 nameInst = DmFactory.eINSTANCE.createArmorInst1();
					nameInst.setName(true);
					nameInst.setValue(newName);
					mods.add(nameInst);
				}
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Armor)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private Integer getInst2(Inst2 inst2, Armor armor) {
		EList<ArmorMods> list = armor.getMods();
		for (ArmorMods mod : list) {
			if (mod instanceof ArmorInst2) {
				switch (inst2) {
				case TYPE:
					if (((ArmorInst2)mod).isType()) {
						return Integer.valueOf(((ArmorInst2)mod).getValue());
					}
					break;
				case PROT:
					if (((ArmorInst2)mod).isProt()) {
						return Integer.valueOf(((ArmorInst2)mod).getValue());
					}
					break;
				case DEF:
					if (((ArmorInst2)mod).isDef()) {
						return Integer.valueOf(((ArmorInst2)mod).getValue());
					}
					break;
				case ENC:
					if (((ArmorInst2)mod).isEnc()) {
						return Integer.valueOf(((ArmorInst2)mod).getValue());
					}
					break;
				case RCOST:
					if (((ArmorInst2)mod).isRcost()) {
						return Integer.valueOf(((ArmorInst2)mod).getValue());
					}
					break;
				}
			}
		}
		return null;
	}
	
	private void setInst2(final Inst2 inst2, final XtextEditor editor, final Armor armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Armor armorToEdit = input;
				EList<ArmorMods> mods = armorToEdit.getMods();
				for (ArmorMods mod : mods) {
					if (mod instanceof ArmorInst2) {
						switch (inst2) {
						case TYPE:
							if (((ArmorInst2)mod).isType()) {
								((ArmorInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case PROT:
							if (((ArmorInst2)mod).isProt()) {
								((ArmorInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEF:
							if (((ArmorInst2)mod).isDef()) {
								((ArmorInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case ENC:
							if (((ArmorInst2)mod).isEnc()) {
								((ArmorInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RCOST:
							if (((ArmorInst2)mod).isRcost()) {
								((ArmorInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Armor)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void addInst2(final Inst2 inst2, final XtextEditor editor, final Armor armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Armor armorToEdit = input;
				EList<ArmorMods> mods = armorToEdit.getMods();
				ArmorInst2 type = DmFactory.eINSTANCE.createArmorInst2();
				switch (inst2) {
				case TYPE:
					type.setType(true);
					break;
				case PROT:
					type.setProt(true);
					break;
				case DEF:
					type.setDef(true);
					break;
				case ENC:
					type.setEnc(true);
					break;
				case RCOST:
					type.setRcost(true);
					break;
				}
				type.setValue(Integer.valueOf(newName));
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Armor)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void removeInst2(final Inst2 inst2, final XtextEditor editor, final Armor armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Armor armorToEdit = input;
				ArmorMods modToRemove = null;
				EList<ArmorMods> mods = armorToEdit.getMods();
				for (ArmorMods mod : mods) {
					if (mod instanceof ArmorInst2) {
						switch (inst2) {
						case TYPE:
							if (((ArmorInst2)mod).isType()) {
								modToRemove = mod;
							}
							break;
						case PROT:
							if (((ArmorInst2)mod).isProt()) {
								modToRemove = mod;
							}
							break;
						case DEF:
							if (((ArmorInst2)mod).isDef()) {
								modToRemove = mod;
							}
							break;
						case ENC:
							if (((ArmorInst2)mod).isEnc()) {
								modToRemove = mod;
							}
							break;
						case RCOST:
							if (((ArmorInst2)mod).isRcost()) {
								modToRemove = mod;
							}
							break;
						}
					}
				}
				if (modToRemove != null) {
					mods.remove(modToRemove);
				}
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Armor)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#inputChanged(org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;
		if (ssel.size()==1) {
			input = (Armor)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
		update();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#commit()
	 */
	public void commit(boolean onSave) {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#setFocus()
	 */
	public void setFocus() {
	}
	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#dispose()
	 */
	public void dispose() {
	}
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
}
