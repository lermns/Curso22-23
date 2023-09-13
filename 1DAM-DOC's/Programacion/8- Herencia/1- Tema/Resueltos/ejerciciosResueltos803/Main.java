package tema8.ejerciciosResueltos.ejerciciosResueltos803;

import tema8.ejerciciosResueltos.ejerciciosResueltos801.Hora;

public class Main {

	public static void main(String[] args) {
		HoraExacta objHora1 = new HoraExacta(23,59,55);
		HoraExacta objHora2 = new HoraExacta(23,59,54);
		
		System.out.println("hora1: " + objHora1 + " hora2: " + objHora2 + " son iguales: " + objHora1.equals(objHora2));
		objHora2.inc();
		System.out.println("hora1: " + objHora1 + " hora2: " + objHora2 + " son iguales: " + objHora1.equals(objHora2));

	}

}
