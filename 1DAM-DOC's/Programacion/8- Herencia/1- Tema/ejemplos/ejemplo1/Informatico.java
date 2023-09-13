package tema8.ejemplos.ejemplo1;

import java.util.Objects;

public class Informatico extends Persona {
	protected String strEspecialidad;
	protected int intAniosExperiencia;
	protected int intEdad;
	
	public Informatico(String strNombre, int intEdad, int intEdad2, String strDni, String strEspecialidad, int intAniosExperiencia) {
		super(strNombre, intEdad, strDni);

		this.intAniosExperiencia=intAniosExperiencia;
		this.strEspecialidad=strEspecialidad;
		this.intEdad=intEdad2;
	}

	@Override
	public String toString() {
		return "Informatico [strEspecialidad=" + this.strEspecialidad + ", intAniosEnLaEmpresa=" + this.intEdad + ", intAniosExperiencia=" + this.intAniosExperiencia
				+ super.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)//si estan en la misma posición de memoria son el mismo objeto
			return true;
		if (obj == null)//Si no he pasado nada, no puede ser igual al objeto que hace la llamada
			return false;
		if (getClass() != obj.getClass())//si no son de la misma clase, no pueden ser iguales
			return false;
		Informatico other = (Informatico) obj;
		return intAniosExperiencia == other.intAniosExperiencia && intEdad == other.intEdad
				&& Objects.equals(strEspecialidad, other.strEspecialidad);
	}
	
	
}
