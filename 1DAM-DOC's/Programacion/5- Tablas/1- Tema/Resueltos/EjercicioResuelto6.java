package tema5.resueltos;

import java.util.Arrays;

public class EjercicioResuelto6 {

	public static void main(String[] args) {
		int[] intArrGanadora= {1,2,3,4,5,6};
		int[] intArrApuesta= {9,39,16,12,22,7};
		
		//mostramos el array
		System.out.println(aciertosPrimitiva(intArrApuesta,intArrGanadora));
		
	}

	private static int aciertosPrimitiva(int[] intArrApuesta, int[] intArrCombinGana) {
		int intAciertos=0;
		
		//si no se han pasado los arrays del tamaño correcto se devuelve -1
		if(intArrApuesta.length!=6 || intArrCombinGana.length!=6)
			intAciertos=-1;
		else {
			for(int intCont=0; intCont<6; intCont++)
				if(Arrays.binarySearch(intArrCombinGana, intArrApuesta[intCont])>=0)
					intAciertos++;
		}
		
		return intAciertos;
	}

}
