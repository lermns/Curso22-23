package tema7.ejerciciosPropuestos.ejerciciosPropuestos16;

public class Punto {
	private double rlnX;
	private double rlnY;
	
	public Punto(double rlnX, double rlnY) {
		this.rlnX = rlnX;
		this.rlnY = rlnY;
	}
	
	public void desplazaX (double rlnDesplazX) {
		this.rlnX += rlnDesplazX;
	}

	public void desplazaY (double rlnDesplazY) {
		this.rlnY += rlnDesplazY;
	}

	public void desplaza (double rlnDesplazX, double rlnDesplazY) {
		this.rlnX += rlnDesplazX;
		this.rlnY += rlnDesplazY;
	}

	public double distanciaEuclidea (Punto otroPunto) {
		return Math.sqrt(Math.pow(this.rlnX-otroPunto.rlnX, 2)+Math.pow(this.rlnY-otroPunto.rlnY, 2));
	}

	public void muestra () {
		System.out.println(this); 
	}

	@Override
	public String toString() {
		return "Punto [rlnX=" + rlnX + ", rlnY=" + rlnY + "]";
	}
}
