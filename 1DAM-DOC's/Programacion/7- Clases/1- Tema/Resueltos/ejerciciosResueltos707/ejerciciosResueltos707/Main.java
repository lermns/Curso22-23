package tema7.ejerciciosResueltos.ejerciciosResueltos707;

public class Main {

	public static void main(String[] args) {
		Texto texto = new Texto("Hola mundo".length());
		
		texto.annadePrincipio('M');
		texto.annadeFinal('u');
		texto.annadePrincipio("Hola ");
		texto.annadeFinal("ndo");
		//no debería dejar los dos siguientes
		texto.annadePrincipio("no deja");
		texto.annadeFinal("no deja");
		System.out.println(texto.toString());
		System.out.println("Vocales: " + texto.vocales());
	}

}
