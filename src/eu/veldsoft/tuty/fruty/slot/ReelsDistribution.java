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
 * Implements the testing of the symbols' combination.
 * Fills the reels with special arranging of symbols.
 * As a result it holds symbol's distribution on every reel.
 * Holds number of elements of every reel.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 08 Sep 2008
 */
class ReelsDistribution : public ReelsBase {
public:

	/**
	 * Number of symbols of a virtual reel.
	 */
	static const int DISTRIBUTION_SIZE = 256;

	/**
	 * Virtual reels, containing ordered symbols.
	 */
	static const ReelSymbol* DISTRIBUTION[ReelsBase::COLS][DISTRIBUTION_SIZE];

public:

	/**
	 * Select random symbols from virtual reels' distribution.
	 * Fill the visible part of reels with randomly choosed symbols from
	 * virtual reels distribution.
	 * Initialize every mechanic reel with three subsequent symbols from
	 * virtual reel's distribution.
	 *
	 * @param symbols Contain random symbols.
	 *
	 * @return Selected random symbols from distribution.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 09 Sep 2008
	 */
	void selectRandomSymbols(ReelSymbol* symbols[ReelsBase::COLS][ReelsBase::ROWS]);
};
