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

import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.validation.Check;
import org.larz.dom3.dm.dm.AbstractElement;
import org.larz.dom3.dm.dm.DmPackage;
import org.larz.dom3.dm.dm.Dom3Mod;
import org.larz.dom3.dm.dm.NewArmor;
import org.larz.dom3.dm.dm.NewMonster;
import org.larz.dom3.dm.dm.NewSite;
import org.larz.dom3.dm.dm.NewWeapon;
import org.larz.dom3.dm.dm.SelectName;
import org.larz.dom3.dm.dm.SelectNation;
 

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
	public void checkArmorIds(NewArmor armor) {
		if (armor.getValue() < MIN_ARMOR_ID || armor.getValue() > MAX_ARMOR_ID) {
			warning("Armor ID must be between " + MIN_ARMOR_ID + " and " + MAX_ARMOR_ID + ".", armor, DmPackage.NEW_ARMOR__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)armor.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewArmor) {
				NewArmor newArmor = (NewArmor)element;
				if (!armor.equals(newArmor) && armor.getValue() == newArmor.getValue()) {
					warning("Duplicate Armor ID", element, DmPackage.NEW_ARMOR__VALUE);
				}
			}
		}
	}

	@Check
	public void checkWeaponIds(NewWeapon weapon) {
		if (weapon.getValue() < MIN_WEAPON_ID || weapon.getValue() > MAX_WEAPON_ID) {
			warning("Weapon ID must be between " + MIN_WEAPON_ID + " and " + MAX_WEAPON_ID + ".", weapon, DmPackage.NEW_WEAPON__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)weapon.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewWeapon) {
				NewWeapon newWeapon = (NewWeapon)element;
				if (!weapon.equals(newWeapon) && weapon.getValue() == newWeapon.getValue()) {
					warning("Duplicate Weapon ID", element, DmPackage.NEW_WEAPON__VALUE);
				}
			}
		}
	}

	@Check
	public void checkMonsterIds(NewMonster monster) {
		if (monster.getValue() < MIN_MONSTER_ID || monster.getValue() > MAX_MONSTER_ID) {
			warning("Unit ID must be between " + MIN_MONSTER_ID + " and " + MAX_MONSTER_ID + ".", monster, DmPackage.NEW_MONSTER__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)monster.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewMonster) {
				NewMonster newMonster = (NewMonster)element;
				if (!monster.equals(newMonster) && monster.getValue() == newMonster.getValue()) {
					warning("Duplicate Unit ID", element, DmPackage.NEW_MONSTER__VALUE);
				}
			}
		}
	}

	@Check
	public void checkNameIds(SelectName name) {
		if (name.getValue() < MIN_NAME_ID || name.getValue() > MAX_NAME_ID) {
			warning("Nametype ID must be between " + MIN_NAME_ID + " and " + MAX_NAME_ID + ".", name, DmPackage.SELECT_NAME__VALUE);
			return;
		}
	}
	
	@Check
	public void checkSiteIds(NewSite site) {
		if (site.getValue() < MIN_SITE_ID || site.getValue() > MAX_SITE_ID) {
			warning("Site ID must be between " + MIN_SITE_ID + " and " + MAX_SITE_ID + ".", site, DmPackage.NEW_SITE__VALUE);
			return;
		}
		Dom3Mod mod = (Dom3Mod)site.eContainer();
		EList<AbstractElement> elements = mod.getElements();
		for (AbstractElement element : elements) {
			if (element instanceof NewSite) {
				NewSite newSite = (NewSite)element;
				if (!site.equals(newSite) && site.getValue() == newSite.getValue()) {
					warning("Duplicate Site ID", element, DmPackage.NEW_SITE__VALUE);
				}
			}
		}
	}

	@Check
	public void checkNationIds(SelectNation nation) {
		if (nation.getValue() < MIN_NATION_ID || nation.getValue() > MAX_NATION_ID) {
			warning("Nation ID must be between " + MIN_NATION_ID + " and " + MAX_NATION_ID + ".", nation, DmPackage.SELECT_NATION__VALUE);
			return;
		}
	}
}
