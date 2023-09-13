package tema9.ejerciciosPropuestos.ejercicioPropuesto924;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

import tema9.ejerciciosPropuestos.ejercicioPropuesto920.ComparadorSocioEdadNum;
import tema9.ejerciciosPropuestos.ejercicioPropuesto920.ComparadorSocioNombre;
import tema9.ejerciciosPropuestos.ejercicioPropuesto920.Socio;

public class Main {

	public static void main(String[] args) {
		Lista elementos = new Lista();
		Lista cadenas = new Lista();
		
		elementos.push(new Socio(5,"Pepe",LocalDate.of(2000, 12, 22)));
		elementos.push(new Socio(7,"María",LocalDate.of(2000, 10, 20)));
		elementos.push(new Socio(3,"María",LocalDate.of(2000, 10, 20)));
		elementos.push(new Socio(9,"María",LocalDate.of(2005, 3, 7)));
		elementos.push(new Socio(1,"María",LocalDate.of(2001, 2, 15)));
		elementos.push(new Socio(2,"Juan",LocalDate.of(2004, 8, 17)));
		
		cadenas.push("uno");
		cadenas.push("dos");
		cadenas.push("tres");
		cadenas.push("cuatro");
		cadenas.push("cinco");
		
		//9.25
		System.out.println("Lista Inicial: " + cadenas);
		cadenas.ordenar();
		System.out.println("Lista Ordenada por criterio por defecto " + cadenas);
		
		//9.26 El orden natural es el de nombre
		System.out.println("Lista Inicial: " + elementos);
		elementos.ordenar();
		System.out.println("Lista Ordenada por criterio por defecto " + elementos);
		
		//9.27 pro edad y num 
		elementos.ordenar(new ComparadorSocioEdadNum());
		System.out.println("Lista Ordenada por edad y numero id " + elementos);
	}

}
