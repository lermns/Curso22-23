package tema8.ejerciciosPropuestos.ejerciciosPropuestos819;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos815.Lista;

public class Conjunto extends Lista{

	@Override
	public void insertarFinal(int intElem) {
		if (super.buscar(intElem)==-1) 
			super.insertarFinal(intElem);
	}

	@Override
	public void insertarPrincipio(int intElem) {
		if (super.buscar(intElem)==-1) 
			super.insertarPrincipio(intElem);
	}

	@Override
	public void insertarPosicion(int intElem, int intPos) {
		if (super.buscar(intElem)==-1) 
			super.insertarPosicion(intElem, intPos);	
	}
}
