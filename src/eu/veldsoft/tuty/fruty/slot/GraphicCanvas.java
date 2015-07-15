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
 * Simulate drawing components on the video screen. Holds width and height of the
 * drawing field. Draws numbers, symbols on the drawing field with the specified
 * coordinates. Prints text symbols on video screen.
 *
 * @author Todor Balabanov
 *
 * @email tdb@tbsoft-bg.com
 *
 * @date 23 Apr 2009
 */
class GraphicCanvas : public Canvas {
public:

	/**
	 * Width of graphic canvas constant.
	 */
	static const int WIDTH = 640;

	/**
	 * Height of graphic canvas constant.
	 */
	static const int HEIGHT = 480;

public:

	/**
	 * Open graphic mode.
	 *
	 * @return Success of opening true, false otherwise.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 29 Apr 2009
	 */
	static bool open();

	/**
	 * Close graphic mode.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 29 Apr 2009
	 */
	static void close();

private:

	/**
	 * Buffer for drawing.
	 */
	SDL_Surface *canvas;

public:

	/**
	 * Default constructgor.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 29 Apr 2009
	 */
	GraphicCanvas();

	/**
	 * Canvas getter.
	 *
	 * @return SDL canvas pointer.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	SDL_Surface* getCanvas();

	/**
	 * Draw SDL surface on canvas.
	 *
	 * @param surface SDL surface pointer.
	 *
	 * @param x Left side of the number.
	 *
	 * @param y Top side of the number.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 10 May 2009
	 */
	void drawSurface(SDL_Surface *surface, int x, int y);

	/**
	 * Set string on canvas.
	 *
	 * @param index Game symbols array index.
	 *
	 * @param string String to be drawn.
	 *
	 * @param x Left side of the string.
	 *
	 * @param y Top side of the string.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	void drawSymbol(int index, int x, int y);

	/**
	 * Draw number on canvas.
	 *
	 * @param number Number to be drawn.
	 *
	 * @param x Left side of the number.
	 *
	 * @param y Top side of the number.
	 *
	 * @param digits Maximum number of digits.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 10 May 2009
	 */
	void drawNumber(long number, int x, int y, int digits);

	/**
	 * Draw number on canvas.
	 *
	 * @param number Number to be drawn.
	 *
	 * @param x Left side of the number.
	 *
	 * @param y Top side of the number.
	 *
	 * @param digits Maximum number of digits.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	void drawNumber(double number, int x, int y, int digits);

	/**
	 * Set string on canvas.
	 *
	 * @param string String to be drawn.
	 *
	 * @param x Left side of the string.
	 *
	 * @param y Top side of the string.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	void drawString(const char* string, int x, int y);

	/**
	 * Draw background image.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	void drawBackground();

	/**
	 * Clean graphic canvas.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 10 May 2009
	 */
	void clean();

	/**
	 * Draw double buffer on the screen.
	 *
	 * @author Nikolay Dimitrov
	 *
	 * @email nikidimi@gmail.com
	 *
	 * @date 10 May 2009
	 */
	void draw();

	/**
	 * Destructor.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	~GraphicCanvas();
};
