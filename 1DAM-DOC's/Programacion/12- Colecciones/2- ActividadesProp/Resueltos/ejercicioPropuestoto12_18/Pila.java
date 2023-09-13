package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_18;

import java.util.ArrayList;

public class Pila <T>{
	private ArrayList<T> elementos;

	public Pila() {
		this.elementos = new ArrayList<T>();
	}
	
	public void push(T elemento) {
		this.elementos.add(0,elemento);
	}
	
	public T pop() {
		if(!this.elementos.isEmpty())
			return this.elementos.remove(0);
		else
			return null;
	}
}
