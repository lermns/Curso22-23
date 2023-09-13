package tema8.ejerciciosPropuestos.ejerciciosPropuestos815;

public class Main {

	public static void main(String[] args) {
		int[] intArr1 = {1,2,3,4,5};
		Lista lista1 = new Lista();
		int[] intArr2 = {1,2,3,4};
		Lista lista2 = new Lista();

		lista1.copiarFinal(intArr1);
		lista2.copiarFinal(intArr2);
		System.out.println("Son iguales: " + lista1.equals(lista2));
		lista2.insertarFinal(5);
		System.out.println("Son iguales: " + lista1.equals(lista2));
		lista2 = new Lista();
		lista2.copiarFinal(intArr2);
		lista2.insertarPrincipio(5);
		System.out.println("Son iguales: " + lista1.equals(lista2));
	}

}
