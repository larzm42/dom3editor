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
package org.larz.dom3.dm.converter;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.parsetree.AbstractNode;
import org.eclipse.xtext.util.Strings;

public class DmValueConverter extends DefaultTerminalConverters {

	@Override
	public IValueConverter<Integer> INT() {
		return new AbstractValueConverter<Integer>() {

			public String toString(Integer value) {
				if (value == null)
					throw new ValueConverterException("INT-value may not be null. (null indeed, zero is ok)", null, null);
				return value.toString();
			}

			public Integer toValue(String string, AbstractNode node) {
				if (Strings.isEmpty(string))
					throw new ValueConverterException("Couldn't convert empty string to int.", node, null);
				try {
					return Integer.valueOf(string);
				} catch (NumberFormatException e) {
					throw new ValueConverterException("Couldn't convert '" + string + "' to int.", node, e);
				}
			}

		};

	}

}
