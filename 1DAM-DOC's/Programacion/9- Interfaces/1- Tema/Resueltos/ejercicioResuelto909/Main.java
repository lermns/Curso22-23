package tema9.ejerciciosResueltos.ejercicioResuelto909;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Socio[] arrSocios = {new Socio(5,"Pepe",33),
							 new Socio(7,"María",22),
							 new Socio(2,"Juan",25)};
		ComparadorSocioEdad comp=new ComparadorSocioEdad();
		
		System.out.println("Array Inicial: " + Arrays.deepToString(arrSocios));
		Arrays.sort(arrSocios, new Comparator() {
			@Override
			public int compare(Object obj1, Object obj2) {
				return ((Socio)obj1).getStrNombre().compareTo(((Socio)obj2).getStrNombre());
			}
		});
		System.out.println("Array Ordenado por edad creciente: " + Arrays.deepToString(arrSocios));
		Arrays.sort(arrSocios, new ComparadorSocioEdad().reversed());
		System.out.println("Array Ordenado por edad decreciente: " + Arrays.deepToString(arrSocios));

	}

}
