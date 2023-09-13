package tema9.ejerciciosPropuestos.ejercicioPropuesto915;

import tema9.ejerciciosPropuestos.ejercicioPropuesto912.Lista;

public class Supercola implements ColaDoble{
	protected Lista cola1, cola2;
	
	public Supercola() {
		this.cola1 = new Lista();
		this.cola2 = new Lista();
	}

	@Override
	public void push1(String strElemento) {
		cola1.push(strElemento);
	}

	@Override
	public String pop1() {
		if(this.cola1.elementos()!=0)
			return this.cola1.pop();
		else
			return this.cola2.pop();
	}

	@Override
	public void push2(String strElemento) {
		cola2.push(strElemento);
	}

	@Override
	public String pop2() {
		if(this.cola2.elementos()!=0)
			return this.cola2.pop();
		else 
			return this.cola1.pop();
	}

	@Override
	public String toString() {
		return "cola1=[" + cola1 + "\ncola2=" + cola2 + "]\n\n";
	}

}
