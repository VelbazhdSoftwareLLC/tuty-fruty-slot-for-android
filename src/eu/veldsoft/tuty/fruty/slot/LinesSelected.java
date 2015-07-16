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
 * Implements lines selected component. The component shows to the player how
 * many lines are selected. Selected lines are these lines on which player can
 * win depending on the number of meetings of symbols over the line. Player can
 * change the number of selected lines. Holds the counter which shows how many
 * lines are selected.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 10 Sep 2008
 */
class LinesSelected extends VisualComponent {

	/**
	 * Lines selector pointer.
	 */
	private LinesSelector selector;

	/**
	 * Constructor.
	 *
	 * @param linesSelector
	 *            Lines selector as source of data.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 09 Oct 2008
	 */
	public LinesSelected(LinesSelector selector) {
	}

	/**
	 * Lines selector pointer getter.
	 *
	 * @return Lines selecltor pointer.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 10 Sep 2008
	 */
	public LinesSelector getSelector() {
		return null;
	}

	/**
	 * Draw the number of the selected lines. When new lines are selected, it
	 * shows the updated number of selected lines.
	 *
	 * @param canvas
	 *            Text drawing area pointer.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	public void draw(Canvas canvas) {
	}
}
