package ejerProps.ejer12_25;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Comparable<Socio>, Serializable {
	private String strNombre;
	private LocalDate fechaAlta;
	
	public Socio(String strNombre, String fechaIngreso) {
		this.strNombre = strNombre;
		this.fechaAlta = LocalDate.parse(fechaIngreso);
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrNombre(){
		return strNombre;
	}

	//para socios auxiliares

	@Override
	public int compareTo(Socio o) {

		return this.strNombre.compareTo(o.strNombre);
	}

	@Override
	public int hashCode() {

		return Objects.hash(strNombre);
	}

	@Override
	public boolean equals(Object other) {

		return Objects.equals(strNombre, ((Socio)other).strNombre);
	}

	@Override
	public String toString() {

		return "[" + this.strNombre + ", " + this.fechaAlta + "]";
	}	
}
