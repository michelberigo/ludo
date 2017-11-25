package Controller;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import Util.Image;
import Util.Timer;

@SuppressWarnings("serial")
public class ScreenCon extends Canvas implements Runnable {
	
	private static ScreenCon display = null;
	private Timer fpsCounter = new Timer(30);
	
	private int width = 800, height = 600;

	Image tab = new Image("tabuleiro.jpg");
	
	private ScreenCon() {
		Dimension dim = new Dimension(width, height);
		this.setPreferredSize(dim);
		this.setMaximumSize(dim);
		this.setMinimumSize(dim);
	}
	
	public static ScreenCon getScreen() {
		if (display == null)
			display = new ScreenCon();
		return display;
	}

	public void run() {
		while (Main.isGameRunning()) {
			if (fpsCounter.run()) {
				this.render();
			}
		}
	}
	
	private void render() {
		this.getGraphics().setColor(Color.black);
		this.getGraphics().fillRect(0, 0, width, height);
		this.getGraphics().drawRoundRect(0, 0, width, height, 30, 30);
		
		//tab.draw(width - height, 0, height, height);
		
		this.getGraphics().dispose();
	}

	public void mouseClicked(int button, int x, int y) {
		int dado = DadoCon.getDado().jogar();
		System.out.println(dado);
	}
}
