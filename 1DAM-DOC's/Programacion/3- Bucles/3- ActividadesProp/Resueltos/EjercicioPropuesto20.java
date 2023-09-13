package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto20 {

	public static void main(String[] args) {
	    int intNum1, intSuma=0;
	    Scanner scnLeer = new Scanner(System.in);
	    
	    do {
		    System.out.print("Dame la siguiente cantidad de dinero: ");
		    intNum1 = scnLeer.nextInt();
		    intSuma+=intNum1;
	    }while(intNum1!=0);
	    scnLeer.close();
   	
	    System.out.print("La suma de dinero que tienes es " + intSuma); 
	}

}
