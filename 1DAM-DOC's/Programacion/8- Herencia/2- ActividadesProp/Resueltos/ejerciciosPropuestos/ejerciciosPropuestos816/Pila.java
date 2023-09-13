package tema8.ejerciciosPropuestos.ejerciciosPropuestos816;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos815.Lista;

public class Pila extends Lista{
	public void push(int intElem) {
		this.insertarFinal(intElem);
	}
	
	public Integer pop() {
		Integer intDevolver = null;
		
		if(this.elementos()>0) {
			 intDevolver = this.elemento(this.elementos()-1);
			this.eliminarPosicion(this.elementos()-1);
		}
		return(intDevolver);
	}
}
