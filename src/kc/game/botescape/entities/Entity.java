package kc.game.botescape.entities;

import java.awt.*;

public abstract class Entity {
	
	private static final Toolkit tk = Toolkit.getDefaultToolkit();
	
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	private Image img;
	
	public Entity() {

	}
	
	public final void update() {
		posX += velX;
		posY += velY;
	}
	
	public final void draw(Graphics2D g) {
		g.drawImage(img, (int) posX, (int) posY, null);
	}
	
	protected final static Image loadImage(String imgName) {
		return tk.getImage(ClassLoader.getSystemResource(imgName));
	}
	
	public final double getPosX() {
		return posX;
	}

	public final void setPosX(double posX) {
		this.posX = posX;
	}

	public final double getPosY() {
		return posY;
	}

	public final void setPosY(double posY) {
		this.posY = posY;
	}

	public final void setVelX(double velX) {
		this.velX = velX;
	}

	public final void setVelY(double velY) {
		this.velY = velY;
	}

	protected final void setImage(Image img) {
		this.img = img;
	}

}
