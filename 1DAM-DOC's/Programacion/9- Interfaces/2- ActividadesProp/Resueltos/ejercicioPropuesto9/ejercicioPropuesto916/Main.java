package tema9.ejerciciosPropuestos.ejercicioPropuesto916;

import tema9.ejerciciosPropuestos.ejercicioPropuesto913.Futbolista;
import tema9.ejerciciosPropuestos.ejercicioPropuesto924.Lista;

public class Main {

	public static void main(String[] args) {
		Lista objLista = new Lista();
		
		for (int intCont = 1; intCont <= 5; intCont++) 
			objLista.push("Hola " + intCont);
		for (int intCont = 0; intCont <= 5; intCont++) 
			objLista.push((double)intCont);  
		objLista.push(new Futbolista("1A", "Pepe", 25, 3));
		objLista.push(new Futbolista("2B", "Juan", 19, 1));
		
		System.out.println(objLista + "\n");
		System.out.println("Sacamos los elementos como pila y cola");
	    while(objLista.elementos()>0)
	        System.out.println(objLista.popPila() + "\t-\t" + objLista.pop());
	}

}
