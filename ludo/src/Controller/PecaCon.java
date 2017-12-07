package Controller;

public class PecaCon {
	int id;
	
	public enum Cor {
	       AMARELO, AZUL, VERMELHO, VERDE;
	}
	
	public static Cor getCorAmarelo() {
		return Cor.AMARELO;
	}
	
	public static Cor getCorAzul() {
		return Cor.AZUL;
	}
	
	public static Cor getCorVermelho() {
		return Cor.VERMELHO;
	}
	
	public static Cor getCorVERDE() {
		return Cor.VERDE;
	}
}
