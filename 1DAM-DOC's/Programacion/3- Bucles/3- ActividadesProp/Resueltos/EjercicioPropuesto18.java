package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto18 {

	public static void main(String[] args) {
	    int intNum1,intNum2, intMcm;
	    Scanner scnLeer = new Scanner(System.in);
	    
	    System.out.print("Dame el número 1: ");
	    intNum1 = scnLeer.nextInt();
	    System.out.print("Dame el número 2: ");
	    intNum2 = scnLeer.nextInt();
	    scnLeer.close();
	    
	    intMcm=(intNum1>intNum2)?intNum1:intNum2;//me quedo en el divisor con el menor
	    	
	    for(; intMcm%intNum1!=0 || intMcm%intNum2!=0; intMcm++);
	    
	    System.out.print("El mínimo común multiplo de " + intNum1 + " y " + intNum2 + " es: " + intMcm); 
	}

}
