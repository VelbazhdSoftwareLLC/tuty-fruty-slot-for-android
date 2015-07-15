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
 * Implements the logic of the visible part of the line selectors.
 * Takes care of showing exactly which lines are selected and how many are they.
 * Holds information about the maximum number of the available lines.
 * Holds all prize combinations of symbols for each available line.
 * Check if the given combination of symbols on the visible part of the reels is
 * winning. Takes care of changing the number of lines.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 05 Sep 2008
 */
class LinesSelector : public VisualComponent {
public:

	/**
	 * Available linese 9 constant.
	 */
	static const int LINES_AVAILABLE_09 = 9;

	/**
	 * Available linese 15 constant.
	 */
	static const int LINES_AVAILABLE_15 = 15;

	/**
	 * Available linese 21 constant.
	 */
	static const int LINES_AVAILABLE_21 = 21;

	/**
	 * Available lines constant.
	 */
	static const int LINES_AVAILABLE = LINES_AVAILABLE_09;

	/**
	 * Number of lines to display at left.
	 */
	static const int NUMBER_OF_LEFT_LINES = LINES_AVAILABLE / 2 + LINES_AVAILABLE % 2;

	/**
	 * Number of lines to display at right.
	 */
	static const int NUMBER_OF_RIGHT_LINES = LINES_AVAILABLE - NUMBER_OF_LEFT_LINES;

	/**
	 * Constant flag indication for selected lines.
	 */
	static const int SELECTED = 1;

	/**
	 * Constant flag indication for not selected lines.
	 */
	static const int NOT_SELECTED = 0;

	/**
	 * Number of lines to be selected in one step.
	 */
	static const int LINES_CHANGE_STEP = 1;

	/**
	 * Contain all prize combinations of symbols for every line.
	 * All combinations for each line should be in descending order by number of
	 * symbols in each combination. It is needed to escape dublications in
	 * longer and shorter lines.
	 */
	static const PrizeCombination* CORRESPONDANCE[LinesSelector::LINES_AVAILABLE][Reels::TOTAL_NUMBER_OF_SYMBOLS][Prizes::NUMBER_OF_CONFIGURATIONS];

	/**
	 * Multiplier for line selected used in win calculation.
	 * Plus one is for zero selected lines.
	 */
	static const double LINES_MULTIPLIERS[LINES_AVAILABLE + 1];

private:

	/**
	 * Holds all available lines and shows which are selected.
	 */
	unsigned char selected[LINES_AVAILABLE];

public:

	/**
	 * Selected lines getter.
	 *
	 * @param flag Array which contain getted value.
	 *
	 * @return Selected lines flags.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	unsigned char * getSelected(unsigned char flags[LINES_AVAILABLE]);

	/**
	 * Selected lines setter.
	 *
	 * @param flags Selected lines flags.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	void setSelected(unsigned char const flags[LINES_AVAILABLE]);

	/**
	 * Add more line(s).
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	void linesUp();

	/**
	 * Remove line(s).
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	void linesDown();

	/**
	 * Counts selected lines.
	 * Gives the number of selected lines.
	 *
	 * @return number of selected lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	unsigned int numberOfSelectedLines() const;

	/**
	 * Draw lines selector.
	 * Lines selector shows all available lines for playing.
	 * Player select on which lines to play from the lines selector.
	 * Indicates the selected lines.
	 *
	 * @param canvas Text drawing area pointer.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void draw(Canvas* canvas);

	/**
	 * Check if the given combination of symbols is part of the win.
	 * Compares with already defined prize combinations.
	 * Gives a result from the comparing combinations.
	 * Gives true if the given combination is equal to a prize combination,
	 * false - otherwise.
	 *
	 * @param combination
	 *
	 * @return True, if given prize combination is active, false - otherwise.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	bool isActive(const PrizeCombination *combination);
};
