package tema7.ejerciciosPropuestos.ejerciciosPropuestos19;

import java.util.Arrays;

public class Pila {
	private int[] intArrElementos;

	public Pila() {
		intArrElementos = new int[0];
	}
	
	public Integer pop() {
		Integer intDevolver = null;
		
		if(this.intArrElementos.length>0) {
			intDevolver = this.intArrElementos[this.intArrElementos.length-1];
			this.intArrElementos = Arrays.copyOf(this.intArrElementos, this.intArrElementos.length-1);
		}else
			System.out.println("Underflow");
		
		return intDevolver;
	}
	
	public void push(int intValor) {
		this.intArrElementos = Arrays.copyOf(this.intArrElementos, this.intArrElementos.length+1);
		this.intArrElementos[this.intArrElementos.length-1] = intValor;

	}
}
