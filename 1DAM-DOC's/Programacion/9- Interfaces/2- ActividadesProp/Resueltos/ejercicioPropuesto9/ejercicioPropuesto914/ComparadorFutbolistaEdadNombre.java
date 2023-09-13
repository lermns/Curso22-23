package tema9.ejerciciosPropuestos.ejercicioPropuesto914;

import java.util.Comparator;

import tema9.ejerciciosPropuestos.ejercicioPropuesto913.Futbolista;

public class ComparadorFutbolistaEdadNombre implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		return ((Futbolista)obj1).getIntEdad()!=((Futbolista)obj2).getIntEdad()? //Si la edad es distinta
				((Futbolista)obj1).getIntEdad()-((Futbolista)obj2).getIntEdad()://devuelve la compraración por edad
				((Futbolista)obj1).getStrNombre().compareTo(((Futbolista)obj2).getStrNombre());//sino ya devuelve por el nombre

	}

}
