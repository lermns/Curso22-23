package tema13.ejerciciosResueltos.ejercicioResuelto13_03;


import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;


public class Main {

	public static void main(String[] args) {
		Cliente[] strArrPersonas = {new Cliente("Pepe",22), new Cliente("Ana",18), new Cliente("Ram�n",19)};
		
		
		System.out.println(mayor(strArrPersonas,((obj1,obj2)->obj1.getIntEdad()-obj2.getIntEdad())));
	}
	
	private static <T> T mayor(T [] array, Comparator<T> comp){
		TreeSet<T> listaElementos = new TreeSet<>(comp);
		
		listaElementos.addAll(Arrays.asList(array));
		
		return listaElementos.last();
	}
}
