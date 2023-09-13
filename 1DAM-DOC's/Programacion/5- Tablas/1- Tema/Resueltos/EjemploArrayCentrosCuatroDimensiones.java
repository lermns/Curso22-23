package tema5;

import java.util.Scanner;

public class EjemploArrayCentrosCuatroDimensiones {
	final static int BRAILLE=0;
	final static int EUROPA=1;
	final static int DAM=0;
	final static int DAW=1;

	public static void main(String[] args) {
		double rlnArrayNotas[][][][]= new double[2][2][5][2];//centro, curso, alumno, nota evaluación
		Scanner scnLeer = new Scanner(System.in);
		
		//imprimo los valores
		//paso por los centros BRAILLE y EUROPA
		for(int intIndiceCentro=0; intIndiceCentro<rlnArrayNotas.length;intIndiceCentro++) {
			if(intIndiceCentro==BRAILLE)
				System.out.println("IES LUIS BRAILLE");
			else if(intIndiceCentro==EUROPA)
				System.out.println("IES EUROPA");
			//paso por los cursos DAM y DAW
			for(int intIndiceCurso=0; intIndiceCurso<rlnArrayNotas[0].length;intIndiceCurso++) {
				imprimeCurso(intIndiceCurso);//imprime el nombre del curo DAM o DAW
				imprimeEvaluaciones(rlnArrayNotas[0][0][0].length); //imprimo titulo "Alumno:" y las evaluaciones
				for(int intIndiceAlumno=0; intIndiceAlumno<rlnArrayNotas[0][0].length;intIndiceAlumno++) {
					System.out.print("\t\t Dame la nota del alumno:"+ (intIndiceAlumno+1));
					
					//meto la nota del alumno
					for(int intIndiceNota=0; intIndiceNota<rlnArrayNotas[0][0][0].length;intIndiceNota++) {
						System.out.print(" " + (intIndiceNota+1) + "ºEv: " );
						rlnArrayNotas[intIndiceCentro][intIndiceCurso][intIndiceAlumno][intIndiceNota]=scnLeer.nextDouble();
					}
					
					System.out.println();
				}
			}
		}
		scnLeer.close();
		imprimeNotas(rlnArrayNotas);
	}

	private static void imprimeNotas(double[][][][] rlnArrayNotas) {
		//imprimo los valores
		//paso por los centros BRAILLE y EUROPA
		for(int intIndiceCentro=0; intIndiceCentro<rlnArrayNotas.length;intIndiceCentro++) {
			if(intIndiceCentro==BRAILLE)
				System.out.println("IES LUIS BRAILLE");
			else if(intIndiceCentro==EUROPA)
				System.out.println("IES EUROPA");
			//paso por los cursos DAM y DAW
			for(int intIndiceCurso=0; intIndiceCurso<rlnArrayNotas[0].length;intIndiceCurso++) {
				imprimeCurso(intIndiceCurso);//imprime el nombre del curo DAM o DAW
				imprimeEvaluaciones(rlnArrayNotas[0][0][0].length); //imprimo titulo "Alumno:" y las evaluaciones
				for(int intIndiceAlumno=0; intIndiceAlumno<rlnArrayNotas[0][0].length;intIndiceAlumno++) {
					System.out.print("\t\t"+ (intIndiceAlumno+1));
					for(int intIndiceNota=0; intIndiceNota<rlnArrayNotas[0][0][0].length;intIndiceNota++)
						System.out.print("\t" + rlnArrayNotas[intIndiceCentro][intIndiceCurso][intIndiceAlumno][intIndiceNota]);
					System.out.println();
				}
			}
		}
	}

	private static void imprimeEvaluaciones(int intNumEvaluaciones) {
		System.out.print("\t\tAlumno:");
		for(int intCont=1; intCont<=intNumEvaluaciones;intCont++)
			System.out.print("\t" + intCont +"ºEv");
		System.out.println();
	}

	private static void imprimeCurso(int intCurso) {
		switch (intCurso) {//por si meto más cursos luego
			case 0->System.out.println("\tDAM");
			case 1->System.out.println("\tDAW");
		}
		
	}

}
