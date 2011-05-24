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
package org.larz.dom3.dm.validation;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.larz.dom3.dm.dm.AbstractElement;
import org.larz.dom3.dm.dm.DmPackage;
import org.larz.dom3.dm.dm.Dom3Mod;
import org.larz.dom3.dm.dm.NewArmor;
import org.larz.dom3.dm.dm.NewMonster;
import org.larz.dom3.dm.dm.NewSite;
import org.larz.dom3.dm.dm.NewWeapon;
import org.larz.dom3.dm.dm.SelectArmorById;
import org.larz.dom3.dm.dm.SelectArmorByName;
import org.larz.dom3.dm.dm.SelectMonsterById;
import org.larz.dom3.dm.dm.SelectMonsterByName;
import org.larz.dom3.dm.dm.SelectName;
import org.larz.dom3.dm.dm.SelectNation;
import org.larz.dom3.dm.dm.SelectSiteById;
import org.larz.dom3.dm.dm.SelectSiteByName;
import org.larz.dom3.dm.dm.SelectWeaponById;
import org.larz.dom3.dm.dm.SelectWeaponByName;
 

public class DmJavaValidator extends AbstractDmJavaValidator {
	public final static int MIN_ARMOR_ID = 200;
	public final static int MAX_ARMOR_ID = 399;
	public final static int MIN_WEAPON_ID = 600;
	public final static int MAX_WEAPON_ID = 999;
	public final static int MIN_MONSTER_ID = 2200;
	public final static int MAX_MONSTER_ID = 2999;
	public final static int MIN_NAME_ID = 100;
	public final static int MAX_NAME_ID = 200;
	public final static int MIN_SITE_ID = 750;
	public final static int MAX_SITE_ID = 999;
	public final static int MIN_NATION_ID = 0;
	public final static int MAX_NATION_ID = 94;

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkNewArmorIds(NewArmor armor) {
		if (armor.getValue() < MIN_ARMOR_ID || armor.getValue() > MAX_ARMOR_ID) {
			warning(Messages.format("ArmorRangeWarning.fmt", MIN_ARMOR_ID, MAX_ARMOR_ID), armor, DmPackage.NEW_ARMOR__VALUE);
			return;
		}
		if (getContext().containsKey("NewArmorId")) {
			if (((Set)getContext().get("NewArmorId")).contains(armor.getValue())) {
				warning(Messages.format("DuplicateNewArmor.fmt", armor.getValue()), armor, DmPackage.NEW_ARMOR__VALUE);
			}
			return;
 		} else {
 			Set<Integer> armorIds = new HashSet<Integer>();
 			Set<Integer> dupArmorIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)armor.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof NewArmor) {
 					NewArmor newArmor = (NewArmor)element;
 					if (armorIds.contains(newArmor.getValue())) {
 						dupArmorIds.add(newArmor.getValue());
 					} else {
 	 					armorIds.add(newArmor.getValue());
 					}
 					if (!armor.equals(newArmor) && armor.getValue() == newArmor.getValue()) {
 						warning(Messages.format("DuplicateNewArmor.fmt", armor.getValue()), armor, DmPackage.NEW_ARMOR__VALUE);
 					}
 				}
 			}
 			getContext().put("NewArmorId", dupArmorIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectArmorIds(SelectArmorById armor) {
		if (getContext().containsKey("SelectArmorId")) {
			if (((Set)getContext().get("SelectArmorId")).contains(armor.getValue())) {
				warning(Messages.format("DuplicateSelectArmor.fmt", armor.getValue()), armor, DmPackage.SELECT_ARMOR_BY_ID__VALUE);
			}
			return;
 		} else {
 			Set<Integer> armorIds = new HashSet<Integer>();
 			Set<Integer> dupArmorIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)armor.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectArmorById) {
 					SelectArmorById newArmor = (SelectArmorById)element;
 					if (armorIds.contains(newArmor.getValue())) {
 						dupArmorIds.add(newArmor.getValue());
 					} else {
 	 					armorIds.add(newArmor.getValue());
 					}
 					if (!armor.equals(newArmor) && armor.getValue() == newArmor.getValue()) {
 						warning(Messages.format("DuplicateSelectArmor.fmt", armor.getValue()), armor, DmPackage.SELECT_ARMOR_BY_ID__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectArmorId", dupArmorIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectArmorNames(SelectArmorByName armor) {
		if (getContext().containsKey("SelectArmorName")) {
			if (((Set)getContext().get("SelectArmorName")).contains(armor.getValue())) {
				warning(Messages.format("DuplicateSelectArmorName.fmt", armor.getValue()), armor, DmPackage.SELECT_ARMOR_BY_NAME__VALUE);
			}
			return;
 		} else {
 			Set<String> armorNames = new HashSet<String>();
 			Set<String> dupArmorNames = new HashSet<String>();
 			Dom3Mod mod = (Dom3Mod)armor.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectArmorByName) {
 					SelectArmorByName newArmor = (SelectArmorByName)element;
 					if (armorNames.contains(newArmor.getValue())) {
 						dupArmorNames.add(newArmor.getValue());
 					} else {
 						armorNames.add(newArmor.getValue());
 					}
 					if (!armor.equals(newArmor) && armor.getValue().equals(newArmor.getValue())) {
 						warning(Messages.format("DuplicateSelectArmorName.fmt", armor.getValue()), armor, DmPackage.SELECT_ARMOR_BY_NAME__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectArmorName", dupArmorNames);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkWeaponIds(NewWeapon weapon) {
		if (weapon.getValue() < MIN_WEAPON_ID || weapon.getValue() > MAX_WEAPON_ID) {
			warning(Messages.format("WeaponRangeWarning.fmt", MIN_WEAPON_ID, MAX_WEAPON_ID), weapon, DmPackage.NEW_WEAPON__VALUE);
			return;
		}
		if (getContext().containsKey("NewWeaponId")) {
			if (((Set)getContext().get("NewWeaponId")).contains(weapon.getValue())) {
				warning(Messages.format("DuplicateNewWeapon.fmt", weapon.getValue()), weapon, DmPackage.NEW_WEAPON__VALUE);
			}
			return;
 		} else {
 			Set<Integer> weaponIds = new HashSet<Integer>();
 			Set<Integer> dupWeaponIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)weapon.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof NewWeapon) {
 					NewWeapon newWeapon = (NewWeapon)element;
 					if (weaponIds.contains(newWeapon.getValue())) {
 						dupWeaponIds.add(newWeapon.getValue());
 					} else {
 						weaponIds.add(newWeapon.getValue());
 					}
 					if (!weapon.equals(newWeapon) && weapon.getValue() == newWeapon.getValue()) {
 						warning(Messages.format("DuplicateNewWeapon.fmt", weapon.getValue()), weapon, DmPackage.NEW_WEAPON__VALUE);
 					}
 				}
 			}
 			getContext().put("NewWeaponId", dupWeaponIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectWeaponIds(SelectWeaponById weapon) {
		if (getContext().containsKey("SelectWeaponId")) {
			if (((Set)getContext().get("SelectWeaponId")).contains(weapon.getValue())) {
				warning(Messages.format("DuplicateSelectWeapon.fmt", weapon.getValue()), weapon, DmPackage.SELECT_WEAPON_BY_ID__VALUE);
			}
			return;
 		} else {
 			Set<Integer> weaponIds = new HashSet<Integer>();
 			Set<Integer> dupWeaponIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)weapon.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectWeaponById) {
 					SelectWeaponById newWeapon = (SelectWeaponById)element;
 					if (weaponIds.contains(newWeapon.getValue())) {
 						dupWeaponIds.add(newWeapon.getValue());
 					} else {
 						weaponIds.add(newWeapon.getValue());
 					}
 					if (!weapon.equals(newWeapon) && weapon.getValue() == newWeapon.getValue()) {
 						warning(Messages.format("DuplicateSelectWeapon.fmt", weapon.getValue()), weapon, DmPackage.SELECT_WEAPON_BY_ID__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectWeaponId", dupWeaponIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectWeaponNames(SelectWeaponByName weapon) {
		if (getContext().containsKey("SelectWeaponName")) {
			if (((Set)getContext().get("SelectWeaponName")).contains(weapon.getValue())) {
				warning(Messages.format("DuplicateSelectWeaponName.fmt", weapon.getValue()), weapon, DmPackage.SELECT_WEAPON_BY_NAME__VALUE);
			}
			return;
 		} else {
 			Set<String> weaponIds = new HashSet<String>();
 			Set<String> dupWeaponIds = new HashSet<String>();
 			Dom3Mod mod = (Dom3Mod)weapon.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectWeaponByName) {
 					SelectWeaponByName newWeapon = (SelectWeaponByName)element;
 					if (weaponIds.contains(newWeapon.getValue())) {
 						dupWeaponIds.add(newWeapon.getValue());
 					} else {
 						weaponIds.add(newWeapon.getValue());
 					}
 					if (!weapon.equals(newWeapon) && weapon.getValue().equals(newWeapon.getValue())) {
 						warning(Messages.format("DuplicateSelectWeaponName.fmt", weapon.getValue()), weapon, DmPackage.SELECT_WEAPON_BY_NAME__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectWeaponName", dupWeaponIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkMonsterIds(NewMonster monster) {
		if (monster.getValue() < MIN_MONSTER_ID || monster.getValue() > MAX_MONSTER_ID) {
			warning(Messages.format("UnitRangeWarning.fmt", MIN_MONSTER_ID, MAX_MONSTER_ID), monster, DmPackage.NEW_MONSTER__VALUE);
			return;
		}
		if (getContext().containsKey("NewMonsterId")) {
			if (((Set)getContext().get("NewMonsterId")).contains(monster.getValue())) {
				warning(Messages.format("DuplicateNewUnit.fmt", monster.getValue()), monster, DmPackage.NEW_MONSTER__VALUE);
			}
			return;
 		} else {
 			Set<Integer> monsterIds = new HashSet<Integer>();
 			Set<Integer> dupMonsterIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)monster.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof NewMonster) {
 					NewMonster newMonster = (NewMonster)element;
 					if (monsterIds.contains(newMonster.getValue())) {
 						dupMonsterIds.add(newMonster.getValue());
 					} else {
 						monsterIds.add(newMonster.getValue());
 					}
 					if (!monster.equals(newMonster) && monster.getValue() == newMonster.getValue()) {
 						warning(Messages.format("DuplicateNewUnit.fmt", monster.getValue()), monster, DmPackage.NEW_MONSTER__VALUE);
 					}
 				}
 			}
 			getContext().put("NewMonsterId", dupMonsterIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectMonsterIds(SelectMonsterById monster) {
		if (getContext().containsKey("SelectMonsterId")) {
			if (((Set)getContext().get("SelectMonsterId")).contains(monster.getValue())) {
				warning(Messages.format("DuplicateSelectUnit.fmt", monster.getValue()), monster, DmPackage.SELECT_MONSTER_BY_ID__VALUE);
			}
			return;
 		} else {
 			Set<Integer> monsterIds = new HashSet<Integer>();
 			Set<Integer> dupMonsterIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)monster.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectMonsterById) {
 					SelectMonsterById newMonster = (SelectMonsterById)element;
 					if (monsterIds.contains(newMonster.getValue())) {
 						dupMonsterIds.add(newMonster.getValue());
 					} else {
 						monsterIds.add(newMonster.getValue());
 					}
 					if (!monster.equals(newMonster) && monster.getValue() == newMonster.getValue()) {
 						warning(Messages.format("DuplicateSelectUnit.fmt", monster.getValue()), monster, DmPackage.SELECT_MONSTER_BY_ID__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectMonsterId", dupMonsterIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectMonsterNames(SelectMonsterByName monster) {
		if (getContext().containsKey("SelectMonsterName")) {
			if (((Set)getContext().get("SelectMonsterName")).contains(monster.getValue())) {
				warning(Messages.format("DuplicateSelectUnitName.fmt", monster.getValue()), monster, DmPackage.SELECT_MONSTER_BY_NAME__VALUE);
			}
			return;
 		} else {
 			Set<String> monsterIds = new HashSet<String>();
 			Set<String> dupMonsterIds = new HashSet<String>();
 			Dom3Mod mod = (Dom3Mod)monster.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectMonsterByName) {
 					SelectMonsterByName newMonster = (SelectMonsterByName)element;
 					if (monsterIds.contains(newMonster.getValue())) {
 						dupMonsterIds.add(newMonster.getValue());
 					} else {
 						monsterIds.add(newMonster.getValue());
 					}
 					if (!monster.equals(newMonster) && monster.getValue().equals(newMonster.getValue())) {
 						warning(Messages.format("DuplicateSelectUnitName.fmt", monster.getValue()), monster, DmPackage.SELECT_MONSTER_BY_NAME__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectMonsterName", dupMonsterIds);
 		}
	}

	@Check(CheckType.EXPENSIVE)
	public void checkNameIds(SelectName name) {
		if (name.getValue() < MIN_NAME_ID || name.getValue() > MAX_NAME_ID) {
			warning(Messages.format("NametypeRangeWarning.fmt", MIN_NAME_ID, MAX_NAME_ID), name, DmPackage.SELECT_NAME__VALUE);
			return;
		}
	}
	
	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSiteIds(NewSite site) {
		if (site.getValue() < MIN_SITE_ID || site.getValue() > MAX_SITE_ID) {
			warning(Messages.format("SiteRangeWarning.fmt", MIN_SITE_ID, MAX_SITE_ID), site, DmPackage.NEW_SITE__VALUE);
			return;
		}
		if (getContext().containsKey("NewSiteId")) {
			if (((Set)getContext().get("NewSiteId")).contains(site.getValue())) {
				warning(Messages.format("DuplicateNewSite.fmt", site.getValue()), site, DmPackage.NEW_SITE__VALUE);
			}
			return;
 		} else {
 			Set<Integer> siteIds = new HashSet<Integer>();
 			Set<Integer> dupSiteIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)site.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof NewSite) {
 					NewSite newSite = (NewSite)element;
 					if (siteIds.contains(newSite.getValue())) {
 						dupSiteIds.add(newSite.getValue());
 					} else {
 						siteIds.add(newSite.getValue());
 					}
 					if (!site.equals(newSite) && site.getValue() == newSite.getValue()) {
 						warning(Messages.format("DuplicateNewSite.fmt", site.getValue()), site, DmPackage.NEW_SITE__VALUE);
 					}
 				}
 			}
 			getContext().put("NewSiteId", dupSiteIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectSiteIds(SelectSiteById site) {
		if (getContext().containsKey("SelectSiteId")) {
			if (((Set)getContext().get("SelectSiteId")).contains(site.getValue())) {
				warning(Messages.format("DuplicateSelectSite.fmt", site.getValue()), site, DmPackage.SELECT_SITE_BY_ID__VALUE);
			}
			return;
 		} else {
 			Set<Integer> siteIds = new HashSet<Integer>();
 			Set<Integer> dupSiteIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)site.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectSiteById) {
 					SelectSiteById newSite = (SelectSiteById)element;
 					if (siteIds.contains(newSite.getValue())) {
 						dupSiteIds.add(newSite.getValue());
 					} else {
 						siteIds.add(newSite.getValue());
 					}
 					if (!site.equals(newSite) && site.getValue() == newSite.getValue()) {
 						warning(Messages.format("DuplicateSelectSite.fmt", site.getValue()), site, DmPackage.SELECT_SITE_BY_ID__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectSiteId", dupSiteIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkSelectSiteNames(SelectSiteByName site) {
		if (getContext().containsKey("SelectSiteName")) {
			if (((Set)getContext().get("SelectSiteName")).contains(site.getValue())) {
				warning(Messages.format("DuplicateSelectSiteName.fmt", site.getValue()), site, DmPackage.SELECT_SITE_BY_NAME__VALUE);
			}
			return;
 		} else {
 			Set<String> siteIds = new HashSet<String>();
 			Set<String> dupSiteIds = new HashSet<String>();
 			Dom3Mod mod = (Dom3Mod)site.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectSiteByName) {
 					SelectSiteByName newSite = (SelectSiteByName)element;
 					if (siteIds.contains(newSite.getValue())) {
 						dupSiteIds.add(newSite.getValue());
 					} else {
 						siteIds.add(newSite.getValue());
 					}
 					if (!site.equals(newSite) && site.getValue().equals(newSite.getValue())) {
 						warning(Messages.format("DuplicateSelectSiteName.fmt", site.getValue()), site, DmPackage.SELECT_SITE_BY_NAME__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectSiteName", dupSiteIds);
 		}
	}

	@SuppressWarnings("rawtypes")
	@Check(CheckType.EXPENSIVE)
	public void checkNationIds(SelectNation nation) {
		if (nation.getValue() < MIN_NATION_ID || nation.getValue() > MAX_NATION_ID) {
			warning(Messages.format("NationRangeWarning.fmt", MIN_NATION_ID, MAX_NATION_ID), nation, DmPackage.SELECT_NATION__VALUE);
			return;
		}
		if (getContext().containsKey("SelectNationId")) {
			if (((Set)getContext().get("SelectNationId")).contains(nation.getValue())) {
				warning(Messages.format("DuplicateSelectNation.fmt", nation.getValue()), nation, DmPackage.SELECT_NATION__VALUE);
			}
			return;
 		} else {
 			Set<Integer> nationIds = new HashSet<Integer>();
 			Set<Integer> dupNationIds = new HashSet<Integer>();
 			Dom3Mod mod = (Dom3Mod)nation.eContainer();
 			EList<AbstractElement> elements = mod.getElements();
 			for (AbstractElement element : elements) {
 				if (element instanceof SelectNation) {
 					SelectNation newNation = (SelectNation)element;
 					if (nationIds.contains(newNation.getValue())) {
 						dupNationIds.add(newNation.getValue());
 					} else {
 						nationIds.add(newNation.getValue());
 					}
 					if (!nation.equals(newNation) && nation.getValue() == newNation.getValue()) {
 						warning(Messages.format("DuplicateSelectNation.fmt", nation.getValue()), nation, DmPackage.SELECT_NATION__VALUE);
 					}
 				}
 			}
 			getContext().put("SelectNationId", dupNationIds);
 		}
	}
}
