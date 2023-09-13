package tema10.ejerciciosPropuestos.ejercicioPropuesto10_21;

import java.util.Objects;

public class Persona implements Comparable{
	private String strNombre;
	private String strTelefono;
	
	public Persona(String strNombre, String strTelefono) {
		super();
		this.strNombre = strNombre;
		this.strTelefono = strTelefono;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		String strNombreDos = (String) obj;
		return this.strNombre.equals(strNombreDos);
	}
	@Override
	public String toString() {
		return "[Nombre=" + strNombre + ", Tel�fono=" + strTelefono + "]";
	}
	public String getStrNombre() {
		return strNombre;
	}
	public String guarda() {
		return this.strNombre + ":" + this.strTelefono;

	}
	@Override
	public int compareTo(Object obj) {
		Persona Persona2 = (Persona) obj;
		return this.strNombre.compareTo(Persona2.getStrNombre());
	}
	
	
}
