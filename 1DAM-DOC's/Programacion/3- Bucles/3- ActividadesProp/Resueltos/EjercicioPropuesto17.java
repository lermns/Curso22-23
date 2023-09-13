package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto17 {

	public static void main(String[] args) {
	    int intNum1,intNum2, intMcd;
	    Scanner scnLeer = new Scanner(System.in);
	    
	    System.out.print("Dame el número 1: ");
	    intNum1 = scnLeer.nextInt();
	    System.out.print("Dame el número 2: ");
	    intNum2 = scnLeer.nextInt();
	    scnLeer.close();
	    
	    intMcd=(intNum1<intNum2)?intNum1:intNum2;//me quedo en el divisor con el menor
	    	
	    for(; intNum1%intMcd!=0 || intNum2%intMcd!=0; intMcd--);
	    
	    System.out.print("El maximo común divisor de " + intNum1 + " y " + intNum2 + " es: " + intMcd); 
	}

}
