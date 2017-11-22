package Controller;

public class JogadorCon {
	String nome;
	boolean turno;
	
	public static void jogaDado () {
		int valorDado;
		valorDado = DadoCon.getDado().jogar();
		
		if (valorDado == 6) {
			JogadorCon.jogaDado ();
		}
	}
	
	
	
	public boolean finalizarTurno () {
		turno = false;
		return turno;
	}
}
