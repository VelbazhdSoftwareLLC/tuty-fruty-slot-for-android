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
 * Base class for drawing visual components. Holds x,y-coordinates of a
 * component. Holds height and width of a component. Defines that the component
 * should be drawn.
 *
 * @author Darina Evtimova
 *
 * @email aleks_f@abv.bg
 *
 * @date 19 Sep 2008
 */
class VisualComponent {

	/**
	 * X-coordinate of visual component.
	 */
	protected int x;

	/**
	 * Y-coordinate of visual component.
	 */
	protected int y;

	/**
	 * Width of visual component.
	 */
	protected int width;

	/**
	 * Height of visual component.
	 */
	protected int height;

	/**
	 * X-coordinate getter.
	 *
	 * @return X-coordinate of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public int getX() {
		return 0;
	}

	/**
	 * X-coordinate setter.
	 *
	 * @param x
	 *            X-coordinate of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public void setX(final int x) {
	}

	/**
	 * Y-coordinate getter.
	 *
	 * @return Y-coordinate of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public int getY() {
		return 0;
	}

	/**
	 * Y-coordinate setter.
	 *
	 * @param y
	 *            Y-coordinate of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public void setY(final int y) {
	}

	/**
	 * Width getter.
	 *
	 * @return Width of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public int getWidth() {
		return 0;
	}

	/**
	 * Width setter.
	 *
	 * @param width
	 *            Width of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public void setWidth(final int width) {
	}

	/**
	 * Height getter.
	 *
	 * @return Height of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public int getHeight() {
		return 0;
	}

	/**
	 * Height setter.
	 *
	 * @param height
	 *            Height of visual component.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public void setHeight(final int height) {
	}

	/**
	 * Draw visual compoment. Just declare that the component should be drawn.
	 *
	 * @param canvas
	 *            Text drawing area pointer.
	 *
	 * @author Darina Evtimova
	 *
	 * @email aleks_f@abv.bg
	 *
	 * @date 19 Sep 2008
	 */
	public void draw(TextCanvas canvas) {
	}
}
