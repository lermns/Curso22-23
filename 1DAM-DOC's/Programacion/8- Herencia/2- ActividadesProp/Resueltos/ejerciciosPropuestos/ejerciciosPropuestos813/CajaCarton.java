package tema8.ejerciciosPropuestos.ejerciciosPropuestos813;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos812.Caja;
import tema8.ejerciciosPropuestos.ejerciciosPropuestos812.Unidad;

public class CajaCarton extends Caja {

	public CajaCarton(int intAncho, int intAlto, int intFondo, String strEtiqueta) {
		super(intAncho, intAlto, intFondo, strEtiquetaUnidad.CM);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getVolumen(){
		return this.rlnVolumen*0.8;
	}

	public double getSuperficie() {
		return 2 * (this.intAncho * this.intAlto + this.intAncho * this.intFondo + this.intAlto * this.intFondo);
	}
}
