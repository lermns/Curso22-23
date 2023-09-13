package tema7.ejerciciosResueltos.ejerciciosResueltos707;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {
	private final int intLongMax;//maxima longitud del texto
	private String strTexto;
	private LocalDate fechaCreacion;
	private LocalDateTime ultimaModificacion;

	public Texto(int intLongMax) {
		this.intLongMax = intLongMax;
		this.strTexto="";
		this.fechaCreacion=LocalDate.now();
	}
	
	//permite añadir un caracter al final del texto
	public void annadeFinal(char chrCaracter) {
		if(this.intLongMax>this.strTexto.length()) {
			this.strTexto+=chrCaracter;
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
	
	//permite añadir un caracter al principio del texto
	public void annadePrincipio(char chrCaracter) {
		if(this.intLongMax>this.strTexto.length()) {
			this.strTexto=chrCaracter+this.strTexto;
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
	
	//permite añadir una cadena al final del texto
	public void annadeFinal(String strCaracter) {
		if(this.intLongMax>=this.strTexto.length()+strCaracter.length()) {
			this.strTexto+=strCaracter;
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
	
	//permite añadir una cadena al principio del texto
	public void annadePrincipio(String strCaracter) {
		if(this.intLongMax>=this.strTexto.length()+strCaracter.length()) {
			this.strTexto=strCaracter+this.strTexto;
			this.ultimaModificacion=LocalDateTime.now();
		}
	}
	
	//permite saber cuantas vocales tienes nuestro texto
	public int vocales() {
		int intVocales=0;
		
		for(int intCont=0; intCont<this.strTexto.length();intCont++)
			//Si se encuentra en la cadena aeiou, el caracter en el que estamos del texto
			if("aeiou".indexOf(Character.toLowerCase(this.strTexto.charAt(intCont)))!=-1)
				intVocales++;
		
		return intVocales;
	}

	@Override
	public String toString() {
		return "Texto [intLongMax=" + intLongMax + ", strTexto=" + strTexto + ", fechaCreacion=" + fechaCreacion
				+ ", ultimaModificacion=" + ultimaModificacion + "]";
	}
	
	
}
