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
 * Implements logic of the lines, on which player will play. Combination shows
 * how exactly a line is built. When player choose a line to play on,
 * combination knows how exactly the line is represented on the visible part of
 * the reels. Check if two combinations are the same.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 08 Sep 2008
 */
class Combination {
	/**
	 * Holds information about how a line is built.
	 */
	private char mask[][] = new char[ReelsBase.COLS][ReelsBase.ROWS];

	/**
	 * Default constructor.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public Combination() {
	}

	/**
	 * Constructor.
	 *
	 * @param mask
	 *            Line container.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 15 Sep 2008
	 */
	public Combination(char mask[][]) {
		for (int i = 0; i < ReelsBase.COLS; i++) {
			for (int j = 0; j < ReelsBase.ROWS; j++) {
				this.mask[i][j] = mask[i][j];
			}
		}
	}

	/**
	 * Bit mask getter.
	 *
	 * @return Mask that indicates the line.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 08 Sep 2008
	 */
	public char[][] getMask() {
		char mask[][] = new char[ReelsBase.COLS][ReelsBase.ROWS];

		for (int i = 0; i < ReelsBase.COLS; i++) {
			for (int j = 0; j < ReelsBase.ROWS; j++) {
				mask[i][j] = this.mask[i][j];
			}
		}

		return mask;
	}

	/**
	 * Bit mask setter.
	 *
	 * @param mask
	 *            The mask to set.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 08 Sep 2008
	 */
	public void setMask(final char mask[][]) {
		for (int i = 0; i < ReelsBase.COLS; i++) {
			for (int j = 0; j < ReelsBase.ROWS; j++) {
				this.mask[i][j] = mask[i][j];
			}
		}
	}

	/**
	 * Compare two combinations.
	 *
	 * @param combination
	 *            External combination to be compared with the internal
	 *            combination.
	 *
	 * @return True if combinations are equal, false - otherwise.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 02 Sep 2008
	 */
	public boolean equals(final Combination combination) {
		for (int i = 0; i < ReelsBase.COLS; i++) {
			for (int j = 0; j < ReelsBase.ROWS; j++) {
				if (this.mask[i][j] != combination.mask[i][j]) {
					return false;
				}
			}
		}

		return true;
	}
}
