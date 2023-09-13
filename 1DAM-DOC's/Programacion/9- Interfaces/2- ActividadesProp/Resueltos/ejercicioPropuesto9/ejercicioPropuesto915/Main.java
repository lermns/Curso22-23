package tema9.ejerciciosPropuestos.ejercicioPropuesto915;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int intMenu;
		Scanner scnLeer = new Scanner(System.in);
		Supercola objSupercola = new Supercola();
		
		do {
			intMenu = menu(scnLeer);
			switch(intMenu) {
								case 1->{  System.out.println("Dame la cadena que quieras encolar en cola1: ");
										   objSupercola.push1(scnLeer.nextLine());
										   System.out.println(objSupercola);
								}
								case 2->{  System.out.println("Dame la cadena que quieras encolar en cola2: ");
								   objSupercola.push2(scnLeer.nextLine());
								   System.out.println(objSupercola);
								}
								case 3->{  System.out.println(objSupercola.pop1());
								   System.out.println(objSupercola);
								}
								case 4->{  System.out.println(objSupercola.pop2());
								   System.out.println(objSupercola);
								}
			}
		}while(intMenu!=5);
		scnLeer.close();
	}

	private static int menu(Scanner scnLeer) {
		int intDevolver;
		
		do {
			System.out.println("Selecciona una opción: "+
								"\n1.-Encolar en cola1"+
								"\n2.-Encolar en cola2"+
								"\n3.-Desencolar en cola1"+
								"\n4.-Desencolar en cola2"+
								"\n5.-Salir");
			intDevolver = Integer.parseInt(scnLeer.nextLine());
		}while(intDevolver<1 || intDevolver>5);
		
		return intDevolver;
	}

}
