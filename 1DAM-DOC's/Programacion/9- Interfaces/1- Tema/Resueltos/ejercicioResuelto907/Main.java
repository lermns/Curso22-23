package tema9.ejerciciosResueltos.ejercicioResuelto907;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Socio[] arrSocios = {new Socio(5,"Pepe"),
							 new Socio(7,"María"),
							 new Socio(2,"María")};
		
		System.out.println("Array Inicial: " + Arrays.deepToString(arrSocios));
		System.out.println("Compara " + arrSocios[0] + " con " + arrSocios[1] + ": " + arrSocios[0].compareTo(arrSocios[1]));
		System.out.println("Compara " + arrSocios[1] + " con " + arrSocios[2] + ": " + arrSocios[1].compareTo(arrSocios[2]));
	    
		Arrays.sort(arrSocios);
		
		System.out.println("Array Ordenado: " + Arrays.deepToString(arrSocios));

	}

}
