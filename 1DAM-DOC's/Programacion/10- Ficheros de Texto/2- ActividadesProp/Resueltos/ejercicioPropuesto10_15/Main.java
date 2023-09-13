package tema10.ejerciciosPropuestos.ejercicioPropuesto10_15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args)  {
		BufferedReader br = null;
		Integer intNum = 0;
		Integer intMayor = null;
		int intMenor = 0;
		String strNumero;
		
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_15/numeros.txt"));
		} catch (FileNotFoundException e) {	
				System.out.println("No existe el fichero numeros.txt");
			}
		
		if(br != null) {
			while(br!=null) {
				try {
					intNum = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					do {
						try {
							strNumero=br.readLine();
							if(strNumero==null) {
								br.close();
								br=null;
							}
							intNum = Integer.parseInt(strNumero);
						} catch (Exception e1) {}
					}while(intNum==null);
				} catch (IOException ie) {}
				if(intMayor==null) {
					intMayor = intNum;
					intMenor = intNum;
				}else {
					if(intMayor < intNum)
						intMayor = intNum;
					if(intMenor > intNum)
						intMenor = intNum;
				}
			}
			System.out.println("N�mero mayor: " + intMayor + " n�mero menor: " + intMenor);
			
		}
	}

}
