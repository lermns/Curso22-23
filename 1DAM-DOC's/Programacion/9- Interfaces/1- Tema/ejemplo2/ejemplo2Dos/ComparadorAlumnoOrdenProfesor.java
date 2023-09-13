package tema9.ejemplo2;

import java.util.Comparator;

public class ComparadorAlumnoOrdenProfesor implements Comparator{
	private final static String[] strArrAlumnos= {"Rafael","Daniel","Miguel", "Thiago", "Mario"};

	@Override
	public int compare(Object obj1, Object obj2) {
		//saco la diferencia en la posición de los alumnos
		int intDevolver=buscar(((Alumno)obj1).getStrNombre())-buscar(((Alumno)obj2).getStrNombre());
		
		//si los dos van en la misma posición y es fuera del array
		if(intDevolver==0 && buscar(((Alumno)obj1).getStrNombre())==ComparadorAlumnoOrdenProfesor.strArrAlumnos.length)
			//hago la comparación por nombre en lugar de por posición
			intDevolver=((Alumno)obj1).getStrNombre().compareTo(((Alumno)obj2).getStrNombre());
			
		return intDevolver;
	}
	
	private static int buscar(String strNombre) {
		int intCont=0;
		
		for(;intCont<strArrAlumnos.length && !strNombre.equals(strArrAlumnos[intCont]);intCont++);
		
		return intCont;
	}
}
