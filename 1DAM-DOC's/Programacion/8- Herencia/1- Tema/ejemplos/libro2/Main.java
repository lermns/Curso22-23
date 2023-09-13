package tema8.ejemplos.libro2;

public class Main {
	

	public static void main(String[] args) {
		A objA;
		B objB = new B();
		C objC = new C();
		
		System.out.println("Valor de x de la clase B: " + objB.intX);//heredado de A
		objB.metodo1();//heredado directamente de A
		objB.metodo2();//implementación del método2 abstracto de A
		objC.metodo1();//heredado directamente de A
		objC.metodo2();//implementación del método2 abstracto de A
		
		objA = objB;
		objA.metodo1();//heredado directamente de A
		objA.metodo2();//implementación del método2 abstracto de A
		objA = objC;
		objA.metodo1();//heredado directamente de A
		objA.metodo2();//implementación del método2 abstracto de A
	}
}
