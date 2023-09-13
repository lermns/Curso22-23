package tema10.ejerciciosPropuestos.ejercicioPropuesto10_17;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		BufferedReader br = null;
		String strLinea;
		
		System.out.print("Dame un nombre de fichero para mostrar: ");
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_17/" + new Scanner(System.in).nextLine()));
		} catch (FileNotFoundException e) {	
				System.out.println("No existe el fichero indicado ");
		}
		
		if(br != null) {
			try {
				strLinea = br.readLine();
				for(int intCont=1;strLinea!=null;intCont++) {
					System.out.println(strLinea);
					if(intCont%3==0) {
						System.out.println("...............pulsa una tecla para continuar");
						new Scanner(System.in).nextLine();
					}
					strLinea = br.readLine();
				}
			
				br.close();
			} catch (IOException e) {}
		}
	}

}
