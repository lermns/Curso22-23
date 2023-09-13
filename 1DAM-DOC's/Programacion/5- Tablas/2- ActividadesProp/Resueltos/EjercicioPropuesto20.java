package tema5.propuestos;

import java.util.Arrays;

public class EjercicioPropuesto20 {

	public static void main(String[] args) {
		int[] intArrUno = {11,33, 66, 99};
		int[] intArrDos = {0,22, 44, 55, 66, 77, 88};
		int[] intArrDestino = new int[intArrUno.length+intArrDos.length];
		int intIndiceUno=0, intIndiceDos=0, intIndiceDestino=0, intQuitar=0;
		
		//mientras los dos arrasys origen tengan elementos, voy cogiendo el m�s peque�o
		while(intIndiceUno<intArrUno.length && intIndiceDos<intArrDos.length) {
			if(intArrUno[intIndiceUno]==intArrDos[intIndiceDos]) {
				intArrDestino[intIndiceDestino]=intArrUno[intIndiceUno];
				intIndiceDos++;
				intIndiceUno++;
				intQuitar++;//quito un elemento más del array destino
			}else if(intArrUno[intIndiceUno]<intArrDos[intIndiceDos]) {
						intArrDestino[intIndiceDestino]=intArrUno[intIndiceUno];
						intIndiceUno++;
				}else {
						intArrDestino[intIndiceDestino]=intArrDos[intIndiceDos];
						intIndiceDos++;
				}
			intIndiceDestino++;
		}
		intArrDestino=Arrays.copyOf(intArrDestino,intArrDestino.length-intQuitar);
		
		//recorro el que le queden elementos y lo copio en el destino
		if(intIndiceUno<intArrUno.length)
			System.arraycopy(intArrUno, intIndiceUno, intArrDestino, intIndiceDestino, intArrDestino.length-intIndiceDestino);
		else
			System.arraycopy(intArrDos, intIndiceDos, intArrDestino, intIndiceDestino, intArrDestino.length-intIndiceDestino);

		System.out.println("Array origen primero: " + Arrays.toString(intArrUno));
		System.out.println("Array origen segundo: " + Arrays.toString(intArrDos));
		System.out.println("Array destino: " + Arrays.toString(intArrDestino));
	}

}
