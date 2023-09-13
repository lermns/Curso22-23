package tema7.ejerciciosResueltos.ejerciciosResueltos714;

import java.util.Arrays;
 ////NUNCA NUNCA IMPLEMENTAR MÉTODOS NO ESTÁTICOS EN EL MAIN
 ////NI PONER ATRIBUTOS
public class Main {
	private int[] intArrTablaEnteros;
	
	public static void main(String[] args) {
		Main tabla = new Main();

		for(int intCont=1;intCont<11;intCont++)
			tabla.insertarFinal(intCont);
		System.out.println("Elementos en la cola " + tabla.toString());

	}
	
	public Main() {
		this.intArrTablaEnteros=new int[0];
	}

	void insertarFinal(int intNuevo) {
		this.intArrTablaEnteros=Arrays.copyOf(this.intArrTablaEnteros, this.intArrTablaEnteros.length+1);
		this.intArrTablaEnteros[this.intArrTablaEnteros.length-1]=intNuevo;
	}
	
	@Override
	public String toString() {
		return "Main [intArrTablaEnteros=" + Arrays.toString(intArrTablaEnteros) + "]";
	}
}
