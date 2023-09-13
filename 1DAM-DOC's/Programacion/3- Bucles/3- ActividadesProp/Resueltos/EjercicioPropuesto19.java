package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto19 {

	public static void main(String[] args) {
	    int intNum1, intRaiz;
	    Scanner scnLeer = new Scanner(System.in);
	    
	    System.out.print("Dame un número: ");
	    intNum1 = scnLeer.nextInt();
	    scnLeer.close();
   	
	    for(intRaiz=1; intRaiz*intRaiz<=intNum1; intRaiz++);
	    intRaiz--;
	    System.out.print("La raiz más cercana a " + intNum1 + " es: " + intRaiz + " y su resto es: " + (intNum1-(intRaiz*intRaiz))); 
	}

}
