package eu.veldsoft.tuty.fruty.slot;

/*******************************************************************************
 *                                                                             *
 * Tuty-Fruty Slot is simple non gambling slot machine game.                   *
 * Copyright (C) 2008-2009 by Todor Balabanov ( tdb@tbsoft-bg.com )            *
 *                                                                             *
 * This program is free software: you can redistribute it and/or modify        *
 * it under the terms of the GNU General Public License as published by        *
 * the Free Software Foundation, either version 3 of the License, or           *
 * (at your option) any later version.                                         *
 *                                                                             *
 * This program is distributed in the hope that it will be useful,             *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of              *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the               *
 * GNU General Public License for more details.                                *
 *                                                                             *
 * You should have received a copy of the GNU General Public License           *
 * along with this program. If not, see <http://www.gnu.org/licenses/>.        *
 *                                                                             *
 ******************************************************************************/

/**
 * Implements logic of pay table entry. Each pay table entry contains
 * information about type of symbol, number of meetings of this symbol and pay
 * out values depending on the number of times the symbol is repeated in the
 * line. Besides pay out values for symbols are calculated from bet value per
 * line,number of selected lines and symobol's coefficient.
 *
 * @author Anton Dimitrov
 *
 * @email anton.naskov@gmail.com
 *
 * @date 15 Sep 2008
 */
class PayTableEntry {

	/**
	 * Prize combination flag.
	 */
	private PrizeCombination prizeCombination = null;

	/**
	 * Value, calculated from bet per line and number of lines with a special
	 * function.
	 */
	private long value = 0;

	/**
	 * Default constructor.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 18 Sep 2008
	 */
	public PayTableEntry() {
	}

	/**
	 * Constructor.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 18 Sep 2008
	 */
	public PayTableEntry(final PrizeCombination prizeCombination, long value) {
		this.prizeCombination = prizeCombination;
		this.value = value;
	}

	/**
	 * Prize combination getter.
	 *
	 * @return Prize combination flag.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public final PrizeCombination getPrizeCombination() {
		return prizeCombination;
	}

	/**
	 * Prize combination setter.
	 *
	 * @param prizeCombination
	 *            Prize combination flag.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public void setPrizeCombination(final PrizeCombination prizeCombination) {
		this.prizeCombination = prizeCombination;
	}

	/**
	 * Value getter.
	 *
	 * @return Value, calculated from bet per line and number of lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public long getValue() {
		return value;
	}

	/**
	 * Value setter.
	 *
	 * @param value
	 *            Value, calculated from bet per line and number of lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public void setValue(final long value) {
		this.value = value;
	}
}
