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
import org.eclipse.swt.graphics.Image;
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
import org.larz.dom3.db.Database;
import org.larz.dom3.db.NationDB;
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.Monster;
import org.larz.dom3.dm.dm.MonsterInst1;
import org.larz.dom3.dm.dm.MonsterMods;
import org.larz.dom3.dm.dm.Nation;
import org.larz.dom3.dm.dm.NationInst1;
import org.larz.dom3.dm.dm.NationInst2;
import org.larz.dom3.dm.dm.NationInst3;
import org.larz.dom3.dm.dm.NationInst4;
import org.larz.dom3.dm.dm.NationInst5;
import org.larz.dom3.dm.dm.NationMods;
import org.larz.dom3.dm.dm.SelectNation;
import org.larz.dom3.dm.ui.editor.DmXtextEditor;
import org.larz.dom3.dm.ui.internal.DmActivator;
import org.larz.dom3.image.ImageConverter;
import org.larz.dom3.image.ImageLoader;

public class NationDetailsPage implements IDetailsPage {
	private IManagedForm mform;
	private SelectNation input;
	private XtextEditor doc;
	private TableViewer viewer;

	private Text name;
	private Text descr;
	private Text summary;
	private Text brief;
	private Label spriteLabel;

	enum Inst {
		NAME (Messages.getString("NationDetailsSection.mod.name"), ""),
		EPITHET (Messages.getString("NationDetailsSection.mod.epithet"), ""),
		DESCR (Messages.getString("NationDetailsSection.mod.descr"), ""),
		SUMMARY (Messages.getString("NationDetailsSection.mod.summary"), ""),
		BRIEF (Messages.getString("NationDetailsSection.mod.brief"), ""),
		FLAG (Messages.getString("NationDetailsSection.mod.flag"), ""),
		MAPBACKGROUND (Messages.getString("NationDetailsSection.mod.mapbackground"), ""),
		STARTSITE1 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		STARTSITE2 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		STARTSITE3 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		STARTSITE4 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		ERA (Messages.getString("NationDetailsSection.mod.era"), ""),
		LABCOST (Messages.getString("NationDetailsSection.mod.labcost"), ""),
		TEMPLECOST (Messages.getString("NationDetailsSection.mod.templecost"), ""),
		TEMPLEPIC (Messages.getString("NationDetailsSection.mod.templepic"), ""),
		STARTUNITNBRS1 (Messages.getString("NationDetailsSection.mod.startunitnbrs1"), ""),
		STARTUNITNBRS2 (Messages.getString("NationDetailsSection.mod.startunitnbrs2"), ""),
		HERO1 (Messages.getString("NationDetailsSection.mod.hero1"), ""),
		HERO2 (Messages.getString("NationDetailsSection.mod.hero2"), ""),
		HERO3 (Messages.getString("NationDetailsSection.mod.hero3"), ""),
		HERO4 (Messages.getString("NationDetailsSection.mod.hero4"), ""),
		HERO5 (Messages.getString("NationDetailsSection.mod.hero5"), ""),
		HERO6 (Messages.getString("NationDetailsSection.mod.hero6"), ""),
		MULTIHERO1 (Messages.getString("NationDetailsSection.mod.multihero1"), ""),
		MULTIHERO2 (Messages.getString("NationDetailsSection.mod.multihero2"), ""),
		DEFMULT1 (Messages.getString("NationDetailsSection.mod.defmult1"), ""),
		DEFMULT1B (Messages.getString("NationDetailsSection.mod.defmult1b"), ""),
		DEFMULT2 (Messages.getString("NationDetailsSection.mod.defmult2"), ""),
		DEFMULT2B (Messages.getString("NationDetailsSection.mod.defmult2b"), ""),
		IDEALCOLD (Messages.getString("NationDetailsSection.mod.idealcold"), ""),
		CASTLEPROD (Messages.getString("NationDetailsSection.mod.castleprod"), ""),
		DOMKILL (Messages.getString("NationDetailsSection.mod.domkill"), ""),
		DOMUNREST (Messages.getString("NationDetailsSection.mod.domunrest"), ""),
		STARTFORT (Messages.getString("NationDetailsSection.mod.startfort"), ""),
		DEFAULTFORT (Messages.getString("NationDetailsSection.mod.defaultfort"), ""),
		FARMFORT (Messages.getString("NationDetailsSection.mod.farmfort"), ""),
		MOUNTAINFORT (Messages.getString("NationDetailsSection.mod.mountainfort"), ""),
		FORESTFORT (Messages.getString("NationDetailsSection.mod.forestfort"), ""),
		SWAMPFORT (Messages.getString("NationDetailsSection.mod.swampfort"), ""),
		UWFORT (Messages.getString("NationDetailsSection.mod.uwfort"), ""),
		DEEPFORT (Messages.getString("NationDetailsSection.mod.deepfort"), ""),
		CLEARNATION (Messages.getString("NationDetailsSection.mod.clearnation")),
		CLEARREC (Messages.getString("NationDetailsSection.mod.clearrec")),
		CLEARSITES (Messages.getString("NationDetailsSection.mod.clearsites")),
		UWNATION (Messages.getString("NationDetailsSection.mod.uwnation")),
		BLOODNATION (Messages.getString("NationDetailsSection.mod.bloodnation")),
		NOPREACH (Messages.getString("NationDetailsSection.mod.nopreach")),
		DYINGDOM (Messages.getString("NationDetailsSection.mod.dyingdom")),
		SACRIFICEDOM (Messages.getString("NationDetailsSection.mod.sacrificedom")),
		NODEATHSUPPLY (Messages.getString("NationDetailsSection.mod.nodeathsupply")),
		AUTOUNDEAD (Messages.getString("NationDetailsSection.mod.autoundead")),
		ZOMBIEREANIM (Messages.getString("NationDetailsSection.mod.zombiereanim")),
		HORSEREANIM (Messages.getString("NationDetailsSection.mod.horsereanim")),
		WIGHTREANIM (Messages.getString("NationDetailsSection.mod.wightreanim")),
		MANIKINREANIM (Messages.getString("NationDetailsSection.mod.manikinreanim")),
		TOMBWYRMREANIM (Messages.getString("NationDetailsSection.mod.tombwyrmreanim")),
		STARTCOM (Messages.getString("NationDetailsSection.mod.startcom"), ""),
		STARTSCOUT (Messages.getString("NationDetailsSection.mod.startscout"), ""),
		STARTUNITTYPE1 (Messages.getString("NationDetailsSection.mod.startunittype1"), ""),
		STARTUNITTYPE2 (Messages.getString("NationDetailsSection.mod.startunittype2"), ""),
		ADDRECUNIT (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECCOM (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		UWUNIT1 (Messages.getString("NationDetailsSection.mod.uwunit1"), ""),
		UWUNIT2 (Messages.getString("NationDetailsSection.mod.uwunit2"), ""),
		UWUNIT3 (Messages.getString("NationDetailsSection.mod.uwunit3"), ""),
		UWUNIT4 (Messages.getString("NationDetailsSection.mod.uwunit4"), ""),
		UWUNIT5 (Messages.getString("NationDetailsSection.mod.uwunit5"), ""),
		UWCOM1 (Messages.getString("NationDetailsSection.mod.uwcom1"), ""),
		UWCOM2 (Messages.getString("NationDetailsSection.mod.uwcom2"), ""),
		UWCOM3 (Messages.getString("NationDetailsSection.mod.uwcom3"), ""),
		UWCOM4 (Messages.getString("NationDetailsSection.mod.uwcom4"), ""),
		UWCOM5 (Messages.getString("NationDetailsSection.mod.uwcom5"), ""),
		DEFCOM1 (Messages.getString("NationDetailsSection.mod.defcom1"), ""),
		DEFCOM2 (Messages.getString("NationDetailsSection.mod.defcom2"), ""),
		DEFUNIT1 (Messages.getString("NationDetailsSection.mod.defunit1"), ""),
		DEFUNIT1B (Messages.getString("NationDetailsSection.mod.defunit1b"), ""),
		DEFUNIT2 (Messages.getString("NationDetailsSection.mod.defunit2"), ""),
		DEFUNIT2B (Messages.getString("NationDetailsSection.mod.defunit2b"), ""),
		COLOR (Messages.getString("NationDetailsSection.mod.color"));
		
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
		private Label defaultLabel;
	}
	
	class Inst3Fields implements InstFields {
		private Button check;
		private Label defaultLabel;
	}

	class Inst4Fields implements InstFields {
		private Button check;
		private Text value;
	}
	
	class Inst5Fields implements InstFields {
		private Button check;
		private Text value1;
		private Text value2;
		private Text value3;
	}

	EnumMap<Inst, InstFields> instMap = new EnumMap<Inst, InstFields>(Inst.class);
	
	public NationDetailsPage(XtextEditor doc, TableViewer viewer) {
		this.doc = doc;
		this.viewer = viewer;
		//instMap.put(Inst.NAME, new Inst1Fields());
		instMap.put(Inst.EPITHET, new Inst1Fields());
		//instMap.put(Inst.DESCR, new Inst1Fields());
		//instMap.put(Inst.SUMMARY, new Inst1Fields());
		//instMap.put(Inst.BRIEF, new Inst1Fields());
		instMap.put(Inst.FLAG, new Inst1Fields());
		instMap.put(Inst.MAPBACKGROUND, new Inst1Fields());
		instMap.put(Inst.STARTSITE1, new Inst1Fields());
		instMap.put(Inst.STARTSITE2, new Inst1Fields());
		instMap.put(Inst.STARTSITE3, new Inst1Fields());
		instMap.put(Inst.STARTSITE4, new Inst1Fields());
		instMap.put(Inst.ERA, new Inst2Fields());
		instMap.put(Inst.LABCOST, new Inst2Fields());
		instMap.put(Inst.TEMPLECOST, new Inst2Fields());
		instMap.put(Inst.TEMPLEPIC, new Inst2Fields());
		instMap.put(Inst.STARTUNITNBRS1, new Inst2Fields());
		instMap.put(Inst.STARTUNITNBRS2, new Inst2Fields());
		instMap.put(Inst.HERO1, new Inst2Fields());
		instMap.put(Inst.HERO2, new Inst2Fields());
		instMap.put(Inst.HERO3, new Inst2Fields());
		instMap.put(Inst.HERO4, new Inst2Fields());
		instMap.put(Inst.HERO5, new Inst2Fields());
		instMap.put(Inst.HERO6, new Inst2Fields());
		instMap.put(Inst.MULTIHERO1, new Inst2Fields());
		instMap.put(Inst.MULTIHERO2, new Inst2Fields());
		instMap.put(Inst.DEFMULT1, new Inst2Fields());
		instMap.put(Inst.DEFMULT1B, new Inst2Fields());
		instMap.put(Inst.DEFMULT2, new Inst2Fields());
		instMap.put(Inst.DEFMULT2B, new Inst2Fields());
		instMap.put(Inst.IDEALCOLD, new Inst2Fields());
		instMap.put(Inst.CASTLEPROD, new Inst2Fields());
		instMap.put(Inst.DOMKILL, new Inst2Fields());
		instMap.put(Inst.DOMUNREST, new Inst2Fields());
		instMap.put(Inst.STARTFORT, new Inst2Fields());
		instMap.put(Inst.DEFAULTFORT, new Inst2Fields());
		instMap.put(Inst.FARMFORT, new Inst2Fields());
		instMap.put(Inst.MOUNTAINFORT, new Inst2Fields());
		instMap.put(Inst.FORESTFORT, new Inst2Fields());
		instMap.put(Inst.SWAMPFORT, new Inst2Fields());
		instMap.put(Inst.UWFORT, new Inst2Fields());
		instMap.put(Inst.DEEPFORT, new Inst2Fields());
		instMap.put(Inst.CLEARNATION, new Inst3Fields());
		instMap.put(Inst.CLEARREC, new Inst3Fields());
		instMap.put(Inst.CLEARSITES, new Inst3Fields());
		instMap.put(Inst.UWNATION, new Inst3Fields());
		instMap.put(Inst.BLOODNATION, new Inst3Fields());
		instMap.put(Inst.NOPREACH, new Inst3Fields());
		instMap.put(Inst.DYINGDOM, new Inst3Fields());
		instMap.put(Inst.SACRIFICEDOM, new Inst3Fields());
		instMap.put(Inst.NODEATHSUPPLY, new Inst3Fields());
		instMap.put(Inst.AUTOUNDEAD, new Inst3Fields());
		instMap.put(Inst.ZOMBIEREANIM, new Inst3Fields());
		instMap.put(Inst.HORSEREANIM, new Inst3Fields());
		instMap.put(Inst.WIGHTREANIM, new Inst3Fields());
		instMap.put(Inst.MANIKINREANIM, new Inst3Fields());
		instMap.put(Inst.TOMBWYRMREANIM, new Inst3Fields());
		instMap.put(Inst.STARTCOM, new Inst4Fields());
		instMap.put(Inst.STARTSCOUT, new Inst4Fields());
		instMap.put(Inst.STARTUNITTYPE1, new Inst4Fields());
		instMap.put(Inst.STARTUNITTYPE2, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM, new Inst4Fields());
		instMap.put(Inst.UWUNIT1, new Inst4Fields());
		instMap.put(Inst.UWUNIT2, new Inst4Fields());
		instMap.put(Inst.UWUNIT3, new Inst4Fields());
		instMap.put(Inst.UWUNIT4, new Inst4Fields());
		instMap.put(Inst.UWUNIT5, new Inst4Fields());
		instMap.put(Inst.UWCOM1, new Inst4Fields());
		instMap.put(Inst.UWCOM2, new Inst4Fields());
		instMap.put(Inst.UWCOM3, new Inst4Fields());
		instMap.put(Inst.UWCOM4, new Inst4Fields());
		instMap.put(Inst.UWCOM5, new Inst4Fields());
		instMap.put(Inst.DEFCOM1, new Inst4Fields());
		instMap.put(Inst.DEFCOM2, new Inst4Fields());
		instMap.put(Inst.DEFUNIT1, new Inst4Fields());
		instMap.put(Inst.DEFUNIT1B, new Inst4Fields());
		instMap.put(Inst.DEFUNIT2, new Inst4Fields());
		instMap.put(Inst.DEFUNIT2B, new Inst4Fields());
		instMap.put(Inst.COLOR, new Inst5Fields());
		
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
	public Nation getInput() {
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
		s1.setText(Messages.getString("NationDetailsSection.name")); //$NON-NLS-1$
		s1.setDescription(Messages.getString("NationDetailsPage.name")); //$NON-NLS-1$
		TableWrapData td = new TableWrapData(TableWrapData.FILL, TableWrapData.TOP);
		td.grabHorizontal = true;
		s1.setLayoutData(td);
		final Composite client = toolkit.createComposite(s1);
		GridLayout glayout = new GridLayout();
		glayout.marginWidth = glayout.marginHeight = 0;
		glayout.numColumns = 2;
		glayout.makeColumnsEqualWidth = true;
		client.setLayout(glayout);
		
		Composite nameComp = toolkit.createComposite(client);
		nameComp.setLayout(new GridLayout(2, false));
		GridData gd = new GridData(SWT.DEFAULT, SWT.FILL, false, false);
		gd.horizontalSpan = 2;
		nameComp.setLayoutData(gd);
		
		toolkit.createLabel(nameComp, Messages.getString("NationDetailsSection.mod.name")); //$NON-NLS-1$
		
		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setNationname(doc, input, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setNationname(doc, input, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 400;
		name.setLayoutData(gd);
		
		toolkit.createLabel(nameComp, Messages.getString("NationDetailsSection.mod.descr")); //$NON-NLS-1$
		
		descr = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		descr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setNationdescr(doc, input, descr.getText());
			}			
		});
		descr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setNationdescr(doc, input, descr.getText());
				}
			}
			
		});
		descr.setLayoutData(new GridData(600, SWT.DEFAULT));
		descr.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = descr.getSize().y;
				int preferredHeight = descr.computeSize(600, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)descr.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		
		toolkit.createLabel(nameComp, Messages.getString("NationDetailsSection.mod.summary")); //$NON-NLS-1$
		
		summary = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		summary.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setInst1(Inst.SUMMARY, doc, input, summary.getText());
			}			
		});
		summary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setInst1(Inst.SUMMARY, doc, input, summary.getText());
				}
			}
			
		});
		summary.setLayoutData(new GridData(600, SWT.DEFAULT));
		summary.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = summary.getSize().y;
				int preferredHeight = summary.computeSize(600, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)summary.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		
		toolkit.createLabel(nameComp, Messages.getString("NationDetailsSection.mod.brief")); //$NON-NLS-1$
		
		brief = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		brief.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setInst1(Inst.BRIEF, doc, input, brief.getText());
			}			
		});
		brief.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setInst1(Inst.BRIEF, doc, input, brief.getText());
				}
			}
			
		});
		brief.setLayoutData(new GridData(600, SWT.DEFAULT));
		brief.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = brief.getSize().y;
				int preferredHeight = brief.computeSize(600, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)brief.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		
		spriteLabel = new Label(nameComp, SWT.NONE);

		Composite leftColumn = new Composite(client, SWT.NONE);
		glayout = new GridLayout(5, false);
		glayout.marginHeight = 0;
		glayout.marginWidth = 0;
		leftColumn.setLayout(glayout);
		leftColumn.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
		
		Composite rightColumn = new Composite(client, SWT.NONE);
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
							addInst3(key, doc, input);
						} else if (field instanceof Inst4Fields) {
							addInst4(key, doc, input, key.defaultValue);
						} else if (field instanceof Inst5Fields) {
							addInst5(key, doc, input, key.defaultValue, key.defaultValue2, key.defaultValue2);
						}
					} else {
						removeInst2(key, doc, input);
					}
				}

			});

			Text myValue1 = null;
			Text myValue2 = null;
			Text myValue3 = null;
			if (field instanceof Inst1Fields ||	field instanceof Inst2Fields ||	field instanceof Inst4Fields ||	field instanceof Inst5Fields) {
				final Text value = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue1 = value;
				
				if (field instanceof Inst2Fields ||	field instanceof Inst4Fields) {
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
						} else if (field instanceof Inst4Fields) {
							setInst4(key, doc, input, value.getText());
						} else if (field instanceof Inst5Fields) {
							setInst5(key, doc, input, value.getText(), null, null);
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
								setInst4(key, doc, input, value.getText());
							} else if (field instanceof Inst5Fields) {
								setInst5(key, doc, input, value.getText(), null, null);
							}
						}
					}
				});
				value.setEnabled(false);
				if (field instanceof Inst1Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.horizontalSpan = 4;
				} else if (field instanceof Inst2Fields ||	field instanceof Inst4Fields) {
					gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
					gd.widthHint = 30;
				} else if (field instanceof Inst3Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.horizontalSpan = 2;
				} else if (field instanceof Inst5Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.horizontalSpan = 4;
				}
				value.setLayoutData(gd);
				
			}
				
			Label defaultLabel1 = null;
			
			if (field instanceof Inst2Fields || field instanceof Inst3Fields || field instanceof Inst4Fields) {
				defaultLabel1 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel1.setEnabled(false);
			}
			if (field instanceof Inst2Fields || field instanceof Inst4Fields) {
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.horizontalSpan = 3;
				defaultLabel1.setLayoutData(gd);
			} else if (field instanceof Inst3Fields) {
				gd = new GridData(SWT.FILL, SWT.FILL, false, false);
				gd.horizontalSpan = 2;
				check.setLayoutData(gd);
				createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
			}

			Label defaultLabel2 = null;
			if (field instanceof Inst5Fields) {
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
						setInst5(key, doc, input, null, value.getText(), null);
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							setInst5(key, doc, input, null, value.getText(), null);
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
				((Inst2Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst3Fields) {
				((Inst3Fields)field).check = check;
				((Inst3Fields)field).defaultLabel = defaultLabel1;
			} else if (field instanceof Inst4Fields) {
				((Inst4Fields)field).check = check;
				((Inst4Fields)field).value = myValue1;
			} else if (field instanceof Inst5Fields) {
				((Inst5Fields)field).check = check;
				((Inst5Fields)field).value1 = myValue1;
				((Inst5Fields)field).value2 = myValue2;
				((Inst5Fields)field).value3 = myValue3;
			}

			isRight = !isRight;
		}

		createSpacer(toolkit, isRight?rightColumn:leftColumn, 2);
		
		s1.setClient(client);
	}
	
	private void createSpacer(FormToolkit toolkit, Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);
	}
	
	public void update() {
		if (input != null) {
			String str = getNationname(input);
			name.setText(str!= null?str:"");
			name.setEnabled(false);
			String description = getNationdesc(input);
			descr.setText(description!=null?description:"");
			String summaryStr = getInst1(Inst.SUMMARY, input);
			summary.setText(summaryStr!=null?summaryStr:"");
			String briefStr = getInst1(Inst.BRIEF, input);
			brief.setText(summaryStr!=null?briefStr:"");

			String sprite = getSprite(input);

			if (sprite != null) {
				final String finalName1 = sprite;
				ImageLoader loader1 = new ImageLoader() {
					@Override
					public InputStream getStream() throws IOException {
						String path = ((DmXtextEditor)doc).getPath();
						path = path.substring(0, path.lastIndexOf('/')+1);
						if (finalName1.startsWith("./")) {
							path += finalName1.substring(2);
						} else {
							path += finalName1;
						}

						return new FileInputStream(new File(path));
					}
				};
				try {
					Image image1 = new Image(null, ImageConverter.convertToSWT(ImageConverter.cropImage(loader1.loadImage())));
					spriteLabel.setImage(image1);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				spriteLabel.setImage(null);
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
			Boolean isVal = getInst3(fields.getKey(), input);
			if (isVal != null) {
				if (fields.getValue() instanceof Inst3Fields) {
					((Inst3Fields)fields.getValue()).check.setSelection(isVal);
				}
			}
			Object val5 = getInst4(fields.getKey(), input);
			if (val5 != null) {
				if (fields.getValue() instanceof Inst4Fields) {
					((Inst4Fields)fields.getValue()).value.setText(val5.toString());
					((Inst4Fields)fields.getValue()).value.setEnabled(true);
					((Inst4Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst4Fields) {
					((Inst4Fields)fields.getValue()).value.setText("");
					((Inst4Fields)fields.getValue()).value.setEnabled(false);
					((Inst4Fields)fields.getValue()).check.setSelection(false);
				}
			}
			if (input instanceof SelectNation) {
				NationDB nationDB = Database.getNation(((SelectNation)input).getValue());
//				switch (fields.getKey()) {
//				case SPECIALLOOK:
//					((Inst2Fields)fields.getValue()).defaultLabel.setText(nationDB.speciallook != null ? Messages.format("DetailsPage.DefaultLabel.fmt", nationDB.speciallook) : "");
//					break;
//				}
			}
		}
	}
	
	private String getNationname(SelectNation nation) {
		EList<NationMods> list = nation.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst1) {
				if (((NationInst1)mod).isName()) {
					return ((NationInst1)mod).getValue();
				}
			}
		}
		return null;
	}
	
	private String getSprite(SelectNation nation) {
		EList<NationMods> list = nation.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst1) {
				if (((NationInst1)mod).isFlag()) {
					return ((NationInst1)mod).getValue();
				}
			}
		}
		return null;
	}
	
	private void setNationname(final XtextEditor editor, final Nation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (NationMods mod : mods) {
					if (mod instanceof NationInst1) {
						if (((NationInst1)mod).isName()) {
							((NationInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					NationInst1 nameInst = DmFactory.eINSTANCE.createNationInst1();
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private String getNationdesc(SelectNation nation) {
		EList<NationMods> list = nation.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst1) {
				if (((NationInst1)mod).isDescr()) {
					return ((NationInst1)mod).getValue();
				}
			}
		}
		return null;
	}
	
	private void setNationdescr(final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				boolean nameSet = false;
				for (NationMods mod : mods) {
					if (mod instanceof NationInst1) {
						if (((NationInst1)mod).isDescr()) {
							((NationInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					NationInst1 nameInst = DmFactory.eINSTANCE.createNationInst1();
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private String getInst1(Inst inst2, SelectNation armor) {
		EList<NationMods> list = armor.getMods();
		int siteCount = 0;
		for (NationMods mod : list) {
			if (mod instanceof NationInst1) {
				switch (inst2) {
				case EPITHET:
					if (((NationInst1)mod).isEpithet()){
						return ((NationInst1)mod).getValue();
					}
					break;
				case SUMMARY:
					if (((NationInst1)mod).isSummary()){
						return ((NationInst1)mod).getValue();
					}
					break;
				case BRIEF:
					if (((NationInst1)mod).isBrief()){
						return ((NationInst1)mod).getValue();
					}
					break;
				case FLAG:
					if (((NationInst1)mod).isFlag()){
						return ((NationInst1)mod).getValue();
					}
					break;
				case MAPBACKGROUND:
					if (((NationInst1)mod).isMapbackground()){
						return ((NationInst1)mod).getValue();
					}
					break;
				case STARTSITE1:
					if (((NationInst1)mod).isStartsite()){
						siteCount++;
						if (siteCount == 1) {
							return ((NationInst1)mod).getValue();
						}
					}
					break;
				case STARTSITE2:
					if (((NationInst1)mod).isStartsite()){
						siteCount++;
						if (siteCount == 2) {
							return ((NationInst1)mod).getValue();
						}
					}
					break;
				case STARTSITE3:
					if (((NationInst1)mod).isStartsite()){
						siteCount++;
						if (siteCount == 3) {
							return ((NationInst1)mod).getValue();
						}
					}
					break;
				case STARTSITE4:
					if (((NationInst1)mod).isStartsite()){
						siteCount++;
						if (siteCount == 4) {
							return ((NationInst1)mod).getValue();
						}
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer getInst2(Inst inst2, SelectNation armor) {
		EList<NationMods> list = armor.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst2) {
				switch (inst2) {
				case ERA:
					if (((NationInst2)mod).isEra()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case LABCOST:
					if (((NationInst2)mod).isLabcost()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case TEMPLECOST:
					if (((NationInst2)mod).isTemplecost()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case TEMPLEPIC:
					if (((NationInst2)mod).isTemplepic()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case STARTUNITNBRS1:
					if (((NationInst2)mod).isStartunitnbrs1()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case STARTUNITNBRS2:
					if (((NationInst2)mod).isStartunitnbrs2()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case HERO1:
					if (((NationInst2)mod).isHero1()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case HERO2:
					if (((NationInst2)mod).isHero2()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case HERO3:
					if (((NationInst2)mod).isHero3()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case HERO4:
					if (((NationInst2)mod).isHero4()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case HERO5:
					if (((NationInst2)mod).isHero5()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case HERO6:
					if (((NationInst2)mod).isHero6()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case MULTIHERO1:
					if (((NationInst2)mod).isMultihero1()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case MULTIHERO2:
					if (((NationInst2)mod).isMultihero2()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DEFMULT1:
					if (((NationInst2)mod).isDefmult1()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DEFMULT1B:
					if (((NationInst2)mod).isDefmult1b()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DEFMULT2:
					if (((NationInst2)mod).isDefmult2()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DEFMULT2B:
					if (((NationInst2)mod).isDefmult2b()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case IDEALCOLD:
					if (((NationInst2)mod).isIdealcold()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case CASTLEPROD:
					if (((NationInst2)mod).isCastleprod()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DOMKILL:
					if (((NationInst2)mod).isDomkill()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DOMUNREST:
					if (((NationInst2)mod).isDomunrest()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case STARTFORT:
					if (((NationInst2)mod).isStartfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DEFAULTFORT:
					if (((NationInst2)mod).isDefaultfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case FARMFORT:
					if (((NationInst2)mod).isFarmfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case MOUNTAINFORT:
					if (((NationInst2)mod).isMountainfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case FORESTFORT:
					if (((NationInst2)mod).isForestfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case SWAMPFORT:
					if (((NationInst2)mod).isSwampfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case UWFORT:
					if (((NationInst2)mod).isUwfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				case DEEPFORT:
					if (((NationInst2)mod).isDeepfort()){
						return Integer.valueOf(((NationInst2)mod).getValue());
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Boolean getInst3(Inst inst3, SelectNation armor) {
		EList<NationMods> list = armor.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst3) {
				switch (inst3) {
				case CLEARNATION:
					if (((NationInst3)mod).isClearnation()){
						return Boolean.TRUE;
					}
					break;
				case CLEARREC:
					if (((NationInst3)mod).isClearrec()){
						return Boolean.TRUE;
					}
					break;
				case CLEARSITES:
					if (((NationInst3)mod).isClearsites()){
						return Boolean.TRUE;
					}
					break;
				case UWNATION:
					if (((NationInst3)mod).isUwnation()){
						return Boolean.TRUE;
					}
					break;
				case BLOODNATION:
					if (((NationInst3)mod).isBloodnation()){
						return Boolean.TRUE;
					}
					break;
				case NOPREACH:
					if (((NationInst3)mod).isNopreach()){
						return Boolean.TRUE;
					}
					break;
				case DYINGDOM:
					if (((NationInst3)mod).isDyingdom()){
						return Boolean.TRUE;
					}
					break;
				case SACRIFICEDOM:
					if (((NationInst3)mod).isSacrificedom()){
						return Boolean.TRUE;
					}
					break;
				case NODEATHSUPPLY:
					if (((NationInst3)mod).isNodeathsupply()){
						return Boolean.TRUE;
					}
					break;
				case AUTOUNDEAD:
					if (((NationInst3)mod).isAutoundead()){
						return Boolean.TRUE;
					}
					break;
				case ZOMBIEREANIM:
					if (((NationInst3)mod).isZombiereanim()){
						return Boolean.TRUE;
					}
					break;
				case HORSEREANIM:
					if (((NationInst3)mod).isHorsereanim()){
						return Boolean.TRUE;
					}
					break;
				case WIGHTREANIM:
					if (((NationInst3)mod).isWightreanim()){
						return Boolean.TRUE;
					}
					break;
				case MANIKINREANIM:
					if (((NationInst3)mod).isManikinreanim()){
						return Boolean.TRUE;
					}
					break;
				case TOMBWYRMREANIM:
					if (((NationInst3)mod).isTombwyrmreanim()){
						return Boolean.TRUE;
					}
					break;
				}
			}
		}
		return Boolean.FALSE;
	}
	
	private Object getInst4(Inst inst4, SelectNation armor) {
		EList<NationMods> list = armor.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst4) {
				switch (inst4) {
				case STARTCOM:
					if (((NationInst4)mod).isStartcom()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case STARTSCOUT:
					if (((NationInst4)mod).isStartscout()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case STARTUNITTYPE1:
					if (((NationInst4)mod).isStartunittype1()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case STARTUNITTYPE2:
					if (((NationInst4)mod).isStartunittype2()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case ADDRECUNIT:
					if (((NationInst4)mod).isAddrecunit()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case ADDRECCOM:
					if (((NationInst4)mod).isAddreccom()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWUNIT1:
					if (((NationInst4)mod).isUwunit1()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWUNIT2:
					if (((NationInst4)mod).isUwunit2()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWUNIT3:
					if (((NationInst4)mod).isUwunit3()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWUNIT4:
					if (((NationInst4)mod).isUwunit4()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWUNIT5:
					if (((NationInst4)mod).isUwunit5()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWCOM1:
					if (((NationInst4)mod).isUwcom1()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWCOM2:
					if (((NationInst4)mod).isUwcom2()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWCOM3:
					if (((NationInst4)mod).isUwcom3()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWCOM4:
					if (((NationInst4)mod).isUwcom4()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case UWCOM5:
					if (((NationInst4)mod).isUwcom5()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DEFCOM1:
					if (((NationInst4)mod).isDefcom1()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DEFCOM2:
					if (((NationInst4)mod).isDefcom2()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DEFUNIT1:
					if (((NationInst4)mod).isDefunit1()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DEFUNIT1B:
					if (((NationInst4)mod).isDefunit1b()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DEFUNIT2:
					if (((NationInst4)mod).isDefunit2()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
						if (strVal != null) {
							return strVal;
						}
						return intVal;
					}
					break;
				case DEFUNIT2B:
					if (((NationInst4)mod).isDefunit2b()){
						String strVal = ((NationInst4)mod).getValue1();
						Integer intVal = ((NationInst4)mod).getValue2();
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
	
	private Double[] getInst5(Inst inst5, SelectNation armor) {
		EList<NationMods> list = armor.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst5) {
				switch (inst5) {
				case COLOR:
					if (((NationInst5)mod).isColor()){
						return new Double[]{Double.valueOf(((NationInst5)mod).getValue1()), Double.valueOf(((NationInst5)mod).getValue2()), Double.valueOf(((NationInst5)mod).getValue3())};
					}
					break;
				}
			}
		}
		return null;
	}
	
	private void setInst1(final Inst inst2, final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				int siteCount = 0;
				EList<NationMods> mods = armorToEdit.getMods();				
				for (NationMods mod : mods) {
					if (mod instanceof NationInst1) {
						switch (inst2) {
						case EPITHET:
							if (((NationInst1)mod).isEpithet()) {
								((NationInst1)mod).setValue(newName);
							}
							break;
						case SUMMARY:
							if (((NationInst1)mod).isSummary()) {
								((NationInst1)mod).setValue(newName);
							}
							break;
						case BRIEF:
							if (((NationInst1)mod).isBrief()) {
								((NationInst1)mod).setValue(newName);
							}
							break;
						case FLAG:
							if (((NationInst1)mod).isFlag()) {
								((NationInst1)mod).setValue(newName);
							}
							break;
						case MAPBACKGROUND:
							if (((NationInst1)mod).isMapbackground()) {
								((NationInst1)mod).setValue(newName);
							}
							break;
						case STARTSITE1:
							if (((NationInst1)mod).isStartsite()) {
								siteCount++;
								if (siteCount == 1) {
									((NationInst1)mod).setValue(newName);
								}
							}
							break;
						case STARTSITE2:
							if (((NationInst1)mod).isStartsite()) {
								siteCount++;
								if (siteCount == 2) {
									((NationInst1)mod).setValue(newName);
								}
							}
							break;
						case STARTSITE3:
							if (((NationInst1)mod).isStartsite()) {
								siteCount++;
								if (siteCount == 3) {
									((NationInst1)mod).setValue(newName);
								}
							}
							break;
						case STARTSITE4:
							if (((NationInst1)mod).isStartsite()) {
								siteCount++;
								if (siteCount == 4) {
									((NationInst1)mod).setValue(newName);
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst2(final Inst inst2, final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				for (NationMods mod : mods) {
					if (mod instanceof NationInst2) {
						switch (inst2) {
						case ERA:
							if (((NationInst2)mod).isEra()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case LABCOST:
							if (((NationInst2)mod).isLabcost()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case TEMPLECOST:
							if (((NationInst2)mod).isTemplecost()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case TEMPLEPIC:
							if (((NationInst2)mod).isTemplepic()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STARTUNITNBRS1:
							if (((NationInst2)mod).isStartunitnbrs1()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STARTUNITNBRS2:
							if (((NationInst2)mod).isStartunitnbrs2()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERO1:
							if (((NationInst2)mod).isHero1()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERO2:
							if (((NationInst2)mod).isHero2()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERO3:
							if (((NationInst2)mod).isHero3()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERO4:
							if (((NationInst2)mod).isHero4()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERO5:
							if (((NationInst2)mod).isHero5()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HERO6:
							if (((NationInst2)mod).isHero6()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MULTIHERO1:
							if (((NationInst2)mod).isMultihero1()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MULTIHERO2:
							if (((NationInst2)mod).isMultihero2()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEFMULT1:
							if (((NationInst2)mod).isDefmult1()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEFMULT1B:
							if (((NationInst2)mod).isDefmult1b()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEFMULT2:
							if (((NationInst2)mod).isDefmult2()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEFMULT2B:
							if (((NationInst2)mod).isDefmult2b()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case IDEALCOLD:
							if (((NationInst2)mod).isIdealcold()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case CASTLEPROD:
							if (((NationInst2)mod).isCastleprod()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DOMKILL:
							if (((NationInst2)mod).isDomkill()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DOMUNREST:
							if (((NationInst2)mod).isDomunrest()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case STARTFORT:
							if (((NationInst2)mod).isStartfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEFAULTFORT:
							if (((NationInst2)mod).isDefaultfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FARMFORT:
							if (((NationInst2)mod).isFarmfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case MOUNTAINFORT:
							if (((NationInst2)mod).isMountainfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case FORESTFORT:
							if (((NationInst2)mod).isForestfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case SWAMPFORT:
							if (((NationInst2)mod).isSwampfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case UWFORT:
							if (((NationInst2)mod).isUwfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case DEEPFORT:
							if (((NationInst2)mod).isDeepfort()){
								((NationInst2)mod).setValue(Integer.parseInt(newName));
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst4(final Inst inst2, final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				for (NationMods mod : mods) {
					if (mod instanceof NationInst4) {
						Integer newValue = null;
						try {
							newValue = Integer.valueOf(newName);
						} catch (NumberFormatException e) {
							// is not a number
						}

						switch (inst2) {
						case STARTCOM:
							if (((NationInst4)mod).isStartcom()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case STARTSCOUT:
							if (((NationInst4)mod).isStartscout()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case STARTUNITTYPE1:
							if (((NationInst4)mod).isStartunittype1()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case STARTUNITTYPE2:
							if (((NationInst4)mod).isStartunittype2()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case ADDRECUNIT:
							if (((NationInst4)mod).isAddrecunit()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case ADDRECCOM:
							if (((NationInst4)mod).isAddreccom()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWUNIT1:
							if (((NationInst4)mod).isUwunit1()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWUNIT2:
							if (((NationInst4)mod).isUwunit2()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWUNIT3:
							if (((NationInst4)mod).isUwunit3()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWUNIT4:
							if (((NationInst4)mod).isUwunit4()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWUNIT5:
							if (((NationInst4)mod).isUwunit5()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWCOM1:
							if (((NationInst4)mod).isUwcom1()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWCOM2:
							if (((NationInst4)mod).isUwcom2()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWCOM3:
							if (((NationInst4)mod).isUwcom3()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWCOM4:
							if (((NationInst4)mod).isUwcom4()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case UWCOM5:
							if (((NationInst4)mod).isUwcom5()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case DEFCOM1:
							if (((NationInst4)mod).isDefcom1()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case DEFCOM2:
							if (((NationInst4)mod).isDefcom2()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case DEFUNIT1:
							if (((NationInst4)mod).isDefunit1()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case DEFUNIT1B:
							if (((NationInst4)mod).isDefunit1b()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case DEFUNIT2:
							if (((NationInst4)mod).isDefunit2()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
								}
							}
							break;
						case DEFUNIT2B:
							if (((NationInst4)mod).isDefunit2b()){
								if (newValue != null) {
									((NationInst4)mod).setValue2(Integer.parseInt(newName));
								} else {
									((NationInst4)mod).setValue1(newName);
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void setInst5(final Inst inst5, final XtextEditor editor, final SelectNation nation, final String value1, final String value2, final String value3) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				for (NationMods mod : mods) {
					if (mod instanceof NationInst5) {
						switch (inst5) {
						case COLOR:
							if (((NationInst5)mod).isColor()) {
								if (value1 != null) {
									((NationInst5)mod).setValue1(value1);
								}
								if (value2 != null) {
									((NationInst5)mod).setValue2(value2);
								}
								if (value3 != null) {
									((NationInst5)mod).setValue3(value3);
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst1(final Inst inst, final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				NationInst1 type = DmFactory.eINSTANCE.createNationInst1();
				switch (inst) {
				case EPITHET:
					type.setEpithet(true);
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst2(final Inst inst, final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				NationInst2 type = DmFactory.eINSTANCE.createNationInst2();
				switch (inst) {
				case ERA:
					type.setEra(true);
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

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst3(final Inst inst, final XtextEditor editor, final SelectNation armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				NationInst3 type = DmFactory.eINSTANCE.createNationInst3();
				switch (inst) {
				case CLEARNATION:
					type.setClearnation(true);
					break;
				}
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst4(final Inst inst, final XtextEditor editor, final SelectNation armor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				NationInst4 type = DmFactory.eINSTANCE.createNationInst4();
				switch (inst) {
				case STARTCOM:
					type.setStartcom(true);
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void addInst5(final Inst inst, final XtextEditor editor, final SelectNation armor, final String newName1, final String newName2, final String newName3) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				EList<NationMods> mods = armorToEdit.getMods();
				NationInst5 type = DmFactory.eINSTANCE.createNationInst5();
				switch (inst) {
				case COLOR:
					type.setColor(true);
					break;
				}
				type.setValue1(newName1);
				type.setValue2(newName2);
				type.setValue3(newName3);
				mods.add(type);
			}  
		},
		myDocument);

		viewer.refresh();
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}
	
	private void removeInst2(final Inst inst2, final XtextEditor editor, final SelectNation armor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation armorToEdit = input;
				NationMods modToRemove = null;
				EList<NationMods> mods = armorToEdit.getMods();
				for (NationMods mod : mods) {
					if (mod instanceof NationInst1) {
						switch (inst2) {
						case EPITHET:
							if (((NationInst1)mod).isEpithet()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst2) {
						switch (inst2) {
						case ERA:
							if (((NationInst2)mod).isEra()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst3) {
						switch (inst2) {
						case CLEARNATION:
							if (((NationInst3)mod).isClearnation()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst4) {
						switch (inst2) {
						case STARTCOM:
							if (((NationInst4)mod).isStartcom()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst5) {
						switch (inst2) {
						case COLOR:
							if (((NationInst5)mod).isColor()){
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
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
			input = (SelectNation)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
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
