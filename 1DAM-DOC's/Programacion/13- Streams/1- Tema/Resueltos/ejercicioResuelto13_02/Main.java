package tema13.ejerciciosResueltos.ejercicioResuelto13_02;

import java.util.ArrayList;
import java.util.List;

import tema13.ejerciciosResueltos.ejercicioResuelto13_01.Cliente;
import tema13.ejerciciosResueltos.ejercicioResuelto13_01.Saludo;

public class Main {

	public static void main(String[] args) {
		Cliente[] strArrPersonas = {new Cliente("Pepe"), new Cliente("Ana"), new Cliente("Ramón")};
		Saludo<Cliente> saludoCliente = objCliente ->"Hola cliente " + objCliente.getStrNombre();
		
		System.out.println(saludoGrupal(strArrPersonas,saludoCliente));
	}
	private static <T> List<String> saludoGrupal(T [] array, Saludo<T> sal){
		List<String> listaSaludos = new ArrayList<>();

		for(T elementoT:array)
			listaSaludos.add(sal.saludar(elementoT));
		
		return listaSaludos;
	}
}
