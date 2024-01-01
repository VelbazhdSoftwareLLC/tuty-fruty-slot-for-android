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
 * Implements logic of the total bet. Holds bet value per line. Holds selected
 * lines and their number. Holds total bet value and updates total bet value.
 * The total bet value is calculated by multiplying number of lines and bet
 * value per line.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 11 Sep 2008
 */
class TotalBet  {

	/**
	 * Bet pointer.
	 */
	private Bet bet;

	/**
	 * Lines selected pointer.
	 */
	private LinesSelected lines;

	/**
	 * Value of total bet.
	 */
	private long value;

	/**
	 * Constructor.
	 *
	 * @param bet
	 *            Source for bet value.
	 *
	 * @param lines
	 *            Source for number of lines.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilifighter1806@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	public TotalBet(Bet bet, LinesSelected lines) {
		this.bet = bet;
		this.lines = lines;
		update();
	}

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
	public long getValue() {
		return value;
	}

	/**
	 * Update total bet value. Total bet value depends on bet value per line and
	 * number of selected lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	public void update() {
		value = bet.getValue() * lines.getSelector().numberOfSelectedLines();
	}
}
