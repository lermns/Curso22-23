package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos613 {

	public static void main(String[] args) {
		String strSentencia;//frase para adivinar
		String strAux;
		Scanner scnLeer=new Scanner(System.in);
		int intInicial, intFinal=0;

		System.out.print("Dame una sentencia de c: ");
		strSentencia=scnLeer.nextLine();
		
		do {
			strAux="";
			intInicial=strSentencia.indexOf("/*");
			if(intInicial!=-1) {
				intFinal=strSentencia.indexOf("*/");
				if(intFinal!=-1)
					strAux=strSentencia.substring(0,intInicial) + strSentencia.substring(intFinal+2);
				else
					strAux=strSentencia.substring(0,intInicial);

				strSentencia=strAux;
			}
		}while(intInicial!=-1);
		
		

		System.out.println(strSentencia);
		
	}

	
}