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
 * Implements logic of winner's paid value. Shows how many credits player takes
 * when he met prize combinations in the game. Calculates the win.
 *
 * @author Stanislav Petrov
 *
 * @email devilfighter1806@gmail.com
 *
 * @date 12 Sep 2008
 */
class WinnerPaid {

	/**
	 * Paid value to winner.
	 */
	private long value;

	/**
	 * Bet value used to calculate winner paid value.
	 */
	private Bet bet;

	/**
	 * Source for selected lines.
	 */
	private LinesSelector selector;

	/**
	 * Source for reels state.
	 */
	private Reels reels;

	/**
	 * Pointers to all prizes already found.
	 */
	private final PrizeCombination found[] = new PrizeCombination[LinesSelector.LINES_AVAILABLE];

	/**
	 * Symbols part of the win.
	 */
	private char winSymbol[][] = new char[Reels.COLS][Reels.ROWS];

	
	/**
	 * Clear array with found pointers.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 11 Oct 2008
	 */
	private void clearFound() {
		for (int i = 0; i < LinesSelector.LINES_AVAILABLE; i++) {
			found[i] = null;
		}
		
		for(int i=0; i<winSymbol.length; i++) {
			for(int j=0; j<winSymbol[i].length; j++) {
				winSymbol[i][j] = 0;
			}			
		}
	}

	/**
	 * Add found prize to array with already found prizes.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 11 Oct 2008
	 */
	private void addFound(final PrizeCombination prize) {
		char mask[][] = prize.getCombination().getMask();
		
		for(int i=0; i<winSymbol.length; i++) {
			for(int j=0; j<winSymbol[i].length; j++) {
				winSymbol[i][j] |= mask[i][j];
			}			
		}
		
		for (int i = 0; i < LinesSelector.LINES_AVAILABLE; i++) {
			if (found[i] == null) {
				found[i] = prize;

				break;
			}
		}
	}

	/**
	 * Check if prize is found in the array.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 11 Oct 2008
	 */
	private boolean isFound(final PrizeCombination prize) {
		for (int i = 0; i < LinesSelector.LINES_AVAILABLE; i++) {
			if (prize != null && found[i] != null
					&& prize.equals(found[i]) == true) {
				return true;
			}
		}

		return false;
	}

	/**
	 * Constructor.
	 *
	 * @param bet
	 *            Source for bet value.
	 *
	 * @param selector
	 *            Gives information about selected lines and their prize
	 *            combinations.
	 *
	 * @param reels
	 *            Source for reels state.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	public WinnerPaid(Bet bet, LinesSelector selector, Reels reels) {
		this.bet = bet;
		this.selector = selector;
		this.reels = reels;
	}

	/**
	 * Winner's paid value getter.
	 *
	 * @return Winner's paid value.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 12 Sep 2008
	 */
	public long getValue() {
		return value;
	}

	/**
	 * Winner's paid value setter.
	 *
	 * @param value
	 *            Winner's paid value.
	 *
	 * @author Stanislav Petrov
	 *
	 * @email devilfighter1806@gmail.com
	 *
	 * @date 12 Sep 2008
	 */
	public void setValue(final long value) {
		this.value = value;
	}

	/**
	 * 
	 * @return
	 */
	public char[][] getWinsMask() {
		return winSymbol;
	}
	
	/**
	 * Calculate winner paid value.
	 *
	 * @return Winner paid value.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 09 Oct 2008
	 */
	public long calculateWin() {
		long sum = 0;

		/*
		 * To escape double calculation of equal configurations.
		 */
		clearFound();

		for (int i = 0; i < LinesSelector.LINES_AVAILABLE; i++) {
			for (int j = 0; j < Reels.TOTAL_NUMBER_OF_SYMBOLS; j++) {
				long highestCoefficient = 0;
				for (int k = 0; k < Prizes.NUMBER_OF_CONFIGURATIONS; k++) {
					PrizeCombination combination = LinesSelector.CORRESPONDANCE[i][j][k];

					if (selector.isActive(combination) == true
							&& reels.hasPrize(combination)
							&& highestCoefficient <= combination
									.getCoefficient()
							&& isFound(combination) == false) {
						highestCoefficient = combination.getCoefficient();
						addFound(combination);
					}
				}

				/*
				 * Sum only the highest prize.
				 */
				sum += (long) ((double) bet.getValue()
						* (double) highestCoefficient * LinesSelector.LINES_MULTIPLIERS[selector
						.numberOfSelectedLines()]);
			}
		}

		return sum;
	}
}
