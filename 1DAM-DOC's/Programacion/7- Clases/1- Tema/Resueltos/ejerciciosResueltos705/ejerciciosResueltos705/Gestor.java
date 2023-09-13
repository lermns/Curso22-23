package tema7.ejerciciosResueltos.ejerciciosResueltos705;

public class Gestor {
	private String strNombre;
	private final String strTelefono;
	private double rlnImpMaxAut;
	
	public Gestor(String strNombre, String strTelefono, double rlnImpMaxAut) {
		this.strNombre = strNombre;
		this.strTelefono = strTelefono;
		this.rlnImpMaxAut = rlnImpMaxAut;
	}

	public Gestor(String strNombre, String strTelefono) {
		this(strNombre, strTelefono, 10000);
	}

	public String getStrTelefono() {
		return strTelefono;
	}

	@Override
	public String toString() {
		return "Gestor [strNombre=" + strNombre + ", strTelefono=" + strTelefono + ", rlnImpMaxAut=" + rlnImpMaxAut
				+ "]";
	}
	
	
}
