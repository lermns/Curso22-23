package tema9.ejerciciosPropuestos.ejercicioPropuesto920;

import java.util.Comparator;

public class ComparadorSocioNombre implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Socio)obj1).getStrNombre().compareTo(((Socio)obj2).getStrNombre());
	}

}
