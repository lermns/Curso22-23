package tema2;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		byte btyNum1,btyNum2, btyOperador;//números a sumar y operador
		short srtResultadoUsr, srtResultado=0; //resultado y dado por el usuario
		char chrOperador=' ';//caracter del operador
		
		btyNum1 = (byte) (Math.random()*99+1);
		btyNum2 = (byte) (Math.random()*99+1);
		btyOperador = (byte) (Math.random()*4+1);
		
		switch(btyOperador) {
			case 1 : { chrOperador='+';
						srtResultado=(short) (btyNum1+btyNum2);
						break;}
			case 2 : { chrOperador='-';
						srtResultado=(short) (btyNum1-btyNum2);
						break;
						}
			case 3 : { chrOperador='*';
						srtResultado=(short) (btyNum1*btyNum2);
						break;
						}

			case 4 : { chrOperador='/';
						srtResultado=(short) (btyNum1/btyNum2);
						break;
						}
		}
		System.out.print("Resultado de " + btyNum1 + chrOperador + btyNum2 + " : ");
		srtResultadoUsr = new Scanner(System.in).nextShort();
		
		if(srtResultadoUsr==srtResultado)
			System.out.println("\nCorrecto");
		else
			System.out.println("\nNo es correcto. El resultado correcto es: " + srtResultado);


	}

}
