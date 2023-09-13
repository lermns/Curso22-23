package tema14.ejerciciosPropuestos.ejercicioPropuesto14_13;

public class Oficina {
	private int intNumDepartamento;
	private String strNombre;
	private String strLocalidad;
	
	public Oficina(int intNumDepartamento) {
		this.intNumDepartamento = intNumDepartamento;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public void setStrLocalidad(String strLocalidad) {
		this.strLocalidad = strLocalidad;
	}

	@Override
	public String toString() {
		return "[Número Departamento=" + intNumDepartamento + ", Nombre=" + strNombre + ", Localidad="
				+ strLocalidad + "]";
	}

	public String getStrLocalidad() {
		return strLocalidad;
	}
	
	
}
