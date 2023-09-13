package tema6.ejerciciosResueltos;

import java.util.Scanner;

public class EjerciciosResueltos608 {

	public static void main(String[] args) {
		final String PREFIJO="Javalin, javalón";
		final String SUFIJO="Javalín, len, len";
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;
		boolean blnIdioma=false;
		
		System.out.print("Dame una frase para ver si esta en el idioma de Javalandia: ");
		strFrase=scnLeer.nextLine();
		scnLeer.close();

		if(strFrase.toLowerCase().startsWith(PREFIJO)) {
			blnIdioma=true;
			strFrase=strFrase.substring(PREFIJO.length());
			//strFrase=strFrase.replace(PREFIJO,"");
		}else if(strFrase.endsWith(SUFIJO)) {
					blnIdioma=true;
					strFrase=strFrase.substring(0, strFrase.lastIndexOf(SUFIJO));
					//strFrase=strFrase.substring(0, strFrase.length()-SUFIJO.length());
			  }
		if(blnIdioma) {
			System.out.println("La frase esta escrita en el idioma de Javalandia y su traducción es: ");
			System.out.println(strFrase.strip());
		}else
			System.out.println("La frase no esta escrita en el idioma de Javalandia");
			

	}
}