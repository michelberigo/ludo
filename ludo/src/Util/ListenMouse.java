package Util;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import Controller.ScreenCon;

public class ListenMouse implements MouseListener {

	public void mouseClicked(MouseEvent e) {
		ScreenCon.getScreen().mouseClicked(e.getButton(), e.getX(), e.getY());
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

}
