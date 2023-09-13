package ejerProps.ejer12_16;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Socio implements Comparable<Socio>, Serializable {
	private String strDni;
	private String strNombre;
	private LocalDate fechaAlta;
	
	public Socio(String strDni, String strNombre, String strFechaNacimiento) {
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.fechaAlta = LocalDate.parse(strFechaNacimiento);
	}

	public String getStrDni() {
		return strDni;
	}

	public void setStrDni(String strDni) {
		this.strDni = strDni;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public String getStrNombre(){
		return strNombre;
	}


	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	//para socios auxiliares
	public Socio(String strDni) {
		super();
		this.strDni = strDni;
	}
	
	public int antiguedad(){

		return (int)this.fechaAlta.until(LocalDate.now(), ChronoUnit.YEARS);
	}

	@Override
	public int compareTo(Socio o) {

		return this.strDni.compareTo(o.strDni);
	}

	@Override
	public int hashCode() {

		return Objects.hash(strDni);
	}

	@Override
	public boolean equals(Object other) {

		return Objects.equals(strDni, ((Socio)other).strDni);
	}

	@Override
	public String toString() {

		return "[" + this.strDni + ", " + this.strNombre + ", " + this.fechaAlta + "]";
	}	
}
