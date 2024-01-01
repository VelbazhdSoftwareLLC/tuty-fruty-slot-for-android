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
 * Implement logic of pay table screen drawing.
 *
 * @author Darina Evtimova
 *
 * @email aleks_f@abv.bg
 *
 * @date 06 Oct 2008
 */
class PayTableScreen {

	/**
	 * Takes bet value for calculating the pay table screen.
	 */
	private Bet bet;

	/**
	 * Takes number of selected lines for calculating the pay table screen.
	 */
	private LinesSelector selector;

	/**
	 * Constructor. Takes care of initialization of pay table canvas, pay table
	 * bet and pay table lines selector.
	 *
	 * @param canvas
	 *            Visual components in pay table screen will be drawn on text
	 *            canvas.
	 *
	 * @param game
	 *            Contain value of bet and number of selected lines.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 26 Oct 2008
	 */
	public PayTableScreen(GameScreen game) {
	}
}
