package main;

public class Jugador implements InterfaceJugador {

	/* (non-Javadoc)
	 * @see main.InterfaceJugador#correr()
	 */
	@Override
	public void correr() {
		System.out.println("jugador corre");
	}
	
	/* (non-Javadoc)
	 * @see main.InterfaceJugador#parar()
	 */
	@Override
	public void parar() {
		System.out.println("jugador para");
	}
}
