package tema8.ejerciciosResueltos.ejerciciosResueltos803;

import tema8.ejerciciosResueltos.ejerciciosResueltos801.Hora;

public class HoraExacta extends Hora {

	private byte bytSegundo;
	
	public HoraExacta(int intHora, int intMinuto, int intSegundo) {
		super(intHora,intMinuto);
		this.bytSegundo = (byte) intSegundo;
	}
	
	public boolean setSegundos(byte bytValor) {
		boolean blnDevolver = false;
		
		if(bytValor>=0 && bytValor<60) {
			this.bytSegundo = bytValor;
			blnDevolver = true;
		}
		
		return blnDevolver;
	}
	
	@Override
	public void inc() {
		this.bytSegundo++;
		if(this.bytSegundo==60) {
			super.inc();
			this.bytSegundo=0;
		}
	}

	@Override
	public String toString() {
		return super.toString() + ":" + bytSegundo;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoraExacta other = (HoraExacta) obj;
		return this.bytSegundo == other.bytSegundo 
				&& this.bytHora==other.bytHora 
				&& this.bytMinuto==other.bytMinuto;
	}
	
	
}
