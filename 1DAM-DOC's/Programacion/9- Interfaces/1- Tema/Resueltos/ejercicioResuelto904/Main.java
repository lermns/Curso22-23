package tema9.ejerciciosResueltos.ejercicioResuelto904;

public class Main {

	public static void main(String[] args) {
		Lista objCola = new Lista();
		
		for (int intCont = 1; intCont <= 10; intCont++) {
	         objCola.pushPila(intCont);
	      }
	      
	      System.out.println("Sacamos los elementos de la Pila");
	      for (int intCont = 1; intCont <= 12; intCont++) {
	         System.out.println(objCola.pop());
	      }

	}

}
