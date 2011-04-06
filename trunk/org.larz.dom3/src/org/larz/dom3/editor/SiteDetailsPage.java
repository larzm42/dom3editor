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
import org.larz.dom3.db.Database;
import org.larz.dom3.db.SiteDB;
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.SelectSiteById;
import org.larz.dom3.dm.dm.SelectSiteByName;
import org.larz.dom3.dm.dm.Site;
import org.larz.dom3.dm.dm.SiteInst1;
import org.larz.dom3.dm.dm.SiteInst2;
import org.larz.dom3.dm.dm.SiteInst3;
import org.larz.dom3.dm.dm.SiteInst4;
import org.larz.dom3.dm.dm.SiteMods;
import org.larz.dom3.dm.ui.internal.DmActivator;

public class SiteDetailsPage implements IDetailsPage {
	private IManagedForm mform;
	private Site input;
	private XtextEditor doc;
	private TableViewer viewer;

	private Text name;

	enum Inst {
		NAME (Messages.getString("SiteDetailsSection.mod.name")),
		CLEAR (Messages.getString("SiteDetailsSection.mod.clear")),
		PATH (Messages.getString("SiteDetailsSection.mod.path"), "0"),
		LEVEL (Messages.getString("SiteDetailsSection.mod.level"), "0"),
		RARITY (Messages.getString("SiteDetailsSection.mod.rarity"), "0"),
		LOC (Messages.getString("SiteDetailsSection.mod.loc"), "0"),
		GEMS1 (Messages.getString("SiteDetailsSection.mod.gems"), "0", "0"),
		GEMS2 (Messages.getString("SiteDetailsSection.mod.gems"), "0", "0"),
		GEMS3 (Messages.getString("SiteDetailsSection.mod.gems"), "0", "0"),
		HOMEMON1 (Messages.getString("SiteDetailsSection.mod.homemon"), "0"),
		HOMEMON2 (Messages.getString("SiteDetailsSection.mod.homemon"), "0"),
		HOMEMON3 (Messages.getString("SiteDetailsSection.mod.homemon"), "0"),
		HOMECOM1 (Messages.getString("SiteDetailsSection.mod.homecom"), "0"),
		HOMECOM2 (Messages.getString("SiteDetailsSection.mod.homecom"), "0"),
		HOMECOM3 (Messages.getString("SiteDetailsSection.mod.homecom"), "0"),
		MON1 (Messages.getString("SiteDetailsSection.mod.mon"), "0"),
		MON2 (Messages.getString("SiteDetailsSection.mod.mon"), "0"),
		MON3 (Messages.getString("SiteDetailsSection.mod.mon"), "0"),
		MON4 (Messages.getString("SiteDetailsSection.mod.mon"), "0"),
		MON5 (Messages.getString("SiteDetailsSection.mod.mon"), "0"),
		COM1 (Messages.getString("SiteDetailsSection.mod.com"), "0"),
		COM2 (Messages.getString("SiteDetailsSection.mod.com"), "0"),
		COM3 (Messages.getString("SiteDetailsSection.mod.com"), "0"),
		COM4 (Messages.getString("SiteDetailsSection.mod.com"), "0"),
		COM5 (Messages.getString("SiteDetailsSection.mod.com"), "0"),
		GOLD (Messages.getString("SiteDetailsSection.mod.gold"), "0"),
		RES (Messages.getString("SiteDetailsSection.mod.res"), "0"),
		INCSCALE1 (Messages.getString("SiteDetailsSection.mod.incscale"), "0"),
		INCSCALE2 (Messages.getString("SiteDetailsSection.mod.incscale"), "0"),
		DECSCALE1 (Messages.getString("SiteDetailsSection.mod.decscale"), "0"),
		DECSCALE2 (Messages.getString("SiteDetailsSection.mod.decscale"), "0");
		
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
		private Text value1;
		private Text value2;
		private Label defaultLabel1;
		private Label defaultLabel2;
	}
	
	class Inst4Fields implements InstFields {
		private Button check;
		private Label defaultLabel;
	}

	EnumMap<Inst, InstFields> instMap = new EnumMap<Inst, InstFields>(Inst.class);
	
	public SiteDetailsPage(XtextEditor doc, TableViewer viewer) {
		this.doc = doc;
		this.viewer = viewer;
		instMap.put(Inst.PATH, new Inst2Fields());
		instMap.put(Inst.PATH, new Inst2Fields());
		instMap.put(Inst.LEVEL, new Inst2Fields());
		instMap.put(Inst.RARITY, new Inst2Fields());
		instMap.put(Inst.LOC, new Inst2Fields());
		instMap.put(Inst.HOMEMON1, new Inst2Fields());
		instMap.put(Inst.HOMEMON2, new Inst2Fields());
		instMap.put(Inst.HOMEMON3, new Inst2Fields());
		instMap.put(Inst.HOMECOM1, new Inst2Fields());
		instMap.put(Inst.HOMECOM2, new Inst2Fields());
		instMap.put(Inst.HOMECOM3, new Inst2Fields());
		instMap.put(Inst.MON1, new Inst2Fields());
		instMap.put(Inst.MON2, new Inst2Fields());
		instMap.put(Inst.MON3, new Inst2Fields());
		instMap.put(Inst.MON4, new Inst2Fields());
		instMap.put(Inst.MON5, new Inst2Fields());
		instMap.put(Inst.COM1, new Inst2Fields());
		instMap.put(Inst.COM2, new Inst2Fields());
		instMap.put(Inst.COM3, new Inst2Fields());
		instMap.put(Inst.COM4, new Inst2Fields());
		instMap.put(Inst.COM5, new Inst2Fields());
		instMap.put(Inst.GOLD, new Inst2Fields());
		instMap.put(Inst.RES, new Inst2Fields());
		instMap.put(Inst.INCSCALE1, new Inst2Fields());
		instMap.put(Inst.INCSCALE2, new Inst2Fields());
		instMap.put(Inst.DECSCALE1, new Inst2Fields());
		instMap.put(Inst.DECSCALE2, new Inst2Fields());
		instMap.put(Inst.GEMS1, new Inst3Fields());
		instMap.put(Inst.GEMS2, new Inst3Fields());
		instMap.put(Inst.GEMS3, new Inst3Fields());
		instMap.put(Inst.CLEAR, new Inst4Fields());
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
	public Site getInput() {
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
		s1.setText(Messages.getString("SiteDetailsSection.name"));
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
		
		toolkit.createLabel(nameComp, Messages.getString("SiteDetailsSection.mod.name")); //$NON-NLS-1$
		
		name = toolkit.createText(nameComp, null, SWT.SINGLE | SWT.BORDER); //$NON-NLS-1$
		name.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				setSitename(doc, name.getText());
			}			
		});
		name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					setSitename(doc, name.getText());
				}
			}
			
		});
		
		gd = new GridData(SWT.FILL, SWT.FILL, false, false);
		gd.widthHint = 500;
		name.setLayoutData(gd);
				
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
							addInst3(key, doc, key.defaultValue, key.defaultValue2);
						} else if (field instanceof Inst4Fields) {
							addInst4(key, doc);
						}
					} else {
						removeInst(key, doc);
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
			if (field instanceof Inst1Fields ||	field instanceof Inst2Fields ||	field instanceof Inst3Fields) {
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
							setInst1(key, doc, value.getText());
						} else if (field instanceof Inst2Fields) {
							setInst2(key, doc, value.getText());
						} else if (field instanceof Inst3Fields) {
							setInst3(key, doc, value.getText(), null);
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
								setInst3(key, doc, value.getText(), null);
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
				}
				value.setLayoutData(gd);
				
			}
				
			Label defaultLabel1 = null;
			
			if (field instanceof Inst2Fields || field instanceof Inst3Fields|| field instanceof Inst4Fields) {
				defaultLabel1 = toolkit.createLabel(isRight?rightColumn:leftColumn, "");
				defaultLabel1.setEnabled(false);
			}
			if (field instanceof Inst2Fields) {
				gd = new GridData(SWT.FILL, SWT.CENTER, false, false);
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
						setInst3(key, doc, null, value.getText());
					}			
				});
				value.addKeyListener(new KeyAdapter() {
					@Override
					public void keyPressed(KeyEvent e) {
						if (e.character == '\r') {
							setInst3(key, doc, null, value.getText());
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
				((Inst3Fields)field).value1 = myValue1;
				((Inst3Fields)field).defaultLabel1 = defaultLabel1;
				((Inst3Fields)field).value2 = myValue2;
				((Inst3Fields)field).defaultLabel2 = defaultLabel2;
			} else if (field instanceof Inst4Fields) {
				((Inst4Fields)field).check = check;
				((Inst4Fields)field).defaultLabel = defaultLabel1;
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
			if (input instanceof SelectSiteByName || input instanceof SelectSiteById) {
				String str = getSelectSitename(input);
				name.setText(str!= null?str:"");
				name.setEnabled(false);
			} else {
				String str = getInst1(Inst.NAME, input);
				name.setText(str!=null?str:"");
			}
			
		}
		SiteDB siteDB = new SiteDB();
		if (input instanceof SelectSiteById) {
			siteDB = Database.getSite(((SelectSiteById)input).getValue());
		} else if (input instanceof SelectSiteByName) {
			siteDB = Database.getSite(((SelectSiteByName)input).getValue());
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
			if (input instanceof SelectSiteByName || input instanceof SelectSiteById) {
				switch (fields.getKey()) {
				case PATH:
					if (siteDB.path != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.path));
						Inst.PATH.defaultValue = siteDB.path.toString();
					}
					break;
				case LEVEL:
					if (siteDB.level != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.level));
						Inst.LEVEL.defaultValue = siteDB.level.toString();
					}
					break;
				case RARITY:
					if (siteDB.rarity != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.rarity));
						Inst.RARITY.defaultValue = siteDB.rarity.toString();
					}
					break;
				case LOC:
					if (siteDB.loc != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.loc));
						Inst.LOC.defaultValue = siteDB.loc.toString();
					}
					break;
//				case HOMEMON:
//					if (siteDB.homemon != null) {
//						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.homemon));
//						Inst.HOMEMON.defaultValue = siteDB.homemon.toString();
//					}
//					break;
//				case HOMECOM:
//					if (siteDB.homecom != null) {
//						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.homecom));
//						Inst.HOMECOM.defaultValue = siteDB.homecom.toString();
//					}
//					break;
				case MON1:
					if (siteDB.mon1 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.mon1));
						Inst.MON1.defaultValue = siteDB.mon1.toString();
					}
					break;
				case MON2:
					if (siteDB.mon2 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.mon2));
						Inst.MON2.defaultValue = siteDB.mon2.toString();
					}
					break;
				case MON3:
					if (siteDB.mon3 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.mon3));
						Inst.MON3.defaultValue = siteDB.mon3.toString();
					}
					break;
				case MON4:
					if (siteDB.mon4 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.mon4));
						Inst.MON4.defaultValue = siteDB.mon4.toString();
					}
					break;
				case MON5:
					if (siteDB.mon5 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.mon5));
						Inst.MON5.defaultValue = siteDB.mon5.toString();
					}
					break;
				case COM1:
					if (siteDB.com1 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.com1));
						Inst.COM1.defaultValue = siteDB.com1.toString();
					}
					break;
				case COM2:
					if (siteDB.com2 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.com2));
						Inst.COM2.defaultValue = siteDB.com2.toString();
					}
					break;
				case COM3:
					if (siteDB.com3 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.com3));
						Inst.COM3.defaultValue = siteDB.com3.toString();
					}
					break;
				case COM4:
					if (siteDB.com4 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.com4));
						Inst.COM4.defaultValue = siteDB.com4.toString();
					}
					break;
				case COM5:
					if (siteDB.com5 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.com5));
						Inst.COM5.defaultValue = siteDB.com5.toString();
					}
					break;
				case GOLD:
					if (siteDB.gold != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.gold));
						Inst.GOLD.defaultValue = siteDB.gold.toString();
					}
					break;
				case RES:
					if (siteDB.res != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.res));
						Inst.RES.defaultValue = siteDB.res.toString();
					}
					break;
				case INCSCALE1:
					if (siteDB.incscale1 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.incscale1));
						Inst.INCSCALE1.defaultValue = siteDB.incscale1.toString();
					}
					break;
				case INCSCALE2:
					if (siteDB.incscale2 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.incscale2));
						Inst.INCSCALE2.defaultValue = siteDB.incscale2.toString();
					}
					break;
				case DECSCALE1:
					if (siteDB.decscale1 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.decscale1));
						Inst.DECSCALE1.defaultValue = siteDB.decscale1.toString();
					}
					break;
				case DECSCALE2:
					if (siteDB.decscale2 != null) {
						((Inst2Fields)fields.getValue()).defaultLabel.setText(Messages.format("DetailsPage.DefaultLabel.fmt", siteDB.decscale2));
						Inst.DECSCALE2.defaultValue = siteDB.decscale2.toString();
					}
					break;
				}
			}
		}
	}
	
	private String getSelectSitename(Site site) {
		if (site instanceof SelectSiteByName) {
			return ((SelectSiteByName)site).getValue();
		} else {
			int id = ((SelectSiteById)site).getValue();
			return Database.getSiteName(id);
		}
	}
	
	private void setSitename(final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Site siteToEdit = input;
				EList<SiteMods> mods = siteToEdit.getMods();
				boolean nameSet = false;
				for (SiteMods mod : mods) {
					if (mod instanceof SiteInst1) {
						if (((SiteInst1)mod).isName()) {
							((SiteInst1)mod).setValue(newName);
							nameSet = true;
						}
					}
				}
				if (!nameSet) {
					SiteInst1 nameInst = DmFactory.eINSTANCE.createSiteInst1();
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
			input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private String getInst1(Inst inst2, Site site) {
		EList<SiteMods> list = site.getMods();
		for (SiteMods mod : list) {
			if (mod instanceof SiteInst1) {
				switch (inst2) {
				case NAME:
					if (((SiteInst1)mod).isName()){
						return ((SiteInst1)mod).getValue();
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer getInst2(Inst inst2, Site site) {
		EList<SiteMods> list = site.getMods();
		int homeMonCount = 0;
		int homeComCount = 0;
		int monCount = 0;
		int comCount = 0;
		int inscaleCount = 0;
		int descaleCount = 0;
		for (SiteMods mod : list) {
			if (mod instanceof SiteInst2) {
				switch (inst2) {
				case PATH:
					if (((SiteInst2)mod).isPath()){
						return Integer.valueOf(((SiteInst2)mod).getValue());
					}
					break;
				case LEVEL:
					if (((SiteInst2)mod).isLevel()){
						return Integer.valueOf(((SiteInst2)mod).getValue());
					}
					break;
				case RARITY:
					if (((SiteInst2)mod).isRarity()){
						return Integer.valueOf(((SiteInst2)mod).getValue());
					}
					break;
				case LOC:
					if (((SiteInst2)mod).isLoc()){
						return Integer.valueOf(((SiteInst2)mod).getValue());
					}
					break;
				case HOMEMON1:
					if (((SiteInst2)mod).isHomemon()){
						homeMonCount++;
						if (homeMonCount == 1) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case HOMEMON2:
					if (((SiteInst2)mod).isHomemon()){
						homeMonCount++;
						if (homeMonCount == 2) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case HOMEMON3:
					if (((SiteInst2)mod).isHomemon()){
						homeMonCount++;
						if (homeMonCount == 3) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case HOMECOM1:
					if (((SiteInst2)mod).isHomecom()){
						homeComCount++;
						if (homeComCount == 1) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case HOMECOM2:
					if (((SiteInst2)mod).isHomecom()){
						homeComCount++;
						if (homeComCount == 2) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case HOMECOM3:
					if (((SiteInst2)mod).isHomecom()){
						homeComCount++;
						if (homeComCount == 3) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case MON1:
					if (((SiteInst2)mod).isMon()){
						monCount++;
						if (monCount == 1) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case MON2:
					if (((SiteInst2)mod).isMon()){
						monCount++;
						if (monCount == 2) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case MON3:
					if (((SiteInst2)mod).isMon()){
						monCount++;
						if (monCount == 3) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case MON4:
					if (((SiteInst2)mod).isMon()){
						monCount++;
						if (monCount == 4) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case MON5:
					if (((SiteInst2)mod).isMon()){
						monCount++;
						if (monCount == 5) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case COM1:
					if (((SiteInst2)mod).isCom()){
						comCount++;
						if (comCount == 1) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case COM2:
					if (((SiteInst2)mod).isCom()){
						comCount++;
						if (comCount == 2) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case COM3:
					if (((SiteInst2)mod).isCom()){
						comCount++;
						if (comCount == 3) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case COM4:
					if (((SiteInst2)mod).isCom()){
						comCount++;
						if (comCount == 4) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case COM5:
					if (((SiteInst2)mod).isCom()){
						comCount++;
						if (comCount == 5) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case GOLD:
					if (((SiteInst2)mod).isGold()){
						return Integer.valueOf(((SiteInst2)mod).getValue());
					}
					break;
				case RES:
					if (((SiteInst2)mod).isRes()){
						return Integer.valueOf(((SiteInst2)mod).getValue());
					}
					break;
				case INCSCALE1:
					if (((SiteInst2)mod).isIncscale()){
						inscaleCount++;
						if (inscaleCount == 1) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case INCSCALE2:
					if (((SiteInst2)mod).isIncscale()){
						inscaleCount++;
						if (inscaleCount == 2) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case DECSCALE1:
					if (((SiteInst2)mod).isDecscale()){
						descaleCount++;
						if (descaleCount == 1) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				case DECSCALE2:
					if (((SiteInst2)mod).isDecscale()){
						descaleCount++;
						if (descaleCount == 2) {
							return Integer.valueOf(((SiteInst2)mod).getValue());
						}
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Integer[] getInst3(Inst inst3, Site site) {
		EList<SiteMods> list = site.getMods();
		int gemCount = 0;
		for (SiteMods mod : list) {
			if (mod instanceof SiteInst3) {
				switch (inst3) {
				case GEMS1:
					if (((SiteInst3)mod).isGems()) {
						gemCount++;
						if (gemCount == 1) {
							return new Integer[]{Integer.valueOf(((SiteInst3)mod).getValue1()), Integer.valueOf(((SiteInst3)mod).getValue2())};
						}
					}
					break;
				case GEMS2:
					if (((SiteInst3)mod).isGems()) {
						gemCount++;
						if (gemCount == 2) {
							return new Integer[]{Integer.valueOf(((SiteInst3)mod).getValue1()), Integer.valueOf(((SiteInst3)mod).getValue2())};
						}
					}
					break;
				case GEMS3:
					if (((SiteInst3)mod).isGems()) {
						gemCount++;
						if (gemCount == 3) {
							return new Integer[]{Integer.valueOf(((SiteInst3)mod).getValue1()), Integer.valueOf(((SiteInst3)mod).getValue2())};
						}
					}
					break;
				}
			}
		}
		return null;
	}
	
	private Boolean getInst4(Inst inst4, Site site) {
		EList<SiteMods> list = site.getMods();
		for (SiteMods mod : list) {
			if (mod instanceof SiteInst4) {
				switch (inst4) {
				case CLEAR:
					if (((SiteInst4)mod).isClear()){
						return Boolean.TRUE;
					}
					break;
				}
			}
		}
		return Boolean.FALSE;
	}
	
	private void setInst1(final Inst inst2, final XtextEditor editor, final String newName) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Site siteToEdit = input;
				EList<SiteMods> mods = siteToEdit.getMods();				
				for (SiteMods mod : mods) {
					if (mod instanceof SiteInst1) {
						switch (inst2) {
						case NAME:
							if (((SiteInst1)mod).isName()) {
								((SiteInst1)mod).setValue(newName);
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
			input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
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
				Site siteToEdit = input;
				int homeMonCount = 0;
				int homeComCount = 0;
				int monCount = 0;
				int comCount = 0;
				int inscaleCount = 0;
				int descaleCount = 0;
				EList<SiteMods> mods = siteToEdit.getMods();
				for (SiteMods mod : mods) {
					if (mod instanceof SiteInst2) {
						switch (inst2) {
						case PATH:
							if (((SiteInst2)mod).isPath()){
								((SiteInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case LEVEL:
							if (((SiteInst2)mod).isLevel()){
								((SiteInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RARITY:
							if (((SiteInst2)mod).isRarity()){
								((SiteInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case LOC:
							if (((SiteInst2)mod).isLoc()){
								((SiteInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case HOMEMON1:
							if (((SiteInst2)mod).isHomemon()){
								homeMonCount++;
								if (homeMonCount == 1) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case HOMEMON2:
							if (((SiteInst2)mod).isHomemon()){
								homeMonCount++;
								if (homeMonCount == 2) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case HOMEMON3:
							if (((SiteInst2)mod).isHomemon()){
								homeMonCount++;
								if (homeMonCount == 3) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case HOMECOM1:
							if (((SiteInst2)mod).isHomecom()){
								homeComCount++;
								if (homeComCount == 1) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case HOMECOM2:
							if (((SiteInst2)mod).isHomecom()){
								homeComCount++;
								if (homeComCount == 2) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case HOMECOM3:
							if (((SiteInst2)mod).isHomecom()){
								homeComCount++;
								if (homeComCount == 3) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case MON1:
							if (((SiteInst2)mod).isMon()){
								monCount++;
								if (monCount == 1) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case MON2:
							if (((SiteInst2)mod).isMon()){
								monCount++;
								if (monCount == 2) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case MON3:
							if (((SiteInst2)mod).isMon()){
								monCount++;
								if (monCount == 3) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case MON4:
							if (((SiteInst2)mod).isMon()){
								monCount++;
								if (monCount == 4) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case MON5:
							if (((SiteInst2)mod).isMon()){
								monCount++;
								if (monCount == 5) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case COM1:
							if (((SiteInst2)mod).isCom()){
								comCount++;
								if (comCount == 1) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case COM2:
							if (((SiteInst2)mod).isCom()){
								comCount++;
								if (comCount == 2) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case COM3:
							if (((SiteInst2)mod).isCom()){
								comCount++;
								if (comCount == 3) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case COM4:
							if (((SiteInst2)mod).isCom()){
								comCount++;
								if (comCount == 4) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case COM5:
							if (((SiteInst2)mod).isCom()){
								comCount++;
								if (comCount == 5) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case GOLD:
							if (((SiteInst2)mod).isGold()){
								((SiteInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case RES:
							if (((SiteInst2)mod).isRes()){
								((SiteInst2)mod).setValue(Integer.parseInt(newName));
							}
							break;
						case INCSCALE1:
							if (((SiteInst2)mod).isIncscale()){
								inscaleCount++;
								if (inscaleCount == 1) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case INCSCALE2:
							if (((SiteInst2)mod).isIncscale()){
								inscaleCount++;
								if (inscaleCount == 2) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case DECSCALE1:
							if (((SiteInst2)mod).isDecscale()){
								descaleCount++;
								if (descaleCount == 1) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
								}
							}
							break;
						case DECSCALE2:
							if (((SiteInst2)mod).isDecscale()){
								descaleCount++;
								if (descaleCount == 2) {
									((SiteInst2)mod).setValue(Integer.parseInt(newName));
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
			input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
	}

	private void setInst3(final Inst inst3, final XtextEditor editor, final String value1, final String value2) 
	{
		final IXtextDocument myDocument = editor.getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {
				Site siteToEdit = input;
				int gemCount = 0;
				EList<SiteMods> mods = siteToEdit.getMods();
				for (SiteMods mod : mods) {
					if (mod instanceof SiteInst3) {
						switch (inst3) {
						case GEMS1:
							if (((SiteInst3)mod).isGems()) {
								gemCount++;
								if (gemCount == 1) {
									if (value1 != null) {
										((SiteInst3)mod).setValue1(Integer.parseInt(value1));
									}
									if (value2 != null) {
										((SiteInst3)mod).setValue2(Integer.parseInt(value2));
									}
								}
							}
							break;
						case GEMS2:
							if (((SiteInst3)mod).isGems()) {
								gemCount++;
								if (gemCount == 2) {
									if (value1 != null) {
										((SiteInst3)mod).setValue1(Integer.parseInt(value1));
									}
									if (value2 != null) {
										((SiteInst3)mod).setValue2(Integer.parseInt(value2));
									}
								}
							}
							break;
						case GEMS3:
							if (((SiteInst3)mod).isGems()) {
								gemCount++;
								if (gemCount == 3) {
									if (value1 != null) {
										((SiteInst3)mod).setValue1(Integer.parseInt(value1));
									}
									if (value2 != null) {
										((SiteInst3)mod).setValue2(Integer.parseInt(value2));
									}
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
			input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
		} else {
			input = null;
		}
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
						EList<SiteMods> mods = input.getMods();
						SiteInst1 type = DmFactory.eINSTANCE.createSiteInst1();
						switch (inst) {
						case NAME:
							type.setName(true);
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
					input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
				} else {
					input = null;
				}
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
						EList<SiteMods> mods = input.getMods();
						SiteInst2 type = DmFactory.eINSTANCE.createSiteInst2();
						switch (inst) {
						case PATH:
							type.setPath(true);
							break;
						case LEVEL:
							type.setLevel(true);
							break;
						case RARITY:
							type.setRarity(true);
							break;
						case LOC:
							type.setLoc(true);
							break;
						case HOMEMON1:
							type.setHomemon(true);
							break;
						case HOMEMON2:
							type.setHomemon(true);
							break;
						case HOMEMON3:
							type.setHomemon(true);
							break;
						case HOMECOM1:
							type.setHomecom(true);
							break;
						case HOMECOM2:
							type.setHomecom(true);
							break;
						case HOMECOM3:
							type.setHomecom(true);
							break;
						case MON1:
							type.setMon(true);
							break;
						case MON2:
							type.setMon(true);
							break;
						case MON3:
							type.setMon(true);
							break;
						case MON4:
							type.setMon(true);
							break;
						case MON5:
							type.setMon(true);
							break;
						case COM1:
							type.setCom(true);
							break;
						case COM2:
							type.setCom(true);
							break;
						case COM3:
							type.setCom(true);
							break;
						case COM4:
							type.setCom(true);
							break;
						case COM5:
							type.setCom(true);
							break;
						case GOLD:
							type.setGold(true);
							break;
						case RES:
							type.setRes(true);
							break;
						case INCSCALE1:
							type.setIncscale(true);
							break;
						case INCSCALE2:
							type.setIncscale(true);
							break;
						case DECSCALE1:
							type.setDecscale(true);
							break;
						case DECSCALE2:
							type.setDecscale(true);
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
					input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
				} else {
					input = null;
				}
			}
		});
	}
	
	private void addInst3(final Inst inst, final XtextEditor editor, final String newName1, final String newName2) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						EList<SiteMods> mods = input.getMods();
						SiteInst3 type = DmFactory.eINSTANCE.createSiteInst3();
						switch (inst) {
						case GEMS1:
							type.setGems(true);
							break;
						case GEMS2:
							type.setGems(true);
							break;
						case GEMS3:
							type.setGems(true);
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
					input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
				} else {
					input = null;
				}
			}
		});
	}
	
	private void addInst4(final Inst inst, final XtextEditor editor) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						EList<SiteMods> mods = input.getMods();
						SiteInst4 type = DmFactory.eINSTANCE.createSiteInst4();
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
					input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
				} else {
					input = null;
				}
			}
		});
	}
	
	private void removeInst(final Inst inst, final XtextEditor editor) {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				final IXtextDocument myDocument = editor.getDocument();
				IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);
				documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
					@Override
					public void process(XtextResource resource) {
						int homeMonCount = 0;
						int homeComCount = 0;
						int monCount = 0;
						int comCount = 0;
						int inscaleCount = 0;
						int descaleCount = 0;
						int gemCount = 0;
						SiteMods modToRemove = null;
						EList<SiteMods> mods = input.getMods();
						for (SiteMods mod : mods) {
							if (mod instanceof SiteInst1) {
								switch (inst) {
								case NAME:
									if (((SiteInst1)mod).isName()){
										modToRemove = mod;
									}
									break;
								}
							}
							if (mod instanceof SiteInst2) {
								switch (inst) {
								case PATH:
									if (((SiteInst2)mod).isPath()){
										modToRemove = mod;
									}
									break;
								case LEVEL:
									if (((SiteInst2)mod).isLevel()){
										modToRemove = mod;
									}
									break;
								case RARITY:
									if (((SiteInst2)mod).isRarity()){
										modToRemove = mod;
									}
									break;
								case LOC:
									if (((SiteInst2)mod).isLoc()){
										modToRemove = mod;
									}
									break;
								case HOMEMON1:
									if (((SiteInst2)mod).isHomemon()){
										homeMonCount++;
										if (homeMonCount == 1) {
											modToRemove = mod;
										}
									}
									break;
								case HOMEMON2:
									if (((SiteInst2)mod).isHomemon()){
										homeMonCount++;
										if (homeMonCount == 2) {
											modToRemove = mod;
										}
									}
									break;
								case HOMEMON3:
									if (((SiteInst2)mod).isHomemon()){
										homeMonCount++;
										if (homeMonCount == 3) {
											modToRemove = mod;
										}
									}
									break;
								case HOMECOM1:
									if (((SiteInst2)mod).isHomecom()){
										homeComCount++;
										if (homeComCount == 1) {
											modToRemove = mod;
										}
									}
									break;
								case HOMECOM2:
									if (((SiteInst2)mod).isHomecom()){
										homeComCount++;
										if (homeComCount == 2) {
											modToRemove = mod;
										}
									}
									break;
								case HOMECOM3:
									if (((SiteInst2)mod).isHomecom()){
										homeComCount++;
										if (homeComCount == 3) {
											modToRemove = mod;
										}
									}
									break;
								case MON1:
									if (((SiteInst2)mod).isMon()){
										monCount++;
										if (monCount == 1) {									
											modToRemove = mod;
										}
									}
									break;
								case MON2:
									if (((SiteInst2)mod).isMon()){
										monCount++;
										if (monCount == 2) {									
											modToRemove = mod;
										}
									}
									break;
								case MON3:
									if (((SiteInst2)mod).isMon()){
										monCount++;
										if (monCount == 3) {									
											modToRemove = mod;
										}
									}
									break;
								case MON4:
									if (((SiteInst2)mod).isMon()){
										monCount++;
										if (monCount == 4) {									
											modToRemove = mod;
										}
									}
									break;
								case MON5:
									if (((SiteInst2)mod).isMon()){
										monCount++;
										if (monCount == 5) {									
											modToRemove = mod;
										}
									}
									break;
								case COM1:
									if (((SiteInst2)mod).isCom()){
										comCount++;
										if (comCount == 1) {
											modToRemove = mod;
										}
									}
									break;
								case COM2:
									if (((SiteInst2)mod).isCom()){
										comCount++;
										if (comCount == 2) {
											modToRemove = mod;
										}
									}
									break;
								case COM3:
									if (((SiteInst2)mod).isCom()){
										comCount++;
										if (comCount == 3) {
											modToRemove = mod;
										}
									}
									break;
								case COM4:
									if (((SiteInst2)mod).isCom()){
										comCount++;
										if (comCount == 4) {
											modToRemove = mod;
										}
									}
									break;
								case COM5:
									if (((SiteInst2)mod).isCom()){
										comCount++;
										if (comCount == 5) {
											modToRemove = mod;
										}
									}
									break;
								case GOLD:
									if (((SiteInst2)mod).isGold()){
										modToRemove = mod;
									}
									break;
								case RES:
									if (((SiteInst2)mod).isRes()){
										modToRemove = mod;
									}
									break;
								case INCSCALE1:
									if (((SiteInst2)mod).isIncscale()){
										inscaleCount++;
										if (inscaleCount == 1) {
											modToRemove = mod;
										}
									}
									break;
								case INCSCALE2:
									if (((SiteInst2)mod).isIncscale()){
										inscaleCount++;
										if (inscaleCount == 2) {
											modToRemove = mod;
										}
									}
									break;
								case DECSCALE1:
									if (((SiteInst2)mod).isDecscale()){
										descaleCount++;
										if (descaleCount == 1) {
											modToRemove = mod;
										}
									}
									break;
								case DECSCALE2:
									if (((SiteInst2)mod).isDecscale()){
										descaleCount++;
										if (descaleCount == 2) {
											modToRemove = mod;
										}
									}
									break;
								}
							}
							if (mod instanceof SiteInst3) {
								switch (inst) {
								case GEMS1:
									if (((SiteInst3)mod).isGems()){
										gemCount++;
										if (gemCount == 1) {
											modToRemove = mod;
										}
									}
									break;
								case GEMS2:
									if (((SiteInst3)mod).isGems()){
										gemCount++;
										if (gemCount == 2) {
											modToRemove = mod;
										}
									}
									break;
								case GEMS3:
									if (((SiteInst3)mod).isGems()){
										gemCount++;
										if (gemCount == 3) {
											modToRemove = mod;
										}
									}
									break;
								}
							}
							if (mod instanceof SiteInst4) {
								switch (inst) {
								case CLEAR:
									if (((SiteInst4)mod).isClear()){
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
					input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
				} else {
					input = null;
				}
			}
		});
	}

	/* (non-Javadoc)
	 * @see org.eclipse.ui.forms.IDetailsPage#inputChanged(org.eclipse.jface.viewers.IStructuredSelection)
	 */
	public void selectionChanged(IFormPart part, ISelection selection) {
		IStructuredSelection ssel = (IStructuredSelection)selection;
		if (ssel.size()==1) {
			input = (Site)((AbstractElementWrapper)ssel.getFirstElement()).getElement();
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
