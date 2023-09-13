package tema8.ejerciciosPropuestos.ejerciciosPropuestos824;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos823.Poligono;

public class Cuadrado extends Poligono {

	public Cuadrado(double rlnLado) {
		super(rlnLado, rlnLado);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return this.rlnBase*this.rlnBase;
	}

}
