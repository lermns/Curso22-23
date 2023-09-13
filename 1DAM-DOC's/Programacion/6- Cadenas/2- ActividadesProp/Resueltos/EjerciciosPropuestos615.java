package tema6.ejerciciosPropuestos;

import java.util.Scanner;

public class EjerciciosPropuestos615 {

	public static void main(String[] args) {
		String strTitulo;//Título de la página web
		String strContenido;//contenido de la página web
		Scanner scnLeer=new Scanner(System.in);
		
		System.out.print("Dame el título de la página web: ");
		strTitulo=scnLeer.nextLine();
		System.out.print("Dame el contenido de la página web: ");
		strContenido=scnLeer.nextLine();
		scnLeer.close();

		System.out.println( "<html>\n" +
							"\t<head>\n" +
							"\t\t<tittle>" + strTitulo + "</tittle>\n" +
							"\t</head>\n" +
							"\t<body>\n" +
							"\t\t<h1>" + strTitulo + "</h1>\n" +
							"\t\t<p>" + strContenido + "</p>\n" +
							"\t</body>\n" +
							"</html>");
	}

	
}