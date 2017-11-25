package Controller;

import java.util.Random;

public class DadoCon {
	
	public static DadoCon dado = null; 
	
	public final int numFaces = 6;
	private int valor;
	private Random rand;
	
	private DadoCon() {
		rand = new Random();
	}
	
	public static DadoCon getDado() {
		if (dado == null)
			dado = new DadoCon();
		return dado;
	}
	
	public int jogar() {
		valor = Math.abs(rand.nextInt()%numFaces) + 1;
		
		return valor;
	}
	
	public int getValor() {
		return valor;
	}
}
