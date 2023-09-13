package tema8.ejerciciosPropuestos.ejerciciosPropuestos812;

public class Caja {
	protected final int intAncho;
	protected final int intAlto;
	protected final int intFondo;
	protected String strEtiqueta;
	protected final Unidad unidad;
	protected final double rlnVolumen;
	
	
	
	public Caja(int intAncho, int intAlto, int intFondo, String strEtiqueta, Unidad unidad) {
		double rlnAux = intAlto*intAncho*intFondo;
		
		this.intAncho = intAncho;
		this.intAlto = intAlto;
		this.intFondo = intFondo;
		this.strEtiqueta = strEtiqueta;
		this.unidad = unidad;
		this.rlnVolumen = this.unidad.equals(Unidad.CM)?rlnAux/1000000:rlnAux;
	}

	public double getVolumen(){
		return this.rlnVolumen;
	}
	
	public void setEtiqueta (String strEtiqueta) {
		this.strEtiqueta = strEtiqueta.substring(0,30);
	}

	@Override
	public String toString() {
		return "Caja [intAncho=" + intAncho + ", intAlto=" + intAlto + ", intFondo=" + intFondo + ", strEtiqueta="
				+ strEtiqueta + ", unidad=" + unidad + "]";
	}
	
	
}
