package main;

public class Main {

	public static void main(String[] args) {
		InterfaceJugador llorente = new EntrenadorDecorator(new Jugador() );
		
		llorente.correr();
		llorente.parar();
	}
	
}
