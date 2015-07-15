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
 * Implement the logic of Game simulation. Control configuration which manage
 * the game. Contain static variable which take care for turning on the
 * simulation.
 *
 * @author Darina Evtimova
 *
 * @email aleks_f@abv.bg
 *
 * @date 02 Oct 2008
 */
class GameConfig {
public:

	/**
	 * Text mode constant.
	 */
	static const int TEXT_MODE = 1;

	/**
	 * Graphic mode constant.
	 */
	static const int GRAPHIC_MODE = 2;

	/**
	 * Game vizualization mode.
	 */
	static int videoMode;

	/**
	 * Control game simulation.
	 */
	static bool simulation;

public:

	/**
	 * Changes value of the variable that controls game simulation.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 26 Oct 2008
	 */
	static void switchSimulation();
};
