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
 * Implements logic of pay table. Fills pay table with different pay table
 * entries and hold its contents. Summarize pay out values for all type symbols.
 * Defines the pay out rules for player and how much credits he gets when he
 * wins. Holds fiexed size number of pay table entries.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 15 Sep 2008
 */
class PayTable  {

	/**
	 * Number of entries.
	 */
	public static final int NUMBER_OF_ENTRIES = Prizes.NUMBER_OF_COMBINATIONS;

	/**
	 * Entry for pay table initializing.
	 */
	private PayTableEntry entries[] = new PayTableEntry[NUMBER_OF_ENTRIES];

	/**
	 * Default constructor.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 18 Sep 2008
	 */
	public PayTable() {
	}

	/**
	 * Constructor.
	 *
	 * @param entries
	 *            Array from PayTableEntry.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 18 Sep 2008
	 */
	public PayTable(PayTableEntry entries[]) {
		for (int i = 0; i < NUMBER_OF_ENTRIES; i++) {
			this.entries[i] = entries[i];
		}
	}

	/**
	 * Entry getter.
	 *
	 * @param index
	 *            Shows the entry of the array that will be taken
	 *
	 * @return Pay table entry.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public PayTableEntry getEntry(int index) {
		return entries[index];
	}

	/**
	 * Entry setter.
	 *
	 * @param entry
	 *            Entry which is set.
	 *
	 * @param index
	 *            Position in array, where entry should be set.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public void setEntry(PayTableEntry entry, int index) {
		this.entries[index] = entry;
	}
}
