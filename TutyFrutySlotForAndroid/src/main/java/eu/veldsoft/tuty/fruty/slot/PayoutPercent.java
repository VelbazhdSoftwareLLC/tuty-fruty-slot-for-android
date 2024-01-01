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
 * Calculating pay out percent.
 *
 * @author Anton Dimitrov
 *
 * @email anton.naskov@gmail.com
 *
 * @date 13 Oct 2008
 */
class PayoutPercent {

	/**
	 * Sum all bets which player has done.
	 */
	private long sumBet;

	/**
	 * Sum all wins which player has done.
	 */
	private long sumWin;

	/**
	 * Pay out percent value.
	 */
	private double value;

	/**
	 * Update pay out percent value.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 13 Oct 2008
	 */
	private void update() {
	}

	/**
	 * Reset sum win, sum bet and pay out percent value.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 13 Oct 2008
	 */
	public void reset() {
	}

	/**
	 * Increase the sum of bet.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 13 Oct 2008
	 */
	public void increaseSumBet(long sumBet) {
	}

	/**
	 * Increase the sum of win.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 13 Oct 2008
	 */
	public void increaseSumWin(long sumWin) {
	}

	/**
	 * Pay out percent value getter.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 13 Oct 2008
	 */
	public double getValue() {
		return 0.0;
	}
}
