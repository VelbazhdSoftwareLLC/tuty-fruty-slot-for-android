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
 * Presents game play screen. Constructing and initialize all visual components
 * which are part of the screen. It contains information about all
 * xy-coordinates of game components and their width and height. Takes care of
 * selecting lines, changing the bet, adding credit. It responds to spinning the
 * reels.
 *
 * @author Anton Dimitrov
 *
 * @email anton.naskov@gmail.com
 *
 * @date 06 Oct 2008
 */
class GameScreen {

	/**
	 * Visual reels component.
	 */
	protected Reels reels = null;

	/**
	 * Visual lines selector component.
	 */
	protected LinesSelector selector = null;

	/**
	 * Visual component which shows bet value.
	 */
	protected Bet bet = null;

	/**
	 * Visual component which shows how many lines are selected.
	 */
	protected LinesSelected lines = null;

	/**
	 * Visual component which shows total bet value.
	 */
	protected TotalBet total = null;

	/**
	 * Visual component which shows how many credits are won.
	 */
	protected WinnerPaid paid = null;

	/**
	 * Visual components which shows credit.
	 */
	protected Credit credit = null;

	/**
	 * Constructor.
	 *
	 * @param canvas
	 *            Visual components in game screen will be drawn on text canvas.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 06 Oct 2008
	 */
	public GameScreen() {
		reels = new Reels();
		selector = new LinesSelector();
		bet = new Bet();
		lines = new LinesSelected(selector);
		total = new TotalBet(bet, lines);
		paid = new WinnerPaid(bet, selector, reels);
		credit = new Credit();
	}

	public Reels getReels() {
		return reels;
	}

	public void setReels(Reels reels) {
		this.reels = reels;
	}

	public LinesSelected getLines() {
		return lines;
	}

	public void setLines(LinesSelected lines) {
		this.lines = lines;
	}

	public TotalBet getTotal() {
		return total;
	}

	public void setTotal(TotalBet total) {
		this.total = total;
	}

	public WinnerPaid getPaid() {
		return paid;
	}

	public void setPaid(WinnerPaid paid) {
		this.paid = paid;
	}

	public Credit getCredit() {
		return credit;
	}

	public void setCredit(Credit credit) {
		this.credit = credit;
	}

	public void setSelector(LinesSelector selector) {
		this.selector = selector;
	}

	public void setBet(Bet bet) {
		this.bet = bet;
	}

	/**
	 * Bet getter.
	 *
	 * @return bet Bet pointer.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 26 Oct 2008
	 */
	public Bet getBet() {
		return bet;
	}

	/**
	 * Lines selector getter.
	 *
	 * @return selector Lines selector pointer.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 26 Oct 2008
	 */
	public LinesSelector getSelector() {
		return selector;
	}

	/**
	 * User changed number of lines from the outside world.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void numberOfLinesChange() {
		selector.linesUp();
		total.update();
	}

	/**
	 * User changed bet from the outside world.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void betChange() {
		bet.cycleIncrement();
		total.update();
	}

	/**
	 * 
	 */
	public void maxBetChange() {
		bet.maximum();
		selector.maximum();
		total.update();
	}

	/**
	 * User added credit from the outside world.
	 *
	 * @param amount
	 *            Amount to be added.
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void addCredit(final long amount) {
		credit.increment(amount);
	}

	/**
	 * Spin reels components on the game screen.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	public void spinReels() {
		/*
		 * User is able to spin only with enough credit.
		 */
		if (credit.getValue() >= total.getValue()) {
			/*
			 * Take bet from the credit before to spin the reels.
			 */
			credit.decrement(total.getValue());

			reels.spin();

			/*
			 * Winner paid can be changed faster and because of this win should
			 * be written in temporary variable.
			 */
			long money = paid.calculateWin();
			paid.setValue(money);
			addCredit(money);
		} else {
			// TODO Write not enough credit message.
		}
	}
}
