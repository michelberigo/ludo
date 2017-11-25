package Controller;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

import Util.ListenMouse;

public class Main {
	
	private static JFrame frame;
	private static boolean gameRunning = true;

	public static void main(String[] args) {
		frame = new JFrame("Ludo");
		
		frame.add(ScreenCon.getScreen());
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.addWindowListener(new WindowListener() {
			public void windowClosing(WindowEvent arg0) {
				Main.stopGame();
				System.exit(0);
			}
			
			public void windowActivated(WindowEvent arg0) {}
			public void windowClosed(WindowEvent arg0) {}
			public void windowDeactivated(WindowEvent arg0) {}
			public void windowDeiconified(WindowEvent arg0) {}
			public void windowIconified(WindowEvent arg0) {}
			public void windowOpened(WindowEvent arg0) {}
			
		});
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.pack();
		
		ScreenCon.getScreen().addMouseListener(new ListenMouse());
		
		new Thread(ScreenCon.getScreen()).start();
	}
	
	public static void stopGame(){
		gameRunning = false;
	}
	
	public static boolean isGameRunning() {
		return gameRunning;
	}

}
