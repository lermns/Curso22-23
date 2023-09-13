package tema9.ejerciciosResueltos.ejercicioResuelto909;

import java.util.Objects;

public class Socio implements Comparable {
	private int intId;
	private String strNombre;
	private byte bytEdad;
	
	public Socio(int intId, String strNombre, int intEdad) {
		this.intId = intId;
		this.strNombre = strNombre;
		this.bytEdad = intEdad>0 && intEdad<129?(byte)intEdad:18;
	}

	@Override
	public int compareTo(Object o) {
		return this.strNombre.compareTo(((Socio)o).strNombre);
	}

	@Override
	public String toString() {
		return "Socio [intId=" + intId + ", strNombre=" + strNombre + ", bytEdad=" + bytEdad + "]";
	}

	public byte getBytEdad() {
		return bytEdad;
	}

	public String getStrNombre() {
		return strNombre;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}


}
