package tema7.ejerciciosResueltos.ejerciciosResueltos701;

import java.util.Scanner;

public class CuentaCorriente {
	String strDni;
	String strNombre;
	double rlnSaldo;
	
	public CuentaCorriente(String strDni, String strNombre) {
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.rlnSaldo = 0;
	}

	public void sacar(double rlnCantidad) {
		if(this.rlnSaldo >= rlnCantidad) {
			this.rlnSaldo -= rlnCantidad;
			System.out.println("Se han sacado " + rlnCantidad + " y ha quedado un saldo de " + this.rlnSaldo);
		}else
			System.out.println("No se ha podido sacar " + rlnCantidad + " porque hay un saldo de " + this.rlnSaldo);

	}
	
	public void ingresar(double rlnCantidad) {
		this.rlnSaldo += rlnCantidad;
	}

	
	public void ingresar() {
		double rlnCantidad;
		
		System.out.print("Dame la cantidad a ingresar: ");
		rlnCantidad=new Scanner(System.in).nextDouble();
		this.rlnSaldo += rlnCantidad;
	} 
	public void mostrar() {
		System.out.println( "CuentaCorriente [strDni=" + strDni + ", strNombre=" + strNombre + ", rlnSaldo=" + rlnSaldo + "]");
	}
	
}
