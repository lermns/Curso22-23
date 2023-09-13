package tema7.ejerciciosResueltos.ejerciciosResueltos709;

public class Main {

	public static void main(String[] args) {
		Bombilla objBombilla = new Bombilla();
		Bombilla objBombilla2 = new Bombilla();
		
		objBombilla2.encender();
		System.out.println("La bombilla al principio está encendida? " + objBombilla.estaEncendida() + " La bombilla2 al principio está encendida? " + objBombilla2.estaEncendida());
		objBombilla.encender();
		System.out.println("Tras encender la  bombilla, ¿La bombilla está encendida? " + objBombilla.estaEncendida() + " Tras encender la  bombilla, ¿La bombilla2 está encendida? " + objBombilla2.estaEncendida());
		objBombilla.pulsarGeneral();//no recomendable
		System.out.println("Pulsado el General una vez, ¿La bombilla está encendida? " + objBombilla.estaEncendida() + " Pulsado el General una vez, ¿La bombilla2 está encendida? " + objBombilla2.estaEncendida());
		Bombilla.pulsarGeneral();
		System.out.println("Pulsado el General una segunda vez, ¿La bombilla está encendida? " + objBombilla.estaEncendida() + " Pulsado el General una segunda vez, ¿La bombilla2 está encendida? " + objBombilla2.estaEncendida());
		objBombilla.apagar();
		System.out.println("Tras apagar la  bombilla , ¿La bombilla está encendida? " + objBombilla.estaEncendida() + " Tras apagar la  bombilla , ¿La bombilla2 está encendida?  " + objBombilla2.estaEncendida());
		Bombilla.pulsarGeneral();
		System.out.println("Pulsado el General una tercera vez, ¿La bombilla está encendida? " + objBombilla.estaEncendida() + " Pulsado el General una tercera vez, ¿La bombilla2 está encendida? " + objBombilla2.estaEncendida());
	}

}
