package tema3;

import java.util.Scanner;

public class EjercicioResuelto10 {

	public static void main(String[] args) {
		int intAcumulador=0;//guarda la suma
		final byte NUM_IMPARES=10;
		
		
		//for(int intCont=1;intCont<=19;intCont+=2)
		for(int intCont=1,intNum=1;intCont<=NUM_IMPARES;intNum++)
			if(intNum%2!=0) {
				System.out.println(intNum);
				intAcumulador+=intNum;
				intCont++;
			}
			
		
		System.out.print("La suma es: " + intAcumulador);
	}

}
