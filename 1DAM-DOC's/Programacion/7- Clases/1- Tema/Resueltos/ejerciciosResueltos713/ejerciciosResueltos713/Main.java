package tema7.ejerciciosResueltos.ejerciciosResueltos713;

public class Main {

	public static void main(String[] args) {
		Cola cola = new Cola();

		cola.push(3);
		cola.push(5);
		cola.push(7);
		cola.push(9);
		cola.push(11);
		cola.push(13);
		System.out.println("Elementos en la cola " + cola.toString());
		cola.pop();
		cola.pop();
		System.out.println("Elementos en la cola " + cola.toString());

	}

}
