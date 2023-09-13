package tema7.ejerciciosResueltos.ejerciciosResueltos704;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta1;
		CuentaCorriente cuenta2=new CuentaCorriente("5678","Maria");
		
		System.out.println("Valores de la cuenta2: " + cuenta2.toString());
		cuenta1=new CuentaCorriente("1234","Pepe",400);
		System.out.println("Valores de la cuenta1: " + cuenta1.toString());
		System.out.println("Valores de la cuenta2: " + cuenta2.toString());
		
		CuentaCorriente.setStrNombreBanco("Banco Nuevo");
		System.out.println("Valores de la cuenta1: " + cuenta1.toString());
		
	}

}
