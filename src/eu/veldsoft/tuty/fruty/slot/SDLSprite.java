package eu.veldsoft.tuty.fruty.slot;
/*******************************************************************************
 *                        SDLSprite.h  -  1.2.0                                *
 *                           -------------------                               *
 *  begin                : Sept 21 2000                                        *
 *  copyright            : (C) 2000 by regis Quercioli                         *
 *  email                : edorul@caramail.com                                 *
 ******************************************************************************/

/*******************************************************************************
 *                                                                             *
 *   This program is free software; you can redistribute it and/or modify      *
 *   it under the terms of the GNU General Public License as published by      *
 *   the Free Software Foundation; either version 2 of the License, or         *
 *   (at your option) any later version.                                       *
 *                                                                             *
 ******************************************************************************/

////////////////////////////////////////////////////////////////////////////////
// based on : 	$Source: /usr/cvsroot/cdx/src/cdx/cdxsprite.h,v $
// 				$Author: MICHAELR $
// 				$Revision: 2.7 $
//
// Ported to SDL and modified by Regis Quercioli / edorul@caramail.com
//
// 1.1 : Sprite's shadow handling with InitShadow, SetShadowOffset, SetShadowValue,
//       It's automaticaly drawn by Draw.
//
// 1.2 : * Position and velocity variables are now float type (in order to use
//       velocity in pixel/sec rather than pixel/frame in the main program).
//       * Add m_DelayStart var
//
////////////////////////////////////////////////////////////////////////////////

#ifndef SDLSPRITE_H
#define SDLSPRITE_H

#define Pi 3.1415926

typedef struct {
	long int x;
	long int y;
} POINT;

typedef struct {
	long int left ;
	long int top;
	long int right;
	long int bottom;
} RECT;

////////////////////////////////////////////////////////////////////////////////
// This class contains the data and functions required to display animated sprites.
// A SDLSprite object is created from a pointer to a SDL_Surface object which is used
// to store the bitmap data for the sprite. All the sprite's frames must be the
// same width and height and stored in the same bitmap file.
////////////////////////////////////////////////////////////////////////////////
class SDLSprite {
public:
	SDLSprite(void){}
	SDLSprite(final char* Filename, int w, int h, int num){}
	SDLSprite(SDLSprite *pTile){}
	~SDLSprite(void){}

	SDL_bool Create(final char* Filename, int w, int h, int num){}
	SDL_bool Create(SDLSprite *pTile){}

	int  min(int num1, int num2) {
		if (num1<num2) return num1;
		else return num2;
	}
	void SetPos(float pX, float pY) {
		m_PosX = pX;
		m_PosY = pY;
	}
	void SetVel(float vX, float vY) {
		m_VelX = vX;
		m_VelY = vY;
	}
	void SetFrame(int Frame) {
		m_Frame = Frame;
	}
	void SetDelay(int Delay) {
		m_Delay = Delay;
	}
	void SetState(int State) {
		m_State = State;
	}
	void SetType(int Type) {
		m_Type = Type;
	}
	void SetColorKey (Uint8 R, Uint8 G, Uint8 B){}
	void SetColorKey (void){}
	void SetObjective(int ObjX, int ObjY){}
	float F_Direction(void){}
	void Orientation(float Dir, short int NbPos){}
	void Mvt(double	DeltaTime, short int NbPos=-1){}
	SDL_bool End_Mvt(SDLSprite* Sprite){} // verifie si le Sprite est arriv� � destination

	void SetAlphaValue(Uint32 Shade) {
		m_AlphaValue=Shade;
		SDL_SetAlpha(m_Surface, SDL_SRCALPHA, Shade){}
	}

	SDL_bool SpriteHit(SDLSprite* pSprite){}
	SDL_bool SpriteHitPixel(SDLSprite* pSprite){}

	void Draw(SDL_Surface* lpSDLS, long int ScrnWorldX, long int ScrnWorldY){}

	SDL_bool InitShadow(int OffX, int OffY, Uint8 Shade, Uint32 Alpha){}
	void SetShadowOffset(int dx, int dy){}
	void SetShadowValue(Uint8 Shade, Uint32 Alpha){}

protected:
	void Init(){}
	SDL_bool m_TileCreated;

public:
	float m_PosX;				// The sprite's X position
	float m_PosY;				// The sprite's Y position
	float m_PosZ;
	int Dest_X;				// The sprite's X destination
	int	Dest_Y;				// The sprite's Y destination
	float	m_VelR;				// Radial speed (en pixels / sec)
	float m_VelX;				// The sprite's X velocity (en pixels / sec)
	float m_VelY;				// The sprite's Y velocity (en pixels / sec)
	int m_Frame;			// The current frame
	int m_NbFrame;			// Number frames for an animation
	int m_NbTotFrame;		// Total number of different frames for this sprite
	int m_Delay;			// Used for game timing, the time till the next frame
	Uint32 m_DelayStart;    // Begining of the sprite's timing
	int m_State;			// User defined state.  Walking, jumping, etc
	int m_Type;				// User defined type.  Health, weapon, etc
	float m_Angle;			// The sprite's angle of rotation
	SDL_bool m_Shadowed;			// Is a shadow surface exist ?

	SDL_Surface* m_Surface;			// emplacement de la surface Bitmap
	SDL_Surface* m_Shadow;			// empacement de la surface pour l'ombre
	int m_PixelWidth;				// la largeur de l'image Bitmap
	int m_PixelHeight;				// la hauteur de l'image Bitmap
	int m_BlockWidth;				// The width of one tile, in pixels
	int m_BlockHeight;				// The height of one tile, in pixels
	int m_BlockNum;					// The number of tiles in the bitmap file

	int m_ShadowOffsetX; 		// Shadow offset from sprite
	int m_ShadowOffsetY;        // Shadow offset from sprite
	Uint32 m_ShadowValue;       // Shadow value (0=black, 255=white)
	Uint32 m_ShadowAlpha;       // Shadow alpha value (0=opaque, 255=totaly transparent)
	Uint32	  m_AlphaValue;  // Sprite Alpha value (0=opaque, 255=totaly transparent)
	Uint32	  m_ColorKey;    // Transparent color key

	SDLSprite* m_Next;		// A SDLSprite pointer to the next sprite in a SDLSpriteList
	SDLSprite* m_Prev;		// A SDLSprite pointer to the previous sprite in a SDLSpriteList
}
