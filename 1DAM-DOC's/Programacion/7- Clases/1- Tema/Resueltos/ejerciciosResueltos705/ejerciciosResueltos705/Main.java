package tema7.ejerciciosResueltos.ejerciciosResueltos705;

public class Main {

	public static void main(String[] args) {
		Gestor gestor = new Gestor("Juan","912345678");
		CuentaCorriente cuenta=new CuentaCorriente("5678","Maria");
		
		System.out.println(cuenta.toString());
		cuenta=new CuentaCorriente("1234","Pepe", 20, gestor);
		System.out.println(cuenta.toString());
		System.out.println(gestor.toString());

	}

}
