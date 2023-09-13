package tema8.ejerciciosResueltos.ejerciciosResueltos802;

import tema8.ejerciciosResueltos.ejerciciosResueltos801.Hora;

public class Main {

	public static void main(String[] args) {
		Hora objHora = new Hora(23,55);
		HoraExacta objHora2 = new HoraExacta(23,59,55);
		
		for(int intCont=0; intCont<10; intCont++) {
			objHora.inc();
			System.out.println(objHora);
		}
		
		System.out.println("\nAhora la exacta");
		for(int intCont=0; intCont<10; intCont++) {
			objHora2.inc();
			System.out.println(objHora2);
		}
		
		System.out.println("\nAhora con el padre al hijo");
		objHora=objHora2;
		for(int intCont=0; intCont<10; intCont++) {
			objHora.inc();
			System.out.println(objHora);
		}
	}

}
