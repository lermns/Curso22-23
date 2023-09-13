package tema7.ejerciciosResueltos.ejerciciosResueltos703;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta1=new CuentaCorriente("1234","Pepe",400);
		
		System.out.println("Cuenta1:");
		System.out.println("Se puede sacar 300€ de la cuenta1? " + cuenta1.sacarDinero(300));
		cuenta1.ingresarDinero(2000);
		System.out.println("Se ingresan 2000€ en la cuenta1 y queda: " + cuenta1.toString());
		
		//acceso a los atributos de las cuentas
		//System.out.println("Intento sacar el saldo de la cuenta1 directamente " + cuenta1.rlnSaldo);//no se puede por ser privado
		System.out.println("Intento sacar el nombre de la cuenta1 directamente " + cuenta1.strNombre);//se puede por ser púbico
		System.out.println("Intento sacar el DNI de la cuenta1 directamente " + cuenta1.strDni);//se puede por ser vecina de la clase
		//System.out.println("Intento sacar el saldo de la cuenta1 directamente " + cuenta1.rlnSaldo);//no se puede por ser privado el acceso
	}

}
