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
package org.larz.dom3.dm.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.parsetree.reconstr.impl.DefaultCommentAssociater;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.larz.dom3.dm.ui.comment.DmCommentAssociater;
import org.larz.dom3.dm.ui.editor.DmXtextEditor;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DmUiModule extends org.larz.dom3.dm.ui.AbstractDmUiModule {
	public DmUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}
	public Class<? extends XtextEditor> bindEditor()
	{
		return DmXtextEditor.class;
	}
	public Class<? extends DefaultCommentAssociater> bindCommentAssociater()
	{
		return DmCommentAssociater.class;
	}
}
