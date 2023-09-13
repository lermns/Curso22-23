package tema7.ejerciciosResueltos.ejerciciosResueltos708;

public class RadioFM {
	private double rlnFrecuencia;
	
	public RadioFM(double rlnFrecuencia) {
		this.rlnFrecuencia = rlnFrecuencia;
		
		if(this.rlnFrecuencia<80)
			this.rlnFrecuencia = 80;
		else if(this.rlnFrecuencia>108)
				this.rlnFrecuencia = 108;
				
	}
	
	public RadioFM() {
		this(80);
	}

	public void up() {
		this.rlnFrecuencia += 0.5;
		if(this.rlnFrecuencia>108)
			this.rlnFrecuencia=80;
	}
	
	public void down() {
		this.rlnFrecuencia -= 0.5;
		if(this.rlnFrecuencia<80)
			this.rlnFrecuencia=108;
	}
	
	public void display() {
		System.out.println("Frecuencia: " + this.rlnFrecuencia + "Mhz");
	}
}
