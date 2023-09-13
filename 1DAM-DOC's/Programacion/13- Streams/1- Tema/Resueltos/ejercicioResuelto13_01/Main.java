package tema13.ejerciciosResueltos.ejercicioResuelto13_01;

public class Main {

	public static void main(String[] args) {
		Saludo<String> saludoString = strCadena -> "Hola cadena " + strCadena;
		Saludo<Cliente> saludoCliente = objCliente ->"Hola cliente " + objCliente.getStrNombre();

		System.out.println(saludoString.saludar("primera"));
		System.out.println(saludoCliente.saludar(new Cliente("Pepe")));
		System.out.println(saludoString.saludar("segunda"));
		System.out.println(saludoCliente.saludar(new Cliente("Ana")));

	}

}
