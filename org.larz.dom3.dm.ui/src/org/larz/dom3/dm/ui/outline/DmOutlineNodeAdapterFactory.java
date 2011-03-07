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
package org.larz.dom3.dm.ui.outline;

import org.eclipse.xtext.ui.editor.outline.actions.DefaultContentOutlineNodeAdapterFactory;

public class DmOutlineNodeAdapterFactory extends DefaultContentOutlineNodeAdapterFactory {

	private static final Class<?>[] types = { 
		// provide list of classes to adapt to, e.g.:
		// Entity.class
		// Service.class
	};

	@Override
	public Class<?>[] getAdapterList() {
		return types;
	}

}

