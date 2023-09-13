package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos618 {

	public static void main(String[] args) {
		String strFrase;//palabra a mostrar
		String strAux;
		String[] strArrAux;
		String strConvertida="";//frase ya convertida
		int intPos;//posición del siguente espacio en blanco
		Scanner scnLeer=new Scanner(System.in);
		
		System.out.print("Dame la frase a convertir: ");
		strFrase = scnLeer.nextLine().toLowerCase().strip();
		scnLeer.close();
		strAux=strFrase;
		
		//paso de n letras en n letras cortando la palabra
		intPos = strFrase.indexOf(" ");
		while(intPos!=-1) {
			strConvertida+=Character.toUpperCase(strFrase.charAt(0)) + strFrase.substring(1,intPos);
			strFrase=strFrase.substring(intPos).stripLeading();
			intPos = strFrase.indexOf(" ");
		}
		//quito la primera mayúscula y cojo, si lo hay, el último trozo de la cadena
		strConvertida=Character.toLowerCase(strConvertida.charAt(0)) + strConvertida.substring(1) + Character.toUpperCase(strFrase.charAt(0))+ strFrase.substring(1);
		System.out.println("la frase quedaría: " + strConvertida);
		
		
		//si hay varios espacios en blanco esta manera no funciona
		strConvertida="";
		strArrAux=strAux.split(" ");//dejo cada palabra en una posición del array
		for(String strValr:strArrAux)
			strConvertida+=Character.toUpperCase(strValr.charAt(0)) + strValr.substring(1);
		strConvertida=Character.toLowerCase(strConvertida.charAt(0)) + strConvertida.substring(1);//quito 1º mayúscula
		System.out.println("\n\nde otra manera: "+ strConvertida);
		
	}
}