package eu.veldsoft.tuty.fruty.slot;
/*******************************************************************************
 *                        SDLSpriteList.h  -  1.1.0                            *
 *                           -------------------                               *
 *  begin                : Tue Aug 15 2000                                     *
 *  copyright            : (C) 2000 by regis Quercioli                         *
 *   email                : edorul@caramail.com                                *
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
// 1.1 : Add DelayStart as parametre in AddSprite function
//
////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////
// Sprite lists are used to store sprites in a dynamic fashion. A SDLSpriteList
// is a linked list of SDLSprite objects, which can be added and removed at run-time.
//
// LOOPING THE LIST: When using a sprite list you will often need to loop through
// the list and perform operations on each of the sprites in the list, such as
// updating their positions.  The code below shows how to loop through a SDLSpriteList:
//
// SDLSpriteList SpriteList;
// SDLSprite* Node;
//
// SDLSprite* Save;
//
// for(Node = SpriteList.Next(); Node != SpriteList.List(); Node = Save)
// {
//     Save = Node->m_Next;
//     Add code to update sprite here
// }
//
// Notice that if you intend to remove sprites from the list as you update them you
// must save a pointer to the next sprite in the list to prevent the loop becoming lost.
////////////////////////////////////////////////////////////////////////////////

class SDLSpriteList {
public:

	SDLSpriteList(void);

	~SDLSpriteList(void);

	SDLSprite *AddSprite(SDLSprite* pTile, int Type=0, int PosX=0, int PosY=0, int VelX=0, int VelY=0, int State=0, int Frame=0, int Delay=0, Uint32 DelayStart=0);

	SDLSprite* AddSprite(SDLSprite* pNode);

	void DelSprite(SDLSprite* pNode);

	SDLSprite* Next(void) {
		return m_List.m_Next;
	}

	SDLSprite* Prev(void) {
		return m_List.m_Prev;
	}

	SDLSprite* List(void) {
		return &m_List;
	}

	void Draw(SDL_Surface* lpSDLS, long int ScrnWorldX, long int ScrnWorldY);

public:

	SDLSprite m_List;			// The top of the list

	int m_nSprites;				// The number of sprites in the list
};
