package tema8.ejerciciosResueltos.ejerciciosResueltos801;

public class Hora {
	protected byte bytHora;
	protected byte bytMinuto;
	
	public Hora(int intHora, int intMinuto) {
		this.bytHora = 0;
		if(!setHora((byte)intHora))
				System.out.println("La hora no es correcta");
		
		this.bytMinuto = 0;
		if(!setMinuto((byte)intMinuto))
				System.out.println("El minuto no es correcto");;
	}

	public void inc() {
		this.bytMinuto++;
		this.bytHora = (byte) ((this.bytHora + (this.bytMinuto/60)) % 24);
		this.bytMinuto %=60;
	}
	
	public boolean setMinuto(byte bytValor) {
		boolean blnDevolver = false;
		
		if(bytValor>=0 && bytValor<60) {
			this.bytMinuto = bytValor;
			blnDevolver = true;
		}
		
		return blnDevolver;
	}
	

	
	public boolean setHora(byte bytValor) {
		boolean blnDevolver = false;
		
		if(bytValor>=0 && bytValor<24) {
			this.bytHora = bytValor;
			blnDevolver = true;
		}
		
		return blnDevolver;
	}

	protected String formatea(byte bytValor) {
		String strDevuelve=Byte.toString(bytValor);
		
		if(bytValor<10)
			strDevuelve = "0" + strDevuelve;
		
		return strDevuelve;
	}
	@Override
	public String toString() {
		return formatea(bytHora) + ":" + formatea(bytMinuto);
	}
	
	
}
