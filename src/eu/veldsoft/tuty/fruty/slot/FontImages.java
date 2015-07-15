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
public:

	/**
	 * Resources directory path used length constant.
	 */
	static const int RESOURCE_PATH_LENGTH = 100;

	/**
	 * Desources direcotry path string.
	 */
	static const char RESOURCE_PATH[RESOURCE_PATH_LENGTH];

	/**
	 * Width of font symbol.
	 */
	static const int WIDTH = 32;

	/**
	 * Height of font symbol.
	 */
	static const int HEIGHT = 32;

	/**
	 * Number of pixels to overlap during text rendering.
	 */
	static const int OVERLAP = 15;

	/**
	 * Digit 0 image.
	 */
	static const SDL_Surface *DIGIT_0;

	/**
	 * Digit 1 image.
	 */
	static const SDL_Surface *DIGIT_1;

	/**
	 * Digit 2 image.
	 */
	static const SDL_Surface *DIGIT_2;

	/**
	 * Digit 3 image.
	 */
	static const SDL_Surface *DIGIT_3;

	/**
	 * Digit 4 image.
	 */
	static const SDL_Surface *DIGIT_4;

	/**
	 * Digit 5 image.
	 */
	static const SDL_Surface *DIGIT_5;

	/**
	 * Digit 6 image.
	 */
	static const SDL_Surface *DIGIT_6;

	/**
	 * Digit 7 image.
	 */
	static const SDL_Surface *DIGIT_7;

	/**
	 * Digit 8 image.
	 */
	static const SDL_Surface *DIGIT_8;

	/**
	 * Digit 9 image.
	 */
	static const SDL_Surface *DIGIT_9;

	/**
	 * Total number of used digits.
	 */
	static const int NUMBER_OF_DIGITS = 10;

	/**
	 * All digits images in a signle array.
	 */
	static const SDL_Surface* DIGITS[ NUMBER_OF_DIGITS ];

	/**
	 * Letter A image.
	 */
	static const SDL_Surface *LETTER_A;

	/**
	 * Letter B image.
	 */
	static const SDL_Surface *LETTER_B;

	/**
	 * Letter C image.
	 */
	static const SDL_Surface *LETTER_C;

	/**
	 * Letter D image.
	 */
	static const SDL_Surface *LETTER_D;

	/**
	 * Letter E image.
	 */
	static const SDL_Surface *LETTER_E;

	/**
	 * Letter F image.
	 */
	static const SDL_Surface *LETTER_F;

	/**
	 * Letter G image.
	 */
	static const SDL_Surface *LETTER_G;

	/**
	 * Letter H image.
	 */
	static const SDL_Surface *LETTER_H;

	/**
	 * Letter I image.
	 */
	static const SDL_Surface *LETTER_I;

	/**
	 * Letter J image.
	 */
	static const SDL_Surface *LETTER_J;

	/**
	 * Letter K image.
	 */
	static const SDL_Surface *LETTER_K;

	/**
	 * Letter L image.
	 */
	static const SDL_Surface *LETTER_L;

	/**
	 * Letter M image.
	 */
	static const SDL_Surface *LETTER_M;

	/**
	 * Letter N image.
	 */
	static const SDL_Surface *LETTER_N;

	/**
	 * Letter O image.
	 */
	static const SDL_Surface *LETTER_O;

	/**
	 * Letter P image.
	 */
	static const SDL_Surface *LETTER_P;

	/**
	 * Letter Q image.
	 */
	static const SDL_Surface *LETTER_Q;

	/**
	 * Letter R image.
	 */
	static const SDL_Surface *LETTER_R;

	/**
	 * Letter S image.
	 */
	static const SDL_Surface *LETTER_S;

	/**
	 * Letter T image.
	 */
	static const SDL_Surface *LETTER_T;

	/**
	 * Letter U image.
	 */
	static const SDL_Surface *LETTER_U;

	/**
	 * Letter V image.
	 */
	static const SDL_Surface *LETTER_V;

	/**
	 * Letter W image.
	 */
	static const SDL_Surface *LETTER_W;

	/**
	 * Letter X image.
	 */
	static const SDL_Surface *LETTER_X;

	/**
	 * Letter Y image.
	 */
	static const SDL_Surface *LETTER_Y;

	/**
	 * Letter Z image.
	 */
	static const SDL_Surface *LETTER_Z;

	/**
	 * Total number of ASCII symbols.
	 */
	static const int NUMBER_OF_ASCII_SYMBOLS = 256;

	/**
	 * All available font symbols images at ASCII positions.
	 */
	static const SDL_Surface* SYMBOLS[ NUMBER_OF_ASCII_SYMBOLS ];

public:

	/**
	 * Extract smaller part of a picture.
	 *
	 * @param fontImage Font sprite image.
	 *
	 * @param buffer Font smaller part image buffer. Memory is allocated inside.
	 *
	 * @param left Smaller part left side coordinate.
	 *
	 * @param top Smaller part top side coordinate.
	 *
	 * @param width Smaller part width.
	 *
	 * @param width Smaller part height.
	 *
	 * @return Extracted image pointer.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 10 May 2009
	 */
	static SDL_Surface* extractImage(SDL_Surface *fontImage, SDL_Surface *buffer, int left, int top, int width, int height);
};
