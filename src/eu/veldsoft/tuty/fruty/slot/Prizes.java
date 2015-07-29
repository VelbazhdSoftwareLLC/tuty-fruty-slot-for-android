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
 * Implements the logic of prizes. Holds all possible prize combinations of
 * every symbol for all available lines and their names. Holds number of all
 * prize combinations. Uses for checking if given combination is equal to one of
 * these prize combinations.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 12 Sep 2008
 */
class Prizes {

	/**
	 * Prize combination 1 constant.
	 */
	public static final PrizeCombination COMBINATION_001_SYMBOL_01_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	/**
	 * Prize combination 2 constant.
	 */
	public static final PrizeCombination COMBINATION_002_SYMBOL_01_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	/**
	 * Prize combination 3 constant.
	 */
	public static final PrizeCombination COMBINATION_003_SYMBOL_01_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	/**
	 * Prize combination 4 constant.
	 */
	public static final PrizeCombination COMBINATION_004_SYMBOL_01_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	/**
	 * Prize combination 5 constant.
	 */
	public static final PrizeCombination COMBINATION_005_SYMBOL_01_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			2 * 2, "Symbol 01 x 2");

	/**
	 * Prize combination 6 constant.
	 */
	public static final PrizeCombination COMBINATION_006_SYMBOL_01_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	/**
	 * Prize combination 7 constant.
	 */
	public static final PrizeCombination COMBINATION_007_SYMBOL_01_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	/**
	 * Prize combination 8 constant.
	 */
	public static final PrizeCombination COMBINATION_008_SYMBOL_01_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	/**
	 * Prize combination 9 constant.
	 */
	public static final PrizeCombination COMBINATION_009_SYMBOL_01_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	/**
	 * Prize combination 10 constant.
	 */
	public static final PrizeCombination COMBINATION_010_SYMBOL_01_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			3 * 2, "Symbol 01 x 3");

	/**
	 * Prize combination 11 constant.
	 */
	public static final PrizeCombination COMBINATION_011_SYMBOL_01_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 12 constant.
	 */
	public static final PrizeCombination COMBINATION_012_SYMBOL_01_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 13 constant.
	 */
	public static final PrizeCombination COMBINATION_013_SYMBOL_01_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 14 constant.
	 */
	public static final PrizeCombination COMBINATION_014_SYMBOL_01_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 15 constant.
	 */
	public static final PrizeCombination COMBINATION_015_SYMBOL_01_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 16 constant.
	 */
	public static final PrizeCombination COMBINATION_016_SYMBOL_01_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 17 constant.
	 */
	public static final PrizeCombination COMBINATION_017_SYMBOL_01_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 18 constant.
	 */
	public static final PrizeCombination COMBINATION_018_SYMBOL_01_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 19 constant.
	 */
	public static final PrizeCombination COMBINATION_019_SYMBOL_01_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_01,
			4 * 2, "Symbol 01 x 4");

	/**
	 * Prize combination 20 constant.
	 */
	public static final PrizeCombination COMBINATION_020_SYMBOL_01_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 21 constant.
	 */
	public static final PrizeCombination COMBINATION_021_SYMBOL_01_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 22 constant.
	 */
	public static final PrizeCombination COMBINATION_022_SYMBOL_01_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 23 constant.
	 */
	public static final PrizeCombination COMBINATION_023_SYMBOL_01_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 24 constant.
	 */
	public static final PrizeCombination COMBINATION_024_SYMBOL_01_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 25 constant.
	 */
	static final PrizeCombination COMBINATION_025_SYMBOL_01_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 26 constant.
	 */
	static final PrizeCombination COMBINATION_026_SYMBOL_01_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 27 constant.
	 */
	public static final PrizeCombination COMBINATION_027_SYMBOL_01_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 28 constant.
	 */
	public static final PrizeCombination COMBINATION_028_SYMBOL_01_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_01,
			5 * 2, "Symbol 01 x 5");

	/**
	 * Prize combination 29 constant.
	 */
	public static final PrizeCombination COMBINATION_029_SYMBOL_02_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	/**
	 * Prize combination 30 constant.
	 */
	public static final PrizeCombination COMBINATION_030_SYMBOL_02_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	/**
	 * Prize combination 31 constant.
	 */
	public static final PrizeCombination COMBINATION_031_SYMBOL_02_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	/**
	 * Prize combination 32 constant.
	 */
	public static final PrizeCombination COMBINATION_032_SYMBOL_02_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	/**
	 * Prize combination 33 constant.
	 */
	public static final PrizeCombination COMBINATION_033_SYMBOL_02_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			3 * 2, "Symbol 02 x 2");

	/**
	 * Prize combination 34 constant.
	 */
	public static final PrizeCombination COMBINATION_034_SYMBOL_02_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	/**
	 * Prize combination 35 constant.
	 */
	public static final PrizeCombination COMBINATION_035_SYMBOL_02_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	/**
	 * Prize combination 36 constant.
	 */
	public static final PrizeCombination COMBINATION_036_SYMBOL_02_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	/**
	 * Prize combination 37 constant.
	 */
	public static final PrizeCombination COMBINATION_037_SYMBOL_02_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	/**
	 * Prize combination 38 constant.
	 */
	public static final PrizeCombination COMBINATION_038_SYMBOL_02_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			4 * 2, "Symbol 02 x 3");

	/**
	 * Prize combination 39 constant.
	 */
	public static final PrizeCombination COMBINATION_039_SYMBOL_02_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");
	/**
	 * Prize combination 40 constant.
	 */
	public static final PrizeCombination COMBINATION_040_SYMBOL_02_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 41 constant.
	 */
	public static final PrizeCombination COMBINATION_041_SYMBOL_02_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 42 constant.
	 */
	public static final PrizeCombination COMBINATION_042_SYMBOL_02_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 43 constant.
	 */
	public static final PrizeCombination COMBINATION_043_SYMBOL_02_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 44 constant.
	 */
	public static final PrizeCombination COMBINATION_044_SYMBOL_02_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 45 constant.
	 */
	public static final PrizeCombination COMBINATION_045_SYMBOL_02_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 46 constant.
	 */
	public static final PrizeCombination COMBINATION_046_SYMBOL_02_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 47 constant.
	 */
	public static final PrizeCombination COMBINATION_047_SYMBOL_02_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_02,
			5 * 2, "Symbol 02 x 4");

	/**
	 * Prize combination 48 constant.
	 */
	public static final PrizeCombination COMBINATION_048_SYMBOL_02_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 49 constant.
	 */
	public static final PrizeCombination COMBINATION_049_SYMBOL_02_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");
	/**
	 * Prize combination 50 constant.
	 */
	public static final PrizeCombination COMBINATION_050_SYMBOL_02_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 51 constant.
	 */
	public static final PrizeCombination COMBINATION_051_SYMBOL_02_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 52 constant.
	 */
	public static final PrizeCombination COMBINATION_052_SYMBOL_02_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 53 constant.
	 */
	public static final PrizeCombination COMBINATION_053_SYMBOL_02_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 54 constant.
	 */
	public static final PrizeCombination COMBINATION_054_SYMBOL_02_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 55 constant.
	 */
	public static final PrizeCombination COMBINATION_055_SYMBOL_02_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 56 constant.
	 */
	public static final PrizeCombination COMBINATION_056_SYMBOL_02_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_02,
			6 * 2, "Symbol 02 x 5");

	/**
	 * Prize combination 57 constant.
	 */
	public static final PrizeCombination COMBINATION_057_SYMBOL_03_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	/**
	 * Prize combination 58 constant.
	 */
	public static final PrizeCombination COMBINATION_058_SYMBOL_03_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	/**
	 * Prize combination 59 constant.
	 */
	public static final PrizeCombination COMBINATION_059_SYMBOL_03_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	/**
	 * Prize combination 60 constant.
	 */
	public static final PrizeCombination COMBINATION_060_SYMBOL_03_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	/**
	 * Prize combination 61 constant.
	 */
	public static final PrizeCombination COMBINATION_061_SYMBOL_03_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			4 * 2, "Symbol 03 x 2");

	/**
	 * Prize combination 62 constant.
	 */
	public static final PrizeCombination COMBINATION_062_SYMBOL_03_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	/**
	 * Prize combination 63 constant.
	 */
	public static final PrizeCombination COMBINATION_063_SYMBOL_03_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	/**
	 * Prize combination 64 constant.
	 */
	public static final PrizeCombination COMBINATION_064_SYMBOL_03_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	/**
	 * Prize combination 65 constant.
	 */
	public static final PrizeCombination COMBINATION_065_SYMBOL_03_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	/**
	 * Prize combination 66 constant.
	 */
	public static final PrizeCombination COMBINATION_066_SYMBOL_03_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			5 * 2, "Symbol 03 x 3");

	/**
	 * Prize combination 67 constant.
	 */
	public static final PrizeCombination COMBINATION_067_SYMBOL_03_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 68 constant.
	 */
	public static final PrizeCombination COMBINATION_068_SYMBOL_03_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 69 constant.
	 */
	public static final PrizeCombination COMBINATION_069_SYMBOL_03_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 70 constant.
	 */
	public static final PrizeCombination COMBINATION_070_SYMBOL_03_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 71 constant.
	 */
	public static final PrizeCombination COMBINATION_071_SYMBOL_03_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 72 constant.
	 */
	public static final PrizeCombination COMBINATION_072_SYMBOL_03_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 73 constant.
	 */
	public static final PrizeCombination COMBINATION_073_SYMBOL_03_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 74 constant.
	 */
	public static final PrizeCombination COMBINATION_074_SYMBOL_03_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 75 constant.
	 */
	public static final PrizeCombination COMBINATION_075_SYMBOL_03_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_03,
			6 * 2, "Symbol 03 x 4");

	/**
	 * Prize combination 76 constant.
	 */
	public static final PrizeCombination COMBINATION_076_SYMBOL_03_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 77 constant.
	 */
	public static final PrizeCombination COMBINATION_077_SYMBOL_03_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 78 constant.
	 */
	public static final PrizeCombination COMBINATION_078_SYMBOL_03_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 79 constant.
	 */
	public static final PrizeCombination COMBINATION_079_SYMBOL_03_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 80 constant.
	 */
	public static final PrizeCombination COMBINATION_080_SYMBOL_03_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 81 constant.
	 */
	public static final PrizeCombination COMBINATION_081_SYMBOL_03_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 82 constant.
	 */
	public static final PrizeCombination COMBINATION_082_SYMBOL_03_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 83 constant.
	 */
	public static final PrizeCombination COMBINATION_083_SYMBOL_03_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 84 constant.
	 */
	public static final PrizeCombination COMBINATION_084_SYMBOL_03_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_03,
			7 * 2, "Symbol 03 x 5");

	/**
	 * Prize combination 85 constant.
	 */
	public static final PrizeCombination COMBINATION_085_SYMBOL_04_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	/**
	 * Prize combination 86 constant.
	 */
	public static final PrizeCombination COMBINATION_086_SYMBOL_04_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	/**
	 * Prize combination 87 constant.
	 */
	public static final PrizeCombination COMBINATION_087_SYMBOL_04_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	/**
	 * Prize combination 88 constant.
	 */
	public static final PrizeCombination COMBINATION_088_SYMBOL_04_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");

	/**
	 * Prize combination 89 constant.
	 */
	public static final PrizeCombination COMBINATION_089_SYMBOL_04_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			5 * 2, "Symbol 04 x 2");
	/**
	 * Prize combination 90 constant.
	 */
	public static final PrizeCombination COMBINATION_090_SYMBOL_04_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	/**
	 * Prize combination 91 constant.
	 */
	public static final PrizeCombination COMBINATION_091_SYMBOL_04_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	/**
	 * Prize combination 92 constant.
	 */
	public static final PrizeCombination COMBINATION_092_SYMBOL_04_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	/**
	 * Prize combination 93 constant.
	 */
	public static final PrizeCombination COMBINATION_093_SYMBOL_04_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	/**
	 * Prize combination 94 constant.
	 */
	public static final PrizeCombination COMBINATION_094_SYMBOL_04_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			6 * 2, "Symbol 04 x 3");

	/**
	 * Prize combination 95 constant.
	 */
	public static final PrizeCombination COMBINATION_095_SYMBOL_04_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 96 constant.
	 */
	public static final PrizeCombination COMBINATION_096_SYMBOL_04_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 97 constant.
	 */
	public static final PrizeCombination COMBINATION_097_SYMBOL_04_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 98 constant.
	 */
	public static final PrizeCombination COMBINATION_098_SYMBOL_04_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 99 constant.
	 */
	public static final PrizeCombination COMBINATION_099_SYMBOL_04_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 100 constant.
	 */
	public static final PrizeCombination COMBINATION_100_SYMBOL_04_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 101 constant.
	 */
	public static final PrizeCombination COMBINATION_101_SYMBOL_04_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 102 constant.
	 */
	public static final PrizeCombination COMBINATION_102_SYMBOL_04_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 103 constant.
	 */
	public static final PrizeCombination COMBINATION_103_SYMBOL_04_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_04,
			7 * 2, "Symbol 04 x 4");

	/**
	 * Prize combination 104 constant.
	 */
	public static final PrizeCombination COMBINATION_104_SYMBOL_04_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 105 constant.
	 */
	public static final PrizeCombination COMBINATION_105_SYMBOL_04_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 106 constant.
	 */
	public static final PrizeCombination COMBINATION_106_SYMBOL_04_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 107 constant.
	 */
	public static final PrizeCombination COMBINATION_107_SYMBOL_04_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 108 constant.
	 */
	public static final PrizeCombination COMBINATION_108_SYMBOL_04_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 109 constant.
	 */
	public static final PrizeCombination COMBINATION_109_SYMBOL_04_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 110 constant.
	 */
	public static final PrizeCombination COMBINATION_110_SYMBOL_04_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 111 constant.
	 */
	public static final PrizeCombination COMBINATION_111_SYMBOL_04_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 112 constant.
	 */
	public static final PrizeCombination COMBINATION_112_SYMBOL_04_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_04,
			8 * 2, "Symbol 04 x 5");

	/**
	 * Prize combination 113 constant.
	 */
	public static final PrizeCombination COMBINATION_113_SYMBOL_05_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	/**
	 * Prize combination 114 constant.
	 */
	public static final PrizeCombination COMBINATION_114_SYMBOL_05_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	/**
	 * Prize combination 115 constant.
	 */
	public static final PrizeCombination COMBINATION_115_SYMBOL_05_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	/**
	 * Prize combination 116 constant.
	 */
	public static final PrizeCombination COMBINATION_116_SYMBOL_05_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	/**
	 * Prize combination 117 constant.
	 */
	public static final PrizeCombination COMBINATION_117_SYMBOL_05_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			6 * 2, "Symbol 05 x 2");

	/**
	 * Prize combination 118 constant.
	 */
	public static final PrizeCombination COMBINATION_118_SYMBOL_05_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	/**
	 * Prize combination 119 constant.
	 */
	public static final PrizeCombination COMBINATION_119_SYMBOL_05_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	/**
	 * Prize combination 120 constant.
	 */
	public static final PrizeCombination COMBINATION_120_SYMBOL_05_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	/**
	 * Prize combination 121 constant.
	 */
	public static final PrizeCombination COMBINATION_121_SYMBOL_05_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	/**
	 * Prize combination 122 constant.
	 */
	public static final PrizeCombination COMBINATION_122_SYMBOL_05_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			7 * 2, "Symbol 05 x 3");

	/**
	 * Prize combination 123 constant.
	 */
	public static final PrizeCombination COMBINATION_123_SYMBOL_05_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 124 constant.
	 */
	public static final PrizeCombination COMBINATION_124_SYMBOL_05_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 125 constant.
	 */
	public static final PrizeCombination COMBINATION_125_SYMBOL_05_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 126 constant.
	 */
	public static final PrizeCombination COMBINATION_126_SYMBOL_05_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 127 constant.
	 */
	public static final PrizeCombination COMBINATION_127_SYMBOL_05_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 128 constant.
	 */
	public static final PrizeCombination COMBINATION_128_SYMBOL_05_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 129 constant.
	 */
	public static final PrizeCombination COMBINATION_129_SYMBOL_05_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 130 constant.
	 */
	public static final PrizeCombination COMBINATION_130_SYMBOL_05_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 131 constant.
	 */
	public static final PrizeCombination COMBINATION_131_SYMBOL_05_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_05,
			8 * 2, "Symbol 05 x 4");

	/**
	 * Prize combination 132 constant.
	 */
	public static final PrizeCombination COMBINATION_132_SYMBOL_05_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 133 constant.
	 */
	public static final PrizeCombination COMBINATION_133_SYMBOL_05_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 134 constant.
	 */
	public static final PrizeCombination COMBINATION_134_SYMBOL_05_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 135 constant.
	 */
	public static final PrizeCombination COMBINATION_135_SYMBOL_05_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 136 constant.
	 */
	public static final PrizeCombination COMBINATION_136_SYMBOL_05_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 137 constant.
	 */
	public static final PrizeCombination COMBINATION_137_SYMBOL_05_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 138 constant.
	 */
	public static final PrizeCombination COMBINATION_138_SYMBOL_05_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 139 constant.
	 */
	public static final PrizeCombination COMBINATION_139_SYMBOL_05_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 140 constant.
	 */
	public static final PrizeCombination COMBINATION_140_SYMBOL_05_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_05,
			9 * 2, "Symbol 05 x 5");

	/**
	 * Prize combination 141 constant.
	 */
	public static final PrizeCombination COMBINATION_141_SYMBOL_06_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	/**
	 * Prize combination 142 constant.
	 */
	public static final PrizeCombination COMBINATION_142_SYMBOL_06_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	/**
	 * Prize combination 143 constant.
	 */
	public static final PrizeCombination COMBINATION_143_SYMBOL_06_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	/**
	 * Prize combination 144 constant.
	 */
	public static final PrizeCombination COMBINATION_144_SYMBOL_06_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	/**
	 * Prize combination 145 constant.
	 */
	public static final PrizeCombination COMBINATION_145_SYMBOL_06_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			7 * 2, "Symbol 06 x 2");

	/**
	 * Prize combination 146 constant.
	 */
	public static final PrizeCombination COMBINATION_146_SYMBOL_06_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	/**
	 * Prize combination 147 constant.
	 */
	public static final PrizeCombination COMBINATION_147_SYMBOL_06_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	/**
	 * Prize combination 148 constant.
	 */
	public static final PrizeCombination COMBINATION_148_SYMBOL_06_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	/**
	 * Prize combination 149 constant.
	 */
	public static final PrizeCombination COMBINATION_149_SYMBOL_06_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	/**
	 * Prize combination 150 constant.
	 */
	public static final PrizeCombination COMBINATION_150_SYMBOL_06_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			8 * 2, "Symbol 06 x 3");

	/**
	 * Prize combination 151 constant.
	 */
	public static final PrizeCombination COMBINATION_151_SYMBOL_06_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 152 constant.
	 */
	public static final PrizeCombination COMBINATION_152_SYMBOL_06_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 153 constant.
	 */
	public static final PrizeCombination COMBINATION_153_SYMBOL_06_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 154 constant.
	 */
	public static final PrizeCombination COMBINATION_154_SYMBOL_06_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 155 constant.
	 */
	public static final PrizeCombination COMBINATION_155_SYMBOL_06_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 156 constant.
	 */
	public static final PrizeCombination COMBINATION_156_SYMBOL_06_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 157 constant.
	 */
	public static final PrizeCombination COMBINATION_157_SYMBOL_06_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 158 constant.
	 */
	public static final PrizeCombination COMBINATION_158_SYMBOL_06_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 159 constant.
	 */
	public static final PrizeCombination COMBINATION_159_SYMBOL_06_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_06,
			9 * 2, "Symbol 06 x 4");

	/**
	 * Prize combination 160 constant.
	 */
	public static final PrizeCombination COMBINATION_160_SYMBOL_06_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 161 constant.
	 */
	public static final PrizeCombination COMBINATION_161_SYMBOL_06_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 162 constant.
	 */
	public static final PrizeCombination COMBINATION_162_SYMBOL_06_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 163 constant.
	 */
	public static final PrizeCombination COMBINATION_163_SYMBOL_06_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 164 constant.
	 */
	public static final PrizeCombination COMBINATION_164_SYMBOL_06_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 165 constant.
	 */
	public static final PrizeCombination COMBINATION_165_SYMBOL_06_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 166 constant.
	 */
	public static final PrizeCombination COMBINATION_166_SYMBOL_06_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 167 constant.
	 */
	public static final PrizeCombination COMBINATION_167_SYMBOL_06_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 168 constant.
	 */
	public static final PrizeCombination COMBINATION_168_SYMBOL_06_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_06,
			10 * 2, "Symbol 06 x 5");

	/**
	 * Prize combination 169 constant.
	 */
	public static final PrizeCombination COMBINATION_169_SYMBOL_07_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	/**
	 * Prize combination 170 constant.
	 */
	public static final PrizeCombination COMBINATION_170_SYMBOL_07_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	/**
	 * Prize combination 171 constant.
	 */
	public static final PrizeCombination COMBINATION_171_SYMBOL_07_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	/**
	 * Prize combination 172 constant.
	 */
	public static final PrizeCombination COMBINATION_172_SYMBOL_07_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	/**
	 * Prize combination 173 constant.
	 */
	public static final PrizeCombination COMBINATION_173_SYMBOL_07_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			8 * 2, "Symbol 07 x 2");

	/**
	 * Prize combination 174 constant.
	 */
	public static final PrizeCombination COMBINATION_174_SYMBOL_07_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	/**
	 * Prize combination 175 constant.
	 */
	public static final PrizeCombination COMBINATION_175_SYMBOL_07_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	/**
	 * Prize combination 176 constant.
	 */
	public static final PrizeCombination COMBINATION_176_SYMBOL_07_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	/**
	 * Prize combination 177 constant.
	 */
	public static final PrizeCombination COMBINATION_177_SYMBOL_07_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	/**
	 * Prize combination 178 constant.
	 */
	public static final PrizeCombination COMBINATION_178_SYMBOL_07_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			9 * 2, "Symbol 07 x 3");

	/**
	 * Prize combination 179 constant.
	 */
	public static final PrizeCombination COMBINATION_179_SYMBOL_07_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 180 constant.
	 */
	public static final PrizeCombination COMBINATION_180_SYMBOL_07_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 181 constant.
	 */
	public static final PrizeCombination COMBINATION_181_SYMBOL_07_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 182 constant.
	 */
	public static final PrizeCombination COMBINATION_182_SYMBOL_07_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 183 constant.
	 */
	public static final PrizeCombination COMBINATION_183_SYMBOL_07_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 184 constant.
	 */
	public static final PrizeCombination COMBINATION_184_SYMBOL_07_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 185 constant.
	 */
	public static final PrizeCombination COMBINATION_185_SYMBOL_07_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 186 constant.
	 */
	public static final PrizeCombination COMBINATION_186_SYMBOL_07_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 187 constant.
	 */
	public static final PrizeCombination COMBINATION_187_SYMBOL_07_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_07,
			10 * 2, "Symbol 07 x 4");

	/**
	 * Prize combination 188 constant.
	 */
	public static final PrizeCombination COMBINATION_188_SYMBOL_07_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 189 constant.
	 */
	public static final PrizeCombination COMBINATION_189_SYMBOL_07_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 190 constant.
	 */
	public static final PrizeCombination COMBINATION_190_SYMBOL_07_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 191 constant.
	 */
	public static final PrizeCombination COMBINATION_191_SYMBOL_07_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 192 constant.
	 */
	public static final PrizeCombination COMBINATION_192_SYMBOL_07_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 193 constant.
	 */
	public static final PrizeCombination COMBINATION_193_SYMBOL_07_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 194 constant.
	 */
	public static final PrizeCombination COMBINATION_194_SYMBOL_07_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 195 constant.
	 */
	public static final PrizeCombination COMBINATION_195_SYMBOL_07_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 196 constant.
	 */
	public static final PrizeCombination COMBINATION_196_SYMBOL_07_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_07,
			11 * 2, "Symbol 07 x 5");

	/**
	 * Prize combination 197 constant.
	 */
	public static final PrizeCombination COMBINATION_197_SYMBOL_08_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	/**
	 * Prize combination 198 constant.
	 */
	public static final PrizeCombination COMBINATION_198_SYMBOL_08_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	/**
	 * Prize combination 199 constant.
	 */
	public static final PrizeCombination COMBINATION_199_SYMBOL_08_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	/**
	 * Prize combination 200 constant.
	 */
	public static final PrizeCombination COMBINATION_200_SYMBOL_08_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	/**
	 * Prize combination 201 constant.
	 */
	public static final PrizeCombination COMBINATION_201_SYMBOL_08_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			9 * 2, "Symbol 08 x 2");

	/**
	 * Prize combination 202 constant.
	 */
	public static final PrizeCombination COMBINATION_202_SYMBOL_08_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	/**
	 * Prize combination 203 constant.
	 */
	public static final PrizeCombination COMBINATION_203_SYMBOL_08_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	/**
	 * Prize combination 204 constant.
	 */
	public static final PrizeCombination COMBINATION_204_SYMBOL_08_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	/**
	 * Prize combination 205 constant.
	 */
	public static final PrizeCombination COMBINATION_205_SYMBOL_08_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	/**
	 * Prize combination 206 constant.
	 */
	public static final PrizeCombination COMBINATION_206_SYMBOL_08_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			10 * 2, "Symbol 08 x 3");

	/**
	 * Prize combination 207 constant.
	 */
	public static final PrizeCombination COMBINATION_207_SYMBOL_08_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 208 constant.
	 */
	public static final PrizeCombination COMBINATION_208_SYMBOL_08_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 209 constant.
	 */
	public static final PrizeCombination COMBINATION_209_SYMBOL_08_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 210 constant.
	 */
	public static final PrizeCombination COMBINATION_210_SYMBOL_08_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 211 constant.
	 */
	public static final PrizeCombination COMBINATION_211_SYMBOL_08_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 212 constant.
	 */
	public static final PrizeCombination COMBINATION_212_SYMBOL_08_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 213 constant.
	 */
	public static final PrizeCombination COMBINATION_213_SYMBOL_08_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 214 constant.
	 */
	public static final PrizeCombination COMBINATION_214_SYMBOL_08_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 215 constant.
	 */
	public static final PrizeCombination COMBINATION_215_SYMBOL_08_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_08,
			11 * 2, "Symbol 08 x 4");

	/**
	 * Prize combination 216 constant.
	 */
	public static final PrizeCombination COMBINATION_216_SYMBOL_08_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 217 constant.
	 */
	public static final PrizeCombination COMBINATION_217_SYMBOL_08_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 218 constant.
	 */
	public static final PrizeCombination COMBINATION_218_SYMBOL_08_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 219 constant.
	 */
	public static final PrizeCombination COMBINATION_219_SYMBOL_08_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 220 constant.
	 */
	public static final PrizeCombination COMBINATION_220_SYMBOL_08_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 221 constant.
	 */
	public static final PrizeCombination COMBINATION_221_SYMBOL_08_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 222 constant.
	 */
	public static final PrizeCombination COMBINATION_222_SYMBOL_08_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 223 constant.
	 */
	public static final PrizeCombination COMBINATION_223_SYMBOL_08_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 224 constant.
	 */
	public static final PrizeCombination COMBINATION_224_SYMBOL_08_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_08,
			12 * 2, "Symbol 08 x 5");

	/**
	 * Prize combination 225 constant.
	 */
	public static final PrizeCombination COMBINATION_225_SYMBOL_09_CONFIGURATION_01 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	/**
	 * Prize combination 226 constant.
	 */
	public static final PrizeCombination COMBINATION_226_SYMBOL_09_CONFIGURATION_02 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	/**
	 * Prize combination 227 constant.
	 */
	public static final PrizeCombination COMBINATION_227_SYMBOL_09_CONFIGURATION_03 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	/**
	 * Prize combination 228 constant.
	 */
	public static final PrizeCombination COMBINATION_228_SYMBOL_09_CONFIGURATION_04 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	/**
	 * Prize combination 229 constant.
	 */
	public static final PrizeCombination COMBINATION_229_SYMBOL_09_CONFIGURATION_05 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			10 * 2, "Symbol 09 x 2");

	/**
	 * Prize combination 230 constant.
	 */
	public static final PrizeCombination COMBINATION_230_SYMBOL_09_CONFIGURATION_06 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	/**
	 * Prize combination 231 constant.
	 */
	public static final PrizeCombination COMBINATION_231_SYMBOL_09_CONFIGURATION_07 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	/**
	 * Prize combination 232 constant.
	 */
	public static final PrizeCombination COMBINATION_232_SYMBOL_09_CONFIGURATION_08 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	/**
	 * Prize combination 233 constant.
	 */
	public static final PrizeCombination COMBINATION_233_SYMBOL_09_CONFIGURATION_09 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	/**
	 * Prize combination 234 constant.
	 */
	public static final PrizeCombination COMBINATION_234_SYMBOL_09_CONFIGURATION_10 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			11 * 2, "Symbol 09 x 3");

	/**
	 * Prize combination 235 constant.
	 */
	public static final PrizeCombination COMBINATION_235_SYMBOL_09_CONFIGURATION_11 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 236 constant.
	 */
	public static final PrizeCombination COMBINATION_236_SYMBOL_09_CONFIGURATION_12 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 237 constant.
	 */
	public static final PrizeCombination COMBINATION_237_SYMBOL_09_CONFIGURATION_13 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 238 constant.
	 */
	public static final PrizeCombination COMBINATION_238_SYMBOL_09_CONFIGURATION_14 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 239 constant.
	 */
	public static final PrizeCombination COMBINATION_239_SYMBOL_09_CONFIGURATION_15 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 240 constant.
	 */
	public static final PrizeCombination COMBINATION_240_SYMBOL_09_CONFIGURATION_16 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 241 constant.
	 */
	public static final PrizeCombination COMBINATION_241_SYMBOL_09_CONFIGURATION_17 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 242 constant.
	 */
	public static final PrizeCombination COMBINATION_242_SYMBOL_09_CONFIGURATION_18 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 243 constant.
	 */
	public static final PrizeCombination COMBINATION_243_SYMBOL_09_CONFIGURATION_19 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }), Reels.SYMBOL_09,
			12 * 2, "Symbol 09 x 4");

	/**
	 * Prize combination 244 constant.
	 */
	public static final PrizeCombination COMBINATION_244_SYMBOL_09_CONFIGURATION_20 = new PrizeCombination(
			new Combination(new char[][] { { 0, 1, 0 }, { 0, 1, 0 },
					{ 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 245 constant.
	 */
	public static final PrizeCombination COMBINATION_245_SYMBOL_09_CONFIGURATION_21 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 246 constant.
	 */
	public static final PrizeCombination COMBINATION_246_SYMBOL_09_CONFIGURATION_22 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 247 constant.
	 */
	public static final PrizeCombination COMBINATION_247_SYMBOL_09_CONFIGURATION_23 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 248 constant.
	 */
	public static final PrizeCombination COMBINATION_248_SYMBOL_09_CONFIGURATION_24 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 249 constant.
	 */
	public static final PrizeCombination COMBINATION_249_SYMBOL_09_CONFIGURATION_25 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 1, 0 },
					{ 1, 0, 0 }, { 1, 0, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 250 constant.
	 */
	public static final PrizeCombination COMBINATION_250_SYMBOL_09_CONFIGURATION_26 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 0, 1, 0 },
					{ 0, 0, 1 }, { 0, 0, 1 }, { 0, 0, 1 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 251 constant.
	 */
	public static final PrizeCombination COMBINATION_251_SYMBOL_09_CONFIGURATION_27 = new PrizeCombination(
			new Combination(new char[][] { { 0, 0, 1 }, { 0, 0, 1 },
					{ 0, 0, 1 }, { 0, 1, 0 }, { 1, 0, 0 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Prize combination 252 constant.
	 */
	public static final PrizeCombination COMBINATION_252_SYMBOL_09_CONFIGURATION_28 = new PrizeCombination(
			new Combination(new char[][] { { 1, 0, 0 }, { 1, 0, 0 },
					{ 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } }), Reels.SYMBOL_09,
			13 * 2, "Symbol 09 x 5");

	/**
	 * Number of combinations.
	 */
	public static final int NUMBER_OF_COMBINATIONS = 252;

	/**
	 * Number of unique reels configurations.
	 */
	public static final int NUMBER_OF_CONFIGURATIONS = 28;

	/**
	 * Flag of prize combination pointers constant.
	 */
	public static final PrizeCombination COMBINATIONS[] = {
			COMBINATION_001_SYMBOL_01_CONFIGURATION_01,
			COMBINATION_002_SYMBOL_01_CONFIGURATION_02,
			COMBINATION_003_SYMBOL_01_CONFIGURATION_03,
			COMBINATION_004_SYMBOL_01_CONFIGURATION_04,
			COMBINATION_005_SYMBOL_01_CONFIGURATION_05,
			COMBINATION_006_SYMBOL_01_CONFIGURATION_06,
			COMBINATION_007_SYMBOL_01_CONFIGURATION_07,
			COMBINATION_008_SYMBOL_01_CONFIGURATION_08,
			COMBINATION_009_SYMBOL_01_CONFIGURATION_09,
			COMBINATION_010_SYMBOL_01_CONFIGURATION_10,
			COMBINATION_011_SYMBOL_01_CONFIGURATION_11,
			COMBINATION_012_SYMBOL_01_CONFIGURATION_12,
			COMBINATION_013_SYMBOL_01_CONFIGURATION_13,
			COMBINATION_014_SYMBOL_01_CONFIGURATION_14,
			COMBINATION_015_SYMBOL_01_CONFIGURATION_15,
			COMBINATION_016_SYMBOL_01_CONFIGURATION_16,
			COMBINATION_017_SYMBOL_01_CONFIGURATION_17,
			COMBINATION_018_SYMBOL_01_CONFIGURATION_18,
			COMBINATION_019_SYMBOL_01_CONFIGURATION_19,
			COMBINATION_020_SYMBOL_01_CONFIGURATION_20,
			COMBINATION_021_SYMBOL_01_CONFIGURATION_21,
			COMBINATION_022_SYMBOL_01_CONFIGURATION_22,
			COMBINATION_023_SYMBOL_01_CONFIGURATION_23,
			COMBINATION_024_SYMBOL_01_CONFIGURATION_24,
			COMBINATION_025_SYMBOL_01_CONFIGURATION_25,
			COMBINATION_026_SYMBOL_01_CONFIGURATION_26,
			COMBINATION_027_SYMBOL_01_CONFIGURATION_27,
			COMBINATION_028_SYMBOL_01_CONFIGURATION_28,
			COMBINATION_029_SYMBOL_02_CONFIGURATION_01,
			COMBINATION_030_SYMBOL_02_CONFIGURATION_02,
			COMBINATION_031_SYMBOL_02_CONFIGURATION_03,
			COMBINATION_032_SYMBOL_02_CONFIGURATION_04,
			COMBINATION_033_SYMBOL_02_CONFIGURATION_05,
			COMBINATION_034_SYMBOL_02_CONFIGURATION_06,
			COMBINATION_035_SYMBOL_02_CONFIGURATION_07,
			COMBINATION_036_SYMBOL_02_CONFIGURATION_08,
			COMBINATION_037_SYMBOL_02_CONFIGURATION_09,
			COMBINATION_038_SYMBOL_02_CONFIGURATION_10,
			COMBINATION_039_SYMBOL_02_CONFIGURATION_11,
			COMBINATION_040_SYMBOL_02_CONFIGURATION_12,
			COMBINATION_041_SYMBOL_02_CONFIGURATION_13,
			COMBINATION_042_SYMBOL_02_CONFIGURATION_14,
			COMBINATION_043_SYMBOL_02_CONFIGURATION_15,
			COMBINATION_044_SYMBOL_02_CONFIGURATION_16,
			COMBINATION_045_SYMBOL_02_CONFIGURATION_17,
			COMBINATION_046_SYMBOL_02_CONFIGURATION_18,
			COMBINATION_047_SYMBOL_02_CONFIGURATION_19,
			COMBINATION_048_SYMBOL_02_CONFIGURATION_20,
			COMBINATION_049_SYMBOL_02_CONFIGURATION_21,
			COMBINATION_050_SYMBOL_02_CONFIGURATION_22,
			COMBINATION_051_SYMBOL_02_CONFIGURATION_23,
			COMBINATION_052_SYMBOL_02_CONFIGURATION_24,
			COMBINATION_053_SYMBOL_02_CONFIGURATION_25,
			COMBINATION_054_SYMBOL_02_CONFIGURATION_26,
			COMBINATION_055_SYMBOL_02_CONFIGURATION_27,
			COMBINATION_056_SYMBOL_02_CONFIGURATION_28,
			COMBINATION_057_SYMBOL_03_CONFIGURATION_01,
			COMBINATION_058_SYMBOL_03_CONFIGURATION_02,
			COMBINATION_059_SYMBOL_03_CONFIGURATION_03,
			COMBINATION_060_SYMBOL_03_CONFIGURATION_04,
			COMBINATION_061_SYMBOL_03_CONFIGURATION_05,
			COMBINATION_062_SYMBOL_03_CONFIGURATION_06,
			COMBINATION_063_SYMBOL_03_CONFIGURATION_07,
			COMBINATION_064_SYMBOL_03_CONFIGURATION_08,
			COMBINATION_065_SYMBOL_03_CONFIGURATION_09,
			COMBINATION_066_SYMBOL_03_CONFIGURATION_10,
			COMBINATION_067_SYMBOL_03_CONFIGURATION_11,
			COMBINATION_068_SYMBOL_03_CONFIGURATION_12,
			COMBINATION_069_SYMBOL_03_CONFIGURATION_13,
			COMBINATION_070_SYMBOL_03_CONFIGURATION_14,
			COMBINATION_071_SYMBOL_03_CONFIGURATION_15,
			COMBINATION_072_SYMBOL_03_CONFIGURATION_16,
			COMBINATION_073_SYMBOL_03_CONFIGURATION_17,
			COMBINATION_074_SYMBOL_03_CONFIGURATION_18,
			COMBINATION_075_SYMBOL_03_CONFIGURATION_19,
			COMBINATION_076_SYMBOL_03_CONFIGURATION_20,
			COMBINATION_077_SYMBOL_03_CONFIGURATION_21,
			COMBINATION_078_SYMBOL_03_CONFIGURATION_22,
			COMBINATION_079_SYMBOL_03_CONFIGURATION_23,
			COMBINATION_080_SYMBOL_03_CONFIGURATION_24,
			COMBINATION_081_SYMBOL_03_CONFIGURATION_25,
			COMBINATION_082_SYMBOL_03_CONFIGURATION_26,
			COMBINATION_083_SYMBOL_03_CONFIGURATION_27,
			COMBINATION_084_SYMBOL_03_CONFIGURATION_28,
			COMBINATION_085_SYMBOL_04_CONFIGURATION_01,
			COMBINATION_086_SYMBOL_04_CONFIGURATION_02,
			COMBINATION_087_SYMBOL_04_CONFIGURATION_03,
			COMBINATION_088_SYMBOL_04_CONFIGURATION_04,
			COMBINATION_089_SYMBOL_04_CONFIGURATION_05,
			COMBINATION_090_SYMBOL_04_CONFIGURATION_06,
			COMBINATION_091_SYMBOL_04_CONFIGURATION_07,
			COMBINATION_092_SYMBOL_04_CONFIGURATION_08,
			COMBINATION_093_SYMBOL_04_CONFIGURATION_09,
			COMBINATION_094_SYMBOL_04_CONFIGURATION_10,
			COMBINATION_095_SYMBOL_04_CONFIGURATION_11,
			COMBINATION_096_SYMBOL_04_CONFIGURATION_12,
			COMBINATION_097_SYMBOL_04_CONFIGURATION_13,
			COMBINATION_098_SYMBOL_04_CONFIGURATION_14,
			COMBINATION_099_SYMBOL_04_CONFIGURATION_15,
			COMBINATION_100_SYMBOL_04_CONFIGURATION_16,
			COMBINATION_101_SYMBOL_04_CONFIGURATION_17,
			COMBINATION_102_SYMBOL_04_CONFIGURATION_18,
			COMBINATION_103_SYMBOL_04_CONFIGURATION_19,
			COMBINATION_104_SYMBOL_04_CONFIGURATION_20,
			COMBINATION_105_SYMBOL_04_CONFIGURATION_21,
			COMBINATION_106_SYMBOL_04_CONFIGURATION_22,
			COMBINATION_107_SYMBOL_04_CONFIGURATION_23,
			COMBINATION_108_SYMBOL_04_CONFIGURATION_24,
			COMBINATION_109_SYMBOL_04_CONFIGURATION_25,
			COMBINATION_110_SYMBOL_04_CONFIGURATION_26,
			COMBINATION_111_SYMBOL_04_CONFIGURATION_27,
			COMBINATION_112_SYMBOL_04_CONFIGURATION_28,
			COMBINATION_113_SYMBOL_05_CONFIGURATION_01,
			COMBINATION_114_SYMBOL_05_CONFIGURATION_02,
			COMBINATION_115_SYMBOL_05_CONFIGURATION_03,
			COMBINATION_116_SYMBOL_05_CONFIGURATION_04,
			COMBINATION_117_SYMBOL_05_CONFIGURATION_05,
			COMBINATION_118_SYMBOL_05_CONFIGURATION_06,
			COMBINATION_119_SYMBOL_05_CONFIGURATION_07,
			COMBINATION_120_SYMBOL_05_CONFIGURATION_08,
			COMBINATION_121_SYMBOL_05_CONFIGURATION_09,
			COMBINATION_122_SYMBOL_05_CONFIGURATION_10,
			COMBINATION_123_SYMBOL_05_CONFIGURATION_11,
			COMBINATION_124_SYMBOL_05_CONFIGURATION_12,
			COMBINATION_125_SYMBOL_05_CONFIGURATION_13,
			COMBINATION_126_SYMBOL_05_CONFIGURATION_14,
			COMBINATION_127_SYMBOL_05_CONFIGURATION_15,
			COMBINATION_128_SYMBOL_05_CONFIGURATION_16,
			COMBINATION_129_SYMBOL_05_CONFIGURATION_17,
			COMBINATION_130_SYMBOL_05_CONFIGURATION_18,
			COMBINATION_131_SYMBOL_05_CONFIGURATION_19,
			COMBINATION_132_SYMBOL_05_CONFIGURATION_20,
			COMBINATION_133_SYMBOL_05_CONFIGURATION_21,
			COMBINATION_134_SYMBOL_05_CONFIGURATION_22,
			COMBINATION_135_SYMBOL_05_CONFIGURATION_23,
			COMBINATION_136_SYMBOL_05_CONFIGURATION_24,
			COMBINATION_137_SYMBOL_05_CONFIGURATION_25,
			COMBINATION_138_SYMBOL_05_CONFIGURATION_26,
			COMBINATION_139_SYMBOL_05_CONFIGURATION_27,
			COMBINATION_140_SYMBOL_05_CONFIGURATION_28,
			COMBINATION_141_SYMBOL_06_CONFIGURATION_01,
			COMBINATION_142_SYMBOL_06_CONFIGURATION_02,
			COMBINATION_143_SYMBOL_06_CONFIGURATION_03,
			COMBINATION_144_SYMBOL_06_CONFIGURATION_04,
			COMBINATION_145_SYMBOL_06_CONFIGURATION_05,
			COMBINATION_146_SYMBOL_06_CONFIGURATION_06,
			COMBINATION_147_SYMBOL_06_CONFIGURATION_07,
			COMBINATION_148_SYMBOL_06_CONFIGURATION_08,
			COMBINATION_149_SYMBOL_06_CONFIGURATION_09,
			COMBINATION_150_SYMBOL_06_CONFIGURATION_10,
			COMBINATION_151_SYMBOL_06_CONFIGURATION_11,
			COMBINATION_152_SYMBOL_06_CONFIGURATION_12,
			COMBINATION_153_SYMBOL_06_CONFIGURATION_13,
			COMBINATION_154_SYMBOL_06_CONFIGURATION_14,
			COMBINATION_155_SYMBOL_06_CONFIGURATION_15,
			COMBINATION_156_SYMBOL_06_CONFIGURATION_16,
			COMBINATION_157_SYMBOL_06_CONFIGURATION_17,
			COMBINATION_158_SYMBOL_06_CONFIGURATION_18,
			COMBINATION_159_SYMBOL_06_CONFIGURATION_19,
			COMBINATION_160_SYMBOL_06_CONFIGURATION_20,
			COMBINATION_161_SYMBOL_06_CONFIGURATION_21,
			COMBINATION_162_SYMBOL_06_CONFIGURATION_22,
			COMBINATION_163_SYMBOL_06_CONFIGURATION_23,
			COMBINATION_164_SYMBOL_06_CONFIGURATION_24,
			COMBINATION_165_SYMBOL_06_CONFIGURATION_25,
			COMBINATION_166_SYMBOL_06_CONFIGURATION_26,
			COMBINATION_167_SYMBOL_06_CONFIGURATION_27,
			COMBINATION_168_SYMBOL_06_CONFIGURATION_28,
			COMBINATION_169_SYMBOL_07_CONFIGURATION_01,
			COMBINATION_170_SYMBOL_07_CONFIGURATION_02,
			COMBINATION_171_SYMBOL_07_CONFIGURATION_03,
			COMBINATION_172_SYMBOL_07_CONFIGURATION_04,
			COMBINATION_173_SYMBOL_07_CONFIGURATION_05,
			COMBINATION_174_SYMBOL_07_CONFIGURATION_06,
			COMBINATION_175_SYMBOL_07_CONFIGURATION_07,
			COMBINATION_176_SYMBOL_07_CONFIGURATION_08,
			COMBINATION_177_SYMBOL_07_CONFIGURATION_09,
			COMBINATION_178_SYMBOL_07_CONFIGURATION_10,
			COMBINATION_179_SYMBOL_07_CONFIGURATION_11,
			COMBINATION_180_SYMBOL_07_CONFIGURATION_12,
			COMBINATION_181_SYMBOL_07_CONFIGURATION_13,
			COMBINATION_182_SYMBOL_07_CONFIGURATION_14,
			COMBINATION_183_SYMBOL_07_CONFIGURATION_15,
			COMBINATION_184_SYMBOL_07_CONFIGURATION_16,
			COMBINATION_185_SYMBOL_07_CONFIGURATION_17,
			COMBINATION_186_SYMBOL_07_CONFIGURATION_18,
			COMBINATION_187_SYMBOL_07_CONFIGURATION_19,
			COMBINATION_188_SYMBOL_07_CONFIGURATION_20,
			COMBINATION_189_SYMBOL_07_CONFIGURATION_21,
			COMBINATION_190_SYMBOL_07_CONFIGURATION_22,
			COMBINATION_191_SYMBOL_07_CONFIGURATION_23,
			COMBINATION_192_SYMBOL_07_CONFIGURATION_24,
			COMBINATION_193_SYMBOL_07_CONFIGURATION_25,
			COMBINATION_194_SYMBOL_07_CONFIGURATION_26,
			COMBINATION_195_SYMBOL_07_CONFIGURATION_27,
			COMBINATION_196_SYMBOL_07_CONFIGURATION_28,
			COMBINATION_197_SYMBOL_08_CONFIGURATION_01,
			COMBINATION_198_SYMBOL_08_CONFIGURATION_02,
			COMBINATION_199_SYMBOL_08_CONFIGURATION_03,
			COMBINATION_200_SYMBOL_08_CONFIGURATION_04,
			COMBINATION_201_SYMBOL_08_CONFIGURATION_05,
			COMBINATION_202_SYMBOL_08_CONFIGURATION_06,
			COMBINATION_203_SYMBOL_08_CONFIGURATION_07,
			COMBINATION_204_SYMBOL_08_CONFIGURATION_08,
			COMBINATION_205_SYMBOL_08_CONFIGURATION_09,
			COMBINATION_206_SYMBOL_08_CONFIGURATION_10,
			COMBINATION_207_SYMBOL_08_CONFIGURATION_11,
			COMBINATION_208_SYMBOL_08_CONFIGURATION_12,
			COMBINATION_209_SYMBOL_08_CONFIGURATION_13,
			COMBINATION_210_SYMBOL_08_CONFIGURATION_14,
			COMBINATION_211_SYMBOL_08_CONFIGURATION_15,
			COMBINATION_212_SYMBOL_08_CONFIGURATION_16,
			COMBINATION_213_SYMBOL_08_CONFIGURATION_17,
			COMBINATION_214_SYMBOL_08_CONFIGURATION_18,
			COMBINATION_215_SYMBOL_08_CONFIGURATION_19,
			COMBINATION_216_SYMBOL_08_CONFIGURATION_20,
			COMBINATION_217_SYMBOL_08_CONFIGURATION_21,
			COMBINATION_218_SYMBOL_08_CONFIGURATION_22,
			COMBINATION_219_SYMBOL_08_CONFIGURATION_23,
			COMBINATION_220_SYMBOL_08_CONFIGURATION_24,
			COMBINATION_221_SYMBOL_08_CONFIGURATION_25,
			COMBINATION_222_SYMBOL_08_CONFIGURATION_26,
			COMBINATION_223_SYMBOL_08_CONFIGURATION_27,
			COMBINATION_224_SYMBOL_08_CONFIGURATION_28,
			COMBINATION_225_SYMBOL_09_CONFIGURATION_01,
			COMBINATION_226_SYMBOL_09_CONFIGURATION_02,
			COMBINATION_227_SYMBOL_09_CONFIGURATION_03,
			COMBINATION_228_SYMBOL_09_CONFIGURATION_04,
			COMBINATION_229_SYMBOL_09_CONFIGURATION_05,
			COMBINATION_230_SYMBOL_09_CONFIGURATION_06,
			COMBINATION_231_SYMBOL_09_CONFIGURATION_07,
			COMBINATION_232_SYMBOL_09_CONFIGURATION_08,
			COMBINATION_233_SYMBOL_09_CONFIGURATION_09,
			COMBINATION_234_SYMBOL_09_CONFIGURATION_10,
			COMBINATION_235_SYMBOL_09_CONFIGURATION_11,
			COMBINATION_236_SYMBOL_09_CONFIGURATION_12,
			COMBINATION_237_SYMBOL_09_CONFIGURATION_13,
			COMBINATION_238_SYMBOL_09_CONFIGURATION_14,
			COMBINATION_239_SYMBOL_09_CONFIGURATION_15,
			COMBINATION_240_SYMBOL_09_CONFIGURATION_16,
			COMBINATION_241_SYMBOL_09_CONFIGURATION_17,
			COMBINATION_242_SYMBOL_09_CONFIGURATION_18,
			COMBINATION_243_SYMBOL_09_CONFIGURATION_19,
			COMBINATION_244_SYMBOL_09_CONFIGURATION_20,
			COMBINATION_245_SYMBOL_09_CONFIGURATION_21,
			COMBINATION_246_SYMBOL_09_CONFIGURATION_22,
			COMBINATION_247_SYMBOL_09_CONFIGURATION_23,
			COMBINATION_248_SYMBOL_09_CONFIGURATION_24,
			COMBINATION_249_SYMBOL_09_CONFIGURATION_25,
			COMBINATION_250_SYMBOL_09_CONFIGURATION_26,
			COMBINATION_251_SYMBOL_09_CONFIGURATION_27,
			COMBINATION_252_SYMBOL_09_CONFIGURATION_28 };
}
