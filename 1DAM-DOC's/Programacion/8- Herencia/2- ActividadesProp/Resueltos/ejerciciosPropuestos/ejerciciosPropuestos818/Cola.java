package tema8.ejerciciosPropuestos.ejerciciosPropuestos818;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos815.Lista;

public class Cola extends Lista{
	public void push(int intElem) {
		this.insertarFinal(intElem);
	}
	
	public Integer pop() {
		Integer intDevolver = null;
		
		if(this.elementos()>0) {
			intDevolver = this.elemento(0);
			this.eliminarPosicion(0);
		}
		return(intDevolver);
	}
}
