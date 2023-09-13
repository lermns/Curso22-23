package tema9.ejerciciosPropuestos.ejercicioPropuesto913;

import java.util.Objects;

public class Futbolista implements Comparable{
	protected String strDni;
	protected String strNombre;
	protected int intEdad;
	protected int intNumGol;
	
	public Futbolista(String strDni, String strNombre, int intEdad, int intNumGol) {
		super();
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.intEdad = intEdad;
		this.intNumGol = intNumGol;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Futbolista other = (Futbolista) obj;
		return Objects.equals(strDni, other.strDni);
	}

	@Override
	public String toString() {
		return "[" + strDni + ", " + strNombre + ", " + intEdad + ", " + intNumGol + "]";
	}

	@Override
	public int compareTo(Object other) {
		return this.strDni.compareTo(((Futbolista)other).strDni);
	}

	public String getStrNombre() {
		return strNombre;
	}

	public int getIntEdad() {
		return intEdad;
	}
	
	
}
