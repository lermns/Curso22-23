package tema9.ejerciciosPropuestos.ejercicioPropuesto912;

import java.util.Arrays;

public class Lista implements Pila, Cola{
	private String[] strArrCadenas;

	public Lista() {
		this.strArrCadenas = new String[0];
	}

	public int elementos() {
		return this.strArrCadenas.length;
	}
	
	public void insertarFinal(String Elemento) {
		this.strArrCadenas=Arrays.copyOf(this.strArrCadenas, this.strArrCadenas.length+1);
		this.strArrCadenas[this.strArrCadenas.length-1] = Elemento;
	}
	
	public void insertarPrincipio(String Elemento) {
		this.strArrCadenas=Arrays.copyOf(this.strArrCadenas, this.strArrCadenas.length+1);
		System.arraycopy(this.strArrCadenas, 0, this.strArrCadenas, 1, this.strArrCadenas.length-1);
		this.strArrCadenas[0] = Elemento;
	}
	
	public void insertarPosicion(String Elemento, int intPos) {
		if(intPos<=this.strArrCadenas.length) {
			this.strArrCadenas=Arrays.copyOf(this.strArrCadenas, this.strArrCadenas.length+1);
			System.arraycopy(this.strArrCadenas, intPos, this.strArrCadenas, intPos+1, this.strArrCadenas.length-(intPos+1));
			this.strArrCadenas[intPos] = Elemento;
		}
	}
	
	public void copiarFinal(String [] arrObjCopia) {
		this.strArrCadenas=Arrays.copyOf(this.strArrCadenas, this.strArrCadenas.length+arrObjCopia.length);
		System.arraycopy(arrObjCopia, 0, this.strArrCadenas, this.strArrCadenas.length-arrObjCopia.length, arrObjCopia.length);
	}
	
	public void eliminarPosicion(int intPos) {
		if(intPos<this.strArrCadenas.length) {
			System.arraycopy(this.strArrCadenas, intPos+1, this.strArrCadenas, intPos, this.strArrCadenas.length-(intPos+1));
			this.strArrCadenas=Arrays.copyOf(this.strArrCadenas, this.strArrCadenas.length-1);
		}
	}
	
	public String elemento( int intPos) {
		//si la posición no es válida devuelvo null
		return this.strArrCadenas.length>intPos?this.strArrCadenas[intPos]:null;
	}
	
	public int buscar(String Elemento) {
		int intPos=0;
		for(;intPos<this.strArrCadenas.length && this.strArrCadenas[intPos]!=Elemento; intPos++);
		return intPos==this.strArrCadenas.length?-1:intPos;
	}

	@Override
	public String toString() {
		return "Lista [intArrLista=" + Arrays.toString(strArrCadenas) + "]";
	}
	
	public static Lista concatena(Lista l1, Lista l2) {
		Lista devolver = new Lista();

		//mientras haya elementos en la lista, los inserto en el elemento de lista para devolver
		for(int intCont=0; intCont<l1.elementos();intCont++)
			devolver.insertarFinal(l1.elemento(intCont));
		//llamando directamente a los atributos
		for(int intCont=0; intCont<l2.strArrCadenas.length; intCont++)
			devolver.insertarFinal(l2.strArrCadenas[intCont]);
		return devolver;
	}

	@Override
	public String pop() {
		String strDevolver=null;
		
		if(this.elementos()>0) {
			strDevolver=this.elemento(0);
			this.eliminarPosicion(0);
		}
		return strDevolver;
	}

	@Override
	public void push(String strElemento) {
		this.insertarFinal(strElemento);
	}

	@Override
	public String popPila() {
		String strDevolver=null;
		
		if(this.elementos()>0) {
			strDevolver=this.elemento(this.elementos()-1);
			this.eliminarPosicion(this.elementos()-1);
		}
		return strDevolver;
	}
}
