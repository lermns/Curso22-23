package tema7.ejerciciosPropuestos.ejerciciosPropuestos18;

import java.util.Arrays;

public class Cola {
	private int[] intArrElementos;

	public Cola() {
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
		System.arraycopy(this.intArrElementos, 0, this.intArrElementos, 1, this.intArrElementos.length-1);
		this.intArrElementos[0] = intValor;

	}
}
