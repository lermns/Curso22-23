package tema3;

import java.util.Scanner;

public class EjercicioResuelto11 {

	public static void main(String[] args) {
		int intLeido, intAcumulador=1;//leido del usuario
		System.out.print("Dame el número para sacar el factorial: ");
		intLeido = new Scanner(System.in).nextInt();
		
		for(int intCont=intLeido;intCont>0;intCont--)
			intAcumulador*=intCont;
		
		System.out.print("El factorial de " + intLeido + " es: " + intAcumulador);
	}

}
