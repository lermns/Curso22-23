package tema8.ejemplos.ejemplo1;

public class Persona {
	protected String strNombre;
	protected int intEdad;
	private String strDni;
	
	public Persona(String strNombre, int intEdad, String strDni) {
		super();
		this.strNombre = strNombre;
		this.intEdad = intEdad;
		this.strDni = strDni;
	}

	public String getStrDni() {
		return strDni;
	}

	@Override
	public String toString() {
		return "Persona [strNombre=" + strNombre + ", intEdad=" + intEdad + ", strDni=" + strDni + "]";
	}
	
	
}
