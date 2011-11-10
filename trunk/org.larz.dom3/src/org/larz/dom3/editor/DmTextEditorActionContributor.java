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

import org.eclipse.jface.action.ActionContributionItem;
import org.eclipse.jface.action.IContributionItem;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.IToolBarManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.SubContributionItem;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.texteditor.BasicTextEditorActionContributor;

public class DmTextEditorActionContributor extends BasicTextEditorActionContributor {

	public DmTextEditorActionContributor() { }

	@Override
	public void setActiveEditor(IEditorPart part) {
		super.setActiveEditor(((DmEditor)part).getSourcePage());
		IActionBars actionBars = part.getEditorSite().getActionBars();
		
		// Remove "Toggle Occurrences"
		IToolBarManager toolBarManager = actionBars.getToolBarManager();
		toolBarManager.remove("markOccurrences");
		
		// Remove "Word Completion"
		IMenuManager menuManager = actionBars.getMenuManager();
		IContributionItem[] menuitems = menuManager.getItems();
		for (IContributionItem item : menuitems) {
			if (item instanceof MenuManager) {
				if (item.getId().equals("edit")) {
					IContributionItem[] items2 = ((MenuManager)item).getItems();
					for (IContributionItem item2: items2) {
						if (item2 instanceof SubContributionItem) {
							IContributionItem contribItem = ((SubContributionItem)item2).getInnerItem();
							if (contribItem instanceof ActionContributionItem) {
								if (((ActionContributionItem)contribItem).getAction().getActionDefinitionId().equals("org.eclipse.ui.edit.text.hippieCompletion")) {
									((MenuManager)item).remove(item2);
									break;
								}
							}
						}
					}
				}
			}
		}
	}	

}
