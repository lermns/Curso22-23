package tema8.ejerciciosPropuestos.ejerciciosPropuestos821;

public class Main {

	public static void main(String[] args) {
		int intNum=2;
		System.out.println("¿Es null un número? " + Comprobador.esNumero(null));
		System.out.println("¿Es 5 un número? " + Comprobador.esNumero(5));
		System.out.println("¿Es 5.5f un número? " + Comprobador.esNumero(5.5f));
		System.out.println("¿Es (byte)5 un número? " + Comprobador.esNumero((byte)5));
		System.out.println("¿Es 5.5 un número? " + Comprobador.esNumero(5.5));
		System.out.println("¿Es \"hola\" un número? " + Comprobador.esNumero("hola"));
		System.out.println("Suma 5 y 5.5 " + Comprobador.sumar(5, 5.5));
		System.out.println("Suma \"5\" y \"5.5\" " + Comprobador.sumar("5", "5.5"));
		System.out.println("Suma 5 y \"5.5\" " + Comprobador.sumar(5, "5.5"));

	}

}
