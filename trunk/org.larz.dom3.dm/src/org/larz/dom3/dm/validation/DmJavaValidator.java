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

import java.text.MessageFormat;

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
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

	@Check
	public void checkNewArmorIds(NewArmor armor) {
		if (armor.getValue() < MIN_ARMOR_ID || armor.getValue() > MAX_ARMOR_ID) {
			warning(MessageFormat.format("Armor ID must be between {0} and {1}.", MIN_ARMOR_ID, MAX_ARMOR_ID), armor, DmPackage.NEW_ARMOR__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)armor.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewArmor) {
				NewArmor newArmor = (NewArmor)element;
				if (!armor.equals(newArmor) && armor.getValue() == newArmor.getValue()) {
					warning(MessageFormat.format("Duplicate New Armor ID: {0}", armor.getValue()), element, DmPackage.NEW_ARMOR__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectArmorIds(SelectArmorById armor) {
		Dom3Mod mod = (Dom3Mod)armor.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectArmorById) {
				SelectArmorById newArmor = (SelectArmorById)element;
				if (!armor.equals(newArmor) && armor.getValue() == newArmor.getValue()) {
					warning(MessageFormat.format("Duplicate Select Armor ID: {0}", armor.getValue()), element, DmPackage.SELECT_ARMOR_BY_ID__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectArmorNames(SelectArmorByName armor) {
		Dom3Mod mod = (Dom3Mod)armor.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectArmorByName) {
				SelectArmorByName newArmor = (SelectArmorByName)element;
				if (!armor.equals(newArmor) && armor.getValue().equals(newArmor.getValue())) {
					warning(MessageFormat.format("Duplicate Select Armor Name: {0}", armor.getValue()), element, DmPackage.SELECT_ARMOR_BY_NAME__VALUE);
				}
			}
		}
	}

	@Check
	public void checkWeaponIds(NewWeapon weapon) {
		if (weapon.getValue() < MIN_WEAPON_ID || weapon.getValue() > MAX_WEAPON_ID) {
			warning(MessageFormat.format("Weapon ID must be between {0} and {1}.", MIN_WEAPON_ID, MAX_WEAPON_ID), weapon, DmPackage.NEW_WEAPON__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)weapon.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewWeapon) {
				NewWeapon newWeapon = (NewWeapon)element;
				if (!weapon.equals(newWeapon) && weapon.getValue() == newWeapon.getValue()) {
					warning(MessageFormat.format("Duplicate New Weapon ID: {0}", weapon.getValue()), element, DmPackage.NEW_WEAPON__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectWeaponIds(SelectWeaponById weapon) {
		Dom3Mod mod = (Dom3Mod)weapon.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectWeaponById) {
				SelectWeaponById newWeapon = (SelectWeaponById)element;
				if (!weapon.equals(newWeapon) && weapon.getValue() == newWeapon.getValue()) {
					warning(MessageFormat.format("Duplicate Select Weapon ID: {0}", weapon.getValue()), element, DmPackage.SELECT_WEAPON_BY_ID__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectWeaponNames(SelectWeaponByName weapon) {
		Dom3Mod mod = (Dom3Mod)weapon.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectWeaponByName) {
				SelectWeaponByName newWeapon = (SelectWeaponByName)element;
				if (!weapon.equals(newWeapon) && weapon.getValue().equals(newWeapon.getValue())) {
					warning(MessageFormat.format("Duplicate Select Weapon Name: {0}", weapon.getValue()), element, DmPackage.SELECT_WEAPON_BY_NAME__VALUE);
				}
			}
		}
	}

	@Check
	public void checkMonsterIds(NewMonster monster) {
		if (monster.getValue() < MIN_MONSTER_ID || monster.getValue() > MAX_MONSTER_ID) {
			warning(MessageFormat.format("Unit ID must be between {0} and {1}.", MIN_MONSTER_ID, MAX_MONSTER_ID), monster, DmPackage.NEW_MONSTER__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)monster.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewMonster) {
				NewMonster newMonster = (NewMonster)element;
				if (!monster.equals(newMonster) && monster.getValue() == newMonster.getValue()) {
					warning(MessageFormat.format("Duplicate New Unit ID : {0}", monster.getValue()), element, DmPackage.NEW_MONSTER__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectMonsterIds(SelectMonsterById monster) {
		Dom3Mod mod = (Dom3Mod)monster.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectMonsterById) {
				SelectMonsterById newMonster = (SelectMonsterById)element;
				if (!monster.equals(newMonster) && monster.getValue() == newMonster.getValue()) {
					warning(MessageFormat.format("Duplicate Select Unit ID: {0}", monster.getValue()), element, DmPackage.SELECT_MONSTER_BY_ID__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectMonsterNames(SelectMonsterByName monster) {
		Dom3Mod mod = (Dom3Mod)monster.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectMonsterByName) {
				SelectMonsterByName newMonster = (SelectMonsterByName)element;
				if (!monster.equals(newMonster) && monster.getValue().equals(newMonster.getValue())) {
					warning(MessageFormat.format("Duplicate Select Unit ID: {0}", monster.getValue()), element, DmPackage.SELECT_MONSTER_BY_NAME__VALUE);
				}
			}
		}
	}

	@Check
	public void checkNameIds(SelectName name) {
		if (name.getValue() < MIN_NAME_ID || name.getValue() > MAX_NAME_ID) {
			warning(MessageFormat.format("Nametype ID must be between {0} and {1}.", MIN_NAME_ID, MAX_NAME_ID), name, DmPackage.SELECT_NAME__VALUE);
			return;
		}
	}
	
	@Check
	public void checkSiteIds(NewSite site) {
		if (site.getValue() < MIN_SITE_ID || site.getValue() > MAX_SITE_ID) {
			warning(MessageFormat.format("Site ID must be between {0} and {1}.", MIN_SITE_ID, MAX_SITE_ID), site, DmPackage.NEW_SITE__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)site.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewSite) {
				NewSite newSite = (NewSite)element;
				if (!site.equals(newSite) && site.getValue() == newSite.getValue()) {
					warning(MessageFormat.format("Duplicate New Site ID: {0}", site.getValue()), element, DmPackage.NEW_SITE__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectSiteIds(SelectSiteById site) {
		Dom3Mod mod = (Dom3Mod)site.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectSiteById) {
				SelectSiteById newSite = (SelectSiteById)element;
				if (!site.equals(newSite) && site.getValue() == newSite.getValue()) {
					warning(MessageFormat.format("Duplicate Select Site ID: {0}", site.getValue()), element, DmPackage.SELECT_SITE_BY_ID__VALUE);
				}
			}
		}
	}

	@Check
	public void checkSelectSiteNames(SelectSiteByName site) {
		Dom3Mod mod = (Dom3Mod)site.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectSiteByName) {
				SelectSiteByName newSite = (SelectSiteByName)element;
				if (!site.equals(newSite) && site.getValue().equals(newSite.getValue())) {
					warning(MessageFormat.format("Duplicate Select Site Name: {0}", site.getValue()), element, DmPackage.SELECT_SITE_BY_NAME__VALUE);
				}
			}
		}
	}

	@Check
	public void checkNationIds(SelectNation nation) {
		if (nation.getValue() < MIN_NATION_ID || nation.getValue() > MAX_NATION_ID) {
			warning(MessageFormat.format("Nation ID must be between {0} and {1}.", MIN_NATION_ID, MAX_NATION_ID), nation, DmPackage.SELECT_NATION__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)nation.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof SelectNation) {
				SelectNation newNation = (SelectNation)element;
				if (!nation.equals(newNation) && nation.getValue() == newNation.getValue()) {
					warning(MessageFormat.format("Duplicate Select Nation: {0}", nation.getValue()), element, DmPackage.SELECT_NATION__VALUE);
				}
			}
		}
	}
}
