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
 * Implements the logic of the visible part of the reels. Holds number of all
 * defined symbols and special symbols. Holds all symbols. Define the visible
 * combination of symbols when the reels stop spinning.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 05 Sep 2008
 */
class Reels extends VisualComponent implements ReelsBase {

	/**
	 * Symbol 1 constant.
	 */
	public static final ReelSymbol SYMBOL_01 = new ReelSymbol("Symbol 01");

	/**
	 * Symbol 2 constant.
	 */
	public static final ReelSymbol SYMBOL_02 = new ReelSymbol("Symbol 02");

	/**
	 * Symbol 3 constant.
	 */
	public static final ReelSymbol SYMBOL_03 = new ReelSymbol("Symbol 03");

	/**
	 * Symbol 4 constant.
	 */
	public static final ReelSymbol SYMBOL_04 = new ReelSymbol("Symbol 04");

	/**
	 * Symbol 5 constant.
	 */
	public static final ReelSymbol SYMBOL_05 = new ReelSymbol("Symbol 05");

	/**
	 * Symbol 6 constant.
	 */
	public static final ReelSymbol SYMBOL_06 = new ReelSymbol("Symbol 06");

	/**
	 * Symbol 7 constant.
	 */
	public static final ReelSymbol SYMBOL_07 = new ReelSymbol("Symbol 07");

	/**
	 * Symbol 8 constant.
	 */
	public static final ReelSymbol SYMBOL_08 = new ReelSymbol("Symbol 08");

	/**
	 * Symbol 9 constant.
	 */
	public static final ReelSymbol SYMBOL_09 = new ReelSymbol("Symbol 09");

	/**
	 * Special symbol 1 constant.
	 */
	public static final ReelSymbol SPECIAL_SYMBOL_01 = new ReelSymbol(
			"Special Symbol 01");

	/**
	 * Number of regular symbols constant.
	 */
	public static final int REGULAR_NUMBER_OF_SYMBOLS = 9;

	/**
	 * Indexes of regular symbol constants.
	 */
	public static final ReelSymbol REGULAR_SYMBOLS[] = { SYMBOL_01, SYMBOL_02,
			SYMBOL_03, SYMBOL_04, SYMBOL_05, SYMBOL_06, SYMBOL_07, SYMBOL_08,
			SYMBOL_09 };

	/**
	 * Number of special symbols constant.
	 */
	public static final int SPECIAL_NUMBER_OF_SYMBOLS = 1;

	/**
	 * Indexes of special symbol constants.
	 */
	public static final ReelSymbol SPECIAL_SYMBOLS[] = { SPECIAL_SYMBOL_01 };

	/**
	 * Number of total symbols constant.
	 */
	public static final int TOTAL_NUMBER_OF_SYMBOLS = 10;

	/**
	 * Indexes of total symbol constants.
	 */
	public static final ReelSymbol TOTAL_SYMBOLS[] = { SYMBOL_01, SYMBOL_02,
			SYMBOL_03, SYMBOL_04, SYMBOL_05, SYMBOL_06, SYMBOL_07, SYMBOL_08,
			SYMBOL_09, SPECIAL_SYMBOL_01 };

	/**
	 * Visible part of the reels.
	 */
	private ReelSymbol visibleCombination[][] = new ReelSymbol[COLS][ROWS];

	/**
	 * Source of discrette probability distribution.
	 */
	private ReelsDistribution distribution = new ReelsDistribution();

	/**
	 * Constructor.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public Reels() {
		distribution.selectRandomSymbols(visibleCombination);
	}

	/**
	 * Visible part of the reels getter.
	 *
	 * @param combination
	 *            Result return variable.
	 *
	 * @return Visible combination.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public void getVisibleCombination(ReelSymbol combination[][]) {
		for (int j = 0; j < ROWS; j++) {
			for (int i = 0; i < COLS; i++) {
				combination[i][j] = visibleCombination[i][j];
			}
		}
	}

	/**
	 * Visible part of the reels setter.
	 *
	 * @param combination
	 *            Combination to be set inside the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public void setVisibleCombination(ReelSymbol combination[][]) {
		for (int j = 0; j < ROWS; j++) {
			for (int i = 0; i < COLS; i++) {
				visibleCombination[i][j] = combination[i][j];
			}
		}
	}

	/**
	 * Spin reels.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmal.com
	 *
	 * @date 09 Oct 2008
	 */
	public void spin() {
		distribution.selectRandomSymbols(visibleCombination);
	}

	/**
	 * Check particular prize combination as part of the reels.
	 *
	 * @param combinaton
	 *            Combinaton to be checked.
	 *
	 * @return True if combination is winning, false otherwise.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 09 Oct 2008
	 */
	public boolean hasPrize(final PrizeCombination combination) {
		char mask[][] = new char[ReelsBase.COLS][ReelsBase.ROWS];
		combination.getCombination().getMask(mask);

		for (int j = 0; j < ROWS; j++) {
			for (int i = 0; i < COLS; i++) {
				/*
				 * Each special symbol can be used for substitution.
				 */
				boolean specialSymbol = false;
				for (int k = 0; k < SPECIAL_NUMBER_OF_SYMBOLS; k++) {
					if (visibleCombination[i][j] == SPECIAL_SYMBOLS[k]) {
						specialSymbol = true;
					}
				}

				/*
				 * If element of the mask is 1 then check for symbol
				 * equivalence.
				 */
				if (mask[i][j] == 1
						&& visibleCombination[i][j] != combination.getSymbol()
						&& specialSymbol == false) {
					return false;
				}
			}
		}

		return true;
	}
}
