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
package org.larz.dom3.dm;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.parser.antlr.IAntlrParser;
import org.larz.dom3.dm.converter.DmValueConverter;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class DmRuntimeModule extends org.larz.dom3.dm.AbstractDmRuntimeModule {
	@Override
	public Class<? extends IAntlrParser> bindIAntlrParser() {
		return org.larz.dom3.dm.parser.DmParser.class;
	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
	  return DmValueConverter.class;
	}

}
