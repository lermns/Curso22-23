package tema9.ejerciciosPropuestos.ejercicioPropuesto913;

import java.util.Comparator;

public class ComparadorFutbolistaEdad implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Futbolista)obj1).getIntEdad()-((Futbolista)obj2).getIntEdad();

	}

}
