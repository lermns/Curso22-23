package tema8.ejerciciosPropuestos.ejerciciosPropuestos823;

public abstract class Poligono {
	protected double rlnBase;
	protected double rlnAltua;
	
	public Poligono(double rlnBase, double rlnAltua) {
		this.rlnBase = rlnBase;
		this.rlnAltua = rlnAltua;
	}

	@Override
	public String toString() {
		return "Poligono [rlnBase=" + rlnBase + ", rlnAltua=" + rlnAltua + ", area=" + area() + ", clase= " + this.getClass().getName() +"]";
	}

	public abstract double area();
}
