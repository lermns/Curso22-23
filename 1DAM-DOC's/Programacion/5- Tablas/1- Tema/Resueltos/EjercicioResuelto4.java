package tema5.resueltos;

import java.util.Arrays;

public class EjercicioResuelto4 {
	public static int maximo(int [] intArray) {
		int intMax=intArray[0];//pongo el primero como mayor para comparar
		
		//paso por todos los elementos del array, comparando con el mayor
		//si es mayor el elemento en que estamos que el mayor guardado, lo cambiamos
		for(int intValor:intArray)
			if(intValor>intMax)
				intMax=intValor;
		
		return intMax;
	}
	
	public static void main(String[] args) {
		int[] intArrNumeros = new int[10];
		
		//rellenamos la tabla
		for(int intCont=0; intCont<intArrNumeros.length; intCont++)
			intArrNumeros[intCont]=(int)(Math.random()*100);
				
		//mostramos el array
		System.out.println(Arrays.toString(intArrNumeros));
		System.out.println("El valor máximo del array es: " +  maximo(intArrNumeros));
	}

}
