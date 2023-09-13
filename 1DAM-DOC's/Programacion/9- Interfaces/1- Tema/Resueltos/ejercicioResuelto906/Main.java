package tema9.ejerciciosResueltos.ejercicioResuelto906;

public class Main {

	public static void main(String[] args) {
		Integer intElem;
		
		Lista objCola = new Lista();
		
		for (int intCont = 1; intCont <= 10; intCont++) {
	         objCola.push(intCont);
	    }
	    
		objCola.encolarMultiple();//meto varios
		
	    System.out.println("Sacamos los elementos de la Cola");
	    intElem=objCola.pop();
	    for (int intCont = 1; intElem!=null; intCont++) {
	    	System.out.println(intElem);
	    	intElem=objCola.pop();
	    }

	}

}
