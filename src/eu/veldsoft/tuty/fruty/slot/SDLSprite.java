package eu.veldsoft.tuty.fruty.slot;

/*******************************************************************************
 *                        SDLSprite.h  -  1.2.0                                *
 *                           -------------------                               *
 *  begin                : Sept 21 2000                                        *
 *  copyright            : (C) 2000 by regis Quercioli                         *
 *  email                : edorul@caramail.com                                 *
 ******************************************************************************/

/*******************************************************************************
 * * This program is free software; you can redistribute it and/or modify * it
 * under the terms of the GNU General Public License as published by * the Free
 * Software Foundation; either version 2 of the License, or * (at your option)
 * any later version. * *
 ******************************************************************************/

// //////////////////////////////////////////////////////////////////////////////
// based on : $Source: /usr/cvsroot/cdx/src/cdx/cdxsprite.h,v $
// $Author: MICHAELR $
// $Revision: 2.7 $
//
// Ported to SDL and modified by Regis Quercioli / edorul@caramail.com
//
// 1.1 : Sprite's shadow handling with InitShadow, SetShadowOffset,
// SetShadowValue,
// It's automaticaly drawn by Draw.
//
// 1.2 : * Position and velocity variables are now float type (in order to use
// velocity in pixel/sec rather than pixel/frame in the main program).
// * Add m_DelayStart var
//
// //////////////////////////////////////////////////////////////////////////////

class POINT {
	long x;
	long y;
}

class RECT {
	long left;
	long top;
	long right;
	long bottom;
}

// //////////////////////////////////////////////////////////////////////////////
// This class contains the data and functions required to display animated
// sprites.
// A SDLSprite object is created from a pointer to a SDL_Surface object which is
// used
// to store the bitmap data for the sprite. All the sprite's frames must be the
// same width and height and stored in the same bitmap file.
// //////////////////////////////////////////////////////////////////////////////
class SDLSprite {

	public SDLSprite() {
	}

	public SDLSprite(final String Filename, int w, int h, int num) {
	}

	public SDLSprite(SDLSprite pTile) {
	}

	@Override
	protected void finalize() {
	}

	public Util.SDL_bool Create(final String Filename, int w, int h, int num) {
		return null;
	}

	public Util.SDL_bool Create(SDLSprite pTile) {
		return null;
	}

	public int min(int num1, int num2) {
		if (num1 < num2)
			return num1;
		else
			return num2;
	}

	public void SetPos(float pX, float pY) {
		m_PosX = pX;
		m_PosY = pY;
	}

	public void SetVel(float vX, float vY) {
		m_VelX = vX;
		m_VelY = vY;
	}

	public void SetFrame(int Frame) {
		m_Frame = Frame;
	}

	public void SetDelay(int Delay) {
		m_Delay = Delay;
	}

	public void SetState(int State) {
		m_State = State;
	}

	public void SetType(int Type) {
		m_Type = Type;
	}

	public void SetColorKey(Util.Uint8 R, Util.Uint8 G, Util.Uint8 B) {
	}

	public void SetColorKey() {
	}

	public void SetObjective(int ObjX, int ObjY) {
	}

	public float F_Direction() {
		return 0F;
	}

	public void Orientation(float Dir, short NbPos) {
	}

	public void Mvt(double DeltaTime, short NbPos) {
	}

	public void Mvt(double DeltaTime) {
		Mvt(DeltaTime, (short) -1);
	}

	public Util.SDL_bool End_Mvt(Util.SDLSprite Sprite) {
		return null;
	} // verifie si le Sprite est arriv� � destination

	public void SetAlphaValue(Util.Uint32 Shade) {
		m_AlphaValue = Shade;
		Util.SDL_SetAlpha(m_Surface, Util.SDL_SRCALPHA, Shade);
	}

	public Util.SDL_bool SpriteHit(SDLSprite pSprite) {
		return null;
	}

	public Util.SDL_bool SpriteHitPixel(SDLSprite pSprite) {
		return null;
	}

	public void Draw(Util.SDL_Surface lpSDLS, long ScrnWorldX, long ScrnWorldY) {
	}

	public Util.SDL_bool InitShadow(int OffX, int OffY, Util.Uint8 Shade,
			Util.Uint32 Alpha) {
		return null;
	}

	public void SetShadowOffset(int dx, int dy) {
	}

	public void SetShadowValue(Util.Uint8 Shade, Util.Uint32 Alpha) {
	}

	protected void Init() {
	}

	protected Util.SDL_bool m_TileCreated;

	public float m_PosX; // The sprite's X position
	public float m_PosY; // The sprite's Y position
	public float m_PosZ;
	public int Dest_X; // The sprite's X destination
	public int Dest_Y; // The sprite's Y destination
	public float m_VelR; // Radial speed (en pixels / sec)
	public float m_VelX; // The sprite's X velocity (en pixels / sec)
	public float m_VelY; // The sprite's Y velocity (en pixels / sec)
	public int m_Frame; // The current frame
	public int m_NbFrame; // Number frames for an animation
	public int m_NbTotFrame; // Total number of different frames for this sprite
	public int m_Delay; // Used for game timing, the time till the next frame
	public Util.Uint32 m_DelayStart; // Begining of the sprite's timing
	public int m_State; // User defined state. Walking, jumping, etc
	public int m_Type; // User defined type. Health, weapon, etc
	public float m_Angle; // The sprite's angle of rotation
	public Util.SDL_bool m_Shadowed; // Is a shadow surface exist ?

	public Util.SDL_Surface m_Surface; // emplacement de la surface Bitmap
	public Util.SDL_Surface m_Shadow; // empacement de la surface pour l'ombre
	public int m_PixelWidth; // la largeur de l'image Bitmap
	public int m_PixelHeight; // la hauteur de l'image Bitmap
	public int m_BlockWidth; // The width of one tile, in pixels
	public int m_BlockHeight; // The height of one tile, in pixels
	public int m_BlockNum; // The number of tiles in the bitmap file

	public int m_ShadowOffsetX; // Shadow offset from sprite
	public int m_ShadowOffsetY; // Shadow offset from sprite
	public Util.Uint32 m_ShadowValue; // Shadow value (0=black, 255=white)
	public Util.Uint32 m_ShadowAlpha; // Shadow alpha value (0=opaque,
										// 255=totaly transparent)
	public Util.Uint32 m_AlphaValue; // Sprite Alpha value (0=opaque, 255=totaly
										// transparent)
	public Util.Uint32 m_ColorKey; // Transparent color key

	public Util.SDLSprite m_Next; // A SDLSprite pointer to the next sprite in a
									// SDLSpriteList
	public Util.SDLSprite m_Prev; // A SDLSprite pointer to the previous sprite
									// in a SDLSpriteList
}
