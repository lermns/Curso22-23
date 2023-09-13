package tema7.ejerciciosPropuestos.ejercicio713;

import java.util.Arrays;

public class Colores {
	private static String[] strArrPaleta= {"Rojo","Verde","Azul","Marrón","Amarillo","Blanco"};
	
	public static String[] seleccionar(int intCantidad) {
		String[] strArrDevolver= {};
		int intColor;

		if(intCantidad>Colores.strArrPaleta.length)//si tengo menos colores que los solicitados
			System.out.println("No hay suficientes colores en la paleta para completar tu solicitud");
		else if(intCantidad==Colores.strArrPaleta.length)//si tengo los mismos colores que los solicitados devuelvo la paleta entera
				strArrDevolver=Colores.strArrPaleta;
			 else {
				while(strArrDevolver.length<intCantidad) {
					intColor=(int)(Math.random()*Colores.strArrPaleta.length);
					strArrDevolver = Colores.insertar(strArrDevolver, Colores.strArrPaleta[intColor]);
				}
			 }
		
		return strArrDevolver;
	}

	private static String[] insertar(String[] strArrDevolver, String strColor) {
		int intIndice;
		
		//busco el color
		for(intIndice=0; intIndice<strArrDevolver.length && !strArrDevolver[intIndice].equals(strColor); intIndice++);
		
		//si no est� lo inserto al final del array
		if(intIndice==strArrDevolver.length) {
			strArrDevolver=Arrays.copyOf(strArrDevolver, strArrDevolver.length+1);
			strArrDevolver[strArrDevolver.length-1]=strColor;
		}			
		return strArrDevolver;
	}

	public static void setStrArrPaleta(String strColor) {
		Colores.strArrPaleta=insertar(Colores.strArrPaleta, strColor);
	}
	
	
}
