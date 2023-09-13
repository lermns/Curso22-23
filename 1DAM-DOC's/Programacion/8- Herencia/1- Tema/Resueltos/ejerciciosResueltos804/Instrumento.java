package tema8.ejerciciosResueltos.ejerciciosResueltos804;

import java.util.Arrays;

public abstract class Instrumento {
	protected Nota[] partitura;

	public Instrumento() {
		this.partitura = new Nota[0];
	}
	
	private boolean encontrar(Nota nuevaNota) {
		int intCont=0;
		
		for(; intCont<this.partitura.length && nuevaNota!=this.partitura[intCont]; intCont++);
		
		return (intCont<this.partitura.length?true:false);
	}
	
	public void add(Nota nuevaNota) {
		//if(!encontrar(nuevaNota)) {
			this.partitura =  Arrays.copyOf(this.partitura, this.partitura.length+1);
			this.partitura[this.partitura.length-1]=nuevaNota;
		//}
	}
	
	public abstract void interpretar();
}
