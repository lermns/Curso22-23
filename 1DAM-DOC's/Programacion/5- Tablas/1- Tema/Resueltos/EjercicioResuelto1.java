package tema5.resueltos;

import java.util.Arrays;

public class EjercicioResuelto1 {

	public static void main(String[] args) {
		double[] rlnArrNumeros = new double[10];
		double rlnSuma=0;
		
		//rellenamos la tabla
		for(int intCont=0; intCont<rlnArrNumeros.length; intCont++)
			rlnArrNumeros[intCont]=Math.random()*99+1;
		
		//mostramos el array
		System.out.println(Arrays.toString(rlnArrNumeros));
		
		//Sacamos la suma
		for(double rlnValor:rlnArrNumeros)
			rlnSuma+=rlnValor;
		
		//mostramos la suma
		System.out.println("Suma total: " + rlnSuma);

	}

}
