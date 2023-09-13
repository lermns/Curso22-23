package tema9.ejerciciosResueltos.ejercicioResuelto911;

import tema9.ejerciciosResueltos.ejercicioResuelto909.Socio;

public class Main {

	public static void main(String[] args) {
		Lista objLista = new Lista();
		
		for (int intCont = 0; intCont <= 5; intCont++) 
			objLista.insertarFinal((double)intCont);
		for (int intCont = 0; intCont <= 5; intCont++) 
			objLista.insertarFinal("Hola");
		objLista.insertarFinal(new Socio(22,"Pepe",123));
		objLista.insertarFinal(new Socio(33,"María",456));
		
	      System.out.println("Sacamos los elementos de la Cola");
	      for (int intCont = 0; intCont <objLista.elementos(); intCont++)
	         System.out.println(objLista.elemento(intCont));
	}

}
