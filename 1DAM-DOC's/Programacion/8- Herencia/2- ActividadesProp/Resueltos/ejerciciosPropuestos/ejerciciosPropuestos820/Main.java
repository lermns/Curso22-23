package tema8.ejerciciosPropuestos.ejerciciosPropuestos820;

public class Main {

	public static void main(String[] args) {
		Conjunto apilados1 = new Conjunto();
		Conjunto apilados2 = new Conjunto();
		
		apilados1.push(5);
		apilados1.push(4);
		System.out.println("Son iguales los conjuntos (2º vacío) " + apilados1.equals(apilados2));
		apilados2.push(4);
		apilados2.push(5);
		System.out.println("Son iguales los conjuntos " + apilados1.equals(apilados2));
		apilados2 = new Conjunto();
		apilados2.push(5);
		apilados2.push(4);
		System.out.println("Son iguales los conjuntos " + apilados1.equals(apilados2));
	}

}
