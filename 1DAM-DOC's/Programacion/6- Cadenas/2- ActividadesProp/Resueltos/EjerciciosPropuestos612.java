package tema6.ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosPropuestos612 {

	public static void main(String[] args) {
		final int INTENTOS=7;
		Scanner scnLeer=new Scanner(System.in);
		String strFrase;//frase para adivinar
		String strFraseIntento="";//frase intento
		char chrLetra;
		char[] chrArrLetras= {};
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
			if(!buscar(chrArrLetras,chrLetra)) {//si no existe la letra la meto y modifico la frase con el nuevo caracter
				chrArrLetras=Arrays.copyOf(chrArrLetras, chrArrLetras.length+1);
				chrArrLetras[chrArrLetras.length-1]=chrLetra;
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
		char[] chrArrAux= strFraseIntento.toCharArray();
		
		for(int intCont=0; intCont<chrArrAux.length; intCont++)
			if(strFrase.charAt(intCont)==chrLetra)
				chrArrAux[intCont]=chrLetra;
		System.out.println("pon letra"+ Arrays.toString(chrArrAux));
		return String.valueOf(chrArrAux);
	}

	private static boolean buscar(char[] chrArrLetras, char chrLetra) {
		boolean blnBuscar=true;
		int intCont=0;
		
		for(;intCont<chrArrLetras.length && chrArrLetras[intCont]!=chrLetra;intCont++);
		
		if(intCont==chrArrLetras.length) 
			blnBuscar=false;
		
		return blnBuscar;
	}
}