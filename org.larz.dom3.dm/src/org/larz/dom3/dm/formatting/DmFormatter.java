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
package org.larz.dom3.dm.formatting;

import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.larz.dom3.dm.services.DmGrammarAccess;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#formatting
 * on how and when to use it 
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an example
 */
public class DmFormatter extends AbstractDeclarativeFormatter {
	
	@Override
	protected void configureFormatting(FormattingConfig c) {
		c.setLinewrap(0, 1, 2).before(((DmGrammarAccess)getGrammarAccess()).getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(((DmGrammarAccess)getGrammarAccess()).getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getML_COMMENTRule());
		
		// General rules
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getDescriptionKeyword_0_1_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getIconKeyword_0_2_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getVersionKeyword_0_3_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getDomversionKeyword_0_4_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getPoppergoldKeyword_0_5_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getResourcemultKeyword_0_6_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getSupplymultKeyword_0_7_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getUnresthalfincKeyword_0_8_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getUnresthalfresKeyword_0_9_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getEventisrareKeyword_0_10_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getTurmoilincomeKeyword_0_11_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getTurmoileventsKeyword_0_12_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getDeathincomeKeyword_0_13_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getDeathsupplyKeyword_0_14_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getDeathdeathKeyword_0_15_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getSlothincomeKeyword_0_16_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getSlothresourcesKeyword_0_17_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getColdincomeKeyword_0_18_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getColdsupplyKeyword_0_19_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getMisfortuneKeyword_0_20_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getLuckeventsKeyword_0_21_0());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getDom3ModAccess().getResearchscaleKeyword_0_22_0());
		
		// Armor rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectArmorByIdRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectArmorByIdRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectArmorByIdAccess().getEndKeyword_4());
		
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectArmorByNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectArmorByNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectArmorByNameAccess().getEndKeyword_4());

		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getNewArmorRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getNewArmorRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNewArmorAccess().getEndKeyword_4());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getArmorPattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getArmorPattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getArmorPattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getArmorPattern2Rule());
		
		// Weapon rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectWeaponByIdRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectWeaponByIdRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectWeaponByIdAccess().getEndKeyword_4());
		
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectWeaponByNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectWeaponByNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectWeaponByNameAccess().getEndKeyword_4());

		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getNewWeaponRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getNewWeaponRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNewWeaponAccess().getEndKeyword_4());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern2Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern3Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern3Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern4Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getWeaponPattern4Rule());
		
		// Monster rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectMonsterByIdRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectMonsterByIdRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectMonsterByIdAccess().getEndKeyword_4());
		
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectMonsterByNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectMonsterByNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectMonsterByNameAccess().getEndKeyword_4());

		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getNewMonsterRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getNewMonsterRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNewMonsterAccess().getEndKeyword_4());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern2Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern3Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern3Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern4Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern4Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern5Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern5Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern6Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getMonsterPattern6Rule());
		
		// Item rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectItemByIdRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectItemByIdRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectItemByIdAccess().getEndKeyword_4());
		
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectItemByNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectItemByNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectItemByNameAccess().getEndKeyword_4());

		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getNewItemRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getNewItemRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNewItemAccess().getEndKeyword_3());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getItemPattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getItemPattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getItemPattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getItemPattern2Rule());
		
		// Site rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectSiteByIdRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectSiteByIdRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectSiteByIdAccess().getEndKeyword_4());
		
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectSiteByNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectSiteByNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectSiteByNameAccess().getEndKeyword_4());

		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getNewSiteRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getNewSiteRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNewSiteAccess().getEndKeyword_4());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSitePattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSitePattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSitePattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSitePattern2Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSitePattern3Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSitePattern3Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSitePattern4Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSitePattern4Rule());
		
		// Spell rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectSpellByIdRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectSpellByIdRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectSpellByIdAccess().getEndKeyword_4());
		
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectSpellByNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectSpellByNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectSpellByNameAccess().getEndKeyword_4());

		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getNewSpellRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getNewSpellRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNewSpellAccess().getEndKeyword_3());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSpellPattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSpellPattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSpellPattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSpellPattern2Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSpellPattern3Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSpellPattern3Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSpellPattern4Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSpellPattern4Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSpellPattern5Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getSpellPattern5Rule());
		
		// Nation rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectNationRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectNationRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectNationAccess().getEndKeyword_4());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNationPattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNationPattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNationPattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNationPattern2Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNationPattern3Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNationPattern3Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNationPattern4Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNationPattern4Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNationPattern5Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNationPattern5Rule());
		
		// Name rules
		c.setLinewrap(2, 2, 2).before(((DmGrammarAccess)getGrammarAccess()).getSelectNameRule());
		c.setLinewrap(1, 1, 2).after(((DmGrammarAccess)getGrammarAccess()).getSelectNameRule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getSelectNameAccess().getEndKeyword_4());
		
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNamePattern1Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNamePattern1Rule());
		c.setLinewrap(1, 1, 1).before(((DmGrammarAccess)getGrammarAccess()).getNamePattern2Rule());
		c.setLinewrap(0, 1, 1).after(((DmGrammarAccess)getGrammarAccess()).getNamePattern2Rule());
		

	}
}
