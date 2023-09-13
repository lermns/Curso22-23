package tema9.ejerciciosPropuestos.ejercicioPropuesto920;

import java.time.LocalDate;
import java.util.Objects;

public class Socio implements Comparable {
	private int intId;
	private String strNombre;
	private LocalDate fechaNacimiento;
	
	public Socio(int intId, String strNombre, LocalDate fechaNacimiento) {
		this.intId = intId;
		this.strNombre = strNombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public int compareTo(Object o) {
		return this.strNombre.compareTo(((Socio)o).strNombre);
	}

	@Override
	public String toString() {
		return "[" + intId + ", " + strNombre + ", " + this.fechaNacimiento + "]";
	}

	public LocalDate getBytEdad() {
		return fechaNacimiento;
	}

	public int getIntId() {
		return intId;
	}

	public String getStrNombre() {
		return strNombre;
	}


}
