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
 * Implements logic of the bet per line. Player sets bet value. Bet value is
 * limited by minimal and maximal bet. This bet value can be incremented.
 * Incremention is done by fixed value. This bet per line takes part for
 * calculating the total bet.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 10 Sep 2008
 */
class Bet  {
	/**
	 * Bet value per line.
	 */
	private long value;

	/**
	 * Minimal bet constant.
	 */
	public static final long MIN_BET = 1;

	/**
	 * Maximal bet constant.
	 */
	public static final long MAX_BET = 10;

	/**
	 * Increasing bet step constant.
	 */
	public static final long BET_STEP = 1;

	public Bet() {
		value = MIN_BET;
	}

	/**
	 * Value getter.
	 *
	 * @return Value of bet.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 10 Sep 2008
	 */
	public long getValue() {
		return value;
	}

	/**
	 * Value setter.
	 *
	 * @param value
	 *            Value of bet.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 10 Sep 2008
	 */
	public void setValue(final long value) {
		this.value = value;
	}

	/**
	 * Increment bet value. Incremention is done by fixed size bet step. Bet
	 * step is the value of credits with which the user change the bet value.
	 * When bet value is greater than maximum bet value, it sets minimal bet
	 * value.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 10 Sep 2008
	 */
	public void cycleIncrement() {
		value += BET_STEP;

		if (value > MAX_BET) {
			value = MIN_BET;
		}
	}

	public void maximum() {
		value = MAX_BET;
	}
}
