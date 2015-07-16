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
 * Implements logic of winner's paid value. Shows how many credits player takes
 * when he met prize combinations in the game. Calculates the win.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 12 Sep 2008
 */
class WinnerPaid : public VisualComponent {
private:

	/**
	 * Paid value to winner.
	 */
	long value;

	/**
	 * Bet value used to calculate winner paid value.
	 */
	Bet *bet;

	/**
	 * Source for selected lines.
	 */
	LinesSelector *selector;

	/**
	 * Source for reels state.
	 */
	Reels *reels;

	/**
	 * Pointers to all prizes already found.
	 */
	PrizeCombination final *found[ LinesSelector.LINES_AVAILABLE ];

private:

	/**
	 * Clear array with found pointers.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 11 Oct 2008
	 */
	void clearFound(){}

	/**
	 * Add found prize to array with already found prizes.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 11 Oct 2008
	 */
	void addFound(final PrizeCombination *prize){}

	/**
	 * Check if prize is found in the array.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 11 Oct 2008
	 */
	boolean isFound(final PrizeCombination *prize){}

public:

	/**
	 * Constructor.
	 *
	 * @param bet Source for bet value.
	 *
	 * @param selector Gives information about selected lines and their prize
	 * combinations.
	 *
	 * @param reels Source for reels state.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	WinnerPaid(Bet *bet, LinesSelector *selector, Reels *reels){}

	/**
	 * Winner's paid value getter.
	 *
	 * @return Winner's paid value.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 12 Sep 2008
	 */
	long getValue(){}

	/**
	 * Winner's paid value setter.
	 *
	 * @param value Winner's paid value.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 12 Sep 2008
	 */
	void setValue(final long value){}

	/**
	 * Calculate winner paid value.
	 *
	 * @return Winner paid value.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	long calculateWin(){}

	/**
	 * Draw winner paid value.
	 * When player wins, winner paid value is drawn on the screen.
	 *
	 * @param canvas Text drawing area pointer.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void draw(Canvas* canvas){}
}
