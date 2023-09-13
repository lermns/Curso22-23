package tema7.ejerciciosResueltos.ejerciciosResueltos710.maquinaria;

import java.util.Scanner;

import tema7.ejerciciosResueltos.ejerciciosResueltos710.personal.Mecanico;

public class Locomotora {
	private final int intMatricula;
	private int intPotencia;
	private int intAnnoFabrica;
	private Mecanico mecanicoEncargado;
	
	public Locomotora(int intMatricula, int intPotencia, int intAnnoFabrica, Mecanico mecanicoEncargado) {
		this.intMatricula = intMatricula;
		this.intPotencia = intPotencia;
		this.intAnnoFabrica = intAnnoFabrica;
		this.mecanicoEncargado = mecanicoEncargado;
	}
	public Locomotora(int intMatricula, int intPotencia, int intAnnoFabrica) {
		Scanner scnLeer = new Scanner(System.in);
		String strNombre;
		String strTelefono;
		String strEspecialidad;
		
		this.intMatricula = intMatricula;
		this.intPotencia = intPotencia;
		this.intAnnoFabrica = intAnnoFabrica;
		System.out.print("Dame el nombre del mecánico: ");
		strNombre = scnLeer.nextLine();
		System.out.print("Dame el teléfono del mecánico: ");
		strTelefono = scnLeer.nextLine();
		System.out.print("Dame la especialidad del mecánico: ");
		strEspecialidad = scnLeer.nextLine().toUpperCase();
		scnLeer.close();
		this.mecanicoEncargado = new Mecanico(strNombre, strTelefono, strEspecialidad);
	}
}
