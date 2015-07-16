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
 * Implements the logic of the visible part of the reels.
 * Holds number of all defined symbols and special symbols.
 * Holds all symbols.
 * Define the visible combination of symbols when the reels stop spinning.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 05 Sep 2008
 */
class Reels : public VisualComponent, public ReelsBase {
public:
	/**
	 * Symbol 1 constant.
	 */
	static final ReelSymbol SYMBOL_01;

	/**
	 * Symbol 2 constant.
	 */
	static final ReelSymbol SYMBOL_02;

	/**
	 * Symbol 3 constant.
	 */
	static final ReelSymbol SYMBOL_03;

	/**
	 * Symbol 4 constant.
	 */
	static final ReelSymbol SYMBOL_04;

	/**
	 * Symbol 5 constant.
	 */
	static final ReelSymbol SYMBOL_05;

	/**
	 * Symbol 6 constant.
	 */
	static final ReelSymbol SYMBOL_06;

	/**
	 * Symbol 7 constant.
	 */
	static final ReelSymbol SYMBOL_07;

	/**
	 * Symbol 8 constant.
	 */
	static final ReelSymbol SYMBOL_08;

	/**
	 * Symbol 9 constant.
	 */
	static final ReelSymbol SYMBOL_09;

	/**
	 * Special symbol 1 constant.
	 */
	static final ReelSymbol SPECIAL_SYMBOL_01;

	/**
	 * Number of regular symbols constant.
	 */
	static final int REGULAR_NUMBER_OF_SYMBOLS = 9;

	/**
	 * Indexes of regular symbol constants.
	 */
	static final ReelSymbol* REGULAR_SYMBOLS[ REGULAR_NUMBER_OF_SYMBOLS ];

	/**
	 * Number of special symbols constant.
	 */
	static final int SPECIAL_NUMBER_OF_SYMBOLS = 1;

	/**
	 * Indexes of special symbol constants.
	 */
	static final ReelSymbol* SPECIAL_SYMBOLS[ SPECIAL_NUMBER_OF_SYMBOLS ];

	/**
	 * Number of total symbols constant.
	 */
	static final int TOTAL_NUMBER_OF_SYMBOLS = 10;

	/**
	 * Indexes of total symbol constants.
	 */
	static final ReelSymbol* TOTAL_SYMBOLS[ TOTAL_NUMBER_OF_SYMBOLS ];

private:

	/**
	 * Reel symbol width.
	 */
	int symbolWidth;

	/**
	 * Reel symbol height.
	 */
	int symbolHeight;

	/**
	 * Reels vertical splitter width.
	 */
	int verticalSplitterWidth;

	/**
	 * Reels horizontal splitter height.
	 */
	int horizontalSplitterHeight;

	/**
	 * Visible part of the reels.
	 */
	ReelSymbol* visibleCombination[COLS][ROWS];

	/**
	 * Source of discrette probability distribution.
	 */
	ReelsDistribution distribution;

public:

	/**
	 * Constructor.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	Reels(){}

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
	int getSymbolWidth(){}

	/**
	 * Reel symbol width setter.
	 *
	 * @param symbolWidth Reel symbol width.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	void setSymbolWidth(int symbolWidth){}

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
	int getSymbolHeight(){}

	/**
	 * Reel symbol height setter.
	 *
	 * @param symbolHeight Reel symbol height.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	void setSymbolHeight(int symbolHeight){}

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
	int getVerticalSplitterWidth(){}

	/**
	 * Vertical splitter width setter.
	 *
	 * @param verticalSplitterWidth Vertical splitter width.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	void setVerticalSplitterWidth(int verticalSplitterWidth){}

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
	int getHorizontalSplitterHeight(){}

	/**
	 * Horizontal splitter height setter.
	 *
	 * @param horizontalSplitterHeight Horizontal splitter height.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 21 Jun 2009
	 */
	void setHorizontalSplitterHeight(int horizontalSplitterHeight){}

	/**
	 * Visible part of the reels getter.
	 *
	 * @param combination Result return variable.
	 *
	 * @return Visible combination.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	void getVisibleCombination(ReelSymbol* combination[COLS][ROWS]){}

	/**
	 * Visible part of the reels setter.
	 *
	 * @param combination Combination to be set inside the object.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	void setVisibleCombination(ReelSymbol* combination[COLS][ROWS]){}

	/**
	 * Spin reels.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmal.com
	 *
	 * @date 09 Oct 2008
	 */
	void spin(){}

	/**
	 * Check particular prize combination as part of the reels.
	 *
	 * @param combinaton Combinaton to be checked.
	 *
	 * @return True if combination is winning, false otherwise.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 09 Oct 2008
	 */
	boolean hasPrize(final PrizeCombination *combination){}

	/**
	 * Draw reels with their symbols.
	 * Draws visible part of the reels.
	 * When player spins the reels, visible part of reels is repainting.
	 *
	 * @param canvas Text drawing area pointer.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void draw(Canvas* canvas){}
}
