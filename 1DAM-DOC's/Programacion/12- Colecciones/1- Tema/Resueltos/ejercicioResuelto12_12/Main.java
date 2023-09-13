package tema12.ejerciciosResueltos.ejercicioResuelto12_12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Set<Integer> conjunto1 = new HashSet<>();
		Set<Integer> conjunto2 = new HashSet<>();
		Set<Integer> union;
		Set<Integer> interseccion;		
		
		conjunto1.add(1);
		conjunto1.add(2);
		conjunto1.add(3);
		conjunto1.add(4);
		conjunto1.add(5);
		System.out.println("c1: " + conjunto1);

		conjunto2.add(4);
		conjunto2.add(5);
		conjunto2.add(6);
		conjunto2.add(7);
		conjunto2.add(8);
		System.out.println("c2: " + conjunto2);

		union = union(conjunto1, conjunto2);
		System.out.println(union);

		interseccion = interseccion(conjunto1, conjunto2);
		System.out.println(interseccion);

	}

	static <E> Set<E> union(Set<E> conj1, Set<E> conj2) {
		Set<E> resultado = new HashSet<>(conj1);
		
		resultado.addAll(conj2);
		return resultado;
	}

	static <E> Set<E> interseccion(Set<E> conj1, Set<E> conj2) {
		Set<E> interseccion = new HashSet<>(conj1);
		
		interseccion.retainAll(conj2);
		return interseccion;
	}
}
