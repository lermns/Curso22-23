package tema7.ejerciciosResueltos.ejerciciosResueltos706;
/*basado en ejercicio propuesto del tema 3 ejercicio 13*/
public class Hora {
	private byte btyHora;
	private byte btyMinuto;
	private byte btySegundo;
	
	public void subeSegundo() {
		this.btyHora=(byte) ((((((btySegundo+1)/60)+btyMinuto)/60)+btyHora)%24);
		this.btyMinuto=(byte) ((((btySegundo+1)/60)+btyMinuto)%60);
		this.btySegundo=(byte) ((btySegundo+1)%60);
	}
	
	//set de hora minuto y segundo
	public void setHora(int intHora) {
		
		this.btyHora = (byte) (intHora<0?-intHora%24:intHora%24);//dejo la hora entre 0 y 23
	}
	
	public void setSegundo(int intSegundo) {
		if(intSegundo<0)
			intSegundo=-intSegundo;
		this.btySegundo = (byte) (intSegundo%60);
	}

	public void setMinuto(int intMinuto) {
		this.btyMinuto = (byte) (intMinuto<0?-intMinuto%60:intMinuto%60);
	}

	public byte getBtyHora() {
		return this.btyHora;
	}

	public byte getBtyMinuto() {
		return this.btyMinuto;
	}

	public byte getBtySegundo() {
		return this.btySegundo;
	}

	private static String darFormato(byte btyNumero) {
		return btyNumero<10?"0"+btyNumero:Byte.toString(btyNumero);
	}
	
	@Override
	public String toString() {
		return Hora.darFormato(this.btyHora) + ":" + Hora.darFormato(this.btyMinuto) + ":" + Hora.darFormato(this.btySegundo);
	}

	public static String mostrarHora(byte btyHora, byte btyMinuto, byte btySegundo) {
		return Hora.darFormato(btyHora) + ":" + Hora.darFormato(btyMinuto) + ":" + Hora.darFormato(btySegundo);
		
	}
}
