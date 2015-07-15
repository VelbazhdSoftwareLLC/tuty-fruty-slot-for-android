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
 * Implements logic of the credits.
 * Player has credits to set bet value per line.
 * Gives information to player about the credit amount he has.
 * Credit is incremented when player puts some cash for additional credit.
 * When the player bets a value per line the credit is decremented with the relevant amount.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 11 Sep 2008
 */
class Credit : public VisualComponent {
private:

	/**
	 * Credit value.
	 */
	long value;

public:

	/**
	 * Credit value getter.
	 *
	 * @return Value of credit.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	long getValue() const;

	/**
	 * Credit value setter.
	 *
	 * @param value Value of credit.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	void setValue(const long value);

	/**
	 * Increment credit value.
	 * Incrementation is done by amount.
	 * Amount is a cash which player puts in the slot machine.
	 *
	 * @param amount Value with which player increment the credit value.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	void increment(const long amount);

	/**
	 * Decrements credit value.
	 * Decrementation is done by amount.
	 * Amount is cash when player takes credits when he wants to get the won credits or
	 * when he wants to bet.
	 *
	 * @param amount
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	void decrement(const long amount);

	/**
	 * Draw credit value.
	 * If credit value is changed it draws the updated credit value.
	 * If credit value has not been changed it draws the unchanged credit value.
	 *
	 * @param canvas Text drawing area pointer.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 19 Sep 2008
	 */
	void draw(Canvas* canvas);
};
