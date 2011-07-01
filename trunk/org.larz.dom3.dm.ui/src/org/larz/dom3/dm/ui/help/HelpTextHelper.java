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
package org.larz.dom3.dm.ui.help;

import java.lang.reflect.Field;

import org.eclipse.emf.ecore.EObject;
import org.larz.dom3.dm.dm.ArmorMods;
import org.larz.dom3.dm.dm.Dom3Mod;
import org.larz.dom3.dm.dm.ItemMods;
import org.larz.dom3.dm.dm.MonsterMods;
import org.larz.dom3.dm.dm.NameMods;
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
import org.larz.dom3.dm.dm.SiteMods;
import org.larz.dom3.dm.dm.SpellMods;
import org.larz.dom3.dm.dm.WeaponMods;

public abstract class HelpTextHelper {
	public final static String WEAPON_CATEGORY = "weapon";
	public final static String ARMOR_CATEGORY = "armor";
	public final static String MONSTER_CATEGORY = "monster";
	public final static String SPELL_CATEGORY = "spell";
	public final static String ITEM_CATEGORY = "item";
	public final static String NAME_CATEGORY = "name";
	public final static String SITE_CATEGORY = "site";
	public final static String NATION_CATEGORY = "nation";
	public final static String GENERAL_CATEGORY = "general";
	
	public static String getText(EObject obj, String text) {
		if (obj instanceof SelectWeaponById || obj instanceof SelectWeaponByName) {
			return Messages.getString(WEAPON_CATEGORY + ".selectweapon");
		} else if (obj instanceof NewWeapon) {
			return Messages.getString(WEAPON_CATEGORY + ".newweapon");
		} else if (obj instanceof WeaponMods) {
			return getHelpString(obj, WEAPON_CATEGORY);
		} else if (obj instanceof SelectArmorById || obj instanceof SelectArmorByName) {
			return Messages.getString(ARMOR_CATEGORY + ".selectarmor");
		} else if (obj instanceof NewArmor) {
				return Messages.getString(ARMOR_CATEGORY + ".newarmor");
		} else if (obj instanceof ArmorMods) {
			return getHelpString(obj, ARMOR_CATEGORY);
		} else if (obj instanceof SelectMonsterById || obj instanceof SelectMonsterByName) {
			return Messages.getString(MONSTER_CATEGORY + ".selectmonster");
		} else if (obj instanceof NewMonster) {
				return Messages.getString(MONSTER_CATEGORY + ".newmonster");
		} else if (obj instanceof MonsterMods) {
			return getHelpString(obj, MONSTER_CATEGORY);
		} else if (obj instanceof SelectSpellById || obj instanceof SelectSpellByName) {
			return Messages.getString(SPELL_CATEGORY + ".selectspell");
		} else if (obj instanceof NewSpell) {
				return Messages.getString(SPELL_CATEGORY + ".newspell");
		} else if (obj instanceof SpellMods) {
			return getHelpString(obj, SPELL_CATEGORY);
		} else if (obj instanceof SelectItemById || obj instanceof SelectItemByName) {
			return Messages.getString(ITEM_CATEGORY + ".selectitem");
		} else if (obj instanceof NewItem) {
				return Messages.getString(ITEM_CATEGORY + ".newitem");
		} else if (obj instanceof ItemMods) {
			return getHelpString(obj, ITEM_CATEGORY);
		} else if (obj instanceof SelectName) {
			return Messages.getString(NAME_CATEGORY + ".selectnametype");
		} else if (obj instanceof NameMods) {
			return getHelpString(obj, NAME_CATEGORY);
		} else if (obj instanceof SelectSiteById || obj instanceof SelectSiteByName) {
			return Messages.getString(SITE_CATEGORY + ".selectsite");
		} else if (obj instanceof NewSite) {
				return Messages.getString(SITE_CATEGORY + ".newsite");
		} else if (obj instanceof SiteMods) {
			return getHelpString(obj, SITE_CATEGORY);
		} else if (obj instanceof SelectNation) {
			return Messages.getString(NATION_CATEGORY + ".selectnation");
		} else if (obj instanceof NationMods) {
			return getHelpString(obj, NATION_CATEGORY);
		} else if (obj instanceof Dom3Mod) {
			return getText(GENERAL_CATEGORY, text.substring(1));
		}
		return obj.toString();
	}
	
	private static String getHelpString(EObject eObj, String category) {
		Field[] fields = eObj.getClass().getDeclaredFields();
		for (Field field : fields) {
			try {
				field.setAccessible(true);
				if (field.getBoolean(eObj)) {
					return Messages.getString(category + "." + field.getName());
				}
			} catch (IllegalArgumentException e) {
			} catch (IllegalAccessException e) {
			}
		}
		return "";
	}
	
	public static String getText(String type, String value) {
		String message = Messages.getString(type +  "." + value);
		StringBuffer buf = new StringBuffer();
		int counter = 0;
		for (char character : message.toCharArray()) {
			counter++;
			if (counter >= 80) {
				if (character == ' ') {
					buf.append("\n");
					counter = 0;
					continue;
				}
			}
			buf.append(character);
			
		}
		return buf.toString();
	}
}
