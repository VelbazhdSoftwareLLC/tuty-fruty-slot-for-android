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
 * Container of all slot symbols images.
 *
 * @author Todor Balabanov
 *
 * @email tdb@tbsoft-bg.com
 *
 * @date 14 May 2009
 */
class SymbolsImages {

	/**
	 * Resources directory path used length constant.
	 */
	public static final int RESOURCE_PATH_LENGTH = 100;

	/**
	 * Desources direcotry path string.
	 */
	public static final String RESOURCE_PATH = "";

	/**
	 * Width of slot symbol.
	 */
	public static final int WIDTH = 75;

	/**
	 * Height of slot symbol.
	 */
	public static final int HEIGHT = 63;

	/**
	 * Regular slot symbol 0 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_00 = null;

	/**
	 * Regular slot symbol 1 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_01 = null;

	/**
	 * Regular slot symbol 2 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_02 = null;

	/**
	 * Regular slot symbol 3 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_03 = null;

	/**
	 * Regular slot symbol 4 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_04 = null;

	/**
	 * Regular slot symbol 5 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_05 = null;

	/**
	 * Regular slot symbol 6 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_06 = null;

	/**
	 * Regular slot symbol 7 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_07 = null;

	/**
	 * Regular slot symbol 8 image.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOL_08 = null;

	/**
	 * Special slot symbol 0 image.
	 */
	public static final Util.SDL_Surface SPECIAL_SYMBOL_00 = null;

	/**
	 * Number of regular slot symbols.
	 */
	public static final int NUMBER_OF_REGULAR_SYMBOLS = 9;

	/**
	 * Regular slot symbols images.
	 */
	public static final Util.SDL_Surface REGULAR_SYMBOLS[] = new Util.SDL_Surface[NUMBER_OF_REGULAR_SYMBOLS];

	/**
	 * Number of special slot symbols.
	 */
	public static final int NUMBER_OF_SPECIAL_SYMBOLS = 1;

	/**
	 * Special slot symbols images.
	 */
	public static final Util.SDL_Surface SPECIAL_SYMBOLS[] = new Util.SDL_Surface[NUMBER_OF_SPECIAL_SYMBOLS];

	/**
	 * Total number of slot symbols.
	 */
	public static final int NUMBER_OF_SLOT_SYMBOLS = NUMBER_OF_REGULAR_SYMBOLS
			+ NUMBER_OF_SPECIAL_SYMBOLS;

	/**
	 * All available slot symbols images.
	 */
	public static final Util.SDL_Surface SYMBOLS[] = new Util.SDL_Surface[NUMBER_OF_SLOT_SYMBOLS];

	public static Util.SDL_Surface extractImage(Util.SDL_Surface image,
			Util.SDL_Surface buffer, int left, int top, int width, int height) {
		return null;
	}
}
