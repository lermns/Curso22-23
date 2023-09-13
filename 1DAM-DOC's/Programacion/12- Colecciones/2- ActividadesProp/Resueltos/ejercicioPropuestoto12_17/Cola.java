package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_17;

import java.util.ArrayList;

public class Cola <T>{
	private ArrayList<T> elementos;

	public Cola() {
		this.elementos = new ArrayList<T>();
	}
	
	public void push(T elemento) {
		this.elementos.add(elemento);
	}
	
	public T pop() {
		if(!this.elementos.isEmpty())
			return this.elementos.remove(0);
		else
			return null;
	}
}
