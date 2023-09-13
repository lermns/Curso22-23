package tema8.ejerciciosPropuestos.ejerciciosPropuestos815;

import java.util.Arrays;

public class Lista {
	private int[] intArrLista;

	public Lista() {
		this.intArrLista = new int[0];
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
	
	public void copiarFinal(int [] intArrListaCopia) {
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length+intArrListaCopia.length);
		System.arraycopy(intArrListaCopia, 0, this.intArrLista, this.intArrLista.length-intArrListaCopia.length, intArrListaCopia.length);
	}
	
	public void eliminarPosicion( int intPos) {
		System.arraycopy(this.intArrLista, intPos+1, this.intArrLista, intPos, this.intArrLista.length-(intPos+1));
		this.intArrLista=Arrays.copyOf(this.intArrLista, this.intArrLista.length-1);
	}
	
/*	public String elemento( int intPos) {
		//si la posición no es válida devuelvo una @
		return this.intArrLista.length>intPos?Integer.toString(this.intArrLista[intPos]):"@";
	}
*/
	public Integer elemento( int intPos) {
		//si la posición no es válida devuelvo null
		return this.intArrLista.length>intPos?this.intArrLista[intPos]:null;
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
	
	public static Lista concatena(Lista l1, Lista l2) {
		Lista devolver = new Lista();

		//mientras haya elementos en la lista, los inserto en el elemento de lista para devolver
		//acceso por métodos. Mas lógico ya que no estoy en el objeto
		for(int intCont=0; intCont<l1.elementos();intCont++)
			devolver.insertarFinal(l1.elemento(intCont));
		//llamando directamente a los atributos
		for(int intCont=0; intCont<l2.intArrLista.length; intCont++)
			devolver.insertarFinal(l2.intArrLista[intCont]);
/*		devolver.copiarFinal(l1.intArrLista);
		devolver.copiarFinal(l2.intArrLista);
*/		return devolver;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lista other = (Lista) obj;
		return Arrays.equals(intArrLista, other.intArrLista);
	}
	
}
