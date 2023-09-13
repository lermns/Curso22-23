package tema7.ejerciciosResueltos.ejerciciosResueltos713;

public class Cola {
	private Lista elementos;
	
	public Cola() {
		this.elementos = new Lista();
	}

	public int pop() {
		Integer intAux=	this.elementos.elemento(this.elementos.elementos()-1); //cojo el �ltimo elemento
		
		if(intAux==null) //si no hay elementos
			System.out.println("No hay elementos underflow");
		else 
			this.elementos.eliminarPosicion(this.elementos.elementos()-1); //elimino la �ltima posici�n
				
		return intAux;
	}
	
	public void push(int intElemento) {
		this.elementos.insertarFinal(intElemento);
	}

	@Override
	public String toString() {
		return this.elementos.toString();
	}
	
	
}
