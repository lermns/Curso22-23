package tema5.resueltos;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioResuelto11 {

	public static void main(String[] args) {
		int[] intArray;//array con la combinaci�n
		int intLongitud;//longitud de la combinaci�n
		int intMin=0, intMax=0;//valores m�ximo y m�nimo que puede tomar la combinaci�n
		long intPrueba;//valor que leo al usuario
		boolean blnFlag;//para saber si queda alg�n d�gito que no sea correcto
		
		do {
			System.out.println("�Cuantos d�gitos quieres que tenga la combinaci�n?");
			intLongitud=new Scanner(System.in).nextInt();
		}while(intLongitud<1);

		intArray=new int[intLongitud];//inicializo con el valor que me haya dado
		//guarda la combinaci�n ganadora en el array
		for(int intCont=0, intMultipicador=1; intCont<intLongitud; intCont++, intMin+=intMultipicador, intMax+=intMultipicador*9, intMultipicador*=10)
			intArray[intCont]=(int)(Math.random()*5+1);
		
		System.out.println("Combinaci�n ganadora: " + Arrays.toString(intArray) + " minimo " + intMin + " Maximo " + intMax);
		
		do {
			System.out.println();
			blnFlag=false;
			do {//Leo una combinaci�n ganadora que pueda ser v�lida
				System.out.println("�Combinaci�n ganadora?");
				intPrueba=new Scanner(System.in).nextLong();
			}while(intPrueba<intMin || intPrueba>intMax);
			
			//paso d�gito por d�gito mirando si son iguales que los del array
			for(int intIndice=0; intIndice<intArray.length; intIndice++) {
				System.out.print(Long.toString(intPrueba).charAt(intIndice));//imprimo el caracter
				//indico si el caracter es correcto, mayor o menor
				if((char)(intArray[intIndice] + '0') == Long.toString(intPrueba).charAt(intIndice))
					System.out.print(" correcto  ");
				else {
					blnFlag=true;//todab�a no es correcta
					if((char)(intArray[intIndice] + '0') < Long.toString(intPrueba).charAt(intIndice))
						System.out.print(" mayor  ");
					else
						System.out.print(" menor  ");
				}
			}
		}while(blnFlag);
		
		System.out.println("Felicidades");
	}
}
