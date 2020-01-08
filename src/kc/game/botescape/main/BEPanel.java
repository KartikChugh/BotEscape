package kc.game.botescape.main;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.Timer;

import kc.game.botescape.entities.Bots;
import kc.game.botescape.entities.Tank;

public final class BEPanel extends JPanel {
	
	private static final int TPS_DESIRED = 100;
    private static int WIDTH;
    private static int HEIGHT;
    
    private final Tank tank;
    private final Bots bots;
    private int ticks;
    private final Timer timer;

    
    public BEPanel() {
    	setBackground(Color.BLACK);
    	setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    	
    	 timer = new Timer(1000/TPS_DESIRED, this::tick);
    	 tank = new Tank(0, 0);
    	 bots = new Bots();
    }
    
    /**
     * Retrieves panel size. Must be called after frame is packed or made visible
     */
	public void setup() {
		final Dimension size = getSize();
		WIDTH = size.width;
		HEIGHT = size.height;
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
        
    }
	
}