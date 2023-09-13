package w;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPropuesto18 {
	public static void main(String[] args) {
		int[][] intArray= rellenaMatrizCuadrada(4);
		
		System.out.println(Arrays.deepToString(intArray));
		if(esMagica(intArray))
			System.out.println("La matriz es mágica");
		else
			System.out.println("La matriz no es mágica");
	}

	private static boolean esMagica(int[][] intArray) {
		int intSumaReferencia=0;
		boolean blnMagica=true;
		
		for(int intIndiceY=0; intIndiceY<intArray[0].length; intIndiceY++)//sumo la primera línea y guardo el valor para comprobar el resto
			intSumaReferencia+=intArray[0][intIndiceY];
			
		//recorro el array sumando filas y columnas
		for(int intIndiceX=0, intSumFila, intSumColumna; intIndiceX<intArray.length && blnMagica; intIndiceX++) {
			intSumFila=0;//en cada iteración inicializo los valores de suma de fila y columna
			intSumColumna=0;
			for(int intIndiceY=0; intIndiceY<intArray[0].length; intIndiceY++) {
				intSumFila+=intArray[intIndiceX][intIndiceY];//como no cambio el primer indice sumo la fila
				intSumColumna+=intArray[intIndiceY][intIndiceX];//como no cambio el segundo indice sumo la columna
			}
			if(intSumFila!=intSumaReferencia || intSumColumna!=intSumaReferencia) // si alguno no me da el valor esperado ya no será mágica
				blnMagica=false;
		}
		
		return blnMagica;
	}

	private static int[][] rellenaMatrizCuadrada(int intDimension) {
		int[][] intArray= new int[intDimension][intDimension];
		Scanner scnLeer = new Scanner(System.in);
		
		for(int intIndiceX=0; intIndiceX<intDimension; intIndiceX++)
			for(int intIndiceY=0; intIndiceY<intDimension; intIndiceY++) {
				System.out.print("Dame el elemento " + intIndiceX + ", " + intIndiceY + ": ");
				intArray[intIndiceX][intIndiceY]=scnLeer.nextInt();
			}
		scnLeer.close();
			
		return intArray;
	}

}
