package tema9.ejemplos.ejemplo2;

import java.util.Comparator;

public class ComparadorAlumnoNombre implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Alumno)obj1).getStrNombre().compareTo(((Alumno)obj2).getStrNombre());
	}

}
