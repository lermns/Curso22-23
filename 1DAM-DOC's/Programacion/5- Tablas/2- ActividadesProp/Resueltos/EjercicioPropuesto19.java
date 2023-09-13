package tema5;

import java.util.Arrays;
import java.util.Scanner;

public class Otra {
    public static void main(String[] args) {
    	Scanner scn = new Scanner(System.in);
    	boolean blnMenor=false;
    	int participantes[] = {};
    	int n,intAux;

		System.out.println("Dame un número de dorsal");
		n = scn.nextInt( );
    	while(n!=-1) {
    		participantes = Arrays.copyOf(participantes, participantes.length+1);
    		participantes [ participantes.length-1] =n;
    		System.out.println("Dame un número de dorsal del corredor que acaba de llegar");
    		n = scn.nextInt( );
    	}
    	System.out.println(Arrays.toString(participantes));
    	
    	
    	do{
    		System.out.println("Dame un número de dorsal de participantes menores o -1");
    		n = scn.nextInt( );
    		intAux=buscar(participantes,n);
    		if(intAux>0 && !blnMenor) {//por si hay varios menores contiguos
    			participantes[intAux]=participantes[intAux-1];
    			participantes[intAux-1]= n;
    			blnMenor=false;
    		}else if(intAux==0)
    				blnMenor=true;
	    		  else
	    			blnMenor=false;
    	}while(n>0);
    	System.out.println(Arrays.toString(participantes));

    	do{
    		System.out.println("Dame un número de dorsal de participantes que han dado positivo o -1");
    		n = scn.nextInt( );
    		intAux=buscar(participantes,n);
    		if(n>=0) 
    			participantes=elimina(participantes,intAux, true);
    	}while(n>0);
    	System.out.println(Arrays.toString(participantes));
    	
    	do{
    		System.out.println("Dame un número de dorsal de participantes que no han pagado o -1");
    		n = scn.nextInt( );
    		intAux=buscar(participantes,n);
    		if(n>=0) 
    			participantes=elimina(participantes,intAux, false);
    	}while(n>0);
    	System.out.println(Arrays.toString(participantes));

    	
    	System.out.println("EL PRIMERO ES "+participantes[0]);
    	if(participantes.length>1)
    		System.out.println("EL SEGUNDO ES "+participantes[1]);
    	if(participantes.length>2)
    		System.out.println("EL TERCERO ES "+participantes[2]);


    }

	private static int[] elimina(int[] participantes, int intIndiceBorrado, boolean blnElimina) {
		int intAux=0;
		
		if(!blnElimina)
			intAux= participantes[intIndiceBorrado];
		
		System.arraycopy(participantes, intIndiceBorrado + 1, participantes, intIndiceBorrado, participantes.length - (intIndiceBorrado + 1));
		
		if(blnElimina)
			participantes = Arrays.copyOf (participantes, participantes.length - 1);
		else
			participantes[participantes.length-1]=intAux;

		return participantes;
	}

	private static int buscar(int[] participantes, int n) {
		int intIndice;
		
		for(intIndice=0; intIndice<participantes.length && participantes[intIndice]!=n; intIndice++);
		if(intIndice!=participantes.length)
			return intIndice;
		else
			return -1;

	}
}
