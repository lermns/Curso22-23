package tema5.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto15 {
	final static int NUMALUMNOS = 2;
	final static int NUMTRIMESTRES = 2;
	
	public static void main(String[] args) {
		int[][][] intArrayNotas; //notas de los alumnos
		Scanner scnLeer= new Scanner(System.in);
		int intGrupos; //indica cuantos grupos de alumnos tenemos
		
		System.out.print("Dame el número de grupos: ");
		intGrupos = scnLeer.nextInt();
		
		//inicializamos el array de notas
		intArrayNotas = new int[intGrupos][NUMALUMNOS][NUMTRIMESTRES];
		
		intArrayNotas=insertarNotas(intArrayNotas, scnLeer, intGrupos);
		
		imprimeMedias(intArrayNotas, intGrupos);
		
		imprimeNotaAlumno(intArrayNotas, scnLeer);
		
		scnLeer.close();
		
	}

	private static void imprimeNotaAlumno(int[][][] intArrayNotas, Scanner scnLeer) {
		int intGrupos;
		int intAlumno;
		int intMediaAlumno=0;
		System.out.println("Dame los valores para dar una nota: ");
		do {
			System.out.print("Dame el número de grupo: ");
			intGrupos = scnLeer.nextInt();
		}while(intGrupos<1 || intGrupos>intArrayNotas.length);
		
		do {
		System.out.print("Dame el número del alumno: ");
		intAlumno = scnLeer.nextInt();
		}while(intAlumno<1 || intAlumno>intArrayNotas[0].length);
		
		for(int intIndice=0; intIndice<intArrayNotas[0][0].length; intIndice++)
			intMediaAlumno+=intArrayNotas[intGrupos-1][intAlumno-1][intIndice];
		
		System.out.println("La nota del alumno es: "+ intMediaAlumno);
	}

	private static void imprimeMedias(int[][][] intArrayNotas, int intGrupos) {
		System.out.println("Notas medias por grupos:");
		for(int intIndiceGrupos=0; intIndiceGrupos<intGrupos; intIndiceGrupos++) {
			System.out.print("Grupo " + (intIndiceGrupos+1) + ": ");
			for(int intIndiceTrimestres=0,intMedia; intIndiceTrimestres<NUMTRIMESTRES; intIndiceTrimestres++) {
				System.out.print("\tTrimestre" + (intIndiceTrimestres+1) + ": ");
				intMedia=0;
				for(int intIndiceAlumnos=0; intIndiceAlumnos<NUMALUMNOS; intIndiceAlumnos++)
					intMedia+=intArrayNotas[intIndiceGrupos][intIndiceAlumnos][intIndiceTrimestres];
				System.out.print(intMedia);
			}
			System.out.println();
		}
	}

	private static int[][][] insertarNotas(int[][][] intArrayNotas, Scanner scnLeer, int intGrupos) {
		//Pedimos los valores
		System.out.println("Inserta las notas de los alumnos:");
		for(int intIndiceGrupos=0; intIndiceGrupos<intGrupos; intIndiceGrupos++) {
			System.out.println("Grupo " + (intIndiceGrupos+1));
			for(int intIndiceAlumnos=0; intIndiceAlumnos<NUMALUMNOS; intIndiceAlumnos++){
				System.out.println("\tAlumno" + (intIndiceAlumnos+1));
				for(int intIndiceTrimestres=0; intIndiceTrimestres<NUMTRIMESTRES; intIndiceTrimestres++) {
					System.out.print("\t\tTrimestre" + (intIndiceTrimestres+1) + ":");
					intArrayNotas[intIndiceGrupos][intIndiceAlumnos][intIndiceTrimestres]=scnLeer.nextInt();
				}
			}
		}
		
		return intArrayNotas;
	}

}
