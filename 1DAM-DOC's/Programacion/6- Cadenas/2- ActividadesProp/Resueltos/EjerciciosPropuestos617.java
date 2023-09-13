package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos617 {

	public static void main(String[] args) {
		String strPalabra;//palabra a mostrar
		String strAux;
		int intNumLetras;//número de letras a cortar la palabra
		int intCont;//contador del bucle
		Scanner scnLeer=new Scanner(System.in);
		
		System.out.print("Dame en número de letras en que quieras romper la palabra: ");
		intNumLetras = scnLeer.nextInt();
		System.out.print("Dame una palabra a romper: ");
		strPalabra = scnLeer.next();
		scnLeer.close();

		//paso de n letras en n letras cortando la palabra
		for(intCont=0; intCont<strPalabra.length()-intNumLetras;intCont+=intNumLetras)
			System.out.println(strPalabra.substring(intCont,intCont+intNumLetras));
		
		if(intCont<strPalabra.length())
			System.out.println(strPalabra.substring(intCont));
		
		//otra manera
		System.out.println("\n\n");
		while(!strPalabra.isEmpty()) {
			intNumLetras=intNumLetras<=strPalabra.length()?intNumLetras:strPalabra.length();//para no pasarme al hacer el corte
			strAux=strPalabra.substring(0,intNumLetras);//cojo el trozo de la palabra
			strPalabra=strPalabra.substring(intNumLetras);//le quito a la palabra lo que he mostrado
			System.out.println(strAux);
		}
	}
}