package tema9.ejerciciosPropuestos.ejercicioPropuesto913;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Futbolista[] arrFutbolistas= {new Futbolista("1A", "Pepe", 25, 3),
									  new Futbolista("2B", "Juan", 19, 1),
									  new Futbolista("3C", "Luis", 25, 0),
									  new Futbolista("4D", "Lucas", 21, 7),
									  new Futbolista("5E", "Marco", 25, 5)};
		
	    System.out.println("Futbolistas ordenados por Nombre");
	    Arrays.sort(arrFutbolistas, new ComparadorFutbolistaNombre());
	    System.out.println("\t" + Arrays.deepToString(arrFutbolistas));
	    
	    System.out.println("Futbolistas ordenados por DNI");
	    Arrays.sort(arrFutbolistas);
	    System.out.println("\t" + Arrays.deepToString(arrFutbolistas));
	    
	    System.out.println("Futbolistas ordenados por Nombre");
	    Arrays.sort(arrFutbolistas, new ComparadorFutbolistaEdad());
	    System.out.println("\t" + Arrays.deepToString(arrFutbolistas));
	}

}
