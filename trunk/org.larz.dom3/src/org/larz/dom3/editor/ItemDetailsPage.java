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
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
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
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.larz.dom3.db.Database;
import org.larz.dom3.db.ItemDB;
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.Item;
import org.larz.dom3.dm.dm.ItemInst1;
import org.larz.dom3.dm.dm.ItemInst2;
import org.larz.dom3.dm.dm.ItemInst3;
import org.larz.dom3.dm.dm.ItemMods;
import org.larz.dom3.dm.dm.SelectItemById;
import org.larz.dom3.dm.dm.SelectItemByName;
import org.larz.dom3.dm.ui.help.HelpTextHelper;
import org.larz.dom3.dm.ui.internal.DmActivator;

public class ItemDetailsPage extends AbstractDetailsPage {
	private Text name;
	private Button nameCheck;
	private Text descr;
	private Button descrCheck;
	private Label spriteLabel;

	enum Inst {
		NAME (Messages.getString("ItemDetailsSection.mod.name"), ""),
		DESCR (Messages.getString("ItemDetailsSection.mod.descr"), ""),
		CONSTLEVEL (Messages.getString("ItemDetailsSection.mod.constlevel"), "0"),
		MAINPATH (Messages.getString("ItemDetailsSection.mod.mainpath"), "0"),
		MAINLEVEL (Messages.getString("ItemDetailsSection.mod.mainlevel"), "0"),
		SECONDARYPATH (Messages.getString("ItemDetailsSection.mod.secondarypath"), "0"),
		SECONDARYLEVEL (Messages.getString("ItemDetailsSection.mod.secondarylevel"), "0"),		
		COPYSPR (Messages.getString("ItemDetailsSection.mod.copyspr"), "0"),
		TYPE (Messages.getString("ItemDetailsSection.mod.type"), "0"),
		WEAPON (Messages.getString("ItemDetailsSection.mod.weapon"), "0"),
		ARMOR (Messages.getString("ItemDetailsSection.mod.armor"), "");
		
		private String label;
		private String defaultValue;
		
		Inst(String label, String defaultValue) {
			this.label = label;
			this.defaultValue = defaultValue;
		}
		
	}
	
	interface InstFields {}
	
	class Inst1Fields implements InstFields {
		private Button check;
		private Text value;
		private Label defaultLabel;
	}
	
	class Inst2Fields implements InstFields {
		private Button check;
		private Text value;
		private Label defaultLabel;
	}
	
	class Inst3Fields implements InstFields {
		private Button check;
		private Text value;
		private Label defaultLabel;
	}
	
	private EnumMap<Inst, InstFields> instMap = new EnumMap<Inst, InstFields>(Inst.class);
	
	public ItemDetailsPage(XtextEditor doc, TableViewer viewer) {
		super(doc, viewer);
		instMap.put(Inst.ARMOR, new Inst1Fields());
		instMap.put(Inst.CONSTLEVEL, new Inst2Fields());
		instMap.put(Inst.MAINPATH, new Inst2Fields());
		instMap.put(Inst.MAINLEVEL, new Inst2Fields());
		instMap.put(Inst.SECONDARYPATH, new Inst2Fields());
		instMap.put(Inst.SECONDARYLEVEL, new Inst2Fields());
		instMap.put(Inst.COPYSPR, new Inst3Fields());
		instMap.put(Inst.TYPE, new Inst2Fields());
		instMap.put(Inst.WEAPON, new Inst2Fields());
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

		final FormToolkit toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		s1.marginWidth = 10;
		s1.setText(Messages.getString("ItemDetailsSection.name")); //$NON-NLS-1$
		TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
		td.grabHorizontal = true;
		s1.setLayoutData(td);
		
		final Composite client = toolkit.createComposite(parent);
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.numColumns = 2;
		glayout.makeColumnsEqualWidth = true;
		client.setLayout(glayout);
		
		Composite nameComp = toolkit.createComposite(client);
		glayout = new GridLayout(2, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		nameComp.setLayout(glayout);
		GridData gd = new GridData(SWT.DEFAULT, SWT.FILL, false, false);
		gd.horizontalSpan = 2;
		nameComp.setLayoutData(gd);
		
		nameCheck = toolkit.createButton(nameComp, Messages.getString("ItemDetailsSection.mod.name"), SWT.CHECK); //$NON-NLS-1$
		nameCheck.setToolTipText(HelpTextHelper.getText(HelpTextHelper.ITEM_CATEGORY, "name"));

		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setItemname(doc, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setItemname(doc, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 500;
		name.setLayoutData(gd);
		nameCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (nameCheck.getSelection()) {
					addInst1(Inst.NAME, doc, "");
					name.setEnabled(true);
					name.setText("");
					nameCheck.setFont(boldFont);
				} else {
					removeInst(Inst.NAME, doc);
					name.setEnabled(false);
					if (input instanceof SelectItemById || input instanceof SelectItemByName) {
						name.setText(getSelectItemname((Item)input));
					} else {
						name.setText("");
					}
					nameCheck.setFont(normalFont);
				}
			}
		});

		descrCheck = toolkit.createButton(nameComp, Messages.getString("ItemDetailsSection.mod.descr"), SWT.CHECK);
		descrCheck.setToolTipText(HelpTextHelper.getText(HelpTextHelper.ITEM_CATEGORY, "descr"));

		descr = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		descr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setItemdescr(doc, descr.getText());
			}			
		});
		descr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setItemdescr(doc, descr.getText());
				}
			}
			
		});
		descr.setLayoutData(new GridData(500, SWT.DEFAULT));
		descr.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = descr.getSize().y;
				int preferredHeight = descr.computeSize(500, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)descr.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		descr.setEnabled(false);
		descr.setBackground(toolkit.getColors().getInactiveBackground());
		descrCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (descrCheck.getSelection()) {
					addInst1(Inst.DESCR, doc, "");
					descr.setEnabled(true);
					descr.setBackground(toolkit.getColors().getBackground());
					descr.setText("");
					descrCheck.setFont(boldFont);
				} else {
					removeInst(Inst.DESCR, doc);
					descr.setEnabled(false);
					descr.setBackground(toolkit.getColors().getInactiveBackground());
					descr.setText("");
					descrCheck.setFont(normalFont);
				}
			}
		});

		spriteLabel = toolkit.createLabel(nameComp, "", SWT.NONE);

		Composite leftColumn = toolkit.createComposite(client);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		glayout.verticalSpacing = 0;
		leftColumn.setLayout(glayout);
		leftColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Composite rightColumn = toolkit.createComposite(client);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		glayout.verticalSpacing = 0;
		rightColumn.setLayout(glayout);
		rightColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		boolean isRight = false;
		for (final Map.Entry<Inst, InstFields> fields : instMap.entrySet()) {
			final Inst key = fields.getKey();
			final InstFields field = fields.getValue();
			final Button check = toolkit.createButton(isRight?rightColumn:leftColumn, key.label, SWT.CHECK);
			check.setToolTipText(HelpTextHelper.getText(HelpTextHelper.ITEM_CATEGORY, key.label));
			check.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (check.getSelection()) {
						check.setFont(boldFont);
						if (field instanceof Inst1Fields) {
							addInst1(key, doc, key.defaultValue);
						} else if (field instanceof Inst2Fields) {
							addInst2(key, doc, key.defaultValue);
						} else if (field instanceof Inst3Fields) {
							addInst3(key, doc, key.defaultValue);
						}
					} else {
						removeInst(key, doc);
						check.setFont(normalFont);
					}
				}

			});

			Text myValue1 = null;
			if (field instanceof Inst1Fields ||	field instanceof Inst2Fields || field instanceof Inst3Fields) {
				final Text value = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue1 = value;
				
				if (field instanceof Inst2Fields) {
					value.addVerifyListener(new VerifyListener() {
						
						@Override
						public void verifyText(VerifyEvent e) {
							if (Character.isLetter(e.character)) {
								e.doit = false;
							}
						}
					});
				}
				check.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						if (check.getSelection()) {
							value.setEnabled(true);
							value.setText(key.defaultValue);
						} else {
							value.setEnabled(false);
							value.setText("");
						}
					}

				});
				value.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						if (field instanceof Inst1Fields) {
							setInst1(key, doc, value.getText());
						} else if (field instanceof Inst2Fields) {
							setInst2(key, doc, value.getText());
						} else if (field instanceof Inst3Fields) {
							setInst3(key, doc, value.getText());
						}
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							if (field instanceof Inst1Fields) {
								setInst1(key, doc, value.getText());
							} else if (field instanceof Inst2Fields) {
								setInst2(key, doc, value.getText());
							} else if (field instanceof Inst3Fields) {
								setInst3(key, doc, value.getText());
							}
						}
					}
				});
				value.setEnabled(false);
				
				if (field instanceof Inst1Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.widthHint = 160;
					gd.horizontalSpan = 3;
				} else if (field instanceof Inst2Fields || field instanceof Inst3Fields) {
					gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
					gd.widthHint = 30;
				}
				value.setLayoutData(gd);
				
			}
				
			Label defaultLabel1 = null;
			
			if (field instanceof Inst1Fields) {
				defaultLabel1 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel1.setEnabled(false);
				gd = new GridData(SWT.FILL, SWT.CENTER, false, false);
				defaultLabel1.setLayoutData(gd);
			} else if (field instanceof Inst2Fields || field instanceof Inst3Fields) {
				defaultLabel1 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel1.setEnabled(false);
				gd = new GridData(SWT.FILL, SWT.CENTER, false, false);
				gd.horizontalSpan = 3;
				defaultLabel1.setLayoutData(gd);
			} 

			if (field instanceof Inst1Fields) {
				((Inst1Fields)field).check = check;
				((Inst1Fields)field).value = myValue1;
				((Inst1Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst2Fields) {
				((Inst2Fields)field).check = check;
				((Inst2Fields)field).value = myValue1;
				((Inst2Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst3Fields) {
				((Inst3Fields)field).check = check;
				((Inst3Fields)field).value = myValue1;
				((Inst3Fields)field).defaultLabel = defaultLabel1;
			}

			isRight = !isRight;
		}

		createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
	}
	
	private String getSelectItemname(Item item) {
		if (item instanceof SelectItemByName) {
			return ((SelectItemByName)item).getValue();
		} else if (item instanceof SelectItemById) {
			int id = ((SelectItemById)item).getValue();
			return Database.getItemName(id);
		}
		return null;
	}
	
	private int getSelectItemid(Item item) {
		if (item instanceof SelectItemByName) {
			return Database.getItem(((SelectItemByName) item).getValue()).id;
		} else {
			return ((SelectItemById)item).getValue();
		}
	}
	
	public void update() {
		if (input != null) {
			String nameString = getInst1(Inst.NAME, (Item)input);
			
			String sprite = null;
			if (input instanceof SelectItemByName || input instanceof SelectItemById) {
				if (nameString != null) {
					name.setText(nameString);
					name.setEnabled(true);
					nameCheck.setSelection(true);
					nameCheck.setFont(boldFont);
				} else {
					name.setText(getSelectItemname((Item)input));
					name.setEnabled(false);
					nameCheck.setSelection(false);
					nameCheck.setFont(normalFont);
				}
				
				int id = getSelectItemid((Item)input);
				if (getInst3(Inst.COPYSPR, (Item)input) != null) {
					Object copyId = getInst3(Inst.COPYSPR, (Item)input);
					if (copyId instanceof Integer) {
						sprite = "item" + copyId + ".png";
					} else if (copyId instanceof String) {
						sprite = "item" + Database.getItem((String)copyId).id + ".png";
					}
				} else {
					sprite = "item" + id + ".png";
				}
			} else {
				if (nameString != null) {
					name.setText(nameString);
					name.setEnabled(true);
					nameCheck.setSelection(true);
					nameCheck.setFont(boldFont);
				} else {
					String str = getItemname((Item)input);
					name.setText(str!=null?str:"");
					name.setEnabled(false);
					nameCheck.setSelection(false);
					nameCheck.setFont(normalFont);
				}
				nameCheck.setEnabled(false);
				
				if (getInst3(Inst.COPYSPR, (Item)input) != null) {
					Object copyId = getInst3(Inst.COPYSPR, (Item)input);
					if (copyId instanceof Integer) {
						sprite = "item" + copyId + ".png";
					} else if (copyId instanceof String) {
						sprite = "item" + Database.getItem((String)copyId).id + ".png";
					}
				}
			}
			
			if (sprite != null) {
				spriteLabel.setImage(getSpriteFromZip(sprite, "items"));
			} else {
				spriteLabel.setImage(null);
			}

			String description = getInst1(Inst.DESCR, (Item)input);
			final FormToolkit toolkit = mform.getToolkit();
			if (description != null) {
				descr.setText(description);
				descr.setEnabled(true);
				descr.setBackground(toolkit.getColors().getBackground());
				descrCheck.setSelection(true);
				descrCheck.setFont(boldFont);
			} else {
				descr.setText("");
				descr.setEnabled(false);
				descr.setBackground(toolkit.getColors().getInactiveBackground());
				descrCheck.setSelection(false);
				descrCheck.setFont(normalFont);
			}
			
		}
		ItemDB itemDB = new ItemDB();
		if (input instanceof SelectItemById) {
			itemDB = Database.getItem(((SelectItemById)input).getValue());
		} else if (input instanceof SelectItemByName) {
			itemDB = Database.getItem(((SelectItemByName)input).getValue());
		}
		for (Map.Entry<Inst, InstFields> fields : instMap.entrySet()) {
			String val1 = getInst1(fields.getKey(), (Item)input);
			if (val1 != null) {
				if (fields.getValue() instanceof Inst1Fields) {
					((Inst1Fields)fields.getValue()).value.setText(val1);
					((Inst1Fields)fields.getValue()).value.setEnabled(true);
					((Inst1Fields)fields.getValue()).check.setSelection(true);
					((Inst1Fields)fields.getValue()).check.setFont(boldFont);
				}
			} else {
				if (fields.getValue() instanceof Inst1Fields) {
					((Inst1Fields)fields.getValue()).value.setText("");
					((Inst1Fields)fields.getValue()).value.setEnabled(false);
					((Inst1Fields)fields.getValue()).check.setSelection(false);
					((Inst1Fields)fields.getValue()).check.setFont(normalFont);
				}
			}
			Integer val = getInst2(fields.getKey(), (Item)input);
			if (val != null) {
				if (fields.getValue() instanceof Inst2Fields) {
					((Inst2Fields)fields.getValue()).value.setText(val.toString());
					((Inst2Fields)fields.getValue()).value.setEnabled(true);
					((Inst2Fields)fields.getValue()).check.setSelection(true);
					((Inst2Fields)fields.getValue()).check.setFont(boldFont);
				}
			} else {
				if (fields.getValue() instanceof Inst2Fields) {
					((Inst2Fields)fields.getValue()).value.setText("");
					((Inst2Fields)fields.getValue()).value.setEnabled(false);
					((Inst2Fields)fields.getValue()).check.setSelection(false);
					((Inst2Fields)fields.getValue()).check.setFont(normalFont);
				}
			}
			Object val3 = getInst3(fields.getKey(), (Item)input);
			if (val3 != null) {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).value.setText(val3.toString());
					((Inst3Fields)fields.getValue()).value.setEnabled(true);
					((Inst3Fields)fields.getValue()).check.setSelection(true);
					((Inst3Fields)fields.getValue()).check.setFont(boldFont);
				}
			} else {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).value.setText("");
					((Inst3Fields)fields.getValue()).value.setEnabled(false);
					((Inst3Fields)fields.getValue()).check.setSelection(false);
					((Inst3Fields)fields.getValue()).check.setFont(normalFont);
				}
			}
			if (input instanceof Item) {
				switch (fields.getKey()) {
				case ARMOR:
					if (itemDB.armor != null) {
						((Inst1Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.armor));
						Inst.ARMOR.defaultValue = itemDB.armor;
					}
					break;
				case CONSTLEVEL:
					if (itemDB.constlevel != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.constlevel.toString()));
						Inst.CONSTLEVEL.defaultValue = itemDB.constlevel.toString();
					}
					break;
				case MAINPATH:
					if (itemDB.mainpath != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.mainpath.toString()));
						Inst.MAINPATH.defaultValue = itemDB.mainpath.toString();
					}
					break;
				case MAINLEVEL:
					if (itemDB.mainlevel != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.mainlevel.toString()));
						Inst.MAINLEVEL.defaultValue = itemDB.mainlevel.toString();
					}
					break;
				case SECONDARYPATH:
					if (itemDB.secondarypath != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.secondarypath.toString()));
						Inst.SECONDARYPATH.defaultValue = itemDB.secondarypath.toString();
					}
					break;
				case SECONDARYLEVEL:
					if (itemDB.secondarylevel != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.secondarylevel.toString()));
						Inst.SECONDARYLEVEL.defaultValue = itemDB.secondarylevel.toString();
					}
					break;
				case TYPE:
					if (itemDB.type != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.type.toString()));
						Inst.TYPE.defaultValue = itemDB.type.toString();
					}
					break;
				case WEAPON:
					if (itemDB.weapon != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", itemDB.weapon.toString()));
						Inst.WEAPON.defaultValue = itemDB.weapon.toString();
					}
					break;
				}
			}
		}
		name.getParent().getParent().getParent().layout(true, true);
	}
	
	private String getItemname(Item item) {
		EList<ItemMods> list = item.getMods();
		for (ItemMods mod : list) {
			if (mod instanceof ItemInst1) {
				if (((ItemInst1)mod).isName()) {
					return ((ItemInst1)mod).getValue();
				}
			}
		}
		return null;
	}

	private void setItemname(final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Item itemToEdit = (Item)input;
				EList<ItemMods> mods = itemToEdit.getMods();
				boolean nameSet = false;
				for (ItemMods mod : mods) {
					if (mod instanceof ItemInst1) {
						if (((ItemInst1)mod).isName()) {
							((ItemInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					ItemInst1 nameInst = DmFactory.eINSTANCE.createItemInst1();
					nameInst.setName(true);
					nameInst.setValue(newName);
					mods.add(nameInst);
				}
			}  
		},
		myDocument);

		updateSelection();
	}
	
	private void setItemdescr(final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Item itemToEdit = (Item)input;
				EList<ItemMods> mods = itemToEdit.getMods();
				boolean nameSet = false;
				for (ItemMods mod : mods) {
					if (mod instanceof ItemInst1) {
						if (((ItemInst1)mod).isDescr()) {
							((ItemInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					ItemInst1 nameInst = DmFactory.eINSTANCE.createItemInst1();
					nameInst.setDescr(true);
					nameInst.setValue(newName);
					mods.add(nameInst);
				}
			}  
		},
		myDocument);

		updateSelection();
	}

	private String getInst1(Inst inst2, Item item) {
		EList<ItemMods> list = item.getMods();
		for (ItemMods mod : list) {
			if (mod instanceof ItemInst1) {
				switch (inst2) {
				case NAME:
					if (((ItemInst1)mod).isName()){
						return ((ItemInst1)mod).getValue();
					}
					break;
				case DESCR:
					if (((ItemInst1)mod).isDescr()){
						return ((ItemInst1)mod).getValue();
					}
					break;
				case ARMOR:
					if (((ItemInst1)mod).isArmor()){
						return ((ItemInst1)mod).getValue();
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer getInst2(Inst inst2, Item item) {
		EList<ItemMods> list = item.getMods();
		for (ItemMods mod : list) {
			if (mod instanceof ItemInst2) {
				switch (inst2) {
				case CONSTLEVEL:
					if (((ItemInst2)mod).isConstlevel()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				case MAINPATH:
					if (((ItemInst2)mod).isMainpath()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				case MAINLEVEL:
					if (((ItemInst2)mod).isMainlevel()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				case SECONDARYPATH:
					if (((ItemInst2)mod).isSecondarypath()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				case SECONDARYLEVEL:
					if (((ItemInst2)mod).isSecondarylevel()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				case TYPE:
					if (((ItemInst2)mod).isType()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				case WEAPON:
					if (((ItemInst2)mod).isWeapon()){
						return Integer.valueOf(((ItemInst2)mod).getValue());
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Object getInst3(Inst inst2, Item item) {
		EList<ItemMods> list = item.getMods();
		for (ItemMods mod : list) {
			if (mod instanceof ItemInst3) {
				switch (inst2) {
				case COPYSPR:
					if (((ItemInst3)mod).isCopyspr()){
						String strVal = ((ItemInst3)mod).getValue1();
						Integer intVal = ((ItemInst3)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				}
			}
		}
		return null;
	}

	private void setInst1(final Inst inst2, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Item itemToEdit = (Item)input;
				EList<ItemMods> mods = itemToEdit.getMods();				
				for (ItemMods mod : mods) {
					if (mod instanceof ItemInst1) {
						switch (inst2) {
						case NAME:
							if (((ItemInst1)mod).isName()) {
								((ItemInst1)mod).setValue(newName);
							}
							break;
						case DESCR:
							if (((ItemInst1)mod).isDescr()) {
								((ItemInst1)mod).setValue(newName);
							}
							break;
						case ARMOR:
							if (((ItemInst1)mod).isArmor()) {
								((ItemInst1)mod).setValue(newName);
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		updateSelection();
	}

	private void setInst2(final Inst inst2, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Item itemToEdit = (Item)input;
				EList<ItemMods> mods = itemToEdit.getMods();
				for (ItemMods mod : mods) {
					if (mod instanceof ItemInst2) {
						switch (inst2) {
						case CONSTLEVEL:
							if (((ItemInst2)mod).isConstlevel()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MAINPATH:
							if (((ItemInst2)mod).isMainpath()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MAINLEVEL:
							if (((ItemInst2)mod).isMainlevel()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SECONDARYPATH:
							if (((ItemInst2)mod).isSecondarypath()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SECONDARYLEVEL:
							if (((ItemInst2)mod).isSecondarylevel()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case TYPE:
							if (((ItemInst2)mod).isType()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case WEAPON:
							if (((ItemInst2)mod).isWeapon()){
								((ItemInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		updateSelection();
	}

	private void setInst3(final Inst inst2, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Item itemToEdit = (Item)input;
				EList<ItemMods> mods = itemToEdit.getMods();
				for (ItemMods mod : mods) {
					if (mod instanceof ItemInst3) {
						Integer newValue = null;
						try {
							newValue = Integer.valueOf(newName);
						} catch (NumberFormatException e) {
							// is not a number
						}

						switch (inst2) {
						case COPYSPR:
							if (((ItemInst3)mod).isCopyspr()){
								mods.remove(mod);
								ItemInst3 newMod = DmFactory.eINSTANCE.createItemInst3();
								newMod.setCopyspr(true);
								if (newValue != null) {
									newMod.setValue2(Integer.parseInt(newName));
								} else {
									newMod.setValue1(newName);
								}
								mods.add(newMod);
							}
							break;
						}
					}
				}

			}  
		},
		myDocument);

		updateSelection();
	}

	private void addInst1(final Inst inst, final XtextEditor editor, final String newName) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						EList<ItemMods> mods = ((Item)input).getMods();
						ItemInst1 type = DmFactory.eINSTANCE.createItemInst1();
						switch (inst) {
						case NAME:
							type.setName(true);
							break;
						case DESCR:
							type.setDescr(true);
							break;
						case ARMOR:
							type.setArmor(true);
							break;
						}
						type.setValue(newName);
						mods.add(type);
					}  
				},
				myDocument);

				updateSelection();
			}
		});
	}
	
	private void addInst2(final Inst inst, final XtextEditor editor, final String newName) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						EList<ItemMods> mods = ((Item)input).getMods();
						ItemInst2 type = DmFactory.eINSTANCE.createItemInst2();
						switch (inst) {
						case CONSTLEVEL:
							type.setConstlevel(true);
							break;
						case MAINPATH:
							type.setMainpath(true);
							break;
						case MAINLEVEL:
							type.setMainlevel(true);
							break;
						case SECONDARYPATH:
							type.setSecondarypath(true);
							break;
						case SECONDARYLEVEL:
							type.setSecondarylevel(true);
							break;
						case TYPE:
							type.setType(true);
							break;
						case WEAPON:
							type.setWeapon(true);
							break;
						}
						try {
							type.setValue(Integer.valueOf(newName));
						} catch (NumberFormatException e) {
							e.printStackTrace();
						}
						mods.add(type);
					}  
				},
				myDocument);

				updateSelection();
			}
		});
	}
	
	private void addInst3(final Inst inst, final XtextEditor editor, final String newName) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						EList<ItemMods> mods = ((Item)input).getMods();
						ItemInst3 type = DmFactory.eINSTANCE.createItemInst3();
						switch (inst) {
						case COPYSPR:
							type.setCopyspr(true);
							break;
						}
						Integer newValue = null;
						try {
							newValue = Integer.valueOf(newName);
						} catch (NumberFormatException e) {
							// is not a number
						}
						if (newValue != null) {
							type.setValue2(Integer.valueOf(newName));
						} else {
							type.setValue1(newName);
						}
						mods.add(type);
					}  
				},
				myDocument);

				updateSelection();
			}
		});
	}

	private void removeInst(final Inst inst2, final XtextEditor editor) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						ItemMods modToRemove = null;
						EList<ItemMods> mods = ((Item)input).getMods();
						for (ItemMods mod : mods) {
							if (mod instanceof ItemInst1) {
								switch (inst2) {
								case NAME:
									if (((ItemInst1)mod).isName()){
										modToRemove = mod;
									}
									break;
								case DESCR:
									if (((ItemInst1)mod).isDescr()){
										modToRemove = mod;
									}
									break;
								case ARMOR:
									if (((ItemInst1)mod).isArmor()){
										modToRemove = mod;
									}
									break;
								}
							}
							if (mod instanceof ItemInst2) {
								switch (inst2) {
								case CONSTLEVEL:
									if (((ItemInst2)mod).isConstlevel()){
										modToRemove = mod;
									}
									break;
								case MAINPATH:
									if (((ItemInst2)mod).isMainpath()){
										modToRemove = mod;
									}
									break;
								case MAINLEVEL:
									if (((ItemInst2)mod).isMainlevel()){
										modToRemove = mod;
									}
									break;
								case SECONDARYPATH:
									if (((ItemInst2)mod).isSecondarypath()){
										modToRemove = mod;
									}
									break;
								case SECONDARYLEVEL:
									if (((ItemInst2)mod).isSecondarylevel()){
										modToRemove = mod;
									}
									break;
								case TYPE:
									if (((ItemInst2)mod).isType()){
										modToRemove = mod;
									}
									break;
								case WEAPON:
									if (((ItemInst2)mod).isWeapon()){
										modToRemove = mod;
									}
									break;
								}
							}
							if (mod instanceof ItemInst3) {
								switch (inst2) {
								case COPYSPR:
									if (((ItemInst3)mod).isCopyspr()){
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

				updateSelection();
			}
		});
	}

}
