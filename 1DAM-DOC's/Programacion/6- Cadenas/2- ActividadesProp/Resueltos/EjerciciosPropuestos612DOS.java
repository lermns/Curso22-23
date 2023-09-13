package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos612DOS {

	public static void main(String[] args) {
		final int INTENTOS=7;
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;//frase para adivinar
		String strFraseIntento="";//frase intento
		char chrLetra;
		String strLetras= "";
		int intIntentos=0;
		
		System.out.print("Dame una frase para adivinar: ");
		strFrase=scnLeer.nextLine().toLowerCase();
		
		//Rellenamos la frase de guiones
		for(int intCont=0; intCont<strFrase.length(); intCont++)
			if(strFrase.charAt(intCont)==' ')
				strFraseIntento+=' ';
			else
				strFraseIntento+='_';
		
		//repetir mientras las frases no sean iguales	
		do {
			System.out.println(strFraseIntento + " Intentos restantes: " + (INTENTOS-intIntentos));
			System.out.print("Dame una letra: ");
			chrLetra=Character.toLowerCase(scnLeer.nextLine().charAt(0));
			if(strLetras.indexOf(chrLetra)==-1) {//si no existe la letra la meto y modifico la frase con el nuevo caracter
				strLetras+=chrLetra;
				strFraseIntento=ponLetra(strFrase,strFraseIntento,chrLetra);
				if(strFrase.indexOf(chrLetra)==-1)
					intIntentos++;
			}
				
		}while(!strFrase.equals(strFraseIntento) && intIntentos<INTENTOS);
		scnLeer.close();
		
		if(intIntentos<INTENTOS)
			System.out.println("Felicidades");
		else
			System.out.println("Has perdido, se acabaron los intentos");
	}

	private static String ponLetra(String strFrase, String strFraseIntento, char chrLetra) {
		for(int intCont=0; intCont<strFrase.length(); intCont++)
			if(strFrase.charAt(intCont)==chrLetra)
				strFraseIntento=strFraseIntento.substring(0,intCont) + chrLetra + strFraseIntento.substring(intCont+1);

		return strFraseIntento;
		
	}

	
}