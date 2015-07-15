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
 * Implements logic of the total bet.
 * Holds bet value per line.
 * Holds selected lines and their number.
 * Holds total bet value and updates total bet value.
 * The total bet value is calculated by multiplying
 * number of lines and bet value per line.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 11 Sep 2008
 */
class TotalBet : public VisualComponent {
private:

	/**
	 * Bet pointer.
	 */
	Bet *bet;

	/**
	 * Lines selected pointer.
	 */
	LinesSelected *lines;

	/**
	 * Value of total bet.
	 */
	long value;

public:

	/**
	 * Constructor.
	 *
	 * @param bet Source for bet value.
	 *
	 * @param lines Source for number of lines.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilifighter1806@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	TotalBet(Bet *bet, LinesSelected *lines);

	/**
	 * Value of a total bet getter.
	 *
	 * @return Value of a total bet.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	long getValue() const;

	/**
	 * Update total bet value.
	 * Total bet value depends on bet value per line
	 * and number of selected lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	void update();

	/**
	 * Draw total bet value.
	 * For every game it draws the updated total bet value.
	 *
	 * @param canvas Text drawing area pointer.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void draw(Canvas* canvas);
};
