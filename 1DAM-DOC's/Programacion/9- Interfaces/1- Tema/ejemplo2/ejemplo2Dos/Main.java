package tema9.ejemplo2;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
	
	public static void main(String[] args) {
		Alumno[] daw1 = {new Alumno(1,"Mario",22),
						 new Alumno(3,"Erik",23),
						 new Alumno(2,"Miguel",22),
						 new Alumno(4,"Thiago",22)};
		
		System.out.println("Original " + Arrays.toString(daw1));
		Arrays.sort(daw1);
		System.out.println("Defecto " + Arrays.toString(daw1));
		Arrays.sort(daw1, new ComparadorAlumnoNombre());
		System.out.println("Nombre " + Arrays.toString(daw1));
		Arrays.sort(daw1, new Comparator() {
			@Override
			public int compare(Object obj1, Object obj2) {
				if(((Alumno)obj1).getIntEdad()==((Alumno)obj2).getIntEdad())
					return ((Alumno)obj1).getStrNombre().compareTo(((Alumno)obj2).getStrNombre());
				else
					return ((Alumno)obj1).getIntEdad()-((Alumno)obj2).getIntEdad();
			}
		});
		System.out.println("Edad y Nombre " + Arrays.toString(daw1));
		Arrays.sort(daw1, new ComparadorAlumnoOrdenProfesor());
		System.out.println("Orden profesor " + Arrays.toString(daw1));
	}

}
