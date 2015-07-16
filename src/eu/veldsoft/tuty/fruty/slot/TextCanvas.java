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
 * Simulate drawing components on the console. Holds width and height of the
 * drawing field. Go to xy-coordinats with markers. Draws numbers,
 * symbols on the drawing field with the specified coordinates. Prints text
 * symbols on console.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 19 Sep 2008
 */
class TextCanvas : public Canvas {
public:

	/**
	 * Width of text canvas constant.
	 */
	static final int WIDTH = 80;

	/**
	 * Height of text canvas constant.
	 */
	static final int HEIGHT = 24;

private:

	/**
	 * Text buffer for printing visual components.
	 */
	char canvas[WIDTH][HEIGHT];

	/**
	 * Virtual marker x coordinate.
	 */
	int markerX;

	/**
	 * Virtual marker y coordinate.
	 */
	int markerY;

public:

	/**
	 * Default constructor.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 10 Oct 2008
	 */
	TextCanvas(){}

	/**
	 * Canvas getter.
	 *
	 * @param canvas Output canvas matrix.
	 *
	 * @return Visible part of the canvas.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	char** getCanvas(char canvas[WIDTH][HEIGHT]){}

	/**
	 * Canvas setter.
	 *
	 * @param canvas Input canvas matrix.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void setCanvas(final char canvas[WIDTH][HEIGHT]){}

	/**
	 * Get currnet marker x position.
	 *
	 * @return Currnet x position.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 26 Sep 2008
	 */
	int getMarkerX(){}

	/**
	 * Get currnet marker y position.
	 *
	 * @return Currnet y position.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 26 Sep 2008
	 */
	int getMarkerY(){}

	/**
	 * Set single symbol on canvas.
	 *
	 * @param symbol Symbol to be drawn.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 26 Sep 2008
	 */
	void drawSymbol(int index, int x, int y){}

	/**
	 * Set number on canvas.
	 *
	 * @param number Number to be drawn.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 26 Sep 2008
	 */
	void drawNumber(long number, int x, int y, int digits){}

	/**
	 * Set number on canvas.
	 *
	 * @param number Number to be drawn.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 26 Sep 2008
	 */
	void drawNumber(double number, int x, int y, int digits){}

	/**
	 * Set string on canvas.
	 *
	 * @param string String to be drawn.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 26 Sep 2008
	 */
	void drawString(final char* string, int x, int y){}

	/**
	 * Go to given position on canvas. If coordinates are invalid old
	 * coordinates will be used.
	 *
	 * @param x New x position of the marker.
	 *
	 * @param y New y position of the marker.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 26 Sep 2008
	 */
	void goToXy(final int x, final int y){}

	/**
	 * Draw background image.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	void drawBackground(){}

	/**
	 * Clean text canvas.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	void clean(){}

	/**
	 * Print text buffer into console.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void draw(){}
}
