package tema14.ejerciciosPropuestos.ejercicioPropuesto14_19;

public class Oficina {
	private int intNumDepartamento;
	private String strNombre;
	private String strLocalidad;
	
	public Oficina(int intNumDepartamento, String strNombre, String strLocalidad) {
		this.intNumDepartamento = intNumDepartamento;
		this.strNombre = strNombre;
		this.strLocalidad = strLocalidad;
	}

	public Oficina(int intNumDepartamento) {
		this.intNumDepartamento = intNumDepartamento;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public void setStrLocalidad(String strLocalidad) {
		this.strLocalidad = strLocalidad;
	}

	public int getNumDepartamento() {
		return this.intNumDepartamento;
	}

	@Override
	public String toString() {
		return "[Número Departamento=" + intNumDepartamento + ", Nombre=" + strNombre + ", Localidad="
				+ strLocalidad + "]";
	}
	
	
}
