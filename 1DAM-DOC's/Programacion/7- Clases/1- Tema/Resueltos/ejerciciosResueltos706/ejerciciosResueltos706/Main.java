package tema7.ejerciciosResueltos.ejerciciosResueltos706;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Hora objHora = new Hora();
		int intCont;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println(objHora.toString());//para ver que inicialmente se ha puesto todo a 0
		System.out.print("Dame la hora de la que quieres partir: ");
		objHora.setHora(scnLeer.nextInt());
		System.out.print("Dame el minuto del que quieres partir: ");
		objHora.setMinuto(scnLeer.nextInt());
		System.out.print("Dame el segundo del que quieres partir: ");
		objHora.setSegundo(scnLeer.nextInt());
		System.out.println(objHora.toString());
		

		System.out.print("Dame los segundos que quieres mostrar ");
		intCont=scnLeer.nextInt();
		scnLeer.close();
		
		for(;intCont>0;intCont--) {
			objHora.subeSegundo();
			//No hacer ¡¡¡¡NUNCA!!!!
			System.out.println(Hora.mostrarHora(objHora.getBtyHora(),objHora.getBtyMinuto(),objHora.getBtySegundo()));
			//Hacer esto de debajo
			//System.out.println(objHora.toString());
		}
	}

}
