package tema8.ejerciciosPropuestos.ejerciciosPropuestos820;

import java.util.Objects;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos815.Lista;

public class Conjunto extends Lista{
	public void push(int intElem) {
		if(this.buscar(intElem)==-1)
			this.insertarFinal(intElem);
	}

	@Override
	public boolean equals(Object obj) {
		boolean blnDevolver = true;
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conjunto other = (Conjunto) obj;
		//tienen que tener el mismo número de elementos
		if(this.elementos()!=other.elementos())
			return false;
		//paso por todos los elementos buscando en el conjunto pasado
		//si alguno no lo encuentra, los conjuntos no son iguales
		for(int intCont=0; intCont<this.elementos() && blnDevolver;intCont++)
			if(other.buscar(this.elemento(intCont))==-1)
				blnDevolver = false;
		return blnDevolver;
	}
}
