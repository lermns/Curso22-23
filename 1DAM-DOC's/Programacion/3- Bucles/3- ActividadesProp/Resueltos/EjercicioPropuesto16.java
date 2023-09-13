package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto16 {

	public static void main(String[] args) {
		System.out.println("Cuántas filas?:");
	    int intLineas = new Scanner(System.in).nextInt();
	    
	    
	    for(int intLinea=1; intLinea <= intLineas; intLinea++) {
	    	//triángulo de blancos 
	    	for(int intColumna=intLineas-intLinea; intColumna >0; intColumna--)
	        	 System.out.print("0");
	    	//triángulo de asteriscos 
	    	for(int intColumna=1; intColumna <= intLinea; intColumna++)
	        	 System.out.print("*0");
        	 System.out.println();
	    }
	     
	}

}
