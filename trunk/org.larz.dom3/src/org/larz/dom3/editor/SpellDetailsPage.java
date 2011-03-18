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
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
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
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.SelectSpellById;
import org.larz.dom3.dm.dm.SelectSpellByName;
import org.larz.dom3.dm.dm.Spell;
import org.larz.dom3.dm.dm.SpellInst1;
import org.larz.dom3.dm.dm.SpellInst2;
import org.larz.dom3.dm.dm.SpellInst3;
import org.larz.dom3.dm.dm.SpellInst4;
import org.larz.dom3.dm.dm.SpellInst5;
import org.larz.dom3.dm.dm.SpellMods;
import org.larz.dom3.dm.ui.internal.DmActivator;

public class SpellDetailsPage implements IDetailsPage {
	private IManagedForm mform;
	private Spell input;
	private XtextEditor doc;
	private TableViewer viewer;

	private Text name;
	private Text descr;
	private Button descCheck;

	enum Inst {
		NAME (Messages.getString("SpellDetailsSection.name.name"), ""),
		DESCR (Messages.getString("SpellDetailsSection.descr.name"), ""),
		SCHOOL (Messages.getString("SpellDetailsSection.school.name"), ""),
		RESEARCHLEVEL (Messages.getString("SpellDetailsSection.researchlevel.name"), ""),
		AOE (Messages.getString("SpellDetailsSection.aoe.name"), ""),
		DAMAGE (Messages.getString("SpellDetailsSection.damage.name"), ""),
		EFFECT (Messages.getString("SpellDetailsSection.effect.name"), ""),
		FATIGUECOST (Messages.getString("SpellDetailsSection.fatiguecost.name"), ""),
		FLIGHTSPR (Messages.getString("SpellDetailsSection.flightspr.name"), ""),
		EXPLSPR (Messages.getString("SpellDetailsSection.explspr.name"), ""),
		NREFF (Messages.getString("SpellDetailsSection.nreff.name"), ""),
		RANGE (Messages.getString("SpellDetailsSection.range.name"), ""),
		PRECISION (Messages.getString("SpellDetailsSection.precision.name"), ""),
		SOUND (Messages.getString("SpellDetailsSection.sound.name"), ""),
		SPEC (Messages.getString("SpellDetailsSection.spec.name"), ""),
		RESTRICTED (Messages.getString("SpellDetailsSection.restricted.name"), ""),
		PATH (Messages.getString("SpellDetailsSection.path.name"), ""),
		PATHLEVEL (Messages.getString("SpellDetailsSection.pathlevel.name"), ""),
		CLEAR (Messages.getString("SpellDetailsSection.clear.name"), ""),
		COPYSPELL (Messages.getString("SpellDetailsSection.copyspell.name"), ""),
		NEXTSPELL (Messages.getString("SpellDetailsSection.nextspell.name"), "");
		
		private String label;
		private String defaultValue;
		private String defaultValue2;
		
		Inst(String label, String defaultValue) {
			this.label = label;
			this.defaultValue = defaultValue;
		}
		
		Inst(String label, String defaultValue, String defaultValue2) {
			this.label = label;
			this.defaultValue = defaultValue;
			this.defaultValue2 = defaultValue2;
		}
		
		Inst(String label) {
			this.label = label;
		}
	}
	
	interface InstFields {}
	
	class Inst1Fields implements InstFields {
		private Button check;
		private Text value;
	}
	
	class Inst2Fields implements InstFields {
		private Button check;
		private Text value;
	}
	
	class Inst3Fields implements InstFields {
		private Button check;
		private Text value1;
		private Text value2;
	}
	
	class Inst4Fields implements InstFields {
		private Button check;
	}

	class Inst5Fields implements InstFields {
		private Button check;
		private Text value;
	}
	
	EnumMap<Inst, InstFields> instMap = new EnumMap<Inst, InstFields>(Inst.class);
	
	public SpellDetailsPage(XtextEditor doc, TableViewer viewer) {
		this.doc = doc;
		this.viewer = viewer;
		instMap.put(Inst.SCHOOL, new Inst2Fields());
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
	public Spell getInput() {
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

		final FormToolkit toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		s1.marginWidth = 10;
		s1.setText(Messages.getString("SpellDetailsSection.name"));
		TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
		td.grabHorizontal = true;
		s1.setLayoutData(td);
		
		final Composite client = toolkit.createComposite(parent);
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.numColumns = 2;
		glayout.makeColumnsEqualWidth = true;
		client.setLayout(glayout);
		
		final Composite nameComp = toolkit.createComposite(client);
		nameComp.setLayout(new GridLayout(2, false));
		GridData gd = new GridData(SWT.DEFAULT, SWT.FILL, false, false);
		gd.horizontalSpan = 2;
		nameComp.setLayoutData(gd);
		
		toolkit.createLabel(nameComp, Messages.getString("SpellDetailsSection.mod.name")); //$NON-NLS-1$
		
		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setSpellname(doc, input, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setSpellname(doc, input, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 500;
		name.setLayoutData(gd);
		
		descCheck = toolkit.createButton(nameComp, Messages.getString("SpellDetailsSection.mod.descr"), SWT.CHECK);

		descr = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER | SWT.WRAP); //$NON-NLS-1$
		descr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setSpelldescr(doc, input, descr.getText());
			}			
		});
		descr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setSpelldescr(doc, input, descr.getText());
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
		descCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (descCheck.getSelection()) {
					addInst1(Inst.DESCR, doc, input, "");
					descr.setEnabled(true);
					descr.setBackground(toolkit.getColors().getBackground());
					descr.setText("");
				} else {
					removeInst2(Inst.DESCR, doc, input);
					descr.setEnabled(false);
					descr.setBackground(toolkit.getColors().getInactiveBackground());
					descr.setText("");
				}
			}
		});

		Composite leftColumn = toolkit.createComposite(client);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		leftColumn.setLayout(glayout);
		leftColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Composite rightColumn = toolkit.createComposite(client);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		rightColumn.setLayout(glayout);
		rightColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));

		boolean isRight = false;
		for (final Map.Entry<Inst, InstFields> fields : instMap.entrySet()) {
			final Inst key = fields.getKey();
			final InstFields field = fields.getValue();
			final Button check = toolkit.createButton(isRight?rightColumn:leftColumn, key.label, SWT.CHECK);
			check.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (check.getSelection()) {
						if (field instanceof Inst1Fields) {
							addInst1(key, doc, input, key.defaultValue);
						} else if (field instanceof Inst2Fields) {
							addInst2(key, doc, input, key.defaultValue);
						} else if (field instanceof Inst3Fields) {
							addInst3(key, doc, input, key.defaultValue, key.defaultValue2);
						} else if (field instanceof Inst4Fields) {
							addInst4(key, doc, input);
						} else if (field instanceof Inst5Fields) {
							addInst5(key, doc, input, key.defaultValue);
						}
					} else {
						removeInst2(key, doc, input);
					}
				}

			});

			if (field instanceof Inst4Fields) {
				gd = new GridData(SWT.FILL, SWT.FILL, false, false);
				gd.horizontalSpan = 2;
				check.setLayoutData(gd);
			}

			Text myValue1 = null;
			Text myValue2 = null;
			if (field instanceof Inst1Fields ||	field instanceof Inst2Fields ||	field instanceof Inst3Fields ||	field instanceof Inst5Fields) {
				final Text value = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue1 = value;
				
				if (field instanceof Inst2Fields ||	field instanceof Inst3Fields) {
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
							setInst1(key, doc, input, value.getText());
						} else if (field instanceof Inst2Fields) {
							setInst2(key, doc, input, value.getText());
						} else if (field instanceof Inst3Fields) {
							setInst3(key, doc, input, value.getText(), null);
						} else if (field instanceof Inst5Fields) {
							setInst5(key, doc, input, value.getText());
						}
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							if (field instanceof Inst1Fields) {
								setInst1(key, doc, input, value.getText());
							} else if (field instanceof Inst2Fields) {
								setInst2(key, doc, input, value.getText());
							} else if (field instanceof Inst3Fields) {
								setInst3(key, doc, input, value.getText(), null);
							} else if (field instanceof Inst5Fields) {
								setInst5(key, doc, input, value.getText());
							}
						}
					}
				});
				value.setEnabled(false);
				if (field instanceof Inst1Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.widthHint = 160;
					gd.horizontalSpan = 4;
				} else if (field instanceof Inst2Fields ||	field instanceof Inst3Fields) {
					gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
					gd.widthHint = 30;
				} else if (field instanceof Inst5Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.horizontalSpan = 4;
				}
				value.setLayoutData(gd);
				
			}
				
			Label defaultLabel1 = null;
			
			if (field instanceof Inst2Fields || field instanceof Inst3Fields|| field instanceof Inst4Fields) {
				defaultLabel1 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel1.setEnabled(false);
			}
			if (field instanceof Inst2Fields) {
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.horizontalSpan = 3;
				defaultLabel1.setLayoutData(gd);
			} else if (field instanceof Inst4Fields) {
				createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
			}

			Label defaultLabel2 = null;
			if (field instanceof Inst3Fields) {
				final Text value = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue2 = value;
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
						} else {
							value.setEnabled(false);
							value.setText("");
						}
					}

				});
				value.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						setInst3(key, doc, input, null, value.getText());
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							setInst3(key, doc, input, null, value.getText());
						}
					}
				});
				value.setEnabled(false);
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.widthHint = 30;
				value.setLayoutData(gd);
				
				defaultLabel2 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel2.setEnabled(false);
			}
			
			if (field instanceof Inst1Fields) {
				((Inst1Fields)field).check = check;
				((Inst1Fields)field).value = myValue1;
			} else if (field instanceof Inst2Fields) {
				((Inst2Fields)field).check = check;
				((Inst2Fields)field).value = myValue1;
				//((Inst2Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst3Fields) {
				((Inst3Fields)field).check = check;
				((Inst3Fields)field).value1 = myValue1;
				//((Inst3Fields)field).defaultLabel1 = defaultLabel1;
				((Inst3Fields)field).value2 = myValue2;
				//((Inst3Fields)field).defaultLabel2 = defaultLabel2;
			} else if (field instanceof Inst4Fields) {
				((Inst4Fields)field).check = check;
				//((Inst4Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst5Fields) {
				((Inst5Fields)field).check = check;
				((Inst5Fields)field).value = myValue1;
			}

			isRight = !isRight;
		}

		createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
	}
	
	private void createSpacer(FormToolkit toolkit, Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);
	}
	
	public void update() {
		if (input != null) {
			if (input instanceof SelectSpellByName || input instanceof SelectSpellById) {
				String str = getSelectSpellname(input);
				name.setText(str!= null?str:"");
				name.setEnabled(false);

				
			} else {
				String str = getInst1(Inst.NAME, input);
				name.setText(str!=null?str:"");
				
			}
			
			String description = getInst1(Inst.DESCR, input);
			final FormToolkit toolkit = mform.getToolkit();
			if (description != null) {
				descr.setText(description);
				descr.setEnabled(true);
				descr.setBackground(toolkit.getColors().getBackground());
				descCheck.setSelection(true);
			} else {
				descr.setText("");
				descr.setEnabled(false);
				descr.setBackground(toolkit.getColors().getInactiveBackground());
				descCheck.setSelection(false);
			}

		}
		for (Map.Entry<Inst, InstFields> fields : instMap.entrySet()) {
			String val1 = getInst1(fields.getKey(), input);
			if (val1 != null) {
				if (fields.getValue() instanceof Inst1Fields) {
					((Inst1Fields)fields.getValue()).value.setText(val1);
					((Inst1Fields)fields.getValue()).value.setEnabled(true);
					((Inst1Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst1Fields) {
					((Inst1Fields)fields.getValue()).value.setText("");
					((Inst1Fields)fields.getValue()).value.setEnabled(false);
					((Inst1Fields)fields.getValue()).check.setSelection(false);
				}
			}
			Integer val = getInst2(fields.getKey(), input);
			if (val != null) {
				if (fields.getValue() instanceof Inst2Fields) {
					((Inst2Fields)fields.getValue()).value.setText(val.toString());
					((Inst2Fields)fields.getValue()).value.setEnabled(true);
					((Inst2Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst2Fields) {
					((Inst2Fields)fields.getValue()).value.setText("");
					((Inst2Fields)fields.getValue()).value.setEnabled(false);
					((Inst2Fields)fields.getValue()).check.setSelection(false);
				}
			}
			Integer[] vals = getInst3(fields.getKey(), input);
			if (vals != null) {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).value1.setText(vals[0].toString());
					((Inst3Fields)fields.getValue()).value1.setEnabled(true);
					((Inst3Fields)fields.getValue()).value2.setText(vals[1].toString());
					((Inst3Fields)fields.getValue()).value2.setEnabled(true);
					((Inst3Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).value1.setText("");
					((Inst3Fields)fields.getValue()).value1.setEnabled(false);
					((Inst3Fields)fields.getValue()).value2.setText("");
					((Inst3Fields)fields.getValue()).value2.setEnabled(false);
					((Inst3Fields)fields.getValue()).check.setSelection(false);
				}
			}
			Boolean isVal = getInst4(fields.getKey(), input);
			if (isVal != null) {
				if (fields.getValue() instanceof Inst4Fields) {
					((Inst4Fields)fields.getValue()).check.setSelection(isVal);
				}
			}
			Object val5 = getInst5(fields.getKey(), input);
			if (val5 != null) {
				if (fields.getValue() instanceof Inst5Fields) {
					((Inst5Fields)fields.getValue()).value.setText(val5.toString());
					((Inst5Fields)fields.getValue()).value.setEnabled(true);
					((Inst5Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst5Fields) {
					((Inst5Fields)fields.getValue()).value.setText("");
					((Inst5Fields)fields.getValue()).value.setEnabled(false);
					((Inst5Fields)fields.getValue()).check.setSelection(false);
				}
			}
//			if (input instanceof SelectSpellByName || input instanceof SelectSpellById) {
//				switch (fields.getKey()) {
//				case SPECIALLOOK:
//					if (spellDB.speciallook != null) {
//						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", spellDB.speciallook));
//						Inst.SPECIALLOOK.defaultValue = spellDB.speciallook.toString();
//					}
//					break;
//				}
//			}
		}
	}
	
	private String getSelectSpellname(Spell spell) {
		if (spell instanceof SelectSpellByName) {
			return ((SelectSpellByName)spell).getValue();
		} else {
			int id = ((SelectSpellById)spell).getValue();
			return "Spell: " + id;
		}
	}
	
//	private int getSelectSpellid(Spell spell) {
//		if (spell instanceof SelectSpellByName) {
//			return ((SelectSpellByName) spell).getValue());
//		} else {
//			return ((SelectSpellById)spell).getValue();
//		}
//	}
	
	private void setSpellname(final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst1) {
						if (((SpellInst1)mod).isName()) {
							((SpellInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					SpellInst1 nameInst = DmFactory.eINSTANCE.createSpellInst1();
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setSpelldescr(final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst1) {
						if (((SpellInst1)mod).isDescr()) {
							((SpellInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					SpellInst1 nameInst = DmFactory.eINSTANCE.createSpellInst1();
					nameInst.setDescr(true);
					nameInst.setValue(newName);
					mods.add(nameInst);
				}
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private String getInst1(Inst inst2, Spell armor) {
		EList<SpellMods> list = armor.getMods();
		for (SpellMods mod : list) {
			if (mod instanceof SpellInst1) {
				switch (inst2) {
				case NAME:
					if (((SpellInst1)mod).isName()){
						return ((SpellInst1)mod).getValue();
					}
					break;
				case DESCR:
					if (((SpellInst1)mod).isDescr()){
						return ((SpellInst1)mod).getValue();
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer getInst2(Inst inst2, Spell armor) {
		EList<SpellMods> list = armor.getMods();
		for (SpellMods mod : list) {
			if (mod instanceof SpellInst2) {
				switch (inst2) {
				case SCHOOL:
					if (((SpellInst2)mod).isSchool()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case RESEARCHLEVEL:
					if (((SpellInst2)mod).isResearchlevel()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case AOE:
					if (((SpellInst2)mod).isAoe()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case DAMAGE:
					if (((SpellInst2)mod).isDamage()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case EFFECT:
					if (((SpellInst2)mod).isEffect()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case FATIGUECOST:
					if (((SpellInst2)mod).isFatiguecost()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case FLIGHTSPR:
					if (((SpellInst2)mod).isFlightspr()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case EXPLSPR:
					if (((SpellInst2)mod).isExplspr()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case NREFF:
					if (((SpellInst2)mod).isNreff()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case RANGE:
					if (((SpellInst2)mod).isRange()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case PRECISION:
					if (((SpellInst2)mod).isPrecision()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case SOUND:
					if (((SpellInst2)mod).isSound()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case SPEC:
					if (((SpellInst2)mod).isSpec()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				case RESTRICTED:
					if (((SpellInst2)mod).isRestricted()){
						return Integer.valueOf(((SpellInst2)mod).getValue());
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer[] getInst3(Inst inst3, Spell armor) {
		EList<SpellMods> list = armor.getMods();
		for (SpellMods mod : list) {
			if (mod instanceof SpellInst3) {
				switch (inst3) {
				case PATH:
					if (((SpellInst3)mod).isPath()) {
						return new Integer[]{Integer.valueOf(((SpellInst3)mod).getValue1()), Integer.valueOf(((SpellInst3)mod).getValue2())};
					}
					break;
				case PATHLEVEL:
					if (((SpellInst3)mod).isPathlevel()) {
						return new Integer[]{Integer.valueOf(((SpellInst3)mod).getValue1()), Integer.valueOf(((SpellInst3)mod).getValue2())};
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Boolean getInst4(Inst inst4, Spell armor) {
		EList<SpellMods> list = armor.getMods();
		for (SpellMods mod : list) {
			if (mod instanceof SpellInst4) {
				switch (inst4) {
				case CLEAR:
					if (((SpellInst4)mod).isClear()){
						return Boolean.TRUE;
					}
					break;
				}
			}
		}
		return Boolean.FALSE;
	}
	
	private Object getInst5(Inst inst2, Spell armor) {
		EList<SpellMods> list = armor.getMods();
		for (SpellMods mod : list) {
			if (mod instanceof SpellInst5) {
				switch (inst2) {
				case COPYSPELL:
					if (((SpellInst5)mod).isCopyspell()){
						String strVal = ((SpellInst5)mod).getValue1();
						Integer intVal = ((SpellInst5)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case NEXTSPELL:
					if (((SpellInst5)mod).isNextspell()){
						String strVal = ((SpellInst5)mod).getValue1();
						Integer intVal = ((SpellInst5)mod).getValue2();
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
	
	private void setInst1(final Inst inst2, final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();				
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst1) {
						switch (inst2) {
						case NAME:
							if (((SpellInst1)mod).isName()) {
								((SpellInst1)mod).setValue(newName);
							}
							break;
						case DESCR:
							if (((SpellInst1)mod).isDescr()) {
								((SpellInst1)mod).setValue(newName);
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst2(final Inst inst2, final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst2) {
						switch (inst2) {
						case SCHOOL:
							if (((SpellInst2)mod).isSchool()){
								((SpellInst2)mod).setValue(Integer.parseInt(newName));
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst3(final Inst inst3, final XtextEditor editor, final Spell armor, final String value1, final String value2) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst3) {
						switch (inst3) {
						case PATH:
							if (((SpellInst3)mod).isPath()) {
								if (value1 != null) {
									((SpellInst3)mod).setValue1(Integer.parseInt(value1));
								}
								if (value2 != null) {
									((SpellInst3)mod).setValue2(Integer.parseInt(value2));
								}
							}
							break;
						case PATHLEVEL:
							if (((SpellInst3)mod).isPathlevel()) {
								if (value1 != null) {
									((SpellInst3)mod).setValue1(Integer.parseInt(value1));
								}
								if (value2 != null) {
									((SpellInst3)mod).setValue2(Integer.parseInt(value2));
								}
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void setInst5(final Inst inst2, final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst5) {
						Integer newValue = null;
						try {
							newValue = Integer.valueOf(newName);
						} catch (NumberFormatException e) {
							// is not a number
						}

						switch (inst2) {
						case COPYSPELL:
							if (((SpellInst5)mod).isCopyspell()){
								if (newValue != null) {
									((SpellInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((SpellInst5)mod).setValue1(newName);
								}
							}
							break;
						case NEXTSPELL:
							if (((SpellInst5)mod).isNextspell()){
								if (newValue != null) {
									((SpellInst5)mod).setValue2(Integer.parseInt(newName));
								} else {
									((SpellInst5)mod).setValue1(newName);
								}
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void addInst1(final Inst inst, final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				SpellInst1 type = DmFactory.eINSTANCE.createSpellInst1();
				switch (inst) {
				case NAME:
					type.setName(true);
					break;
				case DESCR:
					type.setDescr(true);
					break;
				}
				type.setValue(newName);
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst2(final Inst inst, final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				SpellInst2 type = DmFactory.eINSTANCE.createSpellInst2();
				switch (inst) {
				case SCHOOL:
					type.setSchool(true);
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst3(final Inst inst, final XtextEditor editor, final Spell armor, final String newName1, final String newName2) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				SpellInst3 type = DmFactory.eINSTANCE.createSpellInst3();
				switch (inst) {
				case PATH:
					type.setPath(true);
					break;
				case PATHLEVEL:
					type.setPathlevel(true);
					break;
				}
				type.setValue1(Integer.valueOf(newName1));
				type.setValue2(Integer.valueOf(newName2));
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst4(final Inst inst, final XtextEditor editor, final Spell armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				SpellInst4 type = DmFactory.eINSTANCE.createSpellInst4();
				switch (inst) {
				case CLEAR:
					type.setClear(true);
					break;
				}
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst5(final Inst inst, final XtextEditor editor, final Spell armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				EList<SpellMods> mods = armorToEdit.getMods();
				SpellInst5 type = DmFactory.eINSTANCE.createSpellInst5();
				switch (inst) {
				case COPYSPELL:
					type.setCopyspell(true);
					break;
				case NEXTSPELL:
					type.setNextspell(true);
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

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void removeInst2(final Inst inst2, final XtextEditor editor, final Spell armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Spell armorToEdit = input;
				SpellMods modToRemove = null;
				EList<SpellMods> mods = armorToEdit.getMods();
				for (SpellMods mod : mods) {
					if (mod instanceof SpellInst1) {
						switch (inst2) {
						case NAME:
							if (((SpellInst1)mod).isName()){
								modToRemove = mod;
							}
							break;
						case DESCR:
							if (((SpellInst1)mod).isDescr()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof SpellInst2) {
						switch (inst2) {
						case SCHOOL:
							if (((SpellInst2)mod).isSchool()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof SpellInst3) {
						switch (inst2) {
						case PATH:
							if (((SpellInst3)mod).isPath()){
								modToRemove = mod;
							}
							break;
						case PATHLEVEL:
							if (((SpellInst3)mod).isPathlevel()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof SpellInst4) {
						switch (inst2) {
						case CLEAR:
							if (((SpellInst4)mod).isClear()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof SpellInst5) {
						switch (inst2) {
						case COPYSPELL:
							if (((SpellInst5)mod).isCopyspell()){
								modToRemove = mod;
							}
							break;
						case NEXTSPELL:
							if (((SpellInst5)mod).isNextspell()){
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
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
			input = (Spell)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
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
