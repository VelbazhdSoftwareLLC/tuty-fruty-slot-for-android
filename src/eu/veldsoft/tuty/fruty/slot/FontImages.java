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
 * Container of all font images.
 *
 * @author Todor Balabanov
 *
 * @email tdb@tbsoft-bg.com
 *
 * @date 10 May 2009
 */
class FontImages {

	/**
	 * Resources directory path used length constant.
	 */
	public static final int RESOURCE_PATH_LENGTH = 100;

	/**
	 * Desources direcotry path string.
	 */
	public static final String RESOURCE_PATH = "";

	/**
	 * Width of font symbol.
	 */
	public static final int WIDTH = 32;

	/**
	 * Height of font symbol.
	 */
	public static final int HEIGHT = 32;

	/**
	 * Number of pixels to overlap during text rendering.
	 */
	public static final int OVERLAP = 15;

	/**
	 * Digit 0 image.
	 */
	public static final Util.SDL_Surface DIGIT_0 = null;

	/**
	 * Digit 1 image.
	 */
	public static final Util.SDL_Surface DIGIT_1 = null;

	/**
	 * Digit 2 image.
	 */
	public static final Util.SDL_Surface DIGIT_2 = null;

	/**
	 * Digit 3 image.
	 */
	public static final Util.SDL_Surface DIGIT_3 = null;

	/**
	 * Digit 4 image.
	 */
	public static final Util.SDL_Surface DIGIT_4 = null;

	/**
	 * Digit 5 image.
	 */
	public static final Util.SDL_Surface DIGIT_5 = null;

	/**
	 * Digit 6 image.
	 */
	public static final Util.SDL_Surface DIGIT_6 = null;

	/**
	 * Digit 7 image.
	 */
	public static final Util.SDL_Surface DIGIT_7 = null;

	/**
	 * Digit 8 image.
	 */
	public static final Util.SDL_Surface DIGIT_8 = null;

	/**
	 * Digit 9 image.
	 */
	public static final Util.SDL_Surface DIGIT_9 = null;

	/**
	 * Total number of used digits.
	 */
	public static final int NUMBER_OF_DIGITS = 10;

	/**
	 * All digits images in a single array.
	 */
	public static final Util.SDL_Surface DIGITS[] = new Util.SDL_Surface[NUMBER_OF_DIGITS];

	/**
	 * Letter A image.
	 */
	public static final Util.SDL_Surface LETTER_A = null;

	/**
	 * Letter B image.
	 */
	public static final Util.SDL_Surface LETTER_B = null;

	/**
	 * Letter C image.
	 */
	public static final Util.SDL_Surface LETTER_C = null;

	/**
	 * Letter D image.
	 */
	public static final Util.SDL_Surface LETTER_D = null;

	/**
	 * Letter E image.
	 */
	public static final Util.SDL_Surface LETTER_E = null;

	/**
	 * Letter F image.
	 */
	public static final Util.SDL_Surface LETTER_F = null;

	/**
	 * Letter G image.
	 */
	public static final Util.SDL_Surface LETTER_G = null;

	/**
	 * Letter H image.
	 */
	public static final Util.SDL_Surface LETTER_H = null;

	/**
	 * Letter I image.
	 */
	public static final Util.SDL_Surface LETTER_I = null;

	/**
	 * Letter J image.
	 */
	public static final Util.SDL_Surface LETTER_J = null;

	/**
	 * Letter K image.
	 */
	public static final Util.SDL_Surface LETTER_K = null;

	/**
	 * Letter L image.
	 */
	public static final Util.SDL_Surface LETTER_L = null;

	/**
	 * Letter M image.
	 */
	public static final Util.SDL_Surface LETTER_M = null;

	/**
	 * Letter N image.
	 */
	public static final Util.SDL_Surface LETTER_N = null;

	/**
	 * Letter O image.
	 */
	public static final Util.SDL_Surface LETTER_O = null;

	/**
	 * Letter P image.
	 */
	public static final Util.SDL_Surface LETTER_P = null;

	/**
	 * Letter Q image.
	 */
	public static final Util.SDL_Surface LETTER_Q = null;

	/**
	 * Letter R image.
	 */
	public static final Util.SDL_Surface LETTER_R = null;

	/**
	 * Letter S image.
	 */
	public static final Util.SDL_Surface LETTER_S = null;

	/**
	 * Letter T image.
	 */
	public static final Util.SDL_Surface LETTER_T = null;

	/**
	 * Letter U image.
	 */
	public static final Util.SDL_Surface LETTER_U = null;

	/**
	 * Letter V image.
	 */
	public static final Util.SDL_Surface LETTER_V = null;

	/**
	 * Letter W image.
	 */
	public static final Util.SDL_Surface LETTER_W = null;

	/**
	 * Letter X image.
	 */
	public static final Util.SDL_Surface LETTER_X = null;

	/**
	 * Letter Y image.
	 */
	public static final Util.SDL_Surface LETTER_Y = null;

	/**
	 * Letter Z image.
	 */
	public static final Util.SDL_Surface LETTER_Z = null;

	/**
	 * Total number of ASCII symbols.
	 */
	public static final int NUMBER_OF_ASCII_SYMBOLS = 256;

	/**
	 * All available font symbols images at ASCII positions.
	 */
	public static final Util.SDL_Surface SYMBOLS[] = new Util.SDL_Surface[NUMBER_OF_ASCII_SYMBOLS];

	/**
	 * Extract smaller part of a picture.
	 *
	 * @param fontImage
	 *            Font sprite image.
	 *
	 * @param buffer
	 *            Font smaller part image buffer. Memory is allocated inside.
	 *
	 * @param left
	 *            Smaller part left side coordinate.
	 *
	 * @param top
	 *            Smaller part top side coordinate.
	 *
	 * @param width
	 *            Smaller part width.
	 *
	 * @param width
	 *            Smaller part height.
	 *
	 * @return Extracted image pointer.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 10 May 2009
	 */
	public static Util.SDL_Surface extractImage(Util.SDL_Surface fontImage,
			Util.SDL_Surface buffer, int left, int top, int width, int height) {
		return null;
	}
}
