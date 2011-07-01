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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.BusyIndicator;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.DetailsPart;
import org.eclipse.ui.forms.IDetailsPage;
import org.eclipse.ui.forms.IDetailsPageProvider;
import org.eclipse.ui.forms.IManagedForm;
import org.eclipse.ui.forms.MasterDetailsBlock;
import org.eclipse.ui.forms.SectionPart;
import org.eclipse.ui.forms.editor.FormPage;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IDocumentEditor;
import org.eclipse.xtext.util.TextLocation;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.larz.dom3.Activator;
import org.larz.dom3.db.Database;
import org.larz.dom3.dm.dm.AbstractElement;
import org.larz.dom3.dm.dm.Armor;
import org.larz.dom3.dm.dm.ArmorInst1;
import org.larz.dom3.dm.dm.ArmorMods;
import org.larz.dom3.dm.dm.DmFactory;
import org.larz.dom3.dm.dm.Dom3Mod;
import org.larz.dom3.dm.dm.Item;
import org.larz.dom3.dm.dm.ItemInst1;
import org.larz.dom3.dm.dm.ItemMods;
import org.larz.dom3.dm.dm.Monster;
import org.larz.dom3.dm.dm.MonsterInst1;
import org.larz.dom3.dm.dm.MonsterMods;
import org.larz.dom3.dm.dm.NationInst1;
import org.larz.dom3.dm.dm.NationMods;
import org.larz.dom3.dm.dm.NewArmor;
import org.larz.dom3.dm.dm.NewItem;
import org.larz.dom3.dm.dm.NewMonster;
import org.larz.dom3.dm.dm.NewSite;
import org.larz.dom3.dm.dm.NewSpell;
import org.larz.dom3.dm.dm.NewWeapon;
import org.larz.dom3.dm.dm.SelectArmorById;
import org.larz.dom3.dm.dm.SelectArmorByName;
import org.larz.dom3.dm.dm.SelectItemById;
import org.larz.dom3.dm.dm.SelectItemByName;
import org.larz.dom3.dm.dm.SelectMonsterById;
import org.larz.dom3.dm.dm.SelectMonsterByName;
import org.larz.dom3.dm.dm.SelectName;
import org.larz.dom3.dm.dm.SelectNation;
import org.larz.dom3.dm.dm.SelectSiteById;
import org.larz.dom3.dm.dm.SelectSiteByName;
import org.larz.dom3.dm.dm.SelectSpellById;
import org.larz.dom3.dm.dm.SelectSpellByName;
import org.larz.dom3.dm.dm.SelectWeaponById;
import org.larz.dom3.dm.dm.SelectWeaponByName;
import org.larz.dom3.dm.dm.Site;
import org.larz.dom3.dm.dm.SiteInst1;
import org.larz.dom3.dm.dm.SiteMods;
import org.larz.dom3.dm.dm.Spell;
import org.larz.dom3.dm.dm.SpellInst1;
import org.larz.dom3.dm.dm.SpellInst5;
import org.larz.dom3.dm.dm.SpellMods;
import org.larz.dom3.dm.dm.Weapon;
import org.larz.dom3.dm.dm.WeaponInst1;
import org.larz.dom3.dm.dm.WeaponMods;
import org.larz.dom3.dm.dm.impl.NewArmorImpl;
import org.larz.dom3.dm.dm.impl.NewItemImpl;
import org.larz.dom3.dm.dm.impl.NewMonsterImpl;
import org.larz.dom3.dm.dm.impl.NewSiteImpl;
import org.larz.dom3.dm.dm.impl.NewSpellImpl;
import org.larz.dom3.dm.dm.impl.NewWeaponImpl;
import org.larz.dom3.dm.dm.impl.SelectArmorByIdImpl;
import org.larz.dom3.dm.dm.impl.SelectArmorByNameImpl;
import org.larz.dom3.dm.dm.impl.SelectItemByIdImpl;
import org.larz.dom3.dm.dm.impl.SelectItemByNameImpl;
import org.larz.dom3.dm.dm.impl.SelectMonsterByIdImpl;
import org.larz.dom3.dm.dm.impl.SelectMonsterByNameImpl;
import org.larz.dom3.dm.dm.impl.SelectNameImpl;
import org.larz.dom3.dm.dm.impl.SelectNationImpl;
import org.larz.dom3.dm.dm.impl.SelectSiteByIdImpl;
import org.larz.dom3.dm.dm.impl.SelectSiteByNameImpl;
import org.larz.dom3.dm.dm.impl.SelectSpellByIdImpl;
import org.larz.dom3.dm.dm.impl.SelectSpellByNameImpl;
import org.larz.dom3.dm.dm.impl.SelectWeaponByIdImpl;
import org.larz.dom3.dm.dm.impl.SelectWeaponByNameImpl;
import org.larz.dom3.dm.ui.internal.DmActivator;

public class SummaryList extends MasterDetailsBlock {
	private FormPage page;
	private DmEditor editor;
	private XtextEditor doc;
	public TableViewer viewer;
	
	private static final Image ARMOR_IMAGE = Activator.getImageDescriptor("icons/armor.png").createImage();
	private static final Image WEAPON_IMAGE = Activator.getImageDescriptor("icons/weapon.png").createImage();
	private static final Image SPELL_IMAGE = Activator.getImageDescriptor("icons/spell.png").createImage();
	private static final Image SITE_IMAGE = Activator.getImageDescriptor("icons/site.png").createImage();
	private static final Image ITEM_IMAGE = Activator.getImageDescriptor("icons/item.png").createImage();
	private static final Image NATION_IMAGE = Activator.getImageDescriptor("icons/nation.png").createImage();
	private static final Image MONSTER_IMAGE = Activator.getImageDescriptor("icons/monster.png").createImage();
	private static final Image NAME_IMAGE = Activator.getImageDescriptor("icons/name.png").createImage();
	
	enum AddTypes {
		BY_NAME, BY_ID, NEW
	}
	
	public SummaryList(FormPage page, DmEditor editor, XtextEditor doc) {
		this.page = page;
		this.doc = doc;
		this.editor = editor;
	}
	
	/**
	 * @param id
	 * @param title
	 */
	class MasterContentProvider implements IStructuredContentProvider {
		
		public Object[] getElements(Object inputElement) {
			IXtextDocument document = ((XtextEditor)doc).getDocument();
			AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
				public AbstractElement[] exec(XtextResource resource) {             
					Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
					EList<AbstractElement> list = dom3Mod.getElements();
					return list.toArray(new AbstractElement[list.size()]);
					} 
				});
			List<AbstractElementWrapper> wrapperList = new ArrayList<AbstractElementWrapper>();
			int id = 1;
			for (AbstractElement abstractElement : elements) {
				wrapperList.add(new AbstractElementWrapper(abstractElement, id++));
			}

			return wrapperList.toArray();
		}
		public void dispose() {
		}
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}
	}
	class MasterLabelProvider extends LabelProvider implements ITableLabelProvider {
		public String getColumnText(Object obj, int index) {
			AbstractElement element = ((AbstractElementWrapper)obj).getElement();
			if (element instanceof SelectArmorByName) {
				return Messages.format("ScrolledPropertiesBlock.armor.single.fmt", ((SelectArmorByName)element).getValue());
			} else if (element instanceof SelectArmorById) {
				EList<ArmorMods> list = ((SelectArmorById)element).getMods();
				for (ArmorMods mod : list) {
					if (mod instanceof ArmorInst1) {
						if (((ArmorInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.armor.double.fmt", ((ArmorInst1)mod).getValue(), ((SelectArmorById)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.armor.double.fmt", ((SelectArmorById)element).getValue(), Database.getArmorName(((SelectArmorById)element).getValue()));
			} else if (element instanceof NewArmor) {
				EList<ArmorMods> list = ((Armor)element).getMods();
				for (ArmorMods mod : list) {
					if (mod instanceof ArmorInst1) {
						if (((ArmorInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.armor.double.fmt", ((ArmorInst1)mod).getValue(), ((NewArmor)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.armor.single.fmt", ((NewArmor)element).getValue());
			} else if (element instanceof SelectWeaponByName) {
				return Messages.format("ScrolledPropertiesBlock.weapon.single.fmt", ((SelectWeaponByName)element).getValue());
			} else if (element instanceof SelectWeaponById) {
				EList<WeaponMods> list = ((SelectWeaponById)element).getMods();
				for (WeaponMods mod : list) {
					if (mod instanceof WeaponInst1) {
						if (((WeaponInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.weapon.double.fmt", ((WeaponInst1)mod).getValue(), ((SelectWeaponById)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.weapon.double.fmt", ((SelectWeaponById)element).getValue(), Database.getWeaponName(((SelectWeaponById)element).getValue()));
			} else if (element instanceof NewWeapon) {
				EList<WeaponMods> list = ((Weapon)element).getMods();
				for (WeaponMods mod : list) {
					if (mod instanceof WeaponInst1) {
						if (((WeaponInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.weapon.double.fmt", ((WeaponInst1)mod).getValue(), ((NewWeapon)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.weapon.single.fmt", ((NewWeapon)element).getValue());
			} else if (element instanceof SelectMonsterByName) {
				return Messages.format("ScrolledPropertiesBlock.monster.single.fmt", ((SelectMonsterByName)element).getValue());
			} else if (element instanceof SelectMonsterById) {
				EList<MonsterMods> list = ((SelectMonsterById)element).getMods();
				for (MonsterMods mod : list) {
					if (mod instanceof MonsterInst1) {
						if (((MonsterInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.monster.double.fmt", ((MonsterInst1)mod).getValue(), ((SelectMonsterById)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.monster.double.fmt", ((SelectMonsterById)element).getValue(), Database.getMonsterName(((SelectMonsterById)element).getValue()));
			} else if (element instanceof NewMonster) {
				EList<MonsterMods> list = ((Monster)element).getMods();
				for (MonsterMods mod : list) {
					if (mod instanceof MonsterInst1) {
						if (((MonsterInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.monster.double.fmt", ((MonsterInst1)mod).getValue(), ((NewMonster)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.monster.single.fmt", ((NewMonster)element).getValue());
			} else if (element instanceof SelectItemByName) {
				return Messages.format("ScrolledPropertiesBlock.item.single.fmt", ((SelectItemByName)element).getValue());
			} else if (element instanceof SelectItemById) {
				EList<ItemMods> list = ((SelectItemById)element).getMods();
				for (ItemMods mod : list) {
					if (mod instanceof ItemInst1) {
						if (((ItemInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.item.double.fmt", ((ItemInst1)mod).getValue(), ((SelectItemById)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.item.double.fmt", ((SelectItemById)element).getValue(), Database.getItemName(((SelectItemById)element).getValue()));
			} else if (element instanceof NewItem) {
				EList<ItemMods> list = ((Item)element).getMods();
				for (ItemMods mod : list) {
					if (mod instanceof ItemInst1) {
						if (((ItemInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.item.single.fmt", ((ItemInst1)mod).getValue());
						}
					}
				}
			} else if (element instanceof SelectSiteByName) {
				return Messages.format("ScrolledPropertiesBlock.site.single.fmt", ((SelectSiteByName)element).getValue());
			} else if (element instanceof SelectSiteById) {
				EList<SiteMods> list = ((SelectSiteById)element).getMods();
				for (SiteMods mod : list) {
					if (mod instanceof SiteInst1) {
						if (((SiteInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.site.double.fmt", ((SiteInst1)mod).getValue(), ((SelectSiteById)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.site.double.fmt", ((SelectSiteById)element).getValue(), Database.getSiteName(((SelectSiteById)element).getValue()));
			} else if (element instanceof NewSite) {
				EList<SiteMods> list = ((Site)element).getMods();
				for (SiteMods mod : list) {
					if (mod instanceof SiteInst1) {
						if (((SiteInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.site.double.fmt", ((SiteInst1)mod).getValue(), ((NewSite)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.site.single.fmt", ((NewSite)element).getValue());
			} else if (element instanceof SelectSpellByName) {
				return Messages.format("ScrolledPropertiesBlock.spell.single.fmt", ((SelectSpellByName)element).getValue());
			} else if (element instanceof SelectSpellById) {
				EList<SpellMods> list = ((SelectSpellById)element).getMods();
				for (SpellMods mod : list) {
					if (mod instanceof SpellInst1) {
						if (((SpellInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.spell.double.fmt", ((SpellInst1)mod).getValue(), ((SelectSpellById)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.spell.double.fmt", ((SelectSpellById)element).getValue(), Database.getSpellName(((SelectSpellById)element).getValue()));
			} else if (element instanceof NewSpell) {
				EList<SpellMods> list = ((Spell)element).getMods();
				for (SpellMods mod : list) {
					if (mod instanceof SpellInst1) {
						if (((SpellInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.spell.single.fmt", ((SpellInst1)mod).getValue());
						}
					}
				}
				for (SpellMods mod : list) {
					if (mod instanceof SpellInst5) {
						if (((SpellInst5)mod).isCopyspell()) {
							String value1 = ((SpellInst5)mod).getValue1();
							int value2 = ((SpellInst5)mod).getValue2();
							if (value1 != null && value1.length() > 0) {
								return Messages.format("ScrolledPropertiesBlock.spell.copy.fmt", value1);
							} else {
								return Messages.format("ScrolledPropertiesBlock.spell.copy.fmt", value2);
							}
						}
					}
				}
			} else if (element instanceof SelectNation) {
				EList<NationMods> list = ((SelectNation)element).getMods();
				for (NationMods mod : list) {
					if (mod instanceof NationInst1) {
						if (((NationInst1)mod).isName()) {
							return Messages.format("ScrolledPropertiesBlock.nation.double.fmt", ((NationInst1)mod).getValue(), ((SelectNation)element).getValue());
						}
					}
				}
				return Messages.format("ScrolledPropertiesBlock.nation.double.fmt", ((SelectNation)element).getValue(), Database.getNationName(((SelectNation)element).getValue()));
			} else if (element instanceof SelectName) {
				return Messages.format("ScrolledPropertiesBlock.nametype.single.fmt", ((SelectName)element).getValue());
			}
			return obj.toString();
		}
		public Image getColumnImage(Object obj, int index) {
			AbstractElement element = ((AbstractElementWrapper)obj).getElement();
			if (element instanceof NewArmorImpl || 
				element instanceof SelectArmorById ||
				element instanceof SelectArmorByName) {
				return ARMOR_IMAGE;
			}
			if (element instanceof NewWeapon ||
				element instanceof SelectWeaponById ||
				element instanceof SelectWeaponByName) {
				return WEAPON_IMAGE;
			}
			if (element instanceof NewMonster ||
				element instanceof SelectMonsterById ||
				element instanceof SelectMonsterByName) {
				return MONSTER_IMAGE;
			}
			if (element instanceof NewItem ||
				element instanceof SelectItemById ||
				element instanceof SelectItemByName) {
				return ITEM_IMAGE;
			}
			if (element instanceof NewSite ||
				element instanceof SelectSiteById ||
				element instanceof SelectSiteByName) {
				return SITE_IMAGE;
			}
			if (element instanceof NewSpell ||
				element instanceof SelectSpellById ||
				element instanceof SelectSpellByName) {
				return SPELL_IMAGE;
			}
			if (element instanceof SelectNation) {
				return NATION_IMAGE;
			}
			if (element instanceof SelectName) {
				return NAME_IMAGE;
			}
			return null;
		}
	}
	public DetailsPart getDetailsPart() {
		return detailsPart;
	}
	protected void createMasterPart(final IManagedForm managedForm, final Composite parent) {
		FormToolkit toolkit = managedForm.getToolkit();

		Section section = toolkit.createSection(parent, Section.DESCRIPTION|Section.TITLE_BAR);
		section.setText(Messages.getString("ScrolledPropertiesBlock.sname")); //$NON-NLS-1$
		section.setDescription(Messages.getString("ScrolledPropertiesBlock.sdesc")); //$NON-NLS-1$
		section.marginWidth = 10;
		section.marginHeight = 5;
		Composite client = toolkit.createComposite(section, SWT.WRAP);
		GridLayout layout = new GridLayout();
		layout.numColumns = 2;
		layout.marginWidth = 2;
		layout.marginHeight = 2;
		client.setLayout(layout);
		
		Composite comboComp = toolkit.createComposite(client, SWT.NONE);
		comboComp.setLayout(new GridLayout(4, false));
		toolkit.createLabel(comboComp, "Show:");
		final Combo listFilter = new Combo(comboComp, SWT.DROP_DOWN | SWT.READ_ONLY);
		toolkit.adapt(listFilter, true, true);
		listFilter.add("All");
		listFilter.add(Messages.getString("AddDialog.typelist.armor"));
		listFilter.add(Messages.getString("AddDialog.typelist.weapon"));
		listFilter.add(Messages.getString("AddDialog.typelist.monster"));
		listFilter.add(Messages.getString("AddDialog.typelist.spell"));
		listFilter.add(Messages.getString("AddDialog.typelist.item"));
		listFilter.add(Messages.getString("AddDialog.typelist.name"));
		listFilter.add(Messages.getString("AddDialog.typelist.site"));
		listFilter.add(Messages.getString("AddDialog.typelist.nation"));
		listFilter.select(0);
		GridData gd = new GridData(SWT.FILL, SWT.DEFAULT, true, false);
		gd.horizontalSpan = 2;
		comboComp.setLayoutData(gd);
		
		final Text searchText = toolkit.createText(comboComp, "", SWT.BORDER);
		final Button search = toolkit.createButton(comboComp, "Search", SWT.PUSH);

		Table t = toolkit.createTable(client, SWT.NULL);
		gd = new GridData(GridData.FILL_BOTH);
		gd.heightHint = 20;
		gd.widthHint = 100;
		t.setLayoutData(gd);
		toolkit.paintBordersFor(client);
		Button b = toolkit.createButton(client, Messages.getString("ScrolledPropertiesBlock.add"), SWT.PUSH); //$NON-NLS-1$
		gd = new GridData(GridData.VERTICAL_ALIGN_BEGINNING);
		b.setLayoutData(gd);
		b.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
					@Override
					public void run() {
						final AddDialog dialog = new AddDialog(parent.getShell());
						dialog.open();
						if (dialog.getReturnCode() == Window.OK) {
							if (dialog.type != null) {
								AddTypes type = null;
								String name = null;
								int id = 0;
								if (!dialog.select) {
									type = AddTypes.NEW;
									name = dialog.name;
									if (dialog.id != null && !dialog.id.isEmpty()) {
										id = Integer.valueOf(dialog.id);
									}
								} else {
									if (dialog.id != null && !dialog.id.isEmpty()) {
										type = AddTypes.BY_ID;
										id = Integer.valueOf(dialog.id);
									} else if (dialog.name != null && !dialog.name.isEmpty()) {
										type = AddTypes.BY_NAME;
										name = dialog.name;
									}
								}
								switch (dialog.type) {
								case ARMOR:
									addArmor(type, name, id);
									break;
								case WEAPON:
									addWeapon(type, name, id);
									break;
								case MONSTER:
									addMonster(type, name, id);
									break;
								case SPELL:
									addSpell(type, name, id);
									break;
								case ITEM:
									addItem(type, name, id);
									break;
								case NAME:
									addName(type, name, id);
									break;
								case SITE:
									addSite(type, name, id);
									break;
								case NATION:
									addNation(type, name, id);
									break;
								}
							}
						}
					}
				});
			}
		});
		
		section.setClient(client);
		final SectionPart spart = new SectionPart(section);
		managedForm.addPart(spart);
		viewer = new TableViewer(t);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {
			public void selectionChanged(SelectionChangedEvent event) {
				managedForm.fireSelectionChanged(spart, event.getSelection());
			}
		});
		viewer.setContentProvider(new MasterContentProvider());
		viewer.setLabelProvider(new MasterLabelProvider());
		viewer.setInput(page.getEditor().getEditorInput());
		listFilter.addSelectionListener(new SelectionAdapter() {

			@Override
			public void widgetSelected(SelectionEvent e) {
				
				viewer.setFilters(new ViewerFilter[]{new ViewerFilter() {
				@Override
				public boolean select(Viewer viewer, Object parentElement, Object element) {
					if (listFilter.getSelectionIndex() == 1) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectArmorByIdImpl ||
						((AbstractElementWrapper)element).getElement() instanceof SelectArmorByNameImpl ||
						((AbstractElementWrapper)element).getElement() instanceof NewArmorImpl;
					}
					if (listFilter.getSelectionIndex() == 2) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectWeaponByIdImpl ||
						((AbstractElementWrapper)element).getElement() instanceof SelectWeaponByNameImpl ||
						((AbstractElementWrapper)element).getElement() instanceof NewWeaponImpl;
					}
					if (listFilter.getSelectionIndex() == 3) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectMonsterByIdImpl ||
						((AbstractElementWrapper)element).getElement() instanceof SelectMonsterByNameImpl ||
						((AbstractElementWrapper)element).getElement() instanceof NewMonsterImpl;
					}
					if (listFilter.getSelectionIndex() == 4) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectSpellByName ||
						((AbstractElementWrapper)element).getElement() instanceof SelectSpellById ||
						((AbstractElementWrapper)element).getElement() instanceof NewSpell;
					}
					if (listFilter.getSelectionIndex() == 5) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectItemByName ||
						((AbstractElementWrapper)element).getElement() instanceof SelectItemById ||
						((AbstractElementWrapper)element).getElement() instanceof NewItem;
					}
					if (listFilter.getSelectionIndex() == 6) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectName;
					}
					if (listFilter.getSelectionIndex() == 7) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectSiteByName ||
						((AbstractElementWrapper)element).getElement() instanceof SelectSiteById ||
						((AbstractElementWrapper)element).getElement() instanceof NewSite;
					}
					if (listFilter.getSelectionIndex() == 8) {
						return ((AbstractElementWrapper)element).getElement() instanceof SelectNation;
					}
					return true;
				}
			}});
			}
			
		});

		final SelectionListener searchListener = new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (searchText.getText() != null && searchText.getText().length() > 0) {
					StringBuffer buffer = new StringBuffer(searchText.getText().toLowerCase());
					IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
					Object[] elements = ((IStructuredContentProvider)viewer.getContentProvider()).getElements(null);
					boolean started = false;
					for (Object element : elements) {
						if (!started && !selection.isEmpty()) {
							if (selection.getFirstElement().equals(element)) {
								started = true;
							}
						} else
						if (((ITableLabelProvider)viewer.getLabelProvider()).getColumnText(element, 0).toLowerCase().contains(buffer)) {
							viewer.reveal(element);
							viewer.setSelection(new StructuredSelection(element));
							break;
						}
					}
				}
			}
		};
		search.addSelectionListener(searchListener);
		searchText.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.character == '\r') {
					searchListener.widgetSelected(null);
				}
			}
		});

		MenuManager menuManager = new MenuManager();
		Menu menu = menuManager.createContextMenu(viewer.getTable());
		menuManager.add(new Action("Go To Source") {
			@Override
			public void run() {
				gotoSource();
			}
		});
		menuManager.add(new Separator());
		menuManager.add(new Action("Delete") {
			@Override
			public void run() {
				deleteNode();
			}
		});
		viewer.getTable().setMenu(menu);
		
	}
		
	@Override
	public void createContent(IManagedForm managedForm, Composite parent) {
		super.createContent(managedForm, parent);
		sashForm.setSashWidth(4);
		sashForm.setWeights(new int[]{7,13});
	}
	
	protected void createToolBarActions(IManagedForm managedForm) {
		final ScrolledForm form = managedForm.getForm();
		Action haction = new Action("hor", Action.AS_RADIO_BUTTON) { //$NON-NLS-1$
			public void run() {
				sashForm.setOrientation(SWT.HORIZONTAL);
				form.reflow(true);
			}
		};
		haction.setChecked(true);
		haction.setToolTipText(Messages.getString("ScrolledPropertiesBlock.horizontal")); //$NON-NLS-1$
		
		haction.setImageDescriptor(Activator.getImageDescriptor("icons/th_horizontal.gif"));
		Action vaction = new Action("ver", Action.AS_RADIO_BUTTON) { //$NON-NLS-1$
			public void run() {
				sashForm.setOrientation(SWT.VERTICAL);
				form.reflow(true);
			}
		};
		vaction.setChecked(false);
		vaction.setToolTipText(Messages.getString("ScrolledPropertiesBlock.vertical")); //$NON-NLS-1$
		vaction.setImageDescriptor(Activator.getImageDescriptor("icons/th_vertical.gif"));
		form.getToolBarManager().add(haction);
		form.getToolBarManager().add(vaction);
	}
	
	protected void registerPages(DetailsPart detailsPart) {
		detailsPart.setPageProvider(new IDetailsPageProvider() {
			
			@Override
			public Object getPageKey(Object object) {
				return ((AbstractElementWrapper)object).getElement().getClass();
			}
			
			@Override
			public IDetailsPage getPage(Object key) {
				return null;
			}
		});
		detailsPart.registerPage(SelectArmorByIdImpl.class, new ArmorDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectArmorByNameImpl.class, new ArmorDetailsPage(doc, viewer));
		detailsPart.registerPage(NewArmorImpl.class, new ArmorDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectWeaponByIdImpl.class, new WeaponDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectWeaponByNameImpl.class, new WeaponDetailsPage(doc, viewer));
		detailsPart.registerPage(NewWeaponImpl.class, new WeaponDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectMonsterByIdImpl.class, new MonsterDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectMonsterByNameImpl.class, new MonsterDetailsPage(doc, viewer));
		detailsPart.registerPage(NewMonsterImpl.class, new MonsterDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectNationImpl.class, new NationDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectSpellByIdImpl.class, new SpellDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectSpellByNameImpl.class, new SpellDetailsPage(doc, viewer));
		detailsPart.registerPage(NewSpellImpl.class, new SpellDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectItemByIdImpl.class, new ItemDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectItemByNameImpl.class, new ItemDetailsPage(doc, viewer));
		detailsPart.registerPage(NewItemImpl.class, new ItemDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectSiteByIdImpl.class, new SiteDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectSiteByNameImpl.class, new SiteDetailsPage(doc, viewer));
		detailsPart.registerPage(NewSiteImpl.class, new SiteDetailsPage(doc, viewer));
		detailsPart.registerPage(SelectNameImpl.class, new NameDetailsPage(doc, viewer));
	}
	
	public void addArmor(final AddTypes type, final String name, final int id) {
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);

				EList<AbstractElement> elements = dom3Mod.getElements();
				switch (type) {
				case BY_ID:
					SelectArmorById armorById = DmFactory.eINSTANCE.createSelectArmorById();
					armorById.setValue(id);
					elements.add(armorById);
					break;
				case BY_NAME:
					SelectArmorByName armorByName = DmFactory.eINSTANCE.createSelectArmorByName();
					armorByName.setValue(name);
					elements.add(armorByName);
					break;
				case NEW:
					NewArmor newArmor = DmFactory.eINSTANCE.createNewArmor();
					newArmor.setValue(id);
					EList<ArmorMods> mods = newArmor.getMods();
					ArmorInst1 inst1 = DmFactory.eINSTANCE.createArmorInst1();
					inst1.setName(true);
					inst1.setValue(name);
					mods.add(inst1);
					elements.add(newArmor);
					break;
				}
			}  
		},
		document);
		viewer.refresh();

		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
			} 
		});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addWeapon(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				switch (type) {
				case BY_ID:
					SelectWeaponById armorById = DmFactory.eINSTANCE.createSelectWeaponById();
					armorById.setValue(id);
					elements.add(armorById);
					break;
				case BY_NAME:
					SelectWeaponByName armorByName = DmFactory.eINSTANCE.createSelectWeaponByName();
					armorByName.setValue(name);
					elements.add(armorByName);
					break;
				case NEW:
					NewWeapon newArmor = DmFactory.eINSTANCE.createNewWeapon();
					newArmor.setValue(id);
					EList<WeaponMods> mods = newArmor.getMods();
					WeaponInst1 inst1 = DmFactory.eINSTANCE.createWeaponInst1();
					inst1.setName(true);
					inst1.setValue(name);
					mods.add(inst1);
					elements.add(newArmor);
					break;
				}
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addSpell(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				switch (type) {
				case BY_ID:
					SelectSpellById armorById = DmFactory.eINSTANCE.createSelectSpellById();
					armorById.setValue(id);
					elements.add(armorById);
					break;
				case BY_NAME:
					SelectSpellByName armorByName = DmFactory.eINSTANCE.createSelectSpellByName();
					armorByName.setValue(name);
					elements.add(armorByName);
					break;
				case NEW:
					NewSpell newArmor = DmFactory.eINSTANCE.createNewSpell();
					EList<SpellMods> mods = newArmor.getMods();
					SpellInst1 inst1 = DmFactory.eINSTANCE.createSpellInst1();
					inst1.setName(true);
					inst1.setValue(name);
					mods.add(inst1);
					elements.add(newArmor);
					break;
				}
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addItem(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				switch (type) {
				case BY_ID:
					SelectItemById armorById = DmFactory.eINSTANCE.createSelectItemById();
					armorById.setValue(id);
					elements.add(armorById);
					break;
				case BY_NAME:
					SelectItemByName armorByName = DmFactory.eINSTANCE.createSelectItemByName();
					armorByName.setValue(name);
					elements.add(armorByName);
					break;
				case NEW:
					NewItem newArmor = DmFactory.eINSTANCE.createNewItem();
					EList<ItemMods> mods = newArmor.getMods();
					ItemInst1 inst1 = DmFactory.eINSTANCE.createItemInst1();
					inst1.setName(true);
					inst1.setValue(name);
					mods.add(inst1);
					elements.add(newArmor);
					break;
				}
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addName(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				SelectName armorById = DmFactory.eINSTANCE.createSelectName();
				armorById.setValue(id);
				elements.add(armorById);
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addSite(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				switch (type) {
				case BY_ID:
					SelectSiteById armorById = DmFactory.eINSTANCE.createSelectSiteById();
					armorById.setValue(id);
					elements.add(armorById);
					break;
				case BY_NAME:
					SelectSiteByName armorByName = DmFactory.eINSTANCE.createSelectSiteByName();
					armorByName.setValue(name);
					elements.add(armorByName);
					break;
				case NEW:
					NewSite newArmor = DmFactory.eINSTANCE.createNewSite();
					newArmor.setValue(id);
					EList<SiteMods> mods = newArmor.getMods();
					SiteInst1 inst1 = DmFactory.eINSTANCE.createSiteInst1();
					inst1.setName(true);
					inst1.setValue(name);
					mods.add(inst1);
					elements.add(newArmor);
					break;
				}
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addNation(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				SelectNation armorById = DmFactory.eINSTANCE.createSelectNation();
				armorById.setValue(id);
				elements.add(armorById);
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void addMonster(final AddTypes type, final String name, final int id) 
	{
		IXtextDocument document = ((XtextEditor)doc).getDocument();
		IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
		documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
			@Override
			public void process(XtextResource resource) {        
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				
				EList<AbstractElement> elements = dom3Mod.getElements();
				switch (type) {
				case BY_ID:
					SelectMonsterById armorById = DmFactory.eINSTANCE.createSelectMonsterById();
					armorById.setValue(id);
					elements.add(armorById);
					break;
				case BY_NAME:
					SelectMonsterByName armorByName = DmFactory.eINSTANCE.createSelectMonsterByName();
					armorByName.setValue(name);
					elements.add(armorByName);
					break;
				case NEW:
					NewMonster newArmor = DmFactory.eINSTANCE.createNewMonster();
					newArmor.setValue(id);
					EList<MonsterMods> mods = newArmor.getMods();
					MonsterInst1 inst1 = DmFactory.eINSTANCE.createMonsterInst1();
					inst1.setName(true);
					inst1.setValue(name);
					mods.add(inst1);
					elements.add(newArmor);
					break;
				}
				}  
			},
			document);
		viewer.refresh();
		
		AbstractElement[] elements =  document.readOnly(new IUnitOfWork<AbstractElement[], XtextResource>(){       
			public AbstractElement[] exec(XtextResource resource) {             
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> list = dom3Mod.getElements();
				return list.toArray(new AbstractElement[list.size()]);
				} 
			});

		viewer.setSelection(new StructuredSelection(new AbstractElementWrapper(null, elements.length)), true);
	}
	
	public void deleteNode() {
		BusyIndicator.showWhile(Display.getDefault(), new Runnable() {
			@Override
			public void run() {
				IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
				if (ssel.size()==1) {
					final AbstractElement element = ((AbstractElementWrapper)ssel.getFirstElement()).getElement();
					IXtextDocument document = ((XtextEditor)doc).getDocument();
					IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
					documentEditor.process( new IUnitOfWork.Void<XtextResource>() {     
						@Override
						public void process(XtextResource resource) {        
							Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);

							EList<AbstractElement> elements = dom3Mod.getElements();
							elements.remove(element);
						}  
					},
					document);
					viewer.refresh();
					viewer.setSelection(null);
				}
			}
		});
	}

	public void gotoSource() {
		IStructuredSelection ssel = (IStructuredSelection)viewer.getSelection();
		if (ssel.size()==1) {
			final AbstractElement element = ((AbstractElementWrapper)ssel.getFirstElement()).getElement();
			IXtextDocument document = ((XtextEditor)doc).getDocument();
			IDocumentEditor documentEditor = DmActivator.getInstance().getInjector("org.larz.dom3.dm.Dm").getInstance(IDocumentEditor.class);;
			documentEditor.process(  new IUnitOfWork.Void<XtextResource>() {     
				@Override
				public void process(XtextResource resource) {  
					editor.setActivePage(1);
					DefaultLocationInFileProvider prov = new DefaultLocationInFileProvider();
					TextLocation loc = prov.getLocation(element);
					((XtextEditor)doc).selectAndReveal(loc.getOffset(), loc.getLength());
				}  
			},
			document);
			viewer.refresh();
		}
		
	}
}