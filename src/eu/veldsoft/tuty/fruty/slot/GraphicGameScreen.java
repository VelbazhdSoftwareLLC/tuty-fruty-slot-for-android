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
class GraphicGameScreen : public GameScreen {
public:

	/**
	 * Constant reels x coordinate.
	 */
	static const int REELS_X = 91;

	/**
	 * Constant reels y coordinate.
	 */
	static const int REELS_Y = 126;

	/**
	 * Constant reels width.
	 */
	static const int REELS_WIDTH = 0;

	/**
	 * Constant reels height.
	 */
	static const int REELS_HEIGHT = 0;

	/**
	 * Constant symbol width.
	 */
	static const int REELS_SYMBOL_WIDTH = 75;

	/**
	 * Constant symbol height.
	 */
	static const int REELS_SYMBOL_HEIGHT = 63;

	/**
	 * Constant vertical splitter width.
	 */
	static const int REELS_VERTICAL_SPLITTER_WIDTH = 9;

	/**
	 * Constant horizontal splitter height.
	 */
	static const int REELS_HORIZONTAL_SPLITTER_HEIGHT = 10;

	/**
	 * Constant lines selector x coordinate.
	 */
	static const int SELECTOR_X = 0;

	/**
	 * Constant lines selector y coordinate.
	 */
	static const int SELECTOR_Y = 0;

	/**
	 * Constant lines selector width.
	 */
	static const int SELECTOR_WIDTH = 48;

	/**
	 * Constant lines selector height.
	 */
	static const int SELECTOR_HEIGHT = 11;

	/**
	 * Constant bet x coordinate.
	 */
	static const int BET_X = 65;

	/**
	 * Constant bet y coordinate.
	 */
	static const int BET_Y = 380;

	/**
	 * Constant bet width.
	 */
	static const int BET_WIDTH = 0;

	/**
	 * Constant bet height.
	 */
	static const int BET_HEIGHT = 0;

	/**
	 * Constant lines selected x coordinate.
	 */
	static const int LINES_X = 135;

	/**
	 * Constant lines selected y coordinate.
	 */
	static const int LINES_Y = 380;

	/**
	 * Constant lines selected width.
	 */
	static const int LINES_WIDTH = 0;

	/**
	 * Constant lines selected height.
	 */
	static const int LINES_HEIGHT = 0;

	/**
	 * Constant total bet x coordinate.
	 */
	static const int TOTAL_X = 240;

	/**
	 * Constant total bet y coordinate.
	 */
	static const int TOTAL_Y = 380;

	/**
	 * Constant total bet width.
	 */
	static const int TOTAL_WIDTH = 0;

	/**
	 * Constant total bet height.
	 */
	static const int TOTAL_HEIGHT = 0;

	/**
	 * Constant winner paid x coordinate.
	 */
	static const int PAID_X = 335;

	/**
	 * Constant winner paid y coordinate.
	 */
	static const int PAID_Y = 380;

	/**
	 * Constant winner paid width.
	 */
	static const int PAID_WIDTH = 0;

	/**
	 * Constant winner paid height.
	 */
	static const int PAID_HEIGHT = 0;

	/**
	 * Constant credit x coordinate.
	 */
	static const int CREDIT_X = 440;

	/**
	 * Constant credit y coordinate.
	 */
	static const int CREDIT_Y = 380;

	/**
	 * Constant credit width.
	 */
	static const int CREDIT_WIDTH = 0;

	/**
	 * Constant credit height.
	 */
	static const int CREDIT_HEIGHT = 0;

public:

	/**
	 * Constructor.
	 *
	 * @param canvas Visual components in game screen will be drawn on text
	 * canvas.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	GraphicGameScreen(Canvas* canvas);
};
