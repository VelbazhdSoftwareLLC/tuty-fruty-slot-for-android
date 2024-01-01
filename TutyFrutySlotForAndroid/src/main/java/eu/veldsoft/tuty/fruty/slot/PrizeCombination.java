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
 * Implements prize combination of symbols. Holds type of symbol. Holds flag
 * which indicates selected line. Holds symbol's coefficient for defining pay
 * out values of a symbol. Holds the name of the prize combination. Check if two
 * prize combinations are the same.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 09 Sep 2008
 */
class PrizeCombination {

	/**
	 * Combination of symbols distribution.
	 */
	private Combination combination;

	/**
	 * Symbol for checking the prize of combination.
	 */
	private ReelSymbol symbol;

	/**
	 * Coefficient of the symbol frequence.
	 */
	private int coefficient;

	/**
	 * Name of prize combination
	 */
	private String name;

	/**
	 * Default constructor.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 18 Sep 2008
	 */
	public PrizeCombination() {
	}

	/**
	 * Constructor.
	 *
	 * @param combination
	 *            Combination of symbols.
	 *
	 * @param symbol
	 *            Symbol's flag.
	 *
	 * @param coefficient
	 *            Used in pay table.
	 *
	 * @param name
	 *            Symbols name
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public PrizeCombination(Combination combination, final ReelSymbol symbol,
			final int coefficient, final String name) {
		this.combination = combination;
		this.symbol = symbol;
		this.coefficient = coefficient;
		this.name = name;
	}

	/**
	 * Combination of symbols getter.
	 *
	 * @return Combination of symbols.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	public Combination getCombination() {
		return combination;
	}

	/**
	 * Combination of symbols setter.
	 *
	 * @param combination
	 *            Combination to be set in the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	public void setCombination(final Combination combination) {
		this.combination = combination;
	}

	/**
	 * Symbol getter.
	 *
	 * @return Symbol, used for checking the prize combination.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	public ReelSymbol getSymbol() {
		return symbol;
	}

	/**
	 * Symbol setter.
	 *
	 * @param symbol
	 *            Symbol to be set in the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	public void setSymbol(ReelSymbol symbol) {
		this.symbol = symbol;
	}

	/**
	 * Symbol's coefficient getter.
	 *
	 * @return Symbol's coefficient.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	public int getCoefficient() {
		return coefficient;
	}

	/**
	 * Symbol's coefficient setter.
	 *
	 * @param coefficient
	 *            Coefficient to be set in the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	public void setCoefficient(final int coefficient) {
		this.coefficient = coefficient;
	}

	/**
	 * Name of prize combination getter.
	 *
	 * @return Name of prize combination pointer.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 02 Oct 2008
	 */
	public String getName() {
		return name;
	}

	/**
	 * Name of prize combination setter.
	 *
	 * @param name
	 *            Name of prize combination.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 02 Oct 2008
	 */
	public void setName(final String name) {
		this.name = name;
	}

	/**
	 * Compare two prize combinations.
	 *
	 * @param combination
	 *            External prize combination to be compared with the internal
	 *            prize combination.
	 *
	 * @return True if prize combinations are equal, false - otherwise.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 02 Oct 2008
	 */
	public boolean equals(final PrizeCombination combination) {
		if (this.symbol != combination.symbol) {
			return false;
		}

		if (this.coefficient != combination.coefficient) {
			return false;
		}

		if (this.combination.equals(combination.combination) == false) {
			return false;
		}

		if (this.name.equals(combination.name) == false) {
			return false;
		}

		return true;
	}
}
