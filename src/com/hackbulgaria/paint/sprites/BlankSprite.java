package com.hackbulgaria.paint.sprites;

import java.awt.Color;
import java.awt.Graphics;

public class BlankSprite extends Sprite{
	@Override
	public void draw(Graphics graphics) {
		 graphics.setColor(Color.BLACK); //set color
	        graphics.fillRect(0, 0, 2000, 2000); //fill the whole window with black
	}



}
