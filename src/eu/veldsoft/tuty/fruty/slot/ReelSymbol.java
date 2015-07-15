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
 * Holds information for reel symbol.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 27 Oct 2008
 */
class ReelSymbol {
public:

	/**
	 * Reel symbol name size.
	 */
	static const int NAME_SIZE = 15;

private:

	/**
	 * Name of reel symbol. Plus one for null at the end.
	 */
	char name[NAME_SIZE + 1];

public:

	/**
	 * Reel symbol constructor.
	 *
	 * @param name Name to be set. Plus one for null at the end.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 27 Oct 2008
	 */
	ReelSymbol(const char name[NAME_SIZE + 1]);

	/**
	 * Reel symbol name getter.
	 *
	 * @param name Name to be set. Plus one for null at the end.
	 *
	 * @return Reel symbol name.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 27 Oct 2008
	 */
	char* getName(char name[NAME_SIZE + 1]) const;
};
