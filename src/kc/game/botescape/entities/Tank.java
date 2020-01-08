package kc.game.botescape.entities;

import java.awt.Image;

public class Tank extends Entity {
	
	private static final Image up, down, left, right;
	
	static {
		up = loadImage("tankU.png");
		down = loadImage("tankD.png");
		left = loadImage("tankL.png");
		right = loadImage("tankR.png");
	}
	
	public Tank(double posX, double posY) {
		super(posX, posY);
	}
	
	public void init() {
		
	}
	
	public void update() {
		
	}
	
}
