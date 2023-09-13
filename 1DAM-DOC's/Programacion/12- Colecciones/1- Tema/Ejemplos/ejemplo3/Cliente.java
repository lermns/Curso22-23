package tema12.ejemplos.ejemplo3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public class Cliente implements Comparable<Cliente> {
	private String strDni;
	private String strNombre;
	private LocalDate ldFechaNacimiento;
	


	public Cliente(String strDni, String strNombre, String strFechaNacimiento) {
		super();
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.ldFechaNacimiento = LocalDate.parse(strFechaNacimiento);
	}

	public int getEdad() {
		return (int) this.ldFechaNacimiento.until(LocalDate.now(), ChronoUnit.YEARS);
	}


	@Override
	public int hashCode() {
		return Objects.hash(strDni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return this.strDni.equals(other.strDni);
	}

	@Override
	public int compareTo(Cliente otro) {
		return this.strDni.compareTo(otro.strDni);
	}

	@Override
	public String toString() {
		return "\n\tDni=" + strDni + ", Nombre=" + strNombre + ", Fecha Nacimiento=" + ldFechaNacimiento;
	}
}
