package tema8.ejerciciosPropuestos.ejerciciosPropuestos824;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos823.Poligono;

public class Triangulo extends Poligono {

	public Triangulo(double rlnLado) {
		super(rlnLado, rlnLado*Math.sqrt(3)/2);
	}
	
	@Override
	public double area() {
		return this.rlnAltua*this.rlnBase/2;
	}

}
