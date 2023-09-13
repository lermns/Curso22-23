import java.util.Scanner;

public class Otra {
	/* Programa que determina el mayor de dos números o si son iguales*/
	public static void main(String[] args) {
		Scanner scLeer = new Scanner(System.in); //para la entrada de datos 
		int intNum1, intNum2; //números a comparar
		
		System.out.print("Dame un Número: ");
		intNum1 = scLeer.nextInt();
		System.out.print("Dame Otro Número: ");
		intNum2 = scLeer.nextInt();
		
		if(intNum1>intNum2)
			System.out.println("El mayor es: " + intNum1);
		else if(intNum1<intNum2)
				System.out.println("El mayor es: " + intNum2);
			 else
				System.out.println("Son iguales");
	}

}