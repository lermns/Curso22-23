package aaa.propuesto15;

public class SuperCola{
	
	private Lista cola1;
	private Lista cola2;
	
	public SuperCola() {
		this.cola1 = new Lista();
		this.cola2 = new Lista();
	}


	public void push(int intCola, int intElem) {
		Lista colaAux=intCola==1?this.cola1:this.cola2;
		/*if(intCola==1)
		 * 	colaAux=this.cola1;
		 *else
		 * 	colaAux=this.cola2;*/
		colaAux.push(intElem);
	}

/*	public Integer popCola1() {
		Integer intDevolver=null;
		
		if(this.cola1.elementos()>0)
			intDevolver = this.cola1.pop();
		else if(this.cola2.elementos()>0) 
				intDevolver = this.cola2.pop();
		
		return intDevolver;
	}*/
	
	public Integer pop(int intCola) {
		Integer intDevolver=null;
		Lista colaAux=null;
		
		//Devuelvo la cola1 si
		if((intCola==1 && this.cola1.elementos()>0) ||//han llamado a cola1 y no está vacía
		   (intCola==2 && this.cola2.elementos()==0 && this.cola1.elementos()>0))//han llamado a cola2 que esta vacía y cola1 no lo está
			colaAux=this.cola1;
		else if((intCola==2 && this.cola2.elementos()>0) ||//han llamado a cola2 y no está vacía
				   (intCola==1 && this.cola1.elementos()==0 && this.cola2.elementos()>0))//han llamado a cola1 que esta vacía y cola2 no lo está
					colaAux=this.cola2;
		
		if(colaAux!=null)
			intDevolver = colaAux.pop();
		
		return intDevolver;
	}


	@Override
	public String toString() {
		return "SuperCola [cola1=" + cola1 + ", cola2=" + cola2 + "]";
	}
	
	

}
