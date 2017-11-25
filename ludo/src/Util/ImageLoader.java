package Util;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageLoader {
	
	private static ImageLoader loader = null;
	
	private ImageLoader(){}
	
	public static ImageLoader getInstance() {
		if (loader == null)
			loader = new ImageLoader();
		return loader;
	}
	
	public BufferedImage loadImage(String s) {
		BufferedImage bi = null;
		
		try {
			bi = ImageIO.read(getClass().getResource(s));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return bi;
	}

}
