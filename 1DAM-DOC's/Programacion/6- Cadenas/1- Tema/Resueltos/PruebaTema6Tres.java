package tema6;

import java.util.Arrays;

public class PruebaTema6Tres {

	public static void main(String[] args) {
		char[] chrArray={'h','o','l','a',' ','m','u','n','d','o'};
		
		System.out.println("Con replace sustituye en la cadena \"Hola Mundo\" la \'o\' por la \'@\' \t" + "Hola Mundo".replace('o', '@')); 
		System.out.println("Con replace sustituye en la cadena \"ramón ramírez cabrales\" la \"ra\" por la \"@\" \t" + "ramón ramírez cabrales".replace("ra", "@")); 
		System.out.println("Con replaceFirst sustituye en la cadena \"ramón ramírez cabrales\" la primera apaci�n de \"ra\" por la \"@\" \t" + "ramón ramírez cabrales".replaceFirst("ra", "@")); 
		System.out.println("Con replaceAll sustituye en la cadena \"ramón ramírez cabrales\" las apaciones de \"a|e|i|o|u|�|�|�|�|�\" por la \"@\" \t" + "ramón ramírez cabrales".replaceAll("a|e|i|o|u|á|é|í|ó|ú", "@")); 
  
		System.out.println("Con split descompongo la cadena \"19/12/2022\" en sus miembros y los meto en un array de cadenas " + Arrays.toString("19/12/2022".split("/")));
		
		System.out.println("Con toCharArray descompongo la cadena \"Hola Mundo\" en sus miembros y los meto en un array de caracteres " + Arrays.toString("Hola Mundo".toCharArray()));
		
		System.out.println("Con valueOf recompongo el array de caracteres {'h','o','l','a',' ','m','u','n','d','o'} en la cadena \t" + String.valueOf(chrArray));
		System.out.println("Con valueOf(chrArray,3,4) del caso anterior \t" + String.valueOf(chrArray,3,6));

	}

}
