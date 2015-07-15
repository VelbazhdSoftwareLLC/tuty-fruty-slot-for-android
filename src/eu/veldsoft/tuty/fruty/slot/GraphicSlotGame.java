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
 * Slot machine game main class. All game componets are part of this class.
 * Possible screens that slot game class can show are: splash screen, game
 * screen, help screen and pay table screen. It holds information about which
 * screen is being shown at the moment.
 *
 * @author Darina Evtomiva
 *
 * @email aleks_f@abv.bg
 *
 * @date 03 Oct 2008
 */
class GraphicSlotGame : public SlotGame {
public:

	/**
	 * Default constructor.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	GraphicSlotGame();

	/**
	 * Initializing all game visual components.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	virtual void initialize();

	/**
	 * Game loop.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	virtual void loop();

	/**
	 * Finalize the game.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 08 Oct 2008
	 */
	@Override
	virtual void finalize();

	/**
	 * Destructor.
	 *
	 * @author
	 *
	 * @email
	 *
	 * @date
	 */
	~GraphicSlotGame();
};

#endif
