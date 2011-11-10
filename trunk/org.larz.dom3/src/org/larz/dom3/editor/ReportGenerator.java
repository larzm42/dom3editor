package org.larz.dom3.editor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.program.Program;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.larz.dom3.db.ArmorDB;
import org.larz.dom3.db.Database;
import org.larz.dom3.db.ItemDB;
import org.larz.dom3.db.MonsterDB;
import org.larz.dom3.db.NationDB;
import org.larz.dom3.db.SiteDB;
import org.larz.dom3.db.SpellDB;
import org.larz.dom3.db.WeaponDB;
import org.larz.dom3.dm.dm.AbstractElement;
import org.larz.dom3.dm.dm.Armor;
import org.larz.dom3.dm.dm.ArmorInst1;
import org.larz.dom3.dm.dm.ArmorInst2;
import org.larz.dom3.dm.dm.ArmorMods;
import org.larz.dom3.dm.dm.Dom3Mod;
import org.larz.dom3.dm.dm.Item;
import org.larz.dom3.dm.dm.ItemInst1;
import org.larz.dom3.dm.dm.ItemInst2;
import org.larz.dom3.dm.dm.ItemInst3;
import org.larz.dom3.dm.dm.ItemMods;
import org.larz.dom3.dm.dm.Monster;
import org.larz.dom3.dm.dm.MonsterInst1;
import org.larz.dom3.dm.dm.MonsterInst2;
import org.larz.dom3.dm.dm.MonsterInst3;
import org.larz.dom3.dm.dm.MonsterInst4;
import org.larz.dom3.dm.dm.MonsterInst5;
import org.larz.dom3.dm.dm.MonsterInst6;
import org.larz.dom3.dm.dm.MonsterMods;
import org.larz.dom3.dm.dm.Nation;
import org.larz.dom3.dm.dm.NationInst1;
import org.larz.dom3.dm.dm.NationInst2;
import org.larz.dom3.dm.dm.NationInst3;
import org.larz.dom3.dm.dm.NationInst4;
import org.larz.dom3.dm.dm.NationInst5;
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
import org.larz.dom3.dm.dm.SelectNation;
import org.larz.dom3.dm.dm.SelectSiteById;
import org.larz.dom3.dm.dm.SelectSiteByName;
import org.larz.dom3.dm.dm.SelectSpellById;
import org.larz.dom3.dm.dm.SelectSpellByName;
import org.larz.dom3.dm.dm.SelectWeaponById;
import org.larz.dom3.dm.dm.SelectWeaponByName;
import org.larz.dom3.dm.dm.Site;
import org.larz.dom3.dm.dm.SiteInst1;
import org.larz.dom3.dm.dm.SiteInst2;
import org.larz.dom3.dm.dm.SiteInst3;
import org.larz.dom3.dm.dm.SiteInst4;
import org.larz.dom3.dm.dm.SiteMods;
import org.larz.dom3.dm.dm.Spell;
import org.larz.dom3.dm.dm.SpellInst1;
import org.larz.dom3.dm.dm.SpellInst2;
import org.larz.dom3.dm.dm.SpellInst3;
import org.larz.dom3.dm.dm.SpellInst4;
import org.larz.dom3.dm.dm.SpellInst5;
import org.larz.dom3.dm.dm.SpellMods;
import org.larz.dom3.dm.dm.Weapon;
import org.larz.dom3.dm.dm.WeaponInst1;
import org.larz.dom3.dm.dm.WeaponInst2;
import org.larz.dom3.dm.dm.WeaponInst3;
import org.larz.dom3.dm.dm.WeaponInst4;
import org.larz.dom3.dm.dm.WeaponMods;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ReportGenerator {
	public static final Font BOLD = new Font(FontFamily.HELVETICA, 12, Font.BOLD);
	public static final Font TITLE = new Font(FontFamily.HELVETICA, 14, Font.BOLD);
	public static final Font TEXT = new Font(FontFamily.HELVETICA, 8);
	
	public static final String MODIFIED_ARMOR = "Modified Armor";
	public static final String NEW_ARMOR = "New Armor";
	public static final String MODIFIED_WEAPONS = "Modified Weapons";
	public static final String NEW_WEAPONS = "New Weapons";
	public static final String MODIFIED_MONSTERS = "Modified Monsters";
	public static final String NEW_MONSTERS = "New Monsters";
	public static final String MODIFIED_SPELLS = "Modified Spells";
	public static final String NEW_SPELLS = "New Spells";
	public static final String MODIFIED_ITEMS = "Modified Items";
	public static final String NEW_ITEMS = "New Items";
	public static final String MODIFIED_SITES = "Modified Sites";
	public static final String NEW_SITES = "New Sites";
	public static final String MODIFIED_NATIONS = "Modified Nations";

	public static void generateReport(XtextEditor sourcePage, final Shell shell) {
		final IXtextDocument myDocument = ((XtextEditor)sourcePage).getDocument();
		myDocument.modify(new IUnitOfWork.Void<XtextResource>() {
			@Override
			public void process(XtextResource resource) throws Exception {
				Map<String, Map<String, ModObject>> cellMap = new HashMap<String, Map<String, ModObject>>();
				
				Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
				EList<AbstractElement> elements = dom3Mod.getElements();
				for (AbstractElement element : elements) {
					if (element instanceof SelectArmorById || element instanceof SelectArmorByName) {
						String name = getSelectArmorname((Armor)element);
						if (name == null) continue;
						String id = getArmorid((Armor)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_ARMOR);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_ARMOR, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Armor)element, modObject.propertyMap);
					} else if (element instanceof NewArmor) {
						String name = getArmorname((Armor)element);
						String id = getArmorid((Armor)element);

						Map<String, ModObject> map = cellMap.get(NEW_ARMOR);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(NEW_ARMOR, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Armor)element, modObject.propertyMap);
					} else if (element instanceof SelectWeaponById || element instanceof SelectWeaponByName) {
						String name = getSelectWeaponname((Weapon)element);
						String id = getWeaponid((Weapon)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_WEAPONS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_WEAPONS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Weapon)element, modObject.propertyMap);
					} else if (element instanceof NewWeapon) {
						String name = getWeaponname((Weapon)element);
						String id = getWeaponid((Weapon)element);

						Map<String, ModObject> map = cellMap.get(NEW_WEAPONS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(NEW_WEAPONS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Weapon)element, modObject.propertyMap);
					} else if (element instanceof SelectMonsterById || element instanceof SelectMonsterByName) {
						String name = getSelectMonstername((Monster)element);
						String id = getMonsterid((Monster)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_MONSTERS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_MONSTERS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Monster)element, modObject.propertyMap);
					} else if (element instanceof NewMonster) {
						String name = getMonstername((Monster)element);
						String id = getMonsterid((Monster)element);

						Map<String, ModObject> map = cellMap.get(NEW_MONSTERS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(NEW_MONSTERS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Monster)element, modObject.propertyMap);
					} else if (element instanceof SelectSpellById || element instanceof SelectSpellByName) {
						String name = getSelectSpellname((Spell)element);
						String id = getSpellid((Spell)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_SPELLS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_SPELLS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Spell)element, modObject.propertyMap);
					} else if (element instanceof NewSpell) {
						String name = getSpellname((Spell)element);
						//String id = getSpellid((Spell)element);

						Map<String, ModObject> map = cellMap.get(NEW_SPELLS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(NEW_SPELLS, map);
						}
						ModObject modObject = map.get(name);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = "" + name;
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(name, modObject);
						}
						setPropertyValues((Spell)element, modObject.propertyMap);
					} else if (element instanceof SelectItemById || element instanceof SelectItemByName) {
						String name = getSelectItemname((Item)element);
						String id = getItemid((Item)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_ITEMS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_ITEMS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Item)element, modObject.propertyMap);
					} else if (element instanceof NewItem) {
						String name = getItemname((Item)element);
						//String id = getItemid((Item)element);

						Map<String, ModObject> map = cellMap.get(NEW_ITEMS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(NEW_ITEMS, map);
						}
						ModObject modObject = map.get(name);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name;
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(name, modObject);
						}
						setPropertyValues((Item)element, modObject.propertyMap);
					} else if (element instanceof SelectSiteById || element instanceof SelectSiteByName) {
						String name = getSelectSitename((Site)element);
						String id = getSiteid((Site)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_SITES);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_SITES, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Site)element, modObject.propertyMap);
					} else if (element instanceof NewSite) {
						String name = getSitename((Site)element);
						String id = getSiteid((Site)element);

						Map<String, ModObject> map = cellMap.get(NEW_SITES);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(NEW_SITES, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((Site)element, modObject.propertyMap);
					} else if (element instanceof SelectNation) {
						String name = getSelectNationname((Nation)element);
						String id = getNationid((Nation)element);

						Map<String, ModObject> map = cellMap.get(MODIFIED_NATIONS);
						if (map == null) {
							map = new HashMap<String, ModObject>();
							cellMap.put(MODIFIED_NATIONS, map);
						}
						ModObject modObject = map.get(id);
						if (modObject == null) {
							modObject = new ModObject();
							modObject.title = name + " (" + id + ")";
							modObject.propertyMap = new HashMap<String, PropertyValues>();
							map.put(id, modObject);
						}
						setPropertyValues((SelectNation)element, modObject.propertyMap, resource);
					}
					
				}

				try {
					// step 1
					Document document = new Document();
					// step 2
					File tempFile = File.createTempFile("dom3editor", ".pdf");
					tempFile.deleteOnExit();
					FileOutputStream tempFileOutputStream = new FileOutputStream(tempFile);
							
					PdfWriter.getInstance(document, tempFileOutputStream);
					// step 3
					document.open();
					
					for (Map.Entry<String, Map<String, ModObject>> entry : cellMap.entrySet()) {
						PdfPTable table = new PdfPTable(2);
						table.setWidthPercentage(100f);

						PdfPCell cell = new PdfPCell(new Phrase(entry.getKey(), TITLE));
					    cell.setBackgroundColor(BaseColor.LIGHT_GRAY);
					    cell.setFixedHeight(26f);
					    cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					    cell.setVerticalAlignment(Element.ALIGN_BOTTOM);
					    cell.setColspan(2);
					    table.addCell(cell);

					    List<Map.Entry<String, ModObject>> list = new ArrayList<Map.Entry<String, ModObject>>();
						for (Map.Entry<String, ModObject> innerEntry : entry.getValue().entrySet()) {
							list.add(innerEntry);
						}
					    
					    Collections.sort(list, new Comparator<Map.Entry<String, ModObject>>() {
							@Override
							public int compare(Map.Entry<String, ModObject> o1, Map.Entry<String, ModObject> o2) {
								return o1.getValue().title.compareTo(o2.getValue().title);
							}
						});
					    
						for (Map.Entry<String, ModObject> innerEntry : list) {
							if (innerEntry.getValue().propertyMap.size() == 0) continue;
							cell = new PdfPCell();
							PdfPTable innerTable = new PdfPTable(1);
							innerTable.setWidthPercentage(95f);
							cell.addElement(innerTable);
							PdfPCell innerCell = new PdfPCell();
							innerCell.addElement(new Phrase(innerEntry.getValue().title, BOLD));
							innerCell.setBorder(PdfPCell.NO_BORDER);
							innerTable.addCell(innerCell);

							PdfPTable propertyTable = getPropertyTable(innerEntry.getValue().propertyMap);
							innerCell = new PdfPCell();
							innerCell.addElement(propertyTable);
							innerCell.setBorder(PdfPCell.NO_BORDER);
							innerCell.setHorizontalAlignment(Element.ALIGN_LEFT);
							innerTable.addCell(innerCell);
							
							if (entry.getKey().equals(NEW_MONSTERS)) {
								cell.setColspan(2);
							}
							table.addCell(cell);
						}
						if (entry.getValue().entrySet().size()%2 == 1) {
							table.addCell(new PdfPCell());
						}
						document.add(table);
						document.newPage();
					}
					document.close();
					
		    		tempFileOutputStream.flush();
		    		tempFileOutputStream.close();

		    		Program pdfViewer = Program.findProgram("pdf");
			    	if (pdfViewer != null) {
			    		pdfViewer.execute(tempFile.getAbsolutePath());
			    	} else {			 
			    		FileDialog dialog = new FileDialog(shell, SWT.SAVE);
			    		dialog.setFilterExtensions(new String[]{"*.pdf"});
			    		if (dialog.open() != null) {
							FileInputStream from = null;
							FileOutputStream to = null;
							try {
								String filterPath =  dialog.getFilterPath();
					    		String name =  dialog.getFileName();

								from = new FileInputStream(new File(tempFile.getAbsolutePath()));
								to = new FileOutputStream(new File(filterPath + File.separator + name));
								byte[] buffer = new byte[4096];
								int bytesRead;

								while ((bytesRead = from.read(buffer)) != -1) {
									to.write(buffer, 0, bytesRead); // write
								}
							} finally {
								if (from != null) {
									from.close();
								}
								if (to != null) {
									to.close();
								}
							}
			    		}
			    	}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private static String getArmorname(Armor armor) {
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

	private static String getSelectArmorname(Armor armor) {
		String name = null;
		if (armor instanceof SelectArmorByName) {
			name = ((SelectArmorByName)armor).getValue();
		} else if (armor instanceof SelectArmorById) {
			int id = ((SelectArmorById)armor).getValue();
			name = Database.getArmorName(id);
		}
		if (getArmorname(armor) != null) {
			name = getArmorname(armor);
		}
		return name;
	}
	
	private static String getArmorid(Armor armor) {
		if (armor instanceof SelectArmorByName) {
			ArmorDB armorDB = Database.getArmor(((SelectArmorByName)armor).getValue());
			if (armorDB != null && armorDB.id != null) {
				return Integer.toString(armorDB.id);
			}
		} else if (armor instanceof SelectArmorById) {
			return Integer.toString(((SelectArmorById)armor).getValue());
		} else if (armor instanceof NewArmor) {
			return Integer.toString(((NewArmor)armor).getValue());
		}
		return null;
	}

	private static String getWeaponname(Weapon weapon) {
		EList<WeaponMods> list = weapon.getMods();
		for (WeaponMods mod : list) {
			if (mod instanceof WeaponInst1) {
				if (((WeaponInst1)mod).isName()) {
					return ((WeaponInst1)mod).getValue();
				}
			}
		}
		return null;
	}

	private static String getMonstername(Monster monster) {
		EList<MonsterMods> list = monster.getMods();
		for (MonsterMods mod : list) {
			if (mod instanceof MonsterInst1) {
				if (((MonsterInst1)mod).isName()) {
					return ((MonsterInst1)mod).getValue();
				}
			}
		}
		return null;
	}

	private static String getSpellname(Spell spell) {
		EList<SpellMods> list = spell.getMods();
		for (SpellMods mod : list) {
			if (mod instanceof SpellInst1) {
				if (((SpellInst1)mod).isName()) {
					return ((SpellInst1)mod).getValue();
				}
			}
		}
		return null;
	}

	private static String getItemname(Item item) {
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

	private static String getSitename(Site site) {
		EList<SiteMods> list = site.getMods();
		for (SiteMods mod : list) {
			if (mod instanceof SiteInst1) {
				if (((SiteInst1)mod).isName()) {
					return ((SiteInst1)mod).getValue();
				}
			}
		}
		return null;
	}

	private static String getNationname(SelectNation monster) {
		EList<NationMods> list = monster.getMods();
		for (NationMods mod : list) {
			if (mod instanceof NationInst1) {
				if (((NationInst1)mod).isName()) {
					return ((NationInst1)mod).getValue();
				}
			}
		}
		return null;
	}

	private static String getSelectWeaponname(Weapon weapon) {
		String name = null;
		if (weapon instanceof SelectWeaponByName) {
			name = ((SelectWeaponByName)weapon).getValue();
		} else if (weapon instanceof SelectWeaponById) {
			int id = ((SelectWeaponById)weapon).getValue();
			name = Database.getWeaponName(id);
		}
		if (getWeaponname(weapon) != null) {
			name = getWeaponname(weapon);
		}
		return name;
	}
	
	private static String getWeaponid(Weapon weapon) {
		if (weapon instanceof SelectWeaponByName) {
			WeaponDB weaponDB = Database.getWeapon(((SelectWeaponByName)weapon).getValue());
			if (weaponDB != null && weaponDB.id != null) {
				return Integer.toString(weaponDB.id);
			}
		} else if (weapon instanceof SelectWeaponById) {
			return Integer.toString(((SelectWeaponById)weapon).getValue());
		} else if (weapon instanceof NewWeapon) {
			return Integer.toString(((NewWeapon)weapon).getValue());
		}
		return null;
	}

	private static String getSelectMonstername(Monster monster) {
		String name = null;
		if (monster instanceof SelectMonsterByName) {
			name = ((SelectMonsterByName)monster).getValue();
		} else if (monster instanceof SelectMonsterById) {
			int id = ((SelectMonsterById)monster).getValue();
			name = Database.getMonsterName(id);
		}
		if (getMonstername(monster) != null) {
			name = getMonstername(monster);
		}
		return name;
	}
	
	private static String getMonsterid(Monster monster) {
		if (monster instanceof SelectMonsterByName) {
			MonsterDB monsterDB = Database.getMonster(((SelectMonsterByName)monster).getValue());
			if (monsterDB != null && monsterDB.id != null) {
				return Integer.toString(monsterDB.id);
			}
		} else if (monster instanceof SelectMonsterById) {
			return Integer.toString(((SelectMonsterById)monster).getValue());
		} else if (monster instanceof NewMonster) {
			return Integer.toString(((NewMonster)monster).getValue());
		}
		return null;
	}

	private static String getSelectSitename(Site site) {
		String name = null;
		if (site instanceof SelectSiteByName) {
			name = ((SelectSiteByName)site).getValue();
		} else if (site instanceof SelectSiteById) {
			int id = ((SelectSiteById)site).getValue();
			name = Database.getSiteName(id);
		}
		if (getSitename(site) != null) {
			name = getSitename(site);
		}
		return name;
	}
	
	private static String getSiteid(Site site) {
		if (site instanceof SelectSiteByName) {
			SiteDB siteDB = Database.getSite(((SelectSiteByName)site).getValue());
			if (siteDB != null && siteDB.id != null) {
				return Integer.toString(siteDB.id);
			}
		} else if (site instanceof SelectSiteById) {
			return Integer.toString(((SelectSiteById)site).getValue());
		} else if (site instanceof NewSite) {
			return Integer.toString(((NewSite)site).getValue());
		}
		return null;
	}

	private static String getSelectNationname(Nation nation) {
		String name = null;
		if (nation instanceof SelectNation) {
			int id = ((SelectNation)nation).getValue();
			name = Database.getNationName(id);
		}
		if (getNationname((SelectNation)nation) != null) {
			name = getNationname((SelectNation)nation);
		}
		return name;
	}
	
	private static String getNationid(Nation nation) {
		if (nation instanceof SelectNation) {
			return Integer.toString(((SelectNation)nation).getValue());
		}
		return null;
	}

	private static String getSelectSpellname(Spell spell) {
		String name = null;
		if (spell instanceof SelectSpellByName) {
			name = ((SelectSpellByName)spell).getValue();
		} else if (spell instanceof SelectSpellById) {
			int id = ((SelectSpellById)spell).getValue();
			name = Database.getSpellName(id);
		}
		if (getSpellname(spell) != null) {
			name = getSpellname(spell);
		}
		return name;
	}
	
	private static String getSpellid(Spell spell) {
		if (spell instanceof SelectSpellByName) {
			SpellDB spellDB = Database.getSpell(((SelectSpellByName)spell).getValue());
			if (spellDB != null && spellDB.id != null) {
				return Integer.toString(spellDB.id);
			}
		} else if (spell instanceof SelectSpellById) {
			return Integer.toString(((SelectSpellById)spell).getValue());
		}
		return null;
	}

	private static String getSelectItemname(Item item) {
		String name = null;
		if (item instanceof SelectItemByName) {
			name = ((SelectItemByName)item).getValue();
		} else if (item instanceof SelectItemById) {
			int id = ((SelectItemById)item).getValue();
			name = Database.getItemName(id);
		}
		if (getItemname(item) != null) {
			name = getItemname(item);
		}
		return name;
	}
	
	private static String getItemid(Item item) {
		if (item instanceof SelectItemByName) {
			ItemDB itemDB = Database.getItem(((SelectItemByName)item).getValue());
			if (itemDB != null && itemDB.id != null) {
				return Integer.toString(itemDB.id);
			}
		} else if (item instanceof SelectMonsterById) {
			return Integer.toString(((SelectItemById)item).getValue());
		}
		return null;
	}

	private static void setPropertyValues(Armor armor, Map<String, PropertyValues> propertyMap) {
		EList<ArmorMods> list = armor.getMods();
		for (ArmorMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						
						String oldVal = null;
						int id = Integer.valueOf(getArmorid(armor) != null ? getArmorid(armor) : "0");
						if (id != 0) {
							ArmorDB armorDB = Database.getArmor(id);
							if (armorDB != null && armorDB.id != null) {
								Field field2 = armorDB.getClass().getField(field.getName());
								oldVal = "" + field2.get(armorDB);
							}
						}
						
						String newVal = null;
						if (mod instanceof ArmorInst1) {
							newVal = ((ArmorInst1)mod).getValue();
						} else if (mod instanceof ArmorInst2) {
							newVal = ""+((ArmorInst2)mod).getValue();
						}
						if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

	private static void setPropertyValues(Weapon weapon, Map<String, PropertyValues> propertyMap) {
		EList<WeaponMods> list = weapon.getMods();
		for (WeaponMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						
						String oldVal = null;
						int id = Integer.valueOf(getWeaponid(weapon) != null ? getWeaponid(weapon) : "0");
						if (id != 0) {
							WeaponDB weaponDB = Database.getWeapon(id);
							if (weaponDB != null && weaponDB.id != null) {
								Field field2 = weaponDB.getClass().getField(field.getName());
								oldVal = "" + field2.get(weaponDB);
							}
						}
						
						String newVal = null;
						if (mod instanceof WeaponInst1) {
							newVal = ((WeaponInst1)mod).getValue();
						} else if (mod instanceof WeaponInst2) {
							newVal = ""+((WeaponInst2)mod).getValue();
						} else if (mod instanceof WeaponInst3) {
							newVal = ""+((WeaponInst3)mod).getValue1()+", " + ((WeaponInst3)mod).getValue2();
						} else if (mod instanceof WeaponInst4) {
							newVal = "true";
						}
						if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	private static void setPropertyValues(Monster monster, Map<String, PropertyValues> propertyMap) {
		EList<MonsterMods> list = monster.getMods();
		for (MonsterMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			int weaponCount = 1;
			int armorCount = 1;
			int magicBoostCount = 1;
			int gemprodCount = 1;
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						
						String oldVal = null;
						int id = Integer.valueOf(getMonsterid(monster) != null ? getMonsterid(monster) : "0");
						if (id != 0) {
							MonsterDB monsterDB = Database.getMonster(id);
							if (monsterDB != null && monsterDB.id != null) {
								String fieldName = field.getName();
								if (fieldName.equals("weapon")) {
									fieldName += weaponCount++;
								} else if (fieldName.equals("armor")) {
									fieldName += armorCount++;
								} else if (fieldName.equals("magicboost")) {
									fieldName += magicBoostCount++;
								} else if (fieldName.equals("gemprod")) {
									fieldName += gemprodCount++;
								} 
								if (fieldName.equals("magicskill")) {
									int path = ((MonsterInst3)mod).getValue1();
									if (monsterDB.magicskillpath1 != null && monsterDB.magicskillpath1.intValue() == path) {
										oldVal = monsterDB.magicskillpath1 + ", " + monsterDB.magicskilllevel1;
									} else if (monsterDB.magicskillpath2 != null && monsterDB.magicskillpath2.intValue() == path) {
										oldVal = monsterDB.magicskillpath2 + ", " + monsterDB.magicskilllevel2;
									} else if (monsterDB.magicskillpath3 != null && monsterDB.magicskillpath3.intValue() == path) {
										oldVal = monsterDB.magicskillpath3 + ", " + monsterDB.magicskilllevel3;
									} else if (monsterDB.magicskillpath4 != null && monsterDB.magicskillpath4.intValue() == path) {
										oldVal = monsterDB.magicskillpath4 + ", " + monsterDB.magicskilllevel4;
									}
								} else if (!fieldName.equals("cleararmor") && !fieldName.equals("clearweapons") && !fieldName.equals("custommagic")) {
									Field field2 = monsterDB.getClass().getField(fieldName);
									oldVal = "" + field2.get(monsterDB);
								}
							}
						}
						
						String newVal = null;
						if (mod instanceof MonsterInst1) {
							newVal = ((MonsterInst1)mod).getValue();
						} else if (mod instanceof MonsterInst2) {
							newVal = ""+((MonsterInst2)mod).getValue();
						} else if (mod instanceof MonsterInst3) {
							newVal = ""+((MonsterInst3)mod).getValue1()+", " + ((MonsterInst3)mod).getValue2();
						} else if (mod instanceof MonsterInst4) {
							newVal = "true";
						} else if (mod instanceof MonsterInst5) {
							if (((MonsterInst5)mod).getValue1() != null) {
								newVal = ((MonsterInst5)mod).getValue1();
							} else {
								newVal = ""+((MonsterInst5)mod).getValue2();
							}
						} else if (mod instanceof MonsterInst6) {
							newVal = ""+((MonsterInst6)mod).getValue();
						}
						if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	private static void setPropertyValues(Spell spell, Map<String, PropertyValues> propertyMap) {
		EList<SpellMods> list = spell.getMods();
		for (SpellMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						
						String oldVal = null;
						int id = Integer.valueOf(getSpellid(spell) != null ? getSpellid(spell) : "0");
						if (id != 0) {
							SpellDB spellDB = Database.getSpell(id);
							if (spellDB != null && spellDB.id != null) {
								String fieldName = field.getName();
								if (fieldName.equals("path")) {
									if (((SpellInst3)mod).getValue1() == 0) {
										oldVal = "0, " + spellDB.path1;
									} else if (((SpellInst3)mod).getValue1() == 1) {
										oldVal = "1, " + spellDB.path2;
									} else {
										System.out.println("invalid path: " + ((SpellInst3)mod).getValue1());
									}
								} else if (fieldName.equals("pathlevel")) {
									if (((SpellInst3)mod).getValue1() == 0) {
										oldVal = "0, " + spellDB.pathlevel1;
									} else if (((SpellInst3)mod).getValue1() == 1) {
										oldVal = "1, " + spellDB.pathlevel2;
									} else {
										System.out.println("invalid pathlevel: " + ((SpellInst3)mod).getValue1());
									}
								} else {
									Field field2 = spellDB.getClass().getField(fieldName);
									oldVal = "" + field2.get(spellDB);
								}
							}
						}
						
						String newVal = null;
						if (mod instanceof SpellInst1) {
							newVal = ((SpellInst1)mod).getValue();
						} else if (mod instanceof SpellInst2) {
							newVal = ""+((SpellInst2)mod).getValue();
						} else if (mod instanceof SpellInst3) {
							newVal = ""+((SpellInst3)mod).getValue1()+", " + ((SpellInst3)mod).getValue2();
						} else if (mod instanceof SpellInst4) {
							newVal = "true";
						} else if (mod instanceof SpellInst5) {
							newVal = ((SpellInst5)mod).getValue1()+", " + ((SpellInst5)mod).getValue2();
						}
						if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	private static void setPropertyValues(Item item, Map<String, PropertyValues> propertyMap) {
		EList<ItemMods> list = item.getMods();
		for (ItemMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						
						String oldVal = null;
						int id = Integer.valueOf(getItemid(item) != null ? getItemid(item) : "0");
						if (id != 0) {
							ItemDB itemDB = Database.getItem(id);
							if (itemDB != null && itemDB.id != null) {
								Field field2 = itemDB.getClass().getField(field.getName());
								oldVal = "" + field2.get(itemDB);
							}
						}
						
						String newVal = null;
						if (mod instanceof ItemInst1) {
							newVal = ((ItemInst1)mod).getValue();
						} else if (mod instanceof ItemInst2) {
							newVal = ""+((ItemInst2)mod).getValue();
						} else if (mod instanceof ItemInst3) {
							if (((ItemInst3)mod).getValue1() != null) {
								newVal = ((ItemInst3)mod).getValue1();
							} else {
								newVal = "" + ((ItemInst3)mod).getValue2();
							}
						}
						if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	private static void setPropertyValues(Site site, Map<String, PropertyValues> propertyMap) {
		EList<SiteMods> list = site.getMods();
		for (SiteMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						
						String oldVal = null;
						int id = Integer.valueOf(getSiteid(site) != null ? getSiteid(site) : "0");
						if (id != 0) {
							SiteDB siteDB = Database.getSite(id);
							if (siteDB != null && siteDB.id != null) {
								String fieldName = field.getName();
								if (fieldName.equals("gems")) {
									int path = ((SiteInst3)mod).getValue1();
									if (siteDB.gemspath1 != null && siteDB.gemspath1.intValue() == path) {
										oldVal = siteDB.gemspath1 + ", " + siteDB.gemsamt1;
									} else if (siteDB.gemspath2 != null && siteDB.gemspath2.intValue() == path) {
										oldVal = siteDB.gemspath2 + ", " + siteDB.gemsamt2;
									} else if (siteDB.gemspath3 != null && siteDB.gemspath3.intValue() == path) {
										oldVal = siteDB.gemspath3 + ", " + siteDB.gemsamt3;
									}
								} else {
									Field field2 = siteDB.getClass().getField(field.getName());
									oldVal = "" + field2.get(siteDB);
								}
							}
						}
						
						String newVal = null;
						if (mod instanceof SiteInst1) {
							newVal = ((SiteInst1)mod).getValue();
						} else if (mod instanceof SiteInst2) {
							newVal = ""+((SiteInst2)mod).getValue();
						} else if (mod instanceof SiteInst3) {
							newVal = ""+((SiteInst3)mod).getValue1()+", " + ((SiteInst3)mod).getValue2();
						} else if (mod instanceof SiteInst4) {
							newVal = "true";
						}
						if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	private static void setPropertyValues(SelectNation nation, Map<String, PropertyValues> propertyMap, XtextResource resource) {
		int addreccomCount = 1;
		int addrecunitCount = 1;
		EList<NationMods> list = nation.getMods();
		for (NationMods mod : list) {
			Field[] fields = mod.getClass().getDeclaredFields();
			int startsiteCount = 1;
			for (Field field : fields) {
				try {
					field.setAccessible(true);
					if (field.getBoolean(mod)) {
						String property = field.getName();
						if ("name".equals(property)) {
							continue;
						}
						if ("addrecunit".equals(property)) {
							property += addrecunitCount < 10 ? "0" + addrecunitCount : addrecunitCount;
							addrecunitCount++;
						}
						if ("addreccom".equals(property)) {
							property += addreccomCount < 10 ? "0" + addreccomCount : addreccomCount;
							addreccomCount++;
						}
						String oldVal = null;
						int id = Integer.valueOf(getNationid(nation) != null ? getNationid(nation) : "0");
						//if (id != 0) {
							NationDB nationDB = Database.getNation(id);
							if (nationDB != null && nationDB.id != null) {
								String fieldName = field.getName();
								if (fieldName.equals("startsite")) {
									fieldName += startsiteCount++;
								}
								if (!fieldName.equals("clearsites")) {
									if (fieldName.equals("addrecunit")) {
										if (nationDB.addrecunit.length > addrecunitCount-2) {
											oldVal = nationDB.addrecunit[addrecunitCount-2] + " (" + Database.getMonsterName(nationDB.addrecunit[addrecunitCount-2]) + ")";
										}
									} else if (fieldName.equals("addreccom")) {
										if (nationDB.addreccom.length > addreccomCount-2) {
											oldVal = nationDB.addreccom[addreccomCount-2] + " (" + Database.getMonsterName(nationDB.addreccom[addreccomCount-2]) + ")";
										}
									} else {
										Field field2 = nationDB.getClass().getField(fieldName);
										oldVal = "" + field2.get(nationDB);
										if (mod instanceof NationInst2) {
											if (((NationInst2)mod).isHero1() ||
												((NationInst2)mod).isHero2() ||
												((NationInst2)mod).isHero3() ||
												((NationInst2)mod).isHero4() ||
												((NationInst2)mod).isHero5() ||
												((NationInst2)mod).isHero6()) {
												if (field2.get(nationDB) != null) {
													getMonsterName(resource, mod);
													oldVal = field2.get(nationDB) + " (" + Database.getMonsterName(((Integer)field2.get(nationDB)).intValue()) + ")";
												}
											}
										}
									}
								}
							}
						//}
						
						String newVal = null;
						if (mod instanceof NationInst1) {
							newVal = ((NationInst1)mod).getValue();
						} else if (mod instanceof NationInst2) {
							if (((NationInst2)mod).isHero1() ||
								((NationInst2)mod).isHero2() ||
								((NationInst2)mod).isHero3() ||
								((NationInst2)mod).isHero4() ||
								((NationInst2)mod).isHero5() ||
								((NationInst2)mod).isHero6() ||
								((NationInst2)mod).isMultihero1() ||
								((NationInst2)mod).isMultihero2()) {
								newVal = ((NationInst2)mod).getValue() + " (" + getMonsterName(resource, mod) + ")";
							} else {
								newVal = ""+((NationInst2)mod).getValue();
							}
						} else if (mod instanceof NationInst3) {
							newVal = "true";
						} else if (mod instanceof NationInst4) {
							if (((NationInst4)mod).getValue1() != null) {
								newVal = ((NationInst4)mod).getValue1();
							} else {
								newVal = ((NationInst4)mod).getValue2() + " (" + getMonsterName(resource, mod) + ")";
							}
						} else if (mod instanceof NationInst5) {
							newVal = ""+((NationInst5)mod).getValue1()+", " + ((NationInst5)mod).getValue2()+", " + ((NationInst5)mod).getValue3();
						}
						//if (!compareStrings(oldVal, newVal)) {
							PropertyValues propertyValues = propertyMap.get(property);
							if (propertyValues == null) {
								propertyValues = new PropertyValues();
								propertyMap.put(property, propertyValues);
							}
							propertyValues.oldValue = oldVal;
							propertyValues.newValue = newVal;
						//}
					}
				} catch (IllegalArgumentException e) {
					//e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (SecurityException e) {
					e.printStackTrace();
				} catch (NoSuchFieldException e) {
					e.printStackTrace();
				}
			}
			
		}

	}
	
	private static String getMonsterName(XtextResource resource, NationMods mod) {
		Dom3Mod dom3Mod = (Dom3Mod)resource.getContents().get(0);
		EList<AbstractElement> elements = dom3Mod.getElements();
		int id = 0;
		if (mod instanceof NationInst2) {
			id = ((NationInst2)mod).getValue();
		} else if (mod instanceof NationInst4) {
			id = ((NationInst4)mod).getValue2();
		}
		String name = Database.getMonsterName(id);
		for (AbstractElement element : elements) {
			if (element instanceof SelectMonsterById || element instanceof SelectMonsterByName || element instanceof NewMonster) {
				if (id == Integer.valueOf(getMonsterid((Monster)element))) {
					name = getSelectMonstername((Monster)element);
					break;
				}
			}
		}
		return name;
	}
	
	private static boolean compareStrings(String str1, String str2) {
		if (str1 == null && str2 == null) return true;
		if (str1 == null && str2 != null) return false;
		if (str1 != null && str2 == null) return false;
		return str1.equals(str2);
	}

	private static PdfPTable getPropertyTable(Map<String, PropertyValues> map) {
		boolean threeCells = false;
		for (Map.Entry<String, PropertyValues> entry : map.entrySet()) {
			if (entry.getValue().oldValue != null) {
				threeCells = true;
				break;
			}
		}
		
		PdfPTable table = new PdfPTable(threeCells ? 3 : 2);
		table.setWidthPercentage(100f);
		table.setHorizontalAlignment(Element.ALIGN_LEFT);
		PdfPCell c1 = new PdfPCell(new Phrase("property"));
		c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c1);
		if (threeCells) {
			PdfPCell c2 = new PdfPCell(new Phrase("old"));
			c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
			table.addCell(c2);
		}
		PdfPCell c3 = new PdfPCell(new Phrase("new"));
		c3.setBackgroundColor(BaseColor.LIGHT_GRAY);
		table.addCell(c3);
		
	    List<Map.Entry<String, PropertyValues>> list = new ArrayList<Map.Entry<String, PropertyValues>>();
		for (Map.Entry<String, PropertyValues> innerEntry : map.entrySet()) {
			list.add(innerEntry);
		}
	    Collections.sort(list, new Comparator<Map.Entry<String, PropertyValues>>() {
			@Override
			public int compare(Map.Entry<String, PropertyValues> o1, Map.Entry<String, PropertyValues> o2) {
				return o1.getKey().compareTo(o2.getKey());
			}
		});

		for (Map.Entry<String, PropertyValues> entry : list) {
			PdfPCell cell1 = new PdfPCell();
			PdfPCell cell2 = new PdfPCell();
			PdfPCell cell3 = new PdfPCell();

			cell1.addElement(new Phrase(entry.getKey(), TEXT));
			table.addCell(cell1);
			if (threeCells) {
				cell2.addElement(new Phrase(entry.getValue().oldValue, TEXT));
				table.addCell(cell2);
			}
			cell3.addElement(new Phrase(entry.getValue().newValue, TEXT));
			table.addCell(cell3);			
			
		}
		try {
			if (threeCells) {
				table.setWidths(new float[]{0.6f, 1, 1});
			} else {
				table.setWidths(new float[]{0.5f, 1});
			}
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return table;
	}
	
}

class ModObject {
	String title;
	Map<String, PropertyValues> propertyMap;
}

class PropertyValues {
	String oldValue;
	String newValue;
}
