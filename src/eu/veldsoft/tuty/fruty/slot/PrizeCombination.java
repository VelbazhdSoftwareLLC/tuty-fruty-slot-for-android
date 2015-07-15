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
 * out values of a symbol. Holds the name of the prize combination. Check if
 * two prize combinations are the same.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 09 Sep 2008
 */
class PrizeCombination {
public:

	/**
	 * Size of prize combination name
	 */
	static const int NAME_SIZE = 50;

private:

	/**
	 * Combination of symbols distribution.
	 */
	Combination combination;

	/**
	 * Symbol for checking the prize of combination.
	 */
	ReelSymbol *symbol;

	/**
	 * Coefficient of the symbol frequence.
	 */
	int coefficient;

	/**
	 * Name of prize combination
	 */
	char name[NAME_SIZE];

public:

	/**
	 * Default constructor.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 18 Sep 2008
	 */
	PrizeCombination();

	/**
	 * Constructor.
	 *
	 * @param combination Combination of symbols.
	 *
	 * @param symbol Symbol's flag.
	 *
	 * @param coefficient Used in pay table.
	 *
	 * @param name Symbols name
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	PrizeCombination(Combination combination, const ReelSymbol *symbol, const int coefficient, const char name[NAME_SIZE]);

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
	Combination getCombination() const;

	/**
	 * Combination of symbols setter.
	 *
	 * @param combination Combination to be set in the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	void setCombination(const Combination combination);

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
	ReelSymbol* getSymbol() const;

	/**
	 * Symbol setter.
	 *
	 * @param symbol Symbol to be set in the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	void setSymbol(ReelSymbol *symbol);

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
	int getCoefficient() const;

	/**
	 * Symbol's coefficient setter.
	 *
	 * @param coefficient Coefficient to be set in the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	void setCoefficient(const int coefficient);

	/**
	 * Name of prize combination getter.
	 *
	 * @param name Name of prize combination.
	 *
	 * @return Name of prize combination pointer.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 02 Oct 2008
	 */
	char* getName(char name[NAME_SIZE]) const;

	/**
	 * Name of prize combination setter.
	 *
	 * @param name Name of prize combination.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 02 Oct 2008
	 */
	void setName(const char name[NAME_SIZE]);

	/**
	 * Compare two prize combinations.
	 *
	 * @param combination External prize combination to be compared with the
	 * internal prize combination.
	 *
	 * @return True if prize combinations are equal, false - otherwise.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 02 Oct 2008
	 */
	bool equals(const PrizeCombination combination) const;
};
