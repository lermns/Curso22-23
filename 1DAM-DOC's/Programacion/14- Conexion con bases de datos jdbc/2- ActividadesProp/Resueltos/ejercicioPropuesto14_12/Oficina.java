package tema14.ejerciciosPropuestos.ejercicioPropuesto14_12;

public class Oficina {
	private int intNumDepartamento;
	private String strNombre;
	private String strLocalidad;
	
	public Oficina(int intNumDepartamento) {
		this.intNumDepartamento = intNumDepartamento%100;
	}

	public void setStrNombre(String strNombre) {
		this.strNombre = Oficina.corta(strNombre,14);
	}

	public void setStrLocalidad(String strLocalidad) {
		this.strLocalidad = Oficina.corta(strLocalidad,14);;
	}

	@Override
	public String toString() {
		return "[Número Departamento=" + intNumDepartamento + ", Nombre=" + strNombre + ", Localidad="
				+ strLocalidad + "]";
	}
	
	//devuelve una cadena de como mucho la longitud indicada
	private static String corta(String strCadena, int intLogitud) {
		return strCadena!=null?strCadena.substring(0, Math.min(intLogitud, strCadena.length())) : null;
	}
}
