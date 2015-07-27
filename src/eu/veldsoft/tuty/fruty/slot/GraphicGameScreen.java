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
class GraphicGameScreen extends GameScreen {

	/**
	 * Constant reels x coordinate.
	 */
	public static final int REELS_X = 91;

	/**
	 * Constant reels y coordinate.
	 */
	public static final int REELS_Y = 126;

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
	public static final int REELS_SYMBOL_WIDTH = 75;

	/**
	 * Constant symbol height.
	 */
	public static final int REELS_SYMBOL_HEIGHT = 63;

	/**
	 * Constant vertical splitter width.
	 */
	public static final int REELS_VERTICAL_SPLITTER_WIDTH = 9;

	/**
	 * Constant horizontal splitter height.
	 */
	public static final int REELS_HORIZONTAL_SPLITTER_HEIGHT = 10;

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
	public static final int BET_X = 65;

	/**
	 * Constant bet y coordinate.
	 */
	public static final int BET_Y = 380;

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
	public static final int LINES_X = 135;

	/**
	 * Constant lines selected y coordinate.
	 */
	public static final int LINES_Y = 380;

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
	public static final int TOTAL_X = 240;

	/**
	 * Constant total bet y coordinate.
	 */
	public static final int TOTAL_Y = 380;

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
	public static final int PAID_X = 335;

	/**
	 * Constant winner paid y coordinate.
	 */
	public static final int PAID_Y = 380;

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
	public static final int CREDIT_X = 440;

	/**
	 * Constant credit y coordinate.
	 */
	public static final int CREDIT_Y = 380;

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
	public GraphicGameScreen() {
		super();
	}
}
