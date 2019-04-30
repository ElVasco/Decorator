package main;

//clase que decora otro elemento de tipo interfazJugador
public class EntrenadorDecorator implements InterfaceJugador{

	private InterfaceJugador target;
	
	public EntrenadorDecorator(InterfaceJugador target) {
		this.target = target;
	}

	@Override
	public void correr() {
		System.out.println("Entrenador manda a correr");
		target.correr();
	}

	@Override
	public void parar() {
		System.out.println("Entrenador manda a parar");
		target.parar();
	}
}
