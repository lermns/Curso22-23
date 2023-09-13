package tema9.ejerciciosResueltos.ejercicioResuelto909;

import java.util.Comparator;

public class ComparadorSocioEdad implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Socio)obj1).getBytEdad()-((Socio)obj2).getBytEdad();
	}

}
