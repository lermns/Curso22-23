//https://prlazarus.tk/md_2014_06_10.html

package tema11.ejerciciosPropuestos.ejercicioPropuesto11_27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		String strOrigen, strDestino;
		Scanner scnLeer = new Scanner(System.in);
		File f = null;
		//pedir origen y destino
		do {
			System.out.print("Dame la ubicación desde la que quieres copiar: ");
			strOrigen = scnLeer.nextLine();
			f = new File(strOrigen);
		}while (!f.exists() || (f.exists() && !f.isDirectory() )) ;
		System.out.print("Dame la ubicación destino a la que quieres copiar: ");
		strDestino = scnLeer.nextLine();
		scnLeer.close();
		
		copiarDirectorio(strOrigen,strDestino);
	}

	//Copiar un directorio y todo su contenido de forma recursiva
	private static void copiarDirectorio(String strOrigen, String strDestino) {
		File dirOrigen = new File(strOrigen);
		String [] strArrContenidoDirectorio;
		File f;
		
		if (dirOrigen.isDirectory()) {//si es un directorio lo pasado hago algo, sino salgo
			creaSiNoExisteDirectorio(strDestino);//si el destino no existe lo creo
			strArrContenidoDirectorio = dirOrigen.list();//guardo todo lo que tengo en el directorio origen
			if (strArrContenidoDirectorio.length > 0) //si tiene algo dentro me pongo a copiarlo, sino salgo
				for (String strArchivo : strArrContenidoDirectorio) {
					f = new File (strOrigen + File.separator + strArchivo);
					if(f.isDirectory()) //si es un directorio llama para volver a copiarlo 
						copiarDirectorio(strOrigen+File.separator+strArchivo+File.separator, strDestino+File.separator+strArchivo+File.separator);
					 else  //Es un archivo
						copiarArchivo(strOrigen+File.separator+strArchivo, strDestino+File.separator+strArchivo);
				}
		}
	}	

	// Copia el archivo origen en el destino
	private static void copiarArchivo(String strOrigen, String strDestino) {
		try {
			File fichOrigen = new File(strOrigen);
			File fichDestino = new File(strDestino);
			InputStream in = new FileInputStream(fichOrigen);
			OutputStream out = new FileOutputStream(fichDestino);
			byte[] bytBuffer = new byte[1024];
			int intLongitud;
	
			while ((intLongitud = in.read(bytBuffer)) > 0) {
				out.write(bytBuffer, 0, intLongitud);
			}
	
			in.close();
			out.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Comprueba si un directorio existe, y si no existe lo crea
	private static void creaSiNoExisteDirectorio(String ruta) {
		File directorio = new File(ruta);
		
		if (!directorio.exists()) {
			directorio.mkdirs();
		}
	}
}