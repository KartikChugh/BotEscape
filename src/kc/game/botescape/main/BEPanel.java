package kc.game.botescape.main;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.Timer;

import kc.game.botescape.entities.Bots;
import kc.game.botescape.entities.Tank;

public final class BEPanel extends JPanel {
	
	private static final int TPS_DESIRED = 200;
    private static int WIDTH;
    private static int HEIGHT;
    
    private final Tank tank;
    private final Bots bots;
    private int ticks;
    private final Timer timer;

    
    public BEPanel() {
    	setBackground(Color.BLACK);
    	setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    	addKeyListener(new aKeyListener());
    	setFocusable(true);

    	 timer = new Timer(1000/TPS_DESIRED, this::tick);
    	 tank = new Tank();
    	 bots = new Bots();
    }
    
    /**
     * Retrieves panel size. Must be called after frame is packed or made visible
     */
	public void setup() {
		final Dimension size = getSize();
		WIDTH = size.width;
		HEIGHT = size.height;
		tank.setPosStart(WIDTH / 2, HEIGHT / 2);
	}
	
	public void start() {
		ticks = 0;
		bots.init();
		tank.init();
		timer.start();
	}
	
	private void tick(ActionEvent e) {
		tank.update();
		bots.update();
		repaint();
		ticks++;
	}
	
	@Override
    protected void paintComponent(final Graphics g) {
        super.paintComponent(g);
        final Graphics2D g2d = (Graphics2D) g;
        
        tank.draw(g2d);
    }
	
	private class aKeyListener extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e) {
			
			switch(e.getKeyCode()) {
			
			case KeyEvent.VK_RIGHT:
				tank.directRight();
				break;
				
			case KeyEvent.VK_LEFT:
				tank.directLeft();
				break;
				
			case KeyEvent.VK_UP:
				tank.directUp();
				break;
				
			case KeyEvent.VK_DOWN:
				tank.directDown();
				break;
			
			}
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			
			switch(e.getKeyCode()) {
			
			case KeyEvent.VK_RIGHT:
				tank.directStop(true);
				break;
				
			case KeyEvent.VK_LEFT:
				tank.directStop(true);
				break;
				
			case KeyEvent.VK_UP:
				tank.directStop(false);
				break;
				
			case KeyEvent.VK_DOWN:
				tank.directStop(false);
				break;
			
			}
		}
		
	}
	
}