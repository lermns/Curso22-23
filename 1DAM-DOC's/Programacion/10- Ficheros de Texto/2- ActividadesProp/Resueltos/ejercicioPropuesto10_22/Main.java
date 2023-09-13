package tema10.ejerciciosPropuestos.ejercicioPropuesto10_22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner scnLeer;
		BufferedReader br = null;
		String strCadena;
		int intPos, intLeidos=0;
		double[] rlnArrAcumuladores = {0, 0, 0};
		
		try {
			br = new BufferedReader (new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_22/deportistas.txt"));
			strCadena = br.readLine();

			while(strCadena!=null){//pasa por cada deportista
				intLeidos++;
				System.out.println(strCadena);//imprime
				scnLeer=new Scanner(strCadena);
				intPos = 0;
				while(scnLeer.hasNext())//si tiene más valores los leo quedándome solo con los números
					try {
						rlnArrAcumuladores[intPos] += Double.parseDouble(scnLeer.next().replace(',', '.'));
						intPos++;
					} catch (Exception e) {}
				strCadena = br.readLine();
			}
			intLeidos--;
			if(intLeidos>0)
				System.out.println("Las medias son: edades " + rlnArrAcumuladores[0]/intLeidos + " pesos " + rlnArrAcumuladores[1]/intLeidos + " estaturas " + rlnArrAcumuladores[2]/intLeidos);

		} catch (FileNotFoundException e) {
			System.out.println("No existe el fichero");
		} catch (IOException e) {
			System.out.println("Fallo de lectura");
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("No se ha podido cerrar el fichero");
				}
			}
		}
	}

}
