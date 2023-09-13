package tema9.ejemplo2;

public class Alumno implements Comparable{
	private int intNumeroLista;
	private String strNombre;
	private int intEdad;
	
	public Alumno(int intNumeroLista, String strNombre, int intEdad) {
		this.intNumeroLista = intNumeroLista;
		this.strNombre = strNombre;
		this.intEdad = intEdad;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public int getIntEdad() {
		return intEdad;
	} 
	
	@Override
	public int compareTo(Object obj) {
		return this.intNumeroLista-((Alumno)obj).intNumeroLista;
	}

	@Override
	public String toString() {
		return "[" + intNumeroLista + ", " + strNombre + ", " + intEdad + "]";
	}

}
