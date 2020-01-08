package kc.game.botescape.entities;

import java.awt.Image;

public final class Tank extends Entity {
	
	private static final Image up, down, left, right;
	private double posX_start;
	private double posY_start;
	
	static {
		up = loadImage("tankU.png");
		down = loadImage("tankD.png");
		left = loadImage("tankL.png");
		right = loadImage("tankR.png");
	}
	
	public Tank() {
		super();
	}
	
	public void init() {
		setImage(up);
		setPosX(posX_start);
		setPosY(posY_start);
	}
	
/*	public void update() {
		
	}*/

	public void setPosStart(double posX_start, double posY_start) {
		this.posX_start = posX_start;
		this.posY_start = posY_start;
	}

	public void directRight() {
		setImage(right);	
		setVelX(2);
		setVelY(0);
	}

	public void directLeft() {
		setImage(left);
		setVelX(-2);
		setVelY(0);
	}

	public void directUp() {
		setImage(up);
		setVelX(0);
		setVelY(-2);
	}

	public void directDown() {
		setImage(down);
		setVelX(0);
		setVelY(2);
	}
	
	public void directStop(boolean horizontal) {
		if (horizontal) {
			setVelX(0);
		} else {
			setVelY(0);
		}
	}
	
	
}
