package tema9.ejerciciosPropuestos.ejercicioPropuesto911;


public class Main {

	public static void main(String[] args) {
		Lista objLista = new Lista();
		
		
		for (int intCont = 0; intCont <= 5; intCont++) 
			objLista.insertarFinal("Hola" + intCont);
	      
	      System.out.println("Sacamos los elementos de la Lista");
	      for (int intCont = 0; intCont <= 6; intCont++)
	         System.out.println(objLista.elemento(intCont));
	}

}
