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
	private Button descrCheck;
	private Text summary;
	private Button summaryCheck;
	private Text brief;
	private Button briefCheck;
	private Label spriteLabel;

	enum Inst {
		NAME (Messages.getString("NationDetailsSection.mod.name"), ""),
		DESCR (Messages.getString("NationDetailsSection.mod.descr"), ""),
		SUMMARY (Messages.getString("NationDetailsSection.mod.summary"), ""),
		BRIEF (Messages.getString("NationDetailsSection.mod.brief"), ""),
		CLEARNATION (Messages.getString("NationDetailsSection.mod.clearnation")),
		EPITHET (Messages.getString("NationDetailsSection.mod.epithet"), ""),
		ERA (Messages.getString("NationDetailsSection.mod.era"), ""),
		FLAG (Messages.getString("NationDetailsSection.mod.flag"), ""),
		LABCOST (Messages.getString("NationDetailsSection.mod.labcost"), ""),
		TEMPLECOST (Messages.getString("NationDetailsSection.mod.templecost"), ""),
		TEMPLEPIC (Messages.getString("NationDetailsSection.mod.templepic"), ""),
		MAPBACKGROUND (Messages.getString("NationDetailsSection.mod.mapbackground"), ""),
		CLEARREC (Messages.getString("NationDetailsSection.mod.clearrec")),
		STARTCOM (Messages.getString("NationDetailsSection.mod.startcom"), ""),
		STARTSCOUT (Messages.getString("NationDetailsSection.mod.startscout"), ""),
		STARTUNITTYPE1 (Messages.getString("NationDetailsSection.mod.startunittype1"), ""),
		STARTUNITNBRS1 (Messages.getString("NationDetailsSection.mod.startunitnbrs1"), ""),
		STARTUNITTYPE2 (Messages.getString("NationDetailsSection.mod.startunittype2"), ""),
		STARTUNITNBRS2 (Messages.getString("NationDetailsSection.mod.startunitnbrs2"), ""),
		ADDRECUNIT1 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT2 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT3 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT4 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT5 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT6 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT7 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECUNIT8 (Messages.getString("NationDetailsSection.mod.addrecunit"), ""),
		ADDRECCOM1 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM2 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM3 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM4 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM5 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM6 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM7 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
		ADDRECCOM8 (Messages.getString("NationDetailsSection.mod.addreccom"), ""),
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
		HERO1 (Messages.getString("NationDetailsSection.mod.hero1"), ""),
		HERO2 (Messages.getString("NationDetailsSection.mod.hero2"), ""),
		HERO3 (Messages.getString("NationDetailsSection.mod.hero3"), ""),
		HERO4 (Messages.getString("NationDetailsSection.mod.hero4"), ""),
		HERO5 (Messages.getString("NationDetailsSection.mod.hero5"), ""),
		HERO6 (Messages.getString("NationDetailsSection.mod.hero6"), ""),
		MULTIHERO1 (Messages.getString("NationDetailsSection.mod.multihero1"), ""),
		MULTIHERO2 (Messages.getString("NationDetailsSection.mod.multihero2"), ""),
		DEFCOM1 (Messages.getString("NationDetailsSection.mod.defcom1"), ""),
		DEFCOM2 (Messages.getString("NationDetailsSection.mod.defcom2"), ""),
		DEFUNIT1 (Messages.getString("NationDetailsSection.mod.defunit1"), ""),
		DEFUNIT1B (Messages.getString("NationDetailsSection.mod.defunit1b"), ""),
		DEFUNIT2 (Messages.getString("NationDetailsSection.mod.defunit2"), ""),
		DEFUNIT2B (Messages.getString("NationDetailsSection.mod.defunit2b"), ""),
		DEFMULT1 (Messages.getString("NationDetailsSection.mod.defmult1"), ""),
		DEFMULT1B (Messages.getString("NationDetailsSection.mod.defmult1b"), ""),
		DEFMULT2 (Messages.getString("NationDetailsSection.mod.defmult2"), ""),
		DEFMULT2B (Messages.getString("NationDetailsSection.mod.defmult2b"), ""),
		CLEARSITES (Messages.getString("NationDetailsSection.mod.clearsites")),
		STARTSITE1 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		STARTSITE2 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		STARTSITE3 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		STARTSITE4 (Messages.getString("NationDetailsSection.mod.startsite"), ""),
		UWNATION (Messages.getString("NationDetailsSection.mod.uwnation")),
		BLOODNATION (Messages.getString("NationDetailsSection.mod.bloodnation")),
		NOPREACH (Messages.getString("NationDetailsSection.mod.nopreach")),
		DYINGDOM (Messages.getString("NationDetailsSection.mod.dyingdom")),
		SACRIFICEDOM (Messages.getString("NationDetailsSection.mod.sacrificedom")),
		NODEATHSUPPLY (Messages.getString("NationDetailsSection.mod.nodeathsupply")),
		IDEALCOLD (Messages.getString("NationDetailsSection.mod.idealcold"), ""),
		CASTLEPROD (Messages.getString("NationDetailsSection.mod.castleprod"), ""),
		DOMKILL (Messages.getString("NationDetailsSection.mod.domkill"), ""),
		DOMUNREST (Messages.getString("NationDetailsSection.mod.domunrest"), ""),
		AUTOUNDEAD (Messages.getString("NationDetailsSection.mod.autoundead")),
		ZOMBIEREANIM (Messages.getString("NationDetailsSection.mod.zombiereanim")),
		HORSEREANIM (Messages.getString("NationDetailsSection.mod.horsereanim")),
		WIGHTREANIM (Messages.getString("NationDetailsSection.mod.wightreanim")),
		MANIKINREANIM (Messages.getString("NationDetailsSection.mod.manikinreanim")),
		TOMBWYRMREANIM (Messages.getString("NationDetailsSection.mod.tombwyrmreanim")),
		STARTFORT (Messages.getString("NationDetailsSection.mod.startfort"), ""),
		DEFAULTFORT (Messages.getString("NationDetailsSection.mod.defaultfort"), ""),
		FARMFORT (Messages.getString("NationDetailsSection.mod.farmfort"), ""),
		MOUNTAINFORT (Messages.getString("NationDetailsSection.mod.mountainfort"), ""),
		FORESTFORT (Messages.getString("NationDetailsSection.mod.forestfort"), ""),
		SWAMPFORT (Messages.getString("NationDetailsSection.mod.swampfort"), ""),
		UWFORT (Messages.getString("NationDetailsSection.mod.uwfort"), ""),
		DEEPFORT (Messages.getString("NationDetailsSection.mod.deepfort"), ""),
		COLOR (Messages.getString("NationDetailsSection.mod.color"), "0.0", "0.0", "0.0");
		
		private String label;
		private String defaultValue;
		private String defaultValue2;
		private String defaultValue3;
		
		Inst(String label, String defaultValue) {
			this.label = label;
			this.defaultValue = defaultValue;
		}
		
		Inst(String label, String defaultValue, String defaultValue2) {
			this.label = label;
			this.defaultValue = defaultValue;
			this.defaultValue2 = defaultValue2;
		}
		
		Inst(String label, String defaultValue, String defaultValue2, String defaultValue3) {
			this.label = label;
			this.defaultValue = defaultValue;
			this.defaultValue2 = defaultValue2;
			this.defaultValue3 = defaultValue3;
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
		instMap.put(Inst.EPITHET, new Inst1Fields());
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
		instMap.put(Inst.ADDRECUNIT1, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT2, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT3, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT4, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT5, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT6, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT7, new Inst4Fields());
		instMap.put(Inst.ADDRECUNIT8, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM1, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM2, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM3, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM4, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM5, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM6, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM7, new Inst4Fields());
		instMap.put(Inst.ADDRECCOM8, new Inst4Fields());
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

		final FormToolkit toolkit = mform.getToolkit();
		Section s1 = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		s1.marginWidth = 10;
		s1.setText(Messages.getString("NationDetailsSection.name")); //$NON-NLS-1$
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
		nameComp.setLayout(new GridLayout(2, false));
		GridData gd = new GridData(SWT.DEFAULT, SWT.FILL, false, false);
		gd.horizontalSpan = 2;
		nameComp.setLayoutData(gd);
		
		toolkit.createLabel(nameComp, Messages.getString("NationDetailsSection.mod.name")); //$NON-NLS-1$
		
		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setNationname(doc, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setNationname(doc, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 500;
		name.setLayoutData(gd);
		
		descrCheck = toolkit.createButton(nameComp, Messages.getString("NationDetailsSection.mod.descr"), SWT.CHECK);

		descr = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		descr.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setNationdescr(doc, descr.getText());
			}			
		});
		descr.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setNationdescr(doc, descr.getText());
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
				} else {
					removeInst(Inst.DESCR, doc);
					descr.setEnabled(false);
					descr.setBackground(toolkit.getColors().getInactiveBackground());
					descr.setText("");
				}
			}
		});

		summaryCheck = toolkit.createButton(nameComp, Messages.getString("NationDetailsSection.mod.summary"), SWT.CHECK);

		summary = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		summary.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setInst1(Inst.SUMMARY, doc, summary.getText());
			}			
		});
		summary.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setInst1(Inst.SUMMARY, doc, summary.getText());
				}
			}
			
		});
		summary.setLayoutData(new GridData(500, SWT.DEFAULT));
		summary.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = summary.getSize().y;
				int preferredHeight = summary.computeSize(500, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)summary.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		summary.setEnabled(false);
		summary.setBackground(toolkit.getColors().getInactiveBackground());
		summaryCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (summaryCheck.getSelection()) {
					addInst1(Inst.SUMMARY, doc, "");
					summary.setEnabled(true);
					summary.setBackground(toolkit.getColors().getBackground());
					summary.setText("");
				} else {
					removeInst(Inst.SUMMARY, doc);
					summary.setEnabled(false);
					summary.setBackground(toolkit.getColors().getInactiveBackground());
					summary.setText("");
				}
			}
		});

		briefCheck = toolkit.createButton(nameComp, Messages.getString("NationDetailsSection.mod.brief"), SWT.CHECK);

		brief = toolkit.createText(nameComp, null, SWT.MULTI | SWT.BORDER); //$NON-NLS-1$
		brief.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setInst1(Inst.BRIEF, doc, brief.getText());
			}			
		});
		brief.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setInst1(Inst.BRIEF, doc, brief.getText());
				}
			}
			
		});
		brief.setLayoutData(new GridData(500, SWT.DEFAULT));
		brief.addListener(SWT.Modify, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				int currentHeight = brief.getSize().y;
				int preferredHeight = brief.computeSize(500, SWT.DEFAULT).y;
				if (currentHeight != preferredHeight) {
					GridData data = (GridData)brief.getLayoutData();
					data.heightHint = preferredHeight;
					client.pack();
				}
			}
		});
		brief.setEnabled(false);
		brief.setBackground(toolkit.getColors().getInactiveBackground());
		briefCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (briefCheck.getSelection()) {
					addInst1(Inst.BRIEF, doc, "");
					brief.setEnabled(true);
					brief.setBackground(toolkit.getColors().getBackground());
					brief.setText("");
				} else {
					removeInst(Inst.BRIEF, doc);
					brief.setEnabled(false);
					brief.setBackground(toolkit.getColors().getInactiveBackground());
					brief.setText("");
				}
			}
		});

		spriteLabel = new Label(nameComp, SWT.NONE);

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
							addInst1(key, doc, key.defaultValue);
						} else if (field instanceof Inst2Fields) {
							addInst2(key, doc, key.defaultValue);
						} else if (field instanceof Inst3Fields) {
							addInst3(key, doc);
						} else if (field instanceof Inst4Fields) {
							addInst4(key, doc, key.defaultValue);
						} else if (field instanceof Inst5Fields) {
							addInst5(key, doc, key.defaultValue, key.defaultValue2, key.defaultValue3);
						}
					} else {
						removeInst(key, doc);
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
							setInst1(key, doc, value.getText());
						} else if (field instanceof Inst2Fields) {
							setInst2(key, doc, value.getText());
						} else if (field instanceof Inst4Fields) {
							setInst4(key, doc, value.getText());
						} else if (field instanceof Inst5Fields) {
							setInst5(key, doc, value.getText(), null, null);
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
								setInst4(key, doc, value.getText());
							} else if (field instanceof Inst5Fields) {
								setInst5(key, doc, value.getText(), null, null);
							}
						}
					}
				});
				value.setEnabled(false);
				
				if (field instanceof Inst1Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.widthHint = 160;
					gd.horizontalSpan = 4;
				} else if (field instanceof Inst2Fields ||	field instanceof Inst4Fields) {
					gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
					gd.widthHint = 30;
				} else if (field instanceof Inst3Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					gd.horizontalSpan = 2;
				} else if (field instanceof Inst5Fields) {
					gd = new GridData(SWT.FILL, SWT.FILL, false, false);
					//gd.horizontalSpan = 4;
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
			Label defaultLabel3 = null;
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
						setInst5(key, doc, null, value.getText(), null);
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							setInst5(key, doc, null, value.getText(), null);
						}
					}
				});
				value.setEnabled(false);
				
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.widthHint = 30;
				value.setLayoutData(gd);
				
				defaultLabel2 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel2.setEnabled(false);

				final Text value3 = toolkit.createText(isRight?rightColumn:leftColumn, "", SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
				myValue3 = value3;
				value3.addVerifyListener(new VerifyListener() {
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
							value3.setEnabled(true);
							value3.setText("");
						} else {
							value3.setEnabled(false);
							value3.setText("");
						}
					}

				});
				value3.addFocusListener(new FocusAdapter() {
					@Override
					public void focusLost(FocusEvent e) {
						setInst5(key, doc, null, value3.getText(), null);
					}			
				});
				value3.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							setInst5(key, doc, null, value3.getText(), null);
						}
					}
				});
				value3.setEnabled(false);
				
				gd = new GridData(SWT.FILL, SWT.BEGINNING, false, false);
				gd.widthHint = 30;
				value3.setLayoutData(gd);
				
				defaultLabel3 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel3.setEnabled(false);
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
	}
	
	private void createSpacer(FormToolkit toolkit, Composite parent, int span) {
		Label spacer = toolkit.createLabel(parent, ""); //$NON-NLS-1$
		GridData gd = new GridData();
		gd.horizontalSpan = span;
		spacer.setLayoutData(gd);
	}
	
	private Image getSprite(String sprite) {
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
				return new Image(null, ImageConverter.convertToSWT(ImageConverter.cropImage(loader1.loadImage())));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	
	public void update() {
		if (input != null) {
			String str = getInst1(Inst.NAME, input);
			name.setText(str!= null?str:"");
			name.setEnabled(false);

			spriteLabel.setImage(getSprite(getInst1(Inst.FLAG, input)));
			
			String description = getInst1(Inst.DESCR, input);
			final FormToolkit toolkit = mform.getToolkit();
			if (description != null) {
				descr.setText(description);
				descr.setEnabled(true);
				descr.setBackground(toolkit.getColors().getBackground());
				descrCheck.setSelection(true);
			} else {
				descr.setText("");
				descr.setEnabled(false);
				descr.setBackground(toolkit.getColors().getInactiveBackground());
				descrCheck.setSelection(false);
			}

			String summaryStr = getInst1(Inst.SUMMARY, input);
			if (summaryStr != null) {
				summary.setText(summaryStr);
				summary.setEnabled(true);
				summary.setBackground(toolkit.getColors().getBackground());
				summaryCheck.setSelection(true);
			} else {
				summary.setText("");
				summary.setEnabled(false);
				summary.setBackground(toolkit.getColors().getInactiveBackground());
				summaryCheck.setSelection(false);
			}

			String briefStr = getInst1(Inst.BRIEF, input);
			if (briefStr != null) {
				brief.setText(briefStr);
				brief.setEnabled(true);
				brief.setBackground(toolkit.getColors().getBackground());
				briefCheck.setSelection(true);
			} else {
				brief.setText("");
				brief.setEnabled(false);
				brief.setBackground(toolkit.getColors().getInactiveBackground());
				briefCheck.setSelection(false);
			}
		}
		NationDB nationDB = new NationDB();
		if (input instanceof SelectNation) {
			nationDB = Database.getNation(((SelectNation)input).getValue());
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
			Object val4 = getInst4(fields.getKey(), input);
			if (val4 != null) {
				if (fields.getValue() instanceof Inst4Fields) {
					((Inst4Fields)fields.getValue()).value.setText(val4.toString());
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
			Double[] val5 = getInst5(fields.getKey(), input);
			if (val5 != null) {
				if (fields.getValue() instanceof Inst5Fields) {
					((Inst5Fields)fields.getValue()).value1.setText(val5[0] != null ? val5[0].toString() : "");
					((Inst5Fields)fields.getValue()).value1.setEnabled(true);
					((Inst5Fields)fields.getValue()).value2.setText(val5[1] != null ? val5[1].toString() : "");
					((Inst5Fields)fields.getValue()).value2.setEnabled(true);
					((Inst5Fields)fields.getValue()).value3.setText(val5[2] != null ? val5[2].toString() : "");
					((Inst5Fields)fields.getValue()).value3.setEnabled(true);
					((Inst5Fields)fields.getValue()).check.setSelection(true);
				}
			} else {
				if (fields.getValue() instanceof Inst5Fields) {
					((Inst5Fields)fields.getValue()).value1.setText("");
					((Inst5Fields)fields.getValue()).value1.setEnabled(false);
					((Inst5Fields)fields.getValue()).value2.setText("");
					((Inst5Fields)fields.getValue()).value2.setEnabled(false);
					((Inst5Fields)fields.getValue()).value3.setText("");
					((Inst5Fields)fields.getValue()).value3.setEnabled(false);
					((Inst5Fields)fields.getValue()).check.setSelection(false);
				}
			}
			if (input instanceof SelectNation) {
				switch (fields.getKey()) {
				case EPITHET:
					if (nationDB.epithet != null) {
						Inst.EPITHET.defaultValue = nationDB.epithet;
					}
					break;
				case DESCR:
					if (nationDB.descr != null) {
						Inst.DESCR.defaultValue = nationDB.descr;
					}
					break;
				case STARTSITE1:
					if (nationDB.startsite1 != null) {
						Inst.STARTSITE1.defaultValue = nationDB.startsite1;
					}
					break;
				case STARTSITE2:
					if (nationDB.startsite2 != null) {
						Inst.STARTSITE2.defaultValue = nationDB.startsite2;
					}
					break;
				case STARTSITE3:
					if (nationDB.startsite3 != null) {
						Inst.STARTSITE3.defaultValue = nationDB.startsite3;
					}
					break;
				case STARTSITE4:
					if (nationDB.startsite4 != null) {
						Inst.STARTSITE4.defaultValue = nationDB.startsite4;
					}
					break;
				case ERA:
					if (nationDB.era != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", nationDB.era));
						Inst.ERA.defaultValue = nationDB.era.toString();
					}
					break;
				case STARTFORT:
					if (nationDB.startfort != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", nationDB.startfort));
						Inst.STARTFORT.defaultValue = nationDB.startfort.toString();
					}
					break;
				}
			}
		}
	}
	
	private void setNationname(final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
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
	
	private void setNationdescr(final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
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

	private String getInst1(Inst inst2, SelectNation nation) {
		EList<NationMods> list = nation.getMods();
		int siteCount = 0;
		for (NationMods mod : list) {
			if (mod instanceof NationInst1) {
				switch (inst2) {
				case NAME:
					if (((NationInst1)mod).isName()){
						return ((NationInst1)mod).getValue();
					}
					break;
				case DESCR:
					if (((NationInst1)mod).isDescr()){
						return ((NationInst1)mod).getValue();
					}
					break;
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
	
	private Integer getInst2(Inst inst2, SelectNation nation) {
		EList<NationMods> list = nation.getMods();
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
	
	private Boolean getInst3(Inst inst3, SelectNation nation) {
		EList<NationMods> list = nation.getMods();
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
	
	private Object getInst4(Inst inst4, SelectNation nation) {
		int addreccom = 0;
		int addrecunit = 0;
		EList<NationMods> list = nation.getMods();
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
				case ADDRECUNIT1:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 1) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT2:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 2) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT3:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 3) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT4:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 4) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT5:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 5) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT6:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 6) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT7:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 7) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECUNIT8:
					if (((NationInst4)mod).isAddrecunit()){
						addrecunit++;
						if (addrecunit == 8) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM1:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 1) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM2:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 2) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM3:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 3) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM4:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 4) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM5:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 5) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM6:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 6) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM7:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 7) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
					}
					break;
				case ADDRECCOM8:
					if (((NationInst4)mod).isAddreccom()){
						addreccom++;
						if (addreccom == 8) {
							String strVal = ((NationInst4)mod).getValue1();
							Integer intVal = ((NationInst4)mod).getValue2();
							if (strVal != null) {
								return strVal;
							}
							return intVal;
						}
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
	
	private Double[] getInst5(Inst inst5, SelectNation nation) {
		EList<NationMods> list = nation.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst5) {
				switch (inst5) {
				case COLOR:
					if (((NationInst5)mod).isColor()){
						Double value1 = ((NationInst5)mod).getValue1() != null ? Double.valueOf(((NationInst5)mod).getValue1()) : null; 
						Double value2 = ((NationInst5)mod).getValue2() != null ? Double.valueOf(((NationInst5)mod).getValue2()) : null;
						Double value3 = ((NationInst5)mod).getValue3() != null ? Double.valueOf(((NationInst5)mod).getValue3()) : null;
						return new Double[]{value1, value2, value3};
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
				SelectNation nationToEdit = input;
				int siteCount = 0;
				EList<NationMods> mods = nationToEdit.getMods();				
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
								spriteLabel.setImage(getSprite(newName));
								spriteLabel.getParent().layout(true, true);
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

	private void setInst2(final Inst inst2, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
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

	private void setInst4(final Inst inst2, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				int addreccom = 0;
				int addrecunit = 0;
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
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
						case ADDRECUNIT1:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 1) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT2:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 2) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT3:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 3) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT4:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 4) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT5:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 5) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT6:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 6) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT7:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 7) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECUNIT8:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 8) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM1:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 1) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM2:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 2) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM3:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 3) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM4:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 4) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM5:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 5) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM6:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 6) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM7:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 7) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
								}
							}
							break;
						case ADDRECCOM8:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 8) {
									if (newValue != null) {
										((NationInst4)mod).setValue2(Integer.parseInt(newName));
									} else {
										((NationInst4)mod).setValue1(newName);
									}
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
	
	private void setInst5(final Inst inst5, final XtextEditor editor, final String value1, final String value2, final String value3) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
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
	
	private void addInst1(final Inst inst, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
				NationInst1 type = DmFactory.eINSTANCE.createNationInst1();
				switch (inst) {
				case EPITHET:
					type.setEpithet(true);
					break;
				case DESCR:
					type.setDescr(true);
					break;
				case SUMMARY:
					type.setSummary(true);
					break;
				case BRIEF:
					type.setBrief(true);
					break;
				case FLAG:
					type.setFlag(true);
					break;
				case MAPBACKGROUND:
					type.setMapbackground(true);
					break;
				case STARTSITE1:
					type.setStartsite(true);
					break;
				case STARTSITE2:
					type.setStartsite(true);
					break;
				case STARTSITE3:
					type.setStartsite(true);
					break;
				case STARTSITE4:
					type.setStartsite(true);
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
	
	private void addInst2(final Inst inst, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
				NationInst2 type = DmFactory.eINSTANCE.createNationInst2();
				switch (inst) {
				case ERA:
					type.setEra(true);
					break;
				case LABCOST:
					type.setLabcost(true);
					break;
				case TEMPLECOST:
					type.setTemplecost(true);
					break;
				case TEMPLEPIC:
					type.setTemplepic(true);
					break;
				case STARTUNITNBRS1:
					type.setStartunitnbrs1(true);
					break;
				case STARTUNITNBRS2:
					type.setStartunitnbrs2(true);
					break;
				case HERO1:
					type.setHero1(true);
					break;
				case HERO2:
					type.setHero2(true);
					break;
				case HERO3:
					type.setHero3(true);
					break;
				case HERO4:
					type.setHero4(true);
					break;
				case HERO5:
					type.setHero5(true);
					break;
				case HERO6:
					type.setHero6(true);
					break;
				case MULTIHERO1:
					type.setMultihero1(true);
					break;
				case MULTIHERO2:
					type.setMultihero2(true);
					break;
				case DEFMULT1:
					type.setDefmult1(true);
					break;
				case DEFMULT1B:
					type.setDefmult1b(true);
					break;
				case DEFMULT2:
					type.setDefmult2(true);
					break;
				case DEFMULT2B:
					type.setDefmult2b(true);
					break;
				case IDEALCOLD:
					type.setIdealcold(true);
					break;
				case CASTLEPROD:
					type.setCastleprod(true);
					break;
				case DOMKILL:
					type.setDomkill(true);
					break;
				case DOMUNREST:
					type.setDomunrest(true);
					break;
				case STARTFORT:
					type.setStartfort(true);
					break;
				case DEFAULTFORT:
					type.setDefaultfort(true);
					break;
				case FARMFORT:
					type.setFarmfort(true);
					break;
				case MOUNTAINFORT:
					type.setMountainfort(true);
					break;
				case FORESTFORT:
					type.setForestfort(true);
					break;
				case SWAMPFORT:
					type.setSwampfort(true);
					break;
				case UWFORT:
					type.setUwfort(true);
					break;
				case DEEPFORT:
					type.setDeepfort(true);
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
	
	private void addInst3(final Inst inst, final XtextEditor editor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
				NationInst3 type = DmFactory.eINSTANCE.createNationInst3();
				switch (inst) {
				case CLEARNATION:
					type.setClearnation(true);
					break;
				case CLEARREC:
					type.setClearrec(true);
					break;
				case CLEARSITES:
					type.setClearsites(true);
					break;
				case UWNATION:
					type.setUwnation(true);
					break;
				case BLOODNATION:
					type.setBloodnation(true);
					break;
				case NOPREACH:
					type.setNopreach(true);
					break;
				case DYINGDOM:
					type.setDyingdom(true);
					break;
				case SACRIFICEDOM:
					type.setSacrificedom(true);
					break;
				case NODEATHSUPPLY:
					type.setNodeathsupply(true);
					break;
				case AUTOUNDEAD:
					type.setAutoundead(true);
					break;
				case ZOMBIEREANIM:
					type.setZombiereanim(true);
					break;
				case HORSEREANIM:
					type.setHorsereanim(true);
					break;
				case WIGHTREANIM:
					type.setWightreanim(true);
					break;
				case MANIKINREANIM:
					type.setManikinreanim(true);
					break;
				case TOMBWYRMREANIM:
					type.setTombwyrmreanim(true);
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
	
	private void addInst4(final Inst inst, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
				NationInst4 type = DmFactory.eINSTANCE.createNationInst4();
				switch (inst) {
				case STARTCOM:
					type.setStartcom(true);
					break;
				case STARTSCOUT:
					type.setStartscout(true);
					break;
				case STARTUNITTYPE1:
					type.setStartunittype1(true);
					break;
				case STARTUNITTYPE2:
					type.setStartunittype2(true);
					break;
				case ADDRECUNIT1:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT2:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT3:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT4:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT5:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT6:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT7:
					type.setAddrecunit(true);
					break;
				case ADDRECUNIT8:
					type.setAddrecunit(true);
					break;
				case ADDRECCOM1:
					type.setAddreccom(true);
					break;
				case ADDRECCOM2:
					type.setAddreccom(true);
					break;
				case ADDRECCOM3:
					type.setAddreccom(true);
					break;
				case ADDRECCOM4:
					type.setAddreccom(true);
					break;
				case ADDRECCOM5:
					type.setAddreccom(true);
					break;
				case ADDRECCOM6:
					type.setAddreccom(true);
					break;
				case ADDRECCOM7:
					type.setAddreccom(true);
					break;
				case ADDRECCOM8:
					type.setAddreccom(true);
					break;
				case UWUNIT1:
					type.setUwunit1(true);
					break;
				case UWUNIT2:
					type.setUwunit2(true);
					break;
				case UWUNIT3:
					type.setUwunit3(true);
					break;
				case UWUNIT4:
					type.setUwunit4(true);
					break;
				case UWUNIT5:
					type.setUwunit5(true);
					break;
				case UWCOM1:
					type.setUwcom1(true);
					break;
				case UWCOM2:
					type.setUwcom2(true);
					break;
				case UWCOM3:
					type.setUwcom3(true);
					break;
				case UWCOM4:
					type.setUwcom4(true);
					break;
				case UWCOM5:
					type.setUwcom5(true);
					break;
				case DEFCOM1:
					type.setDefcom1(true);
					break;
				case DEFCOM2:
					type.setDefcom2(true);
					break;
				case DEFUNIT1:
					type.setDefunit1(true);
					break;
				case DEFUNIT1B:
					type.setDefunit1b(true);
					break;
				case DEFUNIT2:
					type.setDefunit2(true);
					break;
				case DEFUNIT2B:
					type.setDefunit2b(true);
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
	
	private void addInst5(final Inst inst, final XtextEditor editor, final String newName1, final String newName2, final String newName3) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				EList<NationMods> mods = nationToEdit.getMods();
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
	
	private void removeInst(final Inst inst, final XtextEditor editor) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				SelectNation nationToEdit = input;
				NationMods modToRemove = null;
				int siteCount = 0;
				int addreccom = 0;
				int addrecunit = 0;
				EList<NationMods> mods = nationToEdit.getMods();
				for (NationMods mod : mods) {
					if (mod instanceof NationInst1) {
						switch (inst) {
						case EPITHET:
							if (((NationInst1)mod).isEpithet()){
								modToRemove = mod;
							}
							break;
						case DESCR:
							if (((NationInst1)mod).isDescr()){
								modToRemove = mod;
							}
							break;
						case SUMMARY:
							if (((NationInst1)mod).isSummary()){
								modToRemove = mod;
							}
							break;
						case BRIEF:
							if (((NationInst1)mod).isBrief()){
								modToRemove = mod;
							}
							break;
						case FLAG:
							if (((NationInst1)mod).isFlag()){
								modToRemove = mod;
							}
							break;
						case MAPBACKGROUND:
							if (((NationInst1)mod).isMapbackground()){
								modToRemove = mod;
							}
							break;
						case STARTSITE1:
							if (((NationInst1)mod).isStartsite()){
								siteCount++;
								if (siteCount == 1) {
									modToRemove = mod;
								}
							}
							break;
						case STARTSITE2:
							if (((NationInst1)mod).isStartsite()){
								siteCount++;
								if (siteCount == 2) {
									modToRemove = mod;
								}
							}
							break;
						case STARTSITE3:
							if (((NationInst1)mod).isStartsite()){
								siteCount++;
								if (siteCount == 3) {
									modToRemove = mod;
								}
							}
							break;
						case STARTSITE4:
							if (((NationInst1)mod).isStartsite()){
								siteCount++;
								if (siteCount == 4) {
									modToRemove = mod;
								}
							}
							break;
						}
					}
					if (mod instanceof NationInst2) {
						switch (inst) {
						case ERA:
							if (((NationInst2)mod).isEra()){
								modToRemove = mod;
							}
							break;
						case LABCOST:
							if (((NationInst2)mod).isLabcost()){
								modToRemove = mod;
							}
							break;
						case TEMPLECOST:
							if (((NationInst2)mod).isTemplecost()){
								modToRemove = mod;
							}
							break;
						case TEMPLEPIC:
							if (((NationInst2)mod).isTemplepic()){
								modToRemove = mod;
							}
							break;
						case STARTUNITNBRS1:
							if (((NationInst2)mod).isStartunitnbrs1()){
								modToRemove = mod;
							}
							break;
						case STARTUNITNBRS2:
							if (((NationInst2)mod).isStartunitnbrs2()){
								modToRemove = mod;
							}
							break;
						case HERO1:
							if (((NationInst2)mod).isHero1()){
								modToRemove = mod;
							}
							break;
						case HERO2:
							if (((NationInst2)mod).isHero2()){
								modToRemove = mod;
							}
							break;
						case HERO3:
							if (((NationInst2)mod).isHero3()){
								modToRemove = mod;
							}
							break;
						case HERO4:
							if (((NationInst2)mod).isHero4()){
								modToRemove = mod;
							}
							break;
						case HERO5:
							if (((NationInst2)mod).isHero5()){
								modToRemove = mod;
							}
							break;
						case HERO6:
							if (((NationInst2)mod).isHero6()){
								modToRemove = mod;
							}
							break;
						case MULTIHERO1:
							if (((NationInst2)mod).isMultihero1()){
								modToRemove = mod;
							}
							break;
						case MULTIHERO2:
							if (((NationInst2)mod).isMultihero2()){
								modToRemove = mod;
							}
							break;
						case DEFMULT1:
							if (((NationInst2)mod).isDefmult1()){
								modToRemove = mod;
							}
							break;
						case DEFMULT1B:
							if (((NationInst2)mod).isDefmult1b()){
								modToRemove = mod;
							}
							break;
						case DEFMULT2:
							if (((NationInst2)mod).isDefmult2()){
								modToRemove = mod;
							}
							break;
						case DEFMULT2B:
							if (((NationInst2)mod).isDefmult2b()){
								modToRemove = mod;
							}
							break;
						case IDEALCOLD:
							if (((NationInst2)mod).isIdealcold()){
								modToRemove = mod;
							}
							break;
						case CASTLEPROD:
							if (((NationInst2)mod).isCastleprod()){
								modToRemove = mod;
							}
							break;
						case DOMKILL:
							if (((NationInst2)mod).isDomkill()){
								modToRemove = mod;
							}
							break;
						case DOMUNREST:
							if (((NationInst2)mod).isDomunrest()){
								modToRemove = mod;
							}
							break;
						case STARTFORT:
							if (((NationInst2)mod).isStartfort()){
								modToRemove = mod;
							}
							break;
						case DEFAULTFORT:
							if (((NationInst2)mod).isDefaultfort()){
								modToRemove = mod;
							}
							break;
						case FARMFORT:
							if (((NationInst2)mod).isFarmfort()){
								modToRemove = mod;
							}
							break;
						case MOUNTAINFORT:
							if (((NationInst2)mod).isMountainfort()){
								modToRemove = mod;
							}
							break;
						case FORESTFORT:
							if (((NationInst2)mod).isForestfort()){
								modToRemove = mod;
							}
							break;
						case SWAMPFORT:
							if (((NationInst2)mod).isSwampfort()){
								modToRemove = mod;
							}
							break;
						case UWFORT:
							if (((NationInst2)mod).isUwfort()){
								modToRemove = mod;
							}
							break;
						case DEEPFORT:
							if (((NationInst2)mod).isDeepfort()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst3) {
						switch (inst) {
						case CLEARNATION:
							if (((NationInst3)mod).isClearnation()){
								modToRemove = mod;
							}
							break;
						case CLEARREC:
							if (((NationInst3)mod).isClearrec()){
								modToRemove = mod;
							}
							break;
						case CLEARSITES:
							if (((NationInst3)mod).isClearsites()){
								modToRemove = mod;
							}
							break;
						case UWNATION:
							if (((NationInst3)mod).isUwnation()){
								modToRemove = mod;
							}
							break;
						case BLOODNATION:
							if (((NationInst3)mod).isBloodnation()){
								modToRemove = mod;
							}
							break;
						case NOPREACH:
							if (((NationInst3)mod).isNopreach()){
								modToRemove = mod;
							}
							break;
						case DYINGDOM:
							if (((NationInst3)mod).isDyingdom()){
								modToRemove = mod;
							}
							break;
						case SACRIFICEDOM:
							if (((NationInst3)mod).isSacrificedom()){
								modToRemove = mod;
							}
							break;
						case NODEATHSUPPLY:
							if (((NationInst3)mod).isNodeathsupply()){
								modToRemove = mod;
							}
							break;
						case AUTOUNDEAD:
							if (((NationInst3)mod).isAutoundead()){
								modToRemove = mod;
							}
							break;
						case ZOMBIEREANIM:
							if (((NationInst3)mod).isZombiereanim()){
								modToRemove = mod;
							}
							break;
						case HORSEREANIM:
							if (((NationInst3)mod).isHorsereanim()){
								modToRemove = mod;
							}
							break;
						case WIGHTREANIM:
							if (((NationInst3)mod).isWightreanim()){
								modToRemove = mod;
							}
							break;
						case MANIKINREANIM:
							if (((NationInst3)mod).isManikinreanim()){
								modToRemove = mod;
							}
							break;
						case TOMBWYRMREANIM:
							if (((NationInst3)mod).isTombwyrmreanim()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst4) {
						switch (inst) {
						case STARTCOM:
							if (((NationInst4)mod).isStartcom()){
								modToRemove = mod;
							}
							break;
						case STARTSCOUT:
							if (((NationInst4)mod).isStartscout()){
								modToRemove = mod;
							}
							break;
						case STARTUNITTYPE1:
							if (((NationInst4)mod).isStartunittype1()){
								modToRemove = mod;
							}
							break;
						case STARTUNITTYPE2:
							if (((NationInst4)mod).isStartunittype2()){
								modToRemove = mod;
							}
							break;
						case ADDRECUNIT1:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 1) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT2:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 2) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT3:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 3) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT4:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 4) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT5:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 5) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT6:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 6) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT7:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 7) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECUNIT8:
							if (((NationInst4)mod).isAddrecunit()){
								addrecunit++;
								if (addrecunit == 8) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM1:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 1) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM2:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 2) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM3:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 3) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM4:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 4) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM5:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 5) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM6:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 6) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM7:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 7) {
									modToRemove = mod;
								}
							}
							break;
						case ADDRECCOM8:
							if (((NationInst4)mod).isAddreccom()){
								addreccom++;
								if (addreccom == 8) {
									modToRemove = mod;
								}
							}
							break;
						case UWUNIT1:
							if (((NationInst4)mod).isUwunit1()){
								modToRemove = mod;
							}
							break;
						case UWUNIT2:
							if (((NationInst4)mod).isUwunit2()){
								modToRemove = mod;
							}
							break;
						case UWUNIT3:
							if (((NationInst4)mod).isUwunit3()){
								modToRemove = mod;
							}
							break;
						case UWUNIT4:
							if (((NationInst4)mod).isUwunit4()){
								modToRemove = mod;
							}
							break;
						case UWUNIT5:
							if (((NationInst4)mod).isUwunit5()){
								modToRemove = mod;
							}
							break;
						case UWCOM1:
							if (((NationInst4)mod).isUwcom1()){
								modToRemove = mod;
							}
							break;
						case UWCOM2:
							if (((NationInst4)mod).isUwcom2()){
								modToRemove = mod;
							}
							break;
						case UWCOM3:
							if (((NationInst4)mod).isUwcom3()){
								modToRemove = mod;
							}
							break;
						case UWCOM4:
							if (((NationInst4)mod).isUwcom4()){
								modToRemove = mod;
							}
							break;
						case UWCOM5:
							if (((NationInst4)mod).isUwcom5()){
								modToRemove = mod;
							}
							break;
						case DEFCOM1:
							if (((NationInst4)mod).isDefcom1()){
								modToRemove = mod;
							}
							break;
						case DEFCOM2:
							if (((NationInst4)mod).isDefcom2()){
								modToRemove = mod;
							}
							break;
						case DEFUNIT1:
							if (((NationInst4)mod).isDefunit1()){
								modToRemove = mod;
							}
							break;
						case DEFUNIT1B:
							if (((NationInst4)mod).isDefunit1b()){
								modToRemove = mod;
							}
							break;
						case DEFUNIT2:
							if (((NationInst4)mod).isDefunit2()){
								modToRemove = mod;
							}
							break;
						case DEFUNIT2B:
							if (((NationInst4)mod).isDefunit2b()){
								modToRemove = mod;
							}
							break;
						}
					}
					if (mod instanceof NationInst5) {
						switch (inst) {
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
