package tema7.ejerciciosPropuestos.ejercicio711;

public class Main {

	public static void main(String[] args) {
		MarcaPagina marcador = new MarcaPagina();
		
		System.out.println(marcador.toString());
		marcador.incrementarPaginaLeida();
		marcador.incrementarPaginaLeida();
		marcador.incrementarPaginaLeida();
		marcador.incrementarPaginaLeida();
		System.out.println(marcador.toString());
		marcador.comenzarPrincipio();
		System.out.println(marcador.toString());

	}

}
