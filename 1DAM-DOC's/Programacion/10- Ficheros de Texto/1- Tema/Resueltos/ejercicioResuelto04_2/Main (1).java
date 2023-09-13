package tema10.ejerciciosResueltos.ejercicioResuelto04Dos;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		int intCaracter;
		int intNumeros=0;
		int intAcumulador=0;
		FileReader fr = null;
		String strNumero;
		
		try {
			fr = new FileReader("../../documents/ejemplo.txt");
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido abrir el archivo");
		}
		
		if(fr!=null) {
			try {
				intCaracter = fr.read();

				while(intCaracter!=-1) {
					strNumero="";
					while(intCaracter!=-1 && "0123456789".contains(Character.toString((char)intCaracter))) {
						strNumero+=(char)intCaracter;
						intCaracter = fr.read();
					}
					while(intCaracter!=-1 && !"0123456789".contains(Character.toString((char)intCaracter))) 
						intCaracter = fr.read();
						
					if(strNumero!="") {
						intAcumulador += Integer.parseInt(strNumero);
						intNumeros++;
					}
						
				}
				fr.close();
			} catch (IOException e) {}
		}
		
		System.out.println("La suma de los números es " + intAcumulador + " y la media " + (intNumeros==0?0:intAcumulador/intNumeros));
	}

}
