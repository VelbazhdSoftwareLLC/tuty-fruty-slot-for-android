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
 * Container of background image.
 *
 * @author Todor Balabanov
 *
 * @email tdb@tbsoft-bg.com
 *
 * @date 21 May 2009
 */
class BackgroundImage {
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
	 * Width of background.
	 */
	static const int WIDTH = 0;

	/**
	 * Height of background.
	 */
	static const int HEIGHT = 0;

	/**
	 * Background image.
	 */
	static const SDL_Surface *BACKGROUND;
};
