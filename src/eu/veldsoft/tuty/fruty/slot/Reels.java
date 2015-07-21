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
	public static final ReelSymbol SYMBOL_01 = null;

	/**
	 * Symbol 2 constant.
	 */
	public static final ReelSymbol SYMBOL_02 = null;

	/**
	 * Symbol 3 constant.
	 */
	public static final ReelSymbol SYMBOL_03 = null;

	/**
	 * Symbol 4 constant.
	 */
	public static final ReelSymbol SYMBOL_04 = null;

	/**
	 * Symbol 5 constant.
	 */
	public static final ReelSymbol SYMBOL_05 = null;

	/**
	 * Symbol 6 constant.
	 */
	public static final ReelSymbol SYMBOL_06 = null;

	/**
	 * Symbol 7 constant.
	 */
	public static final ReelSymbol SYMBOL_07 = null;

	/**
	 * Symbol 8 constant.
	 */
	public static final ReelSymbol SYMBOL_08 = null;

	/**
	 * Symbol 9 constant.
	 */
	public static final ReelSymbol SYMBOL_09 = null;

	/**
	 * Special symbol 1 constant.
	 */
	public static final ReelSymbol SPECIAL_SYMBOL_01 = null;

	/**
	 * Number of regular symbols constant.
	 */
	public static final int REGULAR_NUMBER_OF_SYMBOLS = 9;

	/**
	 * Indexes of regular symbol constants.
	 */
	public static final ReelSymbol REGULAR_SYMBOLS[] = new ReelSymbol[REGULAR_NUMBER_OF_SYMBOLS];

	/**
	 * Number of special symbols constant.
	 */
	public static final int SPECIAL_NUMBER_OF_SYMBOLS = 1;

	/**
	 * Indexes of special symbol constants.
	 */
	public static final ReelSymbol SPECIAL_SYMBOLS[] = new ReelSymbol[SPECIAL_NUMBER_OF_SYMBOLS];

	/**
	 * Number of total symbols constant.
	 */
	public static final int TOTAL_NUMBER_OF_SYMBOLS = 10;

	/**
	 * Indexes of total symbol constants.
	 */
	public static final ReelSymbol TOTAL_SYMBOLS[] = new ReelSymbol[TOTAL_NUMBER_OF_SYMBOLS];

	/**
	 * Reel symbol width.
	 */
	private int symbolWidth;

	/**
	 * Reel symbol height.
	 */
	private int symbolHeight;

	/**
	 * Reels vertical splitter width.
	 */
	private int verticalSplitterWidth;

	/**
	 * Reels horizontal splitter height.
	 */
	private int horizontalSplitterHeight;

	/**
	 * Visible part of the reels.
	 */
	private ReelSymbol visibleCombination[][] = new ReelSymbol[COLS][ROWS];

	/**
	 * Source of discrette probability distribution.
	 */
	private ReelsDistribution distribution;

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
	}

	/**
	 * Reel symbol width getter.
	 *
	 * @return Reel symbol width.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public int getSymbolWidth() {
		return 0;
	}

	/**
	 * Reel symbol width setter.
	 *
	 * @param symbolWidth
	 *            Reel symbol width.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public void setSymbolWidth(int symbolWidth) {
	}

	/**
	 * Reel symbol height getter.
	 *
	 * @return Reel symbol height.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public int getSymbolHeight() {
		return 0;
	}

	/**
	 * Reel symbol height setter.
	 *
	 * @param symbolHeight
	 *            Reel symbol height.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public void setSymbolHeight(int symbolHeight) {
	}

	/**
	 * Vertical splitter width getter.
	 *
	 * @return Vertical splitter width.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public int getVerticalSplitterWidth() {
		return 0;
	}

	/**
	 * Vertical splitter width setter.
	 *
	 * @param verticalSplitterWidth
	 *            Vertical splitter width.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public void setVerticalSplitterWidth(int verticalSplitterWidth) {
	}

	/**
	 * Horizontal splitter height getter.
	 *
	 * @return Horizontal splitter height.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public int getHorizontalSplitterHeight() {
		return 0;
	}

	/**
	 * Horizontal splitter height setter.
	 *
	 * @param horizontalSplitterHeight
	 *            Horizontal splitter height.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	public void setHorizontalSplitterHeight(int horizontalSplitterHeight) {
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
		return false;
	}

	/**
	 * Draw reels with their symbols. Draws visible part of the reels. When
	 * player spins the reels, visible part of reels is repainting.
	 *
	 * @param canvas
	 *            Text drawing area pointer.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	public void draw(Canvas canvas) {
	}
}
