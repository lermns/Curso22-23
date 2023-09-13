package tema8.ejerciciosPropuestos.ejerciciosPropuestos818;

public class Main {

	public static void main(String[] args) {
		ColaDoble apilados = new ColaDoble();
		
		apilados.push(5);
		apilados.push(4);
		apilados.encolarPrincipio(6);
		apilados.encolarPrincipio(7);
		System.out.println(apilados);
		System.out.println("Sacar elemento final: " + apilados.pop());
		System.out.println("Sacar elemento principio: " + apilados.desencolarFinal());
		System.out.println("Sacar elemento final: " + apilados.pop());
		System.out.println("Sacar elemento principio: " + apilados.desencolarFinal());
		System.out.println("Sacar elemento final: " + apilados.pop());
		System.out.println("Sacar elemento principio: " + apilados.desencolarFinal());
	}

}
