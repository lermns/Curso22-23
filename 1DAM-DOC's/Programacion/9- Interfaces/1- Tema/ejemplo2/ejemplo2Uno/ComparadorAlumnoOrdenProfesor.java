package tema9.ejemplos.ejemplo2;

import java.util.Comparator;

public class ComparadorAlumnoOrdenProfesor implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		return buscar(((Alumno)obj1).getStrNombre())-buscar(((Alumno)obj2).getStrNombre());
	}
	
	private static int buscar(String strNombre) {
		int intCont=0;
		String[] strArrAlumnos= {"Rafael","Daniel","Miguel", "Thiago", "Mario"};
		
		for(;intCont<strArrAlumnos.length && !strNombre.equals(strArrAlumnos[intCont]);intCont++);
		
		return intCont;
	}
}
