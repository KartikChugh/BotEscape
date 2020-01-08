package kc.game.botescape.main;

import javax.swing.*;


public class BotEscape {
	
	public static final String VERSION = "0.1.0";
	
	public static void main(String[] args) {
        SwingUtilities.invokeLater(BotEscape::initFrame);
    }

    private static void initFrame() {
    	
        final JFrame frame = new JFrame("Bot Escape " + VERSION);
        final BEPanel panel = new BEPanel();

        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);   
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        panel.setup();
        panel.start();
        
    }

}
