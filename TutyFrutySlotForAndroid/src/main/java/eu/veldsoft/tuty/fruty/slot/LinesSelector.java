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
 * Implements the logic of the visible part of the line selectors. Takes care of
 * showing exactly which lines are selected and how many are they. Holds
 * information about the maximum number of the available lines. Holds all prize
 * combinations of symbols for each available line. Check if the given
 * combination of symbols on the visible part of the reels is winning. Takes
 * care of changing the number of lines.
 *
 * @author Qna Dimova
 *
 * @email q.dimova@gmail.com
 *
 * @date 05 Sep 2008
 */
class LinesSelector {

	/**
	 * Available linese 9 constant.
	 */
	public static final int LINES_AVAILABLE_09 = 9;

	/**
	 * Available linese 15 constant.
	 */
	public static final int LINES_AVAILABLE_15 = 15;

	/**
	 * Available linese 21 constant.
	 */
	public static final int LINES_AVAILABLE_21 = 21;

	/**
	 * Available lines constant.
	 */
	public static final int LINES_AVAILABLE = LINES_AVAILABLE_09;

	/**
	 * Number of lines to display at left.
	 */
	public static final int NUMBER_OF_LEFT_LINES = LINES_AVAILABLE / 2
			+ LINES_AVAILABLE % 2;

	/**
	 * Number of lines to display at right.
	 */
	public static final int NUMBER_OF_RIGHT_LINES = LINES_AVAILABLE
			- NUMBER_OF_LEFT_LINES;

	/**
	 * Constant flag indication for selected lines.
	 */
	public static final int SELECTED = 1;

	/**
	 * Constant flag indication for not selected lines.
	 */
	public static final int NOT_SELECTED = 0;

	/**
	 * Number of lines to be selected in one step.
	 */
	public static final int LINES_CHANGE_STEP = 1;

	/**
	 * Contain all prize combinations of symbols for every line. All
	 * combinations for each line should be in descending order by number of
	 * symbols in each combination. It is needed to escape duplications in
	 * longer and shorter lines.
	 */
	public static final PrizeCombination CORRESPONDANCE[][][] = {
			{
					{ Prizes.COMBINATION_001_SYMBOL_01_CONFIGURATION_01,
							Prizes.COMBINATION_002_SYMBOL_01_CONFIGURATION_02,
							Prizes.COMBINATION_003_SYMBOL_01_CONFIGURATION_03,
							Prizes.COMBINATION_004_SYMBOL_01_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_029_SYMBOL_02_CONFIGURATION_01,
							Prizes.COMBINATION_030_SYMBOL_02_CONFIGURATION_02,
							Prizes.COMBINATION_031_SYMBOL_02_CONFIGURATION_03,
							Prizes.COMBINATION_032_SYMBOL_02_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_057_SYMBOL_03_CONFIGURATION_01,
							Prizes.COMBINATION_058_SYMBOL_03_CONFIGURATION_02,
							Prizes.COMBINATION_059_SYMBOL_03_CONFIGURATION_03,
							Prizes.COMBINATION_060_SYMBOL_03_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_085_SYMBOL_04_CONFIGURATION_01,
							Prizes.COMBINATION_086_SYMBOL_04_CONFIGURATION_02,
							Prizes.COMBINATION_087_SYMBOL_04_CONFIGURATION_03,
							Prizes.COMBINATION_088_SYMBOL_04_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_113_SYMBOL_05_CONFIGURATION_01,
							Prizes.COMBINATION_114_SYMBOL_05_CONFIGURATION_02,
							Prizes.COMBINATION_115_SYMBOL_05_CONFIGURATION_03,
							Prizes.COMBINATION_116_SYMBOL_05_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_141_SYMBOL_06_CONFIGURATION_01,
							Prizes.COMBINATION_142_SYMBOL_06_CONFIGURATION_02,
							Prizes.COMBINATION_143_SYMBOL_06_CONFIGURATION_03,
							Prizes.COMBINATION_144_SYMBOL_06_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_169_SYMBOL_07_CONFIGURATION_01,
							Prizes.COMBINATION_170_SYMBOL_07_CONFIGURATION_02,
							Prizes.COMBINATION_171_SYMBOL_07_CONFIGURATION_03,
							Prizes.COMBINATION_172_SYMBOL_07_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_197_SYMBOL_08_CONFIGURATION_01,
							Prizes.COMBINATION_198_SYMBOL_08_CONFIGURATION_02,
							Prizes.COMBINATION_199_SYMBOL_08_CONFIGURATION_03,
							Prizes.COMBINATION_200_SYMBOL_08_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_225_SYMBOL_09_CONFIGURATION_01,
							Prizes.COMBINATION_226_SYMBOL_09_CONFIGURATION_02,
							Prizes.COMBINATION_227_SYMBOL_09_CONFIGURATION_03,
							Prizes.COMBINATION_228_SYMBOL_09_CONFIGURATION_04,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_005_SYMBOL_01_CONFIGURATION_05,
							Prizes.COMBINATION_006_SYMBOL_01_CONFIGURATION_06,
							Prizes.COMBINATION_007_SYMBOL_01_CONFIGURATION_07,
							Prizes.COMBINATION_008_SYMBOL_01_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_033_SYMBOL_02_CONFIGURATION_05,
							Prizes.COMBINATION_034_SYMBOL_02_CONFIGURATION_06,
							Prizes.COMBINATION_035_SYMBOL_02_CONFIGURATION_07,
							Prizes.COMBINATION_036_SYMBOL_02_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_061_SYMBOL_03_CONFIGURATION_05,
							Prizes.COMBINATION_062_SYMBOL_03_CONFIGURATION_06,
							Prizes.COMBINATION_063_SYMBOL_03_CONFIGURATION_07,
							Prizes.COMBINATION_064_SYMBOL_03_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_089_SYMBOL_04_CONFIGURATION_05,
							Prizes.COMBINATION_090_SYMBOL_04_CONFIGURATION_06,
							Prizes.COMBINATION_091_SYMBOL_04_CONFIGURATION_07,
							Prizes.COMBINATION_092_SYMBOL_04_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_117_SYMBOL_05_CONFIGURATION_05,
							Prizes.COMBINATION_118_SYMBOL_05_CONFIGURATION_06,
							Prizes.COMBINATION_119_SYMBOL_05_CONFIGURATION_07,
							Prizes.COMBINATION_120_SYMBOL_05_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_145_SYMBOL_06_CONFIGURATION_05,
							Prizes.COMBINATION_146_SYMBOL_06_CONFIGURATION_06,
							Prizes.COMBINATION_147_SYMBOL_06_CONFIGURATION_07,
							Prizes.COMBINATION_148_SYMBOL_06_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_173_SYMBOL_07_CONFIGURATION_05,
							Prizes.COMBINATION_174_SYMBOL_07_CONFIGURATION_06,
							Prizes.COMBINATION_175_SYMBOL_07_CONFIGURATION_07,
							Prizes.COMBINATION_176_SYMBOL_07_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_201_SYMBOL_08_CONFIGURATION_05,
							Prizes.COMBINATION_202_SYMBOL_08_CONFIGURATION_06,
							Prizes.COMBINATION_203_SYMBOL_08_CONFIGURATION_07,
							Prizes.COMBINATION_204_SYMBOL_08_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_229_SYMBOL_09_CONFIGURATION_05,
							Prizes.COMBINATION_230_SYMBOL_09_CONFIGURATION_06,
							Prizes.COMBINATION_231_SYMBOL_09_CONFIGURATION_07,
							Prizes.COMBINATION_232_SYMBOL_09_CONFIGURATION_08,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_009_SYMBOL_01_CONFIGURATION_09,
							Prizes.COMBINATION_010_SYMBOL_01_CONFIGURATION_10,
							Prizes.COMBINATION_011_SYMBOL_01_CONFIGURATION_11,
							Prizes.COMBINATION_012_SYMBOL_01_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_037_SYMBOL_02_CONFIGURATION_09,
							Prizes.COMBINATION_038_SYMBOL_02_CONFIGURATION_10,
							Prizes.COMBINATION_039_SYMBOL_02_CONFIGURATION_11,
							Prizes.COMBINATION_040_SYMBOL_02_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_065_SYMBOL_03_CONFIGURATION_09,
							Prizes.COMBINATION_066_SYMBOL_03_CONFIGURATION_10,
							Prizes.COMBINATION_067_SYMBOL_03_CONFIGURATION_11,
							Prizes.COMBINATION_068_SYMBOL_03_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_093_SYMBOL_04_CONFIGURATION_09,
							Prizes.COMBINATION_094_SYMBOL_04_CONFIGURATION_10,
							Prizes.COMBINATION_095_SYMBOL_04_CONFIGURATION_11,
							Prizes.COMBINATION_096_SYMBOL_04_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_121_SYMBOL_05_CONFIGURATION_09,
							Prizes.COMBINATION_122_SYMBOL_05_CONFIGURATION_10,
							Prizes.COMBINATION_123_SYMBOL_05_CONFIGURATION_11,
							Prizes.COMBINATION_124_SYMBOL_05_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_149_SYMBOL_06_CONFIGURATION_09,
							Prizes.COMBINATION_150_SYMBOL_06_CONFIGURATION_10,
							Prizes.COMBINATION_151_SYMBOL_06_CONFIGURATION_11,
							Prizes.COMBINATION_152_SYMBOL_06_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_177_SYMBOL_07_CONFIGURATION_09,
							Prizes.COMBINATION_178_SYMBOL_07_CONFIGURATION_10,
							Prizes.COMBINATION_179_SYMBOL_07_CONFIGURATION_11,
							Prizes.COMBINATION_180_SYMBOL_07_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_205_SYMBOL_08_CONFIGURATION_09,
							Prizes.COMBINATION_206_SYMBOL_08_CONFIGURATION_10,
							Prizes.COMBINATION_207_SYMBOL_08_CONFIGURATION_11,
							Prizes.COMBINATION_208_SYMBOL_08_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_233_SYMBOL_09_CONFIGURATION_09,
							Prizes.COMBINATION_234_SYMBOL_09_CONFIGURATION_10,
							Prizes.COMBINATION_235_SYMBOL_09_CONFIGURATION_11,
							Prizes.COMBINATION_236_SYMBOL_09_CONFIGURATION_12,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_013_SYMBOL_01_CONFIGURATION_13,
							Prizes.COMBINATION_014_SYMBOL_01_CONFIGURATION_14,
							Prizes.COMBINATION_015_SYMBOL_01_CONFIGURATION_15,
							Prizes.COMBINATION_016_SYMBOL_01_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_041_SYMBOL_02_CONFIGURATION_13,
							Prizes.COMBINATION_042_SYMBOL_02_CONFIGURATION_14,
							Prizes.COMBINATION_043_SYMBOL_02_CONFIGURATION_15,
							Prizes.COMBINATION_044_SYMBOL_02_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_069_SYMBOL_03_CONFIGURATION_13,
							Prizes.COMBINATION_070_SYMBOL_03_CONFIGURATION_14,
							Prizes.COMBINATION_071_SYMBOL_03_CONFIGURATION_15,
							Prizes.COMBINATION_072_SYMBOL_03_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_097_SYMBOL_04_CONFIGURATION_13,
							Prizes.COMBINATION_098_SYMBOL_04_CONFIGURATION_14,
							Prizes.COMBINATION_099_SYMBOL_04_CONFIGURATION_15,
							Prizes.COMBINATION_100_SYMBOL_04_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_125_SYMBOL_05_CONFIGURATION_13,
							Prizes.COMBINATION_126_SYMBOL_05_CONFIGURATION_14,
							Prizes.COMBINATION_127_SYMBOL_05_CONFIGURATION_15,
							Prizes.COMBINATION_128_SYMBOL_05_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_153_SYMBOL_06_CONFIGURATION_13,
							Prizes.COMBINATION_154_SYMBOL_06_CONFIGURATION_14,
							Prizes.COMBINATION_155_SYMBOL_06_CONFIGURATION_15,
							Prizes.COMBINATION_156_SYMBOL_06_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_181_SYMBOL_07_CONFIGURATION_13,
							Prizes.COMBINATION_182_SYMBOL_07_CONFIGURATION_14,
							Prizes.COMBINATION_183_SYMBOL_07_CONFIGURATION_15,
							Prizes.COMBINATION_184_SYMBOL_07_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_209_SYMBOL_08_CONFIGURATION_13,
							Prizes.COMBINATION_210_SYMBOL_08_CONFIGURATION_14,
							Prizes.COMBINATION_211_SYMBOL_08_CONFIGURATION_15,
							Prizes.COMBINATION_212_SYMBOL_08_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_237_SYMBOL_09_CONFIGURATION_13,
							Prizes.COMBINATION_238_SYMBOL_09_CONFIGURATION_14,
							Prizes.COMBINATION_239_SYMBOL_09_CONFIGURATION_15,
							Prizes.COMBINATION_240_SYMBOL_09_CONFIGURATION_16,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_017_SYMBOL_01_CONFIGURATION_17,
							Prizes.COMBINATION_018_SYMBOL_01_CONFIGURATION_18,
							Prizes.COMBINATION_019_SYMBOL_01_CONFIGURATION_19,
							Prizes.COMBINATION_020_SYMBOL_01_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_045_SYMBOL_02_CONFIGURATION_17,
							Prizes.COMBINATION_046_SYMBOL_02_CONFIGURATION_18,
							Prizes.COMBINATION_047_SYMBOL_02_CONFIGURATION_19,
							Prizes.COMBINATION_048_SYMBOL_02_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_073_SYMBOL_03_CONFIGURATION_17,
							Prizes.COMBINATION_074_SYMBOL_03_CONFIGURATION_18,
							Prizes.COMBINATION_075_SYMBOL_03_CONFIGURATION_19,
							Prizes.COMBINATION_076_SYMBOL_03_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_101_SYMBOL_04_CONFIGURATION_17,
							Prizes.COMBINATION_102_SYMBOL_04_CONFIGURATION_18,
							Prizes.COMBINATION_103_SYMBOL_04_CONFIGURATION_19,
							Prizes.COMBINATION_104_SYMBOL_04_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_129_SYMBOL_05_CONFIGURATION_17,
							Prizes.COMBINATION_130_SYMBOL_05_CONFIGURATION_18,
							Prizes.COMBINATION_131_SYMBOL_05_CONFIGURATION_19,
							Prizes.COMBINATION_132_SYMBOL_05_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_157_SYMBOL_06_CONFIGURATION_17,
							Prizes.COMBINATION_158_SYMBOL_06_CONFIGURATION_18,
							Prizes.COMBINATION_159_SYMBOL_06_CONFIGURATION_19,
							Prizes.COMBINATION_160_SYMBOL_06_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_185_SYMBOL_07_CONFIGURATION_17,
							Prizes.COMBINATION_186_SYMBOL_07_CONFIGURATION_18,
							Prizes.COMBINATION_187_SYMBOL_07_CONFIGURATION_19,
							Prizes.COMBINATION_188_SYMBOL_07_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_213_SYMBOL_08_CONFIGURATION_17,
							Prizes.COMBINATION_214_SYMBOL_08_CONFIGURATION_18,
							Prizes.COMBINATION_215_SYMBOL_08_CONFIGURATION_19,
							Prizes.COMBINATION_216_SYMBOL_08_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_241_SYMBOL_09_CONFIGURATION_17,
							Prizes.COMBINATION_242_SYMBOL_09_CONFIGURATION_18,
							Prizes.COMBINATION_243_SYMBOL_09_CONFIGURATION_19,
							Prizes.COMBINATION_244_SYMBOL_09_CONFIGURATION_20,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_017_SYMBOL_01_CONFIGURATION_17,
							Prizes.COMBINATION_018_SYMBOL_01_CONFIGURATION_18,
							Prizes.COMBINATION_021_SYMBOL_01_CONFIGURATION_21,
							Prizes.COMBINATION_022_SYMBOL_01_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_045_SYMBOL_02_CONFIGURATION_17,
							Prizes.COMBINATION_046_SYMBOL_02_CONFIGURATION_18,
							Prizes.COMBINATION_049_SYMBOL_02_CONFIGURATION_21,
							Prizes.COMBINATION_050_SYMBOL_02_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_073_SYMBOL_03_CONFIGURATION_17,
							Prizes.COMBINATION_074_SYMBOL_03_CONFIGURATION_18,
							Prizes.COMBINATION_077_SYMBOL_03_CONFIGURATION_21,
							Prizes.COMBINATION_078_SYMBOL_03_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_101_SYMBOL_04_CONFIGURATION_17,
							Prizes.COMBINATION_102_SYMBOL_04_CONFIGURATION_18,
							Prizes.COMBINATION_105_SYMBOL_04_CONFIGURATION_21,
							Prizes.COMBINATION_106_SYMBOL_04_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_129_SYMBOL_05_CONFIGURATION_17,
							Prizes.COMBINATION_130_SYMBOL_05_CONFIGURATION_18,
							Prizes.COMBINATION_133_SYMBOL_05_CONFIGURATION_21,
							Prizes.COMBINATION_134_SYMBOL_05_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_157_SYMBOL_06_CONFIGURATION_17,
							Prizes.COMBINATION_158_SYMBOL_06_CONFIGURATION_18,
							Prizes.COMBINATION_161_SYMBOL_06_CONFIGURATION_21,
							Prizes.COMBINATION_162_SYMBOL_06_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_185_SYMBOL_07_CONFIGURATION_17,
							Prizes.COMBINATION_186_SYMBOL_07_CONFIGURATION_18,
							Prizes.COMBINATION_189_SYMBOL_07_CONFIGURATION_21,
							Prizes.COMBINATION_190_SYMBOL_07_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_213_SYMBOL_08_CONFIGURATION_17,
							Prizes.COMBINATION_214_SYMBOL_08_CONFIGURATION_18,
							Prizes.COMBINATION_217_SYMBOL_08_CONFIGURATION_21,
							Prizes.COMBINATION_218_SYMBOL_08_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_241_SYMBOL_09_CONFIGURATION_17,
							Prizes.COMBINATION_242_SYMBOL_09_CONFIGURATION_18,
							Prizes.COMBINATION_245_SYMBOL_09_CONFIGURATION_21,
							Prizes.COMBINATION_246_SYMBOL_09_CONFIGURATION_22,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_013_SYMBOL_01_CONFIGURATION_13,
							Prizes.COMBINATION_014_SYMBOL_01_CONFIGURATION_14,
							Prizes.COMBINATION_023_SYMBOL_01_CONFIGURATION_23,
							Prizes.COMBINATION_024_SYMBOL_01_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_041_SYMBOL_02_CONFIGURATION_13,
							Prizes.COMBINATION_042_SYMBOL_02_CONFIGURATION_14,
							Prizes.COMBINATION_051_SYMBOL_02_CONFIGURATION_23,
							Prizes.COMBINATION_052_SYMBOL_02_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_069_SYMBOL_03_CONFIGURATION_13,
							Prizes.COMBINATION_070_SYMBOL_03_CONFIGURATION_14,
							Prizes.COMBINATION_079_SYMBOL_03_CONFIGURATION_23,
							Prizes.COMBINATION_080_SYMBOL_03_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_097_SYMBOL_04_CONFIGURATION_13,
							Prizes.COMBINATION_098_SYMBOL_04_CONFIGURATION_14,
							Prizes.COMBINATION_107_SYMBOL_04_CONFIGURATION_23,
							Prizes.COMBINATION_108_SYMBOL_04_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_125_SYMBOL_05_CONFIGURATION_13,
							Prizes.COMBINATION_126_SYMBOL_05_CONFIGURATION_14,
							Prizes.COMBINATION_135_SYMBOL_05_CONFIGURATION_23,
							Prizes.COMBINATION_136_SYMBOL_05_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_153_SYMBOL_06_CONFIGURATION_13,
							Prizes.COMBINATION_154_SYMBOL_06_CONFIGURATION_14,
							Prizes.COMBINATION_163_SYMBOL_06_CONFIGURATION_23,
							Prizes.COMBINATION_164_SYMBOL_06_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_181_SYMBOL_07_CONFIGURATION_13,
							Prizes.COMBINATION_182_SYMBOL_07_CONFIGURATION_14,
							Prizes.COMBINATION_191_SYMBOL_07_CONFIGURATION_23,
							Prizes.COMBINATION_192_SYMBOL_07_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_209_SYMBOL_08_CONFIGURATION_13,
							Prizes.COMBINATION_210_SYMBOL_08_CONFIGURATION_14,
							Prizes.COMBINATION_219_SYMBOL_08_CONFIGURATION_23,
							Prizes.COMBINATION_220_SYMBOL_08_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_237_SYMBOL_09_CONFIGURATION_13,
							Prizes.COMBINATION_238_SYMBOL_09_CONFIGURATION_14,
							Prizes.COMBINATION_247_SYMBOL_09_CONFIGURATION_23,
							Prizes.COMBINATION_248_SYMBOL_09_CONFIGURATION_24,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_005_SYMBOL_01_CONFIGURATION_05,
							Prizes.COMBINATION_006_SYMBOL_01_CONFIGURATION_06,
							Prizes.COMBINATION_025_SYMBOL_01_CONFIGURATION_25,
							Prizes.COMBINATION_026_SYMBOL_01_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_033_SYMBOL_02_CONFIGURATION_05,
							Prizes.COMBINATION_034_SYMBOL_02_CONFIGURATION_06,
							Prizes.COMBINATION_053_SYMBOL_02_CONFIGURATION_25,
							Prizes.COMBINATION_054_SYMBOL_02_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_061_SYMBOL_03_CONFIGURATION_05,
							Prizes.COMBINATION_062_SYMBOL_03_CONFIGURATION_06,
							Prizes.COMBINATION_081_SYMBOL_03_CONFIGURATION_25,
							Prizes.COMBINATION_082_SYMBOL_03_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_089_SYMBOL_04_CONFIGURATION_05,
							Prizes.COMBINATION_090_SYMBOL_04_CONFIGURATION_06,
							Prizes.COMBINATION_109_SYMBOL_04_CONFIGURATION_25,
							Prizes.COMBINATION_110_SYMBOL_04_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_117_SYMBOL_05_CONFIGURATION_05,
							Prizes.COMBINATION_118_SYMBOL_05_CONFIGURATION_06,
							Prizes.COMBINATION_137_SYMBOL_05_CONFIGURATION_25,
							Prizes.COMBINATION_138_SYMBOL_05_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_145_SYMBOL_06_CONFIGURATION_05,
							Prizes.COMBINATION_146_SYMBOL_06_CONFIGURATION_06,
							Prizes.COMBINATION_165_SYMBOL_06_CONFIGURATION_25,
							Prizes.COMBINATION_166_SYMBOL_06_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_173_SYMBOL_07_CONFIGURATION_05,
							Prizes.COMBINATION_174_SYMBOL_07_CONFIGURATION_06,
							Prizes.COMBINATION_193_SYMBOL_07_CONFIGURATION_25,
							Prizes.COMBINATION_194_SYMBOL_07_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_201_SYMBOL_08_CONFIGURATION_05,
							Prizes.COMBINATION_202_SYMBOL_08_CONFIGURATION_06,
							Prizes.COMBINATION_221_SYMBOL_08_CONFIGURATION_25,
							Prizes.COMBINATION_222_SYMBOL_08_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_229_SYMBOL_09_CONFIGURATION_05,
							Prizes.COMBINATION_230_SYMBOL_09_CONFIGURATION_06,
							Prizes.COMBINATION_249_SYMBOL_09_CONFIGURATION_25,
							Prizes.COMBINATION_250_SYMBOL_09_CONFIGURATION_26,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, },

			{
					{ Prizes.COMBINATION_009_SYMBOL_01_CONFIGURATION_09,
							Prizes.COMBINATION_010_SYMBOL_01_CONFIGURATION_10,
							Prizes.COMBINATION_027_SYMBOL_01_CONFIGURATION_27,
							Prizes.COMBINATION_028_SYMBOL_01_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_037_SYMBOL_02_CONFIGURATION_09,
							Prizes.COMBINATION_038_SYMBOL_02_CONFIGURATION_10,
							Prizes.COMBINATION_055_SYMBOL_02_CONFIGURATION_27,
							Prizes.COMBINATION_056_SYMBOL_02_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_065_SYMBOL_03_CONFIGURATION_09,
							Prizes.COMBINATION_066_SYMBOL_03_CONFIGURATION_10,
							Prizes.COMBINATION_083_SYMBOL_03_CONFIGURATION_27,
							Prizes.COMBINATION_084_SYMBOL_03_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_093_SYMBOL_04_CONFIGURATION_09,
							Prizes.COMBINATION_094_SYMBOL_04_CONFIGURATION_10,
							Prizes.COMBINATION_111_SYMBOL_04_CONFIGURATION_27,
							Prizes.COMBINATION_112_SYMBOL_04_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_121_SYMBOL_05_CONFIGURATION_09,
							Prizes.COMBINATION_122_SYMBOL_05_CONFIGURATION_10,
							Prizes.COMBINATION_139_SYMBOL_05_CONFIGURATION_27,
							Prizes.COMBINATION_140_SYMBOL_05_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_149_SYMBOL_06_CONFIGURATION_09,
							Prizes.COMBINATION_150_SYMBOL_06_CONFIGURATION_10,
							Prizes.COMBINATION_167_SYMBOL_06_CONFIGURATION_27,
							Prizes.COMBINATION_168_SYMBOL_06_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_177_SYMBOL_07_CONFIGURATION_09,
							Prizes.COMBINATION_178_SYMBOL_07_CONFIGURATION_10,
							Prizes.COMBINATION_195_SYMBOL_07_CONFIGURATION_27,
							Prizes.COMBINATION_196_SYMBOL_07_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_205_SYMBOL_08_CONFIGURATION_09,
							Prizes.COMBINATION_206_SYMBOL_08_CONFIGURATION_10,
							Prizes.COMBINATION_223_SYMBOL_08_CONFIGURATION_27,
							Prizes.COMBINATION_224_SYMBOL_08_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ Prizes.COMBINATION_233_SYMBOL_09_CONFIGURATION_09,
							Prizes.COMBINATION_234_SYMBOL_09_CONFIGURATION_10,
							Prizes.COMBINATION_251_SYMBOL_09_CONFIGURATION_27,
							Prizes.COMBINATION_252_SYMBOL_09_CONFIGURATION_28,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null },
					{ null, null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null, null, null, null, null, null,
							null, null, null }, } };

	/**
	 * Multiplier for line selected used in win calculation. Plus one is for
	 * zero selected lines.
	 */
	public static final double LINES_MULTIPLIERS[] = { 0.00, 0.65, 0.65, 0.65,
			0.65, 0.65, 0.65, 0.65, 0.65, 1.00 };

	/**
	 * Holds all available lines and shows which are selected.
	 */
	private char selected[] = new char[LINES_AVAILABLE];

	/**
	 * Set all lines active for play.
	 *
	 * @author Todor Balabanov
	 *
	 * @email todor.balabanov@gmail.com
	 *
	 * @date 28 Jul 2015
	 */
	private void setAllSeleceted() {
		for (int i = 0; i < selected.length; i++) {
			selected[i] = SELECTED;
		}
	}

	public LinesSelector() {
		setAllSeleceted();
	}

	/**
	 * Selected lines getter.
	 *
	 * @param flag
	 *            Array which contain getted value.
	 *
	 * @return Selected lines flags.
	 *
	 * @author Qna Dimova
	 *
	 * @email q.dimova@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public char[] getSelected() {
		char flags[] = new char[selected.length];

		for (int i = 0; i < selected.length; i++) {
			flags[i] = selected[i];
		}

		return flags;
	}

	/**
	 * Selected lines setter.
	 *
	 * @param flags
	 *            Selected lines flags.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 05 Sep 2008
	 */
	public void setSelected(final char flags[]) {
		for (int i = 0; i < flags.length && i < selected.length; i++) {
			selected[i] = flags[i];
		}
	}

	/**
	 * Add more line(s).
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void linesUp() {
		int nextSelectionIndex = LINES_AVAILABLE - 1;

		/*
		 * Searching for the next line to be selected.
		 */
		for (nextSelectionIndex = LINES_AVAILABLE - 1; nextSelectionIndex >= 0; nextSelectionIndex--) {
			if (selected[nextSelectionIndex] == SELECTED) {
				break;
			}
		}

		/*
		 * There are not negative indexes.
		 */
		if (nextSelectionIndex < 0) {
			nextSelectionIndex = 0;
		}

		/*
		 * After previous for it is possible next selected index to be proper if
		 * there is no selected lines at all.
		 */
		if (selected[nextSelectionIndex] == SELECTED) {
			nextSelectionIndex++;
		}

		/*
		 * If all lines are selected and still there is a need to do selection
		 * clear all lines and start new selection. By this way loop selection
		 * is implmented.
		 */
		if (nextSelectionIndex == LINES_AVAILABLE) {
			for (int i = 0; i < LINES_AVAILABLE; i++) {
				selected[i] = NOT_SELECTED;
			}
			nextSelectionIndex = 0;
		}

		/*
		 * Select more lines.
		 */
		for (int i = 0; i < LINES_CHANGE_STEP
				&& nextSelectionIndex + i < LINES_AVAILABLE; i++) {
			selected[nextSelectionIndex + i] = SELECTED;
		}
	}

	/**
	 * Remove line(s).
	 *
	 * @author Todor Balabanov
	 *
	 * @email tdb@tbsoft-bg.com
	 *
	 * @date 08 Oct 2008
	 */
	public void linesDown() {
		// TODO To be implemented only if it is needed.
	}

	public void maximum() {
		setAllSeleceted();
	}

	/**
	 * Counts selected lines. Gives the number of selected lines.
	 *
	 * @return number of selected lines.
	 *
	 * @author Anton Dimitrov
	 *
	 * @email anton.naskov@gmail.com
	 *
	 * @date 11 Sep 2008
	 */
	public int numberOfSelectedLines() {
		int numberLines = 0;

		for (int i = 0; i < LINES_AVAILABLE; i++) {
			if (selected[i] == SELECTED) {
				numberLines++;
			}
		}

		return numberLines;
	}

	/**
	 * Check if the given combination of symbols is part of the win. Compares
	 * with already defined prize combinations. Gives a result from the
	 * comparing combinations. Gives true if the given combination is equal to a
	 * prize combination, false - otherwise.
	 *
	 * @param combination
	 *
	 * @return True, if given prize combination is active, false - otherwise.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public boolean isActive(final PrizeCombination combination) {
		for (int i = 0; i < LINES_AVAILABLE; i++) {
			if (selected[i] == SELECTED) {
				for (int j = 0; j < Reels.TOTAL_NUMBER_OF_SYMBOLS; j++) {
					for (int k = 0; k < Prizes.NUMBER_OF_CONFIGURATIONS; k++) {
						if (combination != null
								&& CORRESPONDANCE[i][j][k] != null
								&& combination.equals(CORRESPONDANCE[i][j][k])) {
							return true;
						}
					}
				}
			}
		}

		return false;
	}
}
