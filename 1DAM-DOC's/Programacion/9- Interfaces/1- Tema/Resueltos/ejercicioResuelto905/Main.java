package tema9.ejerciciosResueltos.ejercicioResuelto905;

import java.util.Scanner;

import tema9.ejerciciosResueltos.ejercicioResuelto901.Cola;

public class Main {

	public static void main(String[] args) {
		Scanner scnLeer = new Scanner(System.in);
		Integer intNum;
		Cola objCola = new Cola() {
			private Lista turnos = new Lista();
			@Override
			public Integer pop() {
				Integer intDevolver=null;
				
				if(turnos.elementos()>0) {
					intDevolver=this.turnos.elemento(0);
					this.turnos.eliminarPosicion(0);
				}
				return intDevolver;
			}

			@Override
			public void push(int intElemento) {
				this.turnos.insertarFinal(intElemento);
				
			}
			
			@Override
			public int elementos() {
				return turnos.elementos();
			}
		};
		
		System.out.print("Dame el elemento a insertar o pon un número negativo: ");
		intNum = scnLeer.nextInt();
		while(intNum>=0) {
	         objCola.push(intNum);
	         System.out.print("Dame el elemento a insertar o pon un número negativo: ");
	 		 intNum = scnLeer.nextInt();
	     }
	     scnLeer.close();
	      
	     System.out.println("Sacamos los elementos de la Cola");
	     while (objCola.elementos()>0)
	         System.out.println(objCola.pop());

	}

}
