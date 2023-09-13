package tema8.ejemplos.libro2;

//clase abstracta, ya que uno de sus métodos, metodo2( ) es abstracto
public abstract class A {
	int intX = 1;
	
	void metodo1() {//método implementado y heredado por las subclases
		System.out.println("método implementado en A");
	}
	abstract void metodo2();//método abstracto para ser implementado en subclases
}
