package tema9.ejerciciosPropuestos.ejercicioPropuesto920;

import java.util.Comparator;

public class ComparadorSocioEdadNum implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Socio)obj1).getBytEdad().compareTo(((Socio)obj2).getBytEdad())!=0 ? //si tienen distinta edad;
				((Socio)obj1).getBytEdad().compareTo(((Socio)obj2).getBytEdad()) : //ordena por edad
				((Socio)obj1).getIntId()-((Socio)obj2).getIntId() ; //sino ordena por número de socio
	}

}
