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
 * Implements logic of calculating frequency of prizes.
 *
 * @author Darina Evtimova
 *
 * @email aleks_f@abv.bg
 *
 * @date 14 Oct 2008
 */
class PrizesFrequency {

	/**
	 * Maximum number of prizes.
	 */
	public static final int MAX_NUMBER_OF_PRIZES = 1000;

	/**
	 * Size of prizes names.
	 */
	public static final int SIZE_OF_PRIZES_NAMES = 100;

	/**
	 * Number of prizes under frequency test.
	 */
	private int numberOfPrizes;

	/**
	 * List of the prizes under frequency test.
	 */
	private char prizes[][] = new char[MAX_NUMBER_OF_PRIZES][SIZE_OF_PRIZES_NAMES];

	/**
	 * It contain count of frequencies.
	 */
	private long counters[] = new long[MAX_NUMBER_OF_PRIZES];

	/**
	 * Total number of spins.
	 */
	private long totalNumberOfSpins;

	/**
	 * Default constructor.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 14 Oct 2008
	 */
	public PrizesFrequency() {
	}

	/**
	 * Initialize with zeros all counters.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 14 Oct 2008
	 */
	public void reset() {
	}

	/**
	 * Increment frequency of given prize.
	 *
	 * @param name
	 *            Name of the prize which frequency should be increment.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 14 Oct 2008
	 */
	public void increment(String name) {
	}

	/**
	 * Increment number of spins.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 14 Oct 2008
	 */
	public void incrementSpins() {
	}

	/**
	 * Number of spins getter.
	 *
	 * @return Total number of spins.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Oct 2008
	 */
	public long getTotalNumberOfSpins() {
		return 0;
	}

	/**
	 * Sort prizes frequencies by name.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 17 Oct 2008
	 */
	public void sortByName() {
	}

	/**
	 * Sort prizes frequencies by frequencies.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 17 Oct 2008
	 */
	public void sortByFrequency() {
	}

	/**
	 * Print frequencies.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 14 Oct 2008
	 */
	public void print() {
	}
}
