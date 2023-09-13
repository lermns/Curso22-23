package tema3;

import java.util.Scanner;

public class EjercicioResuelto2 {

	public static void main(String[] args) {
		int intEdad, intSumaEdades=0, intNumeroAlumnos=0, intNumeroMayores=0;//guarda la edad de un alumno, suma de las edades, el número de alumnos y el número de alumnos mayores
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame la edad del alumno " + (intNumeroAlumnos+1)+ ":");
		intEdad = scnLeer.nextInt();
		while(intEdad>0) {
			intNumeroAlumnos++;
			intSumaEdades+=intEdad;
			if(intEdad>=18)
				intNumeroMayores++;
			System.out.println("Dame la edad del alumno " + (intNumeroAlumnos+1));
			intEdad = scnLeer.nextInt();
		}
		if(intNumeroAlumnos==0)
			System.out.println("No has introducido ningún alumno");
		else {
			System.out.println("Suma de las edades: "+ intSumaEdades);
			System.out.println("Media de las edades: "+ intSumaEdades/intNumeroAlumnos);
			System.out.println("Número de alumnos: "+ intNumeroAlumnos);
			System.out.println("Número de alumnos mayores de edad: "+  intNumeroMayores);
		}
	}

}
