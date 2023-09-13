package tema3.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto15 {

	public static void main(String[] args) {
		System.out.println("Cuántas filas?:");
	    int intLineas = new Scanner(System.in).nextInt();
	    
	    for(int intLineaN=0; intLineaN < intLineas; intLineaN++) {
	         for(int intColumnaM=0; intColumnaM <= intLineaN; intColumnaM++)
	        	 System.out.print("*");

        	 System.out.println();
	    }
	     for(int intLineaN=0; intLineaN < intLineas; intLineaN++) {
	         for(int intColumnaM=0,intFactN,intFactM,intFactNM; intColumnaM <= intLineaN; intColumnaM++) {
	            intFactN=1;
	            for(int intCont=1; intCont<=intLineaN; intCont++)
	               intFactN*=intCont;
	            intFactM=1;
	            for(int intCont=1; intCont<=intColumnaM; intCont++)
	               intFactM*=intCont;
	            
	            intFactNM = 1;
	            for(int intCont=1; intCont<=intLineaN-intColumnaM; intCont++)
	               intFactNM*=intCont;
	            
	            System.out.print((intFactN/(intFactM*intFactNM)));
	         }
	         System.out.println("");
	      }
		
	}

}
