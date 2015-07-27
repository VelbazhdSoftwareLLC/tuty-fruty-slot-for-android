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
 * Implements the logic of the visible part of the line selectors. Takes care of
 * showing exactly which lines are selected and how many are they. Holds
 * information about the maximum number of the available lines. Holds all prize
 * combinations of symbols for each available line. Check if the given
 * combination of symbols on the visible part of the reels is winning. Takes
 * care of changing the number of lines.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 05 Sep 2008
 */
class LinesSelector extends VisualComponent {

	/**
	 * Available linese 9 constant.
	 */
	public static final int LINES_AVAILABLE_09 = 9;

	/**
	 * Available linese 15 constant.
	 */
	public static final int LINES_AVAILABLE_15 = 15;

	/**
	 * Available linese 21 constant.
	 */
	public static final int LINES_AVAILABLE_21 = 21;

	/**
	 * Available lines constant.
	 */
	public static final int LINES_AVAILABLE = LINES_AVAILABLE_09;

	/**
	 * Number of lines to display at left.
	 */
	public static final int NUMBER_OF_LEFT_LINES = LINES_AVAILABLE / 2
			+ LINES_AVAILABLE % 2;

	/**
	 * Number of lines to display at right.
	 */
	public static final int NUMBER_OF_RIGHT_LINES = LINES_AVAILABLE
			- NUMBER_OF_LEFT_LINES;

	/**
	 * Constant flag indication for selected lines.
	 */
	public static final int SELECTED = 1;

	/**
	 * Constant flag indication for not selected lines.
	 */
	public static final int NOT_SELECTED = 0;

	/**
	 * Number of lines to be selected in one step.
	 */
	public static final int LINES_CHANGE_STEP = 1;

	/**
	 * Contain all prize combinations of symbols for every line. All
	 * combinations for each line should be in descending order by number of
	 * symbols in each combination. It is needed to escape duplications in
	 * longer and shorter lines.
	 */
	public static final PrizeCombination CORRESPONDANCE[][][] = new PrizeCombination[LinesSelector.LINES_AVAILABLE][Reels.TOTAL_NUMBER_OF_SYMBOLS][Prizes.NUMBER_OF_CONFIGURATIONS];

	/**
	 * Multiplier for line selected used in win calculation. Plus one is for
	 * zero selected lines.
	 */
	public static final double LINES_MULTIPLIERS[] = new double[LINES_AVAILABLE + 1];

	/**
	 * Holds all available lines and shows which are selected.
	 */
	private char selected[] = new char[LINES_AVAILABLE];

	/**
	 * Selected lines getter.
	 *
	 * @param flag
	 *            Array which contain getted value.
	 *
	 * @return Selected lines flags.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public char[] getSelected() {
		char flags[] = new char[selected.length];

		for (int i = 0; i < selected.length; i++) {
			flags[i] = selected[i];
		}

		return flags;
	}

	/**
	 * Selected lines setter.
	 *
	 * @param flags
	 *            Selected lines flags.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public void setSelected(final char flags[]) {
		for (int i = 0; i < flags.length && i < selected.length; i++) {
			selected[i] = flags[i];
		}
	}

	/**
	 * Add more line(s).
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void linesUp() {
		int nextSelectionIndex = LINES_AVAILABLE - 1;

		/*
		 * Searching for the next line to be selected.
		 */
		for (nextSelectionIndex = LINES_AVAILABLE - 1; nextSelectionIndex >= 0; nextSelectionIndex--) {
			if (selected[nextSelectionIndex] == SELECTED) {
				break;
			}
		}

		/*
		 * There are not negative indexes.
		 */
		if (nextSelectionIndex < 0) {
			nextSelectionIndex = 0;
		}

		/*
		 * After previous for it is possible next selected index to be proper if
		 * there is no selected lines at all.
		 */
		if (selected[nextSelectionIndex] == SELECTED) {
			nextSelectionIndex++;
		}

		/*
		 * If all lines are selected and still there is a need to do selection
		 * clear all lines and start new selection. By this way loop selection
		 * is implmented.
		 */
		if (nextSelectionIndex == LINES_AVAILABLE) {
			for (int i = 0; i < LINES_AVAILABLE; i++) {
				selected[i] = NOT_SELECTED;
			}
			nextSelectionIndex = 0;
		}

		/*
		 * Select more lines.
		 */
		for (int i = 0; i < LINES_CHANGE_STEP
				&& nextSelectionIndex + i < LINES_AVAILABLE; i++) {
			selected[nextSelectionIndex + i] = SELECTED;
		}
	}

	/**
	 * Remove line(s).
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void linesDown() {
		// TODO To be implemented only if it is needed.
	}

	/**
	 * Counts selected lines. Gives the number of selected lines.
	 *
	 * @return number of selected lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	public int numberOfSelectedLines() {
		int numberLines = 0;

		for (int i = 0; i < LINES_AVAILABLE; i++) {
			if (selected[i] == SELECTED) {
				numberLines++;
			}
		}

		return numberLines;
	}

	/**
	 * Check if the given combination of symbols is part of the win. Compares
	 * with already defined prize combinations. Gives a result from the
	 * comparing combinations. Gives true if the given combination is equal to a
	 * prize combination, false - otherwise.
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
	public boolean isActive(final PrizeCombination combination) {
		for (int i = 0; i < LINES_AVAILABLE; i++) {
			if (selected[i] == SELECTED) {
				for (int j = 0; j < Reels.TOTAL_NUMBER_OF_SYMBOLS; j++) {
					for (int k = 0; k < Prizes.NUMBER_OF_CONFIGURATIONS; k++) {
						if (combination != null
								&& CORRESPONDANCE[i][j][k] != null
								&& combination.equals(CORRESPONDANCE[i][j][k])) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}
