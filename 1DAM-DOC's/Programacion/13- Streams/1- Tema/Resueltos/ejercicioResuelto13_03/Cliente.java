package tema13.ejerciciosResueltos.ejercicioResuelto13_03;

public class Cliente {
	private String strNombre;
	private int intEdad;
	
	public Cliente(String strNombre, int intEdad) {
		this.strNombre = strNombre;
		this.intEdad = intEdad;
	}

	public int getIntEdad() {
		return intEdad;
	}

	public String getStrNombre() {
		return strNombre;
	}

	@Override
	public String toString() {
		return "Cliente [strNombre=" + strNombre + ", intEdad=" + intEdad + "]";
	}
	
}
