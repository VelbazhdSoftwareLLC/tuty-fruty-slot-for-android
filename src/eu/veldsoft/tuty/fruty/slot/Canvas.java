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
 * Base canvas class.
 *
 * @author Todor Balabanov
 *
 * @email tdb@tbsoft-bg.com
 *
 * @date 18 Apr 2009
 */
class Canvas {

	/**
	 * Width constant.
	 */
	public static final int WIDTH = 0;

	/**
	 * Height constant.
	 */
	public static final int HEIGHT = 0;

	/**
	 * Set single symbol on canvas.
	 *
	 * @param index
	 *            Game symbols array index.
	 *
	 * @param string
	 *            String to be drawn.
	 *
	 * @param x
	 *            Left side of the string.
	 *
	 * @param y
	 *            Top side of the string.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void drawSymbol(int index, int x, int y) {
	}

	/**
	 * Set number on canvas.
	 *
	 * @param number
	 *            Number to be drawn.
	 *
	 * @param x
	 *            Left side of the number.
	 *
	 * @param y
	 *            Top side of the number.
	 *
	 * @param digits
	 *            Maximum number of digits.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void drawNumber(long number, int x, int y, int digits) {
	}

	/**
	 * Set number on canvas.
	 *
	 * @param number
	 *            Number to be drawn.
	 *
	 * @param x
	 *            Left side of the number.
	 *
	 * @param y
	 *            Top side of the number.
	 *
	 * @param digits
	 *            Maximum number of digits.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void drawNumber(double number, int x, int y, int digits) {
	}

	/**
	 * Set string on canvas.
	 *
	 * @param string
	 *            String to be drawn.
	 *
	 * @param x
	 *            Left side of the string.
	 *
	 * @param y
	 *            Top side of the string.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void drawString(final String string, int x, int y) {
	}

	/**
	 * Draw background image.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void drawBackground() {
	}

	/**
	 * Clean canvas.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void clean() {
	}

	/**
	 * Draw canvas.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	public void draw() {
	}
}
