package tema8.ejerciciosPropuestos.ejerciciosPropuestos817;

public class Main {

	public static void main(String[] args) {
		Cola apilados = new Cola();
		
		apilados.push(5);
		apilados.push(4);
		apilados.push(3);
		apilados.push(2);
		System.out.println(apilados);
		System.out.println("Sacar elemento: " + apilados.pop());
		System.out.println("Sacar elemento: " + apilados.pop());
		System.out.println("Sacar elemento: " + apilados.pop());
		System.out.println("Sacar elemento: " + apilados.pop());
		System.out.println("Sacar elemento: " + apilados.pop());
	}

}
