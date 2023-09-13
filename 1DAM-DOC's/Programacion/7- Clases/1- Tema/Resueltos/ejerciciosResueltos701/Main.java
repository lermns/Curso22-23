package tema7.ejerciciosResueltos.ejerciciosResueltos701;

public class Main {

	public static void main(String[] args) {
		CuentaCorriente cuenta = new CuentaCorriente("123456789", "Pepe");
		
		cuenta.mostrar();
		cuenta.ingresar(20);
		cuenta.mostrar();
		cuenta.sacar(10);
		cuenta.mostrar();
		cuenta.sacar(15);
		cuenta.mostrar();
		//adicional no pedido
		cuenta.ingresar();
		cuenta.mostrar();

	}

}
