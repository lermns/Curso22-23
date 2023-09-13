package tema7.ejerciciosResueltos.ejerciciosResueltos711;

import java.util.Arrays;

public class Lista {
	private Integer[] intArrLista;

	public Lista() {
		this.intArrLista = new Integer[0];
	}

	public int elementos() {
		return this.intArrLista.length;
	}
	
	public void insertarFinal(int intElem) {
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length+1);
		this.intArrLista[this.intArrLista.length-1] = intElem;
	}
	
	public void insertarPrincipio(int intElem) {
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length+1);
		System.arraycopy(this.intArrLista, 0, this.intArrLista, 1, this.intArrLista.length-1);
		this.intArrLista[0] = intElem;
	}
	
	public void insertarPosicion(int intElem, int intPos) {
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length+1);
		System.arraycopy(this.intArrLista, intPos, this.intArrLista, intPos+1, this.intArrLista.length-(intPos+1));
		this.intArrLista[intPos] = intElem;
	}
	
	public void copiarFinal(Integer [] intArrListaCopia) {
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length+intArrListaCopia.length);
		System.arraycopy(intArrListaCopia, 0, this.intArrLista, this.intArrLista.length-intArrListaCopia.length, intArrListaCopia.length);
	}
	
	public void eliminarPosicion( int intPos) {
		System.arraycopy(this.intArrLista, intPos+1, this.intArrLista, intPos, this.intArrLista.length-(intPos+1));
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length-1);
	}
	
	public int elemento( int intPos) {
		return this.intArrLista[intPos];
	}
	
	public int buscar( int intElem) {
		int intPos;
		for(intPos=0;intPos<this.intArrLista.length && this.intArrLista[intPos]!=intElem; intPos++);
		return intPos==this.intArrLista.length?-1:intPos;
	}

	@Override
	public String toString() {
		return "Lista [intArrLista=" + Arrays.toString(intArrLista) + "]";
	}
	
	
}
