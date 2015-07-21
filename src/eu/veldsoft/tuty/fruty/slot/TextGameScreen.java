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
 * Presents game play screen. Constructing and initialize all visual components
 * which are part of the screen. It contains information about all
 * xy-coordinates of game components and their width and height. Takes care of
 * selecting lines, changing the bet, adding credit. It responds to spinning the
 * reels.
 *
 * @author Anton Dimitrov
 *
 * @email anton.naskov@gmail.com
 *
 * @date 06 Oct 2008
 */
class TextGameScreen extends GameScreen {

	/**
	 * Constant reels x coordinate.
	 */
	public static final int REELS_X = 7;

	/**
	 * Constant reels y coordinate.
	 */
	public static final int REELS_Y = 0;

	/**
	 * Constant reels width.
	 */
	public static final int REELS_WIDTH = 0;

	/**
	 * Constant reels height.
	 */
	public static final int REELS_HEIGHT = 0;

	/**
	 * Constant symbol width.
	 */
	public static final int REELS_SYMBOL_WIDTH = 6;

	/**
	 * Constant symbol height.
	 */
	public static final int REELS_SYMBOL_HEIGHT = 3;

	/**
	 * Constant vertical splitter width.
	 */
	public static final int REELS_VERTICAL_SPLITTER_WIDTH = 1;

	/**
	 * Constant horizontal splitter height.
	 */
	public static final int REELS_HORIZONTAL_SPLITTER_HEIGHT = 1;

	/**
	 * Constant lines selector x coordinate.
	 */
	public static final int SELECTOR_X = 0;

	/**
	 * Constant lines selector y coordinate.
	 */
	public static final int SELECTOR_Y = 0;

	/**
	 * Constant lines selector width.
	 */
	public static final int SELECTOR_WIDTH = 48;

	/**
	 * Constant lines selector height.
	 */
	public static final int SELECTOR_HEIGHT = 11;

	/**
	 * Constant bet x coordinate.
	 */
	public static final int BET_X = 0;

	/**
	 * Constant bet y coordinate.
	 */
	public static final int BET_Y = 15;

	/**
	 * Constant bet width.
	 */
	public static final int BET_WIDTH = 0;

	/**
	 * Constant bet height.
	 */
	public static final int BET_HEIGHT = 0;

	/**
	 * Constant lines selected x coordinate.
	 */
	public static final int LINES_X = 6;

	/**
	 * Constant lines selected y coordinate.
	 */
	public static final int LINES_Y = 15;

	/**
	 * Constant lines selected width.
	 */
	public static final int LINES_WIDTH = 0;

	/**
	 * Constant lines selected height.
	 */
	public static final int LINES_HEIGHT = 0;

	/**
	 * Constant total bet x coordinate.
	 */
	public static final int TOTAL_X = 14;

	/**
	 * Constant total bet y coordinate.
	 */
	public static final int TOTAL_Y = 15;

	/**
	 * Constant total bet width.
	 */
	public static final int TOTAL_WIDTH = 0;

	/**
	 * Constant total bet height.
	 */
	public static final int TOTAL_HEIGHT = 0;

	/**
	 * Constant winner paid x coordinate.
	 */
	public static final int PAID_X = 26;

	/**
	 * Constant winner paid y coordinate.
	 */
	public static final int PAID_Y = 15;

	/**
	 * Constant winner paid width.
	 */
	public static final int PAID_WIDTH = 0;

	/**
	 * Constant winner paid height.
	 */
	public static final int PAID_HEIGHT = 0;

	/**
	 * Constant credit x coordinate.
	 */
	public static final int CREDIT_X = 40;

	/**
	 * Constant credit y coordinate.
	 */
	public static final int CREDIT_Y = 15;

	/**
	 * Constant credit width.
	 */
	public static final int CREDIT_WIDTH = 0;

	/**
	 * Constant credit height.
	 */
	public static final int CREDIT_HEIGHT = 0;

	/**
	 * Constructor.
	 *
	 * @param canvas
	 *            Visual components in game screen will be drawn on text canvas.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public TextGameScreen(Canvas canvas) {
		super(canvas);
	}
}
