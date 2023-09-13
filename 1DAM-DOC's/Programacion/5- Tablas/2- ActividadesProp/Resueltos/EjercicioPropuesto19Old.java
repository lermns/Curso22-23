package w;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPropuesto19 {
	public static void main(String[] args) {
		int[] intCorredores= new int[0];
		int[] intCorredoresMenores= new int[0];
		Scanner scnLeer = new Scanner(System.in);
		int intDorsal=0;
		
		intCorredores=llegaMeta(intCorredores,scnLeer);//inserta en el array los dorsales de los corredores
		System.out.println(Arrays.toString(intCorredores));
		
		//sacamos a un nuevo array los dorsales de los corredores menores		
		do{
			System.out.print("Dame el dorsal que entra o pulsa -1 para terminar ");
			intDorsal=scnLeer.nextInt();
			intArray=Arrays.copyOf(intArray, intArray.length+1);
			intArray[intArray.length-1]=intDorsal;
			
		}while(intDorsal!=-1);
		scnLeer.close();
	}

	//inserta en el array los dorsales de los corredores
	//inserción en desorden
	private static int[] llegaMeta(int[] intArray, Scanner scnLeer) {
		int intDorsal;
				
		System.out.print("Dame el dorsal que entra o pulsa -1 para terminar ");
		intDorsal=scnLeer.nextInt();
		
		while(intDorsal!=-1) {
			intArray=Arrays.copyOf(intArray, intArray.length+1);
			intArray[intArray.length-1]=intDorsal;
			System.out.print("Dame el dorsal que entra o pulsa -1 para terminar ");
			intDorsal=scnLeer.nextInt();
		}
		
		return intArray;
	}

}
