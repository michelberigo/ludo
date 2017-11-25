package Util;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import Controller.ScreenCon;

public class Image {
	
	public static BufferedImage img;
	
	public Image (String s) {
		img = ImageLoader.getInstance().loadImage("/image/"+s);
	}
	
	public void draw(int posX, int posY, int wid, int hei) {
		Graphics g = ScreenCon.getScreen().getGraphics();
		if (g != null && img != null) {
			g.drawImage(img, posX, posY, wid, hei, null);
		}
	}
	
	public void draw(int posX, int posY) {
		if (img != null)
			this.draw(posX, posY, img.getWidth(), img.getHeight());
	}
}
