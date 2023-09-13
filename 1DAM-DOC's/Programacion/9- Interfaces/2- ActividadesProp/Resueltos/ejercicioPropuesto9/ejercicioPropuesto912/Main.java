package tema9.ejerciciosPropuestos.ejercicioPropuesto912;


public class Main {

	public static void main(String[] args) {
		Lista objLista = new Lista();
		
		//cola
		for (int intCont = 1; intCont <= 10; intCont++) 
			objLista.push("Hola" + intCont);
		System.out.println("Sacamos los elementos de la Cola");
		for (int intCont = 0; objLista.elementos()>0; intCont++)
			System.out.println(objLista.pop());
		
		//pila
		for (int intCont = 1; intCont <= 10; intCont++) 
			objLista.push("Hola" + intCont);
		System.out.println("Sacamos los elementos de la Pila");
		for (int intCont = 0; objLista.elementos()>0; intCont++)
			System.out.println(objLista.popPila());
	}

}
