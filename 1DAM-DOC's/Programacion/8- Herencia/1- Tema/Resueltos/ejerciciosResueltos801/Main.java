package tema8.ejerciciosResueltos.ejerciciosResueltos801;

public class Main {

	public static void main(String[] args) {
		Hora objHora = new Hora(24,55);
		
		for(int intCont=0; intCont<10; intCont++) {
			objHora.inc();
			System.out.println(objHora);
		}
	}

}
