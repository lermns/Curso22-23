package tema3;

import java.util.Scanner;

public class EjercicioResuelto5 {

	public static void main(String[] args) {
		int intNum1, intNum2, intLeido, intIntentos=0;//Numeros aleatorios, leido del usuario y número de intentos
		Scanner scnLeer = new Scanner(System.in);
		
		do{
			intNum1 = (int)(Math.random()*100+1);
			intNum2 = (int)(Math.random()*100+1);
			System.out.print("Dime la suma de  " + intNum1 + "+" + intNum2);
			intLeido=scnLeer.nextInt();
			intIntentos++;
		}while(intLeido==intNum1+intNum2);
		
		System.out.println("Numero de aciertos: " + (intIntentos-1));
			
	}

}
