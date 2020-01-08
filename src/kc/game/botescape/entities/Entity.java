package kc.game.botescape.entities;

import java.awt.*;

public abstract class Entity {
	
	private static final Toolkit tk = Toolkit.getDefaultToolkit();
	
	private double posX;
	private double posY;
	private double velX;
	private double velY;
	private Image img;
	
	public Entity(double posX, double posY) {
		
	}
	
	public final void draw(Graphics2D g) {
		g.drawImage(img, (int) posX, (int) posY, null);
	}
	
	protected final void setImage(Image img) {
		this.img = img;
	}
	
	protected final static Image loadImage(String imgName) {
		return tk.getImage(ClassLoader.getSystemResource(imgName));
	}

}
