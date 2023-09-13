package tema7.ejerciciosPropuestos.ejerciciosPropuestos21;

public class Conjunto {
	private Lista elementos;
	
	public Conjunto() {
		this.elementos = new Lista();
	}

	public int numeroElementos () {
		return this.elementos.elementos();
	}
	
	public boolean insertar(int intElem) {
		boolean blnDevolver=false;
		
		if(this.elementos.buscar(intElem)==-1){//solo si no existe lo inserto
			this.elementos.insertarFinal(intElem);
			blnDevolver=true;
		}
		
		return blnDevolver;
	}
	
	public boolean insertar(Conjunto otroConjunto) {
		boolean blnDevolver=false;
		
		for(int intCont=0; intCont<otroConjunto.elementos.elementos();intCont++)
			if(this.insertar(otroConjunto.elementos.elemento(intCont)))//si ha insertado algún elemento devuelvo true
				blnDevolver=true;
		
		return blnDevolver;
	}
	
	public boolean eliminarElemento (int intElem) {
		boolean blnDevolver=false;
		int intPosicion=this.elementos.buscar(intElem);
		
		if(intPosicion!=-1){//solo si existe lo elimino
			this.elementos.eliminarPosicion(intPosicion);
			blnDevolver=true;
		}
		
		return blnDevolver;
	}
	
	public boolean eliminarConjunto (Conjunto otroConjunto) {
		boolean blnDevolver=false;
		int intPosicion;
		
		for(int intCont=0; intCont<otroConjunto.elementos.elementos();intCont++) {
			intPosicion=this.elementos.buscar(otroConjunto.elementos.elemento(intCont));
			if(intPosicion!=-1){//solo si existe lo elimino
				this.elementos.eliminarPosicion(intPosicion);
				blnDevolver=true;
			}
		}				
		
		return blnDevolver;
	}
	
	public boolean pertenece(int intElem) {
		return this.elementos.buscar( intElem)!=-1;
	}
	
	public void mostrar() {
		System.out.println(this.elementos.toString());
	}

}
