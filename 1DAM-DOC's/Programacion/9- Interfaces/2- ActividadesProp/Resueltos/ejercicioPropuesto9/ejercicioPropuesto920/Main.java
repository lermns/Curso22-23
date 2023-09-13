package tema9.ejerciciosPropuestos.ejercicioPropuesto920;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		Socio[] arrSocios = {new Socio(5,"Pepe",LocalDate.of(2000, 12, 22)),
							 new Socio(7,"María",LocalDate.of(2000, 10, 20)),
							 new Socio(3,"María",LocalDate.of(2000, 10, 20)),
							 new Socio(9,"María",LocalDate.of(2005, 3, 7)),
							 new Socio(1,"María",LocalDate.of(2001, 2, 15)),
							 new Socio(2,"Juan",LocalDate.of(2004, 8, 17))};
		
		System.out.println("Array Inicial: " + Arrays.deepToString(arrSocios));
		Arrays.sort(arrSocios, new ComparadorSocioEdadNum());
		System.out.println("20 Array Ordenado por edad creciente y num socio si son =: " + Arrays.deepToString(arrSocios));
		
		//Ejercicio 21
		Arrays.sort(arrSocios, new Comparator() {
			@Override
			public int compare(Object obj1, Object obj2) {
				return ((Socio)obj1).getBytEdad().compareTo(((Socio)obj2).getBytEdad());
			}
		});
		System.out.println("21 Array Ordenado por fecha de nacimiento: " + Arrays.deepToString(arrSocios));
		
		//Ejercicio 22
		Arrays.sort(arrSocios, new ComparadorSocioNombre());/*new Comparator() {
					@Override
					public int compare(Object obj1, Object obj2) {
						return ((Socio)obj1).getStrNombre().compareTo(((Socio)obj2).getStrNombre());
					}
				});*/
		System.out.println("22 Array Ordenado por nombre: " + Arrays.deepToString(arrSocios));

		//Ejercicio 23
		Arrays.sort(arrSocios, new ComparadorSocioNombre().reversed());
		System.out.println("23 Array Ordenado por nombre invertido: " + Arrays.deepToString(arrSocios));
	}

}
