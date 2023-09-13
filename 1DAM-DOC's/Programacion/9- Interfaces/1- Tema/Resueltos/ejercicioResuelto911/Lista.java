package tema9.ejerciciosResueltos.ejercicioResuelto911;

import java.util.Arrays;

public class Lista {
	private Object[] arrObjetos;

	public Lista() {
		this.arrObjetos = new Object[0];
	}

	public int elementos() {
		return this.arrObjetos.length;
	}
	
	public void insertarFinal(Object Elemento) {
		this.arrObjetos=Arrays.copyOf(this.arrObjetos, this.arrObjetos.length+1);
		this.arrObjetos[this.arrObjetos.length-1] = Elemento;
	}
	
	public void insertarPrincipio(Object Elemento) {
		this.arrObjetos=Arrays.copyOf(this.arrObjetos, this.arrObjetos.length+1);
		System.arraycopy(this.arrObjetos, 0, this.arrObjetos, 1, this.arrObjetos.length-1);
		this.arrObjetos[0] = Elemento;
	}
	
	public void insertarPosicion(Object Elemento, int intPos) {
		if(intPos<=this.arrObjetos.length) {
			this.arrObjetos=Arrays.copyOf(this.arrObjetos, this.arrObjetos.length+1);
			System.arraycopy(this.arrObjetos, intPos, this.arrObjetos, intPos+1, this.arrObjetos.length-(intPos+1));
			this.arrObjetos[intPos] = Elemento;
		}
	}
	
	public void copiarFinal(Object [] arrObjCopia) {
		this.arrObjetos=Arrays.copyOf(this.arrObjetos, this.arrObjetos.length+arrObjCopia.length);
		System.arraycopy(arrObjCopia, 0, this.arrObjetos, this.arrObjetos.length-arrObjCopia.length, arrObjCopia.length);
	}
	
	public void eliminarPosicion(int intPos) {
		if(intPos<this.arrObjetos.length) {
			System.arraycopy(this.arrObjetos, intPos+1, this.arrObjetos, intPos, this.arrObjetos.length-(intPos+1));
			this.arrObjetos=Arrays.copyOf(this.arrObjetos, this.arrObjetos.length-1);
		}
	}
	
	public Object elemento( int intPos) {
		//si la posición no es válida devuelvo null
		return this.arrObjetos.length>intPos?this.arrObjetos[intPos]:null;
	}
	
	public int buscar(Object Elemento) {
		int intPos=0;
		for(;intPos<this.arrObjetos.length && this.arrObjetos[intPos]!=Elemento; intPos++);
		return intPos==this.arrObjetos.length?-1:intPos;
	}

	@Override
	public String toString() {
		return "Lista [intArrLista=" + Arrays.toString(arrObjetos) + "]";
	}
	
	public static Lista concatena(Lista l1, Lista l2) {
		Lista devolver = new Lista();

		//mientras haya elementos en la lista, los inserto en el elemento de lista para devolver
		for(int intCont=0; intCont<l1.elementos();intCont++)
			devolver.insertarFinal(l1.elemento(intCont));
		//llamando directamente a los atributos
		for(int intCont=0; intCont<l2.arrObjetos.length; intCont++)
			devolver.insertarFinal(l2.arrObjetos[intCont]);
		return devolver;
	}
}
