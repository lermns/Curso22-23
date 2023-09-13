package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_20;

import java.util.ArrayList;

public class SuperCola <T>{
	private ArrayList<T> elementos1;
	private ArrayList<T> elementos2;

	public SuperCola() {
		this.elementos1 = new ArrayList<T>();
		this.elementos2 = new ArrayList<T>();
	}
	
	public void push1(T elemento) {
		this.elementos1.add(elemento);
	}
	
	public void push2(T elemento) {
		this.elementos2.add(elemento);
	}
	
	public T pop1() {
		if(!this.elementos1.isEmpty())
			return this.elementos1.remove(0);
		else if(!this.elementos2.isEmpty())
				 return this.elementos2.remove(0);
			 else
				 return null;
	}
	
	public T pop2() {
		if(!this.elementos2.isEmpty())
			return this.elementos2.remove(0);
		else if(!this.elementos1.isEmpty())
				 return this.elementos1.remove(0);
			 else
				 return null;
	}
}
