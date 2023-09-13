package ficherosDeTexto.ejerProps.ejer10_18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader a;
		String strLinea, strTexto="";
		try {
			a = new BufferedReader(new FileReader("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_18/numeros.txt"));
			while((strLinea=a.readLine()) != null) {
				strTexto+=strLinea;
			}
			
	        Integer[] enteros = leerEnteros(strTexto);
	        
	        for (int i = 0; i < enteros.length; i++) {
	            System.out.println(enteros[i]);
	        }
	        
		} catch (FileNotFoundException e) {
			System.out.println("El fichero firmas.txt no se encuentra " + e.getMessage());
		}
		
	}
	  public static Integer[] leerEnteros(String texto) {
		  	// Crea una instancia de ArrayList para almacenar los enteros
	        ArrayList<Integer> enteros = new ArrayList<Integer>();
	        // Crea una instancia de StringBuilder para almacenar 
	        //temporalmente los dígitos que se encuentran en la cadena
	        StringBuilder buffer = new StringBuilder();
	        
	        for (int i = 0; i < texto.length(); i++) {
	            char c = texto.charAt(i);
	            // Si el carácter es un dígito, lo agrega al buffer
	            if (Character.isDigit(c)) {        
	                buffer.append(c);
	            // Si el carácter no es un dígito pero hay números en el buffer, convierte el buffer en un entero
	            //y lo agrega a la lista de enteros
	            } else if (buffer.length() > 0) {
	                // Si el buffer no está vacío, lo convierte a un entero y lo agrega a la lista
	                int entero = Integer.parseInt(buffer.toString());
	                enteros.add(entero);
	                
	                // Limpia el buffer para el siguiente número
	                buffer.setLength(0);
	            }
	        }
	        
	        // Si hay algún número en el buffer al final del texto, lo agrega a la lista
	        if (buffer.length() > 0) {
	            int entero = Integer.parseInt(buffer.toString());
	            enteros.add(entero);
	        }
	        
	        // Convierte la lista a un arreglo y lo devuelve
	        Integer[] resultado = new Integer[enteros.size()];
	        enteros.toArray(resultado);
	        return resultado;
	    }

}
