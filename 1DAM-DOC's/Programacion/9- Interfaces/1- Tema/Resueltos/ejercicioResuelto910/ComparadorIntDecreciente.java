package tema9.ejerciciosResueltos.ejercicioResuelto910;

import java.util.Comparator;

public class ComparadorIntDecreciente implements Comparator{
	@Override
	public int compare(Object obj1, Object obj2) {
	return (Integer)obj2-(Integer)obj1;
}}