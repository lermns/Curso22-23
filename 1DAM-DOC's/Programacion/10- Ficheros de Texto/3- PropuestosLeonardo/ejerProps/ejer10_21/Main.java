package tema10.ficherosDeTexto.ejerProps.ejer10_21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> listNombres = new ArrayList<>();
		ArrayList<String> listNumeros = new ArrayList<>();
		int intSelect;
		
		System.out.println("Seleccione la opcion que desea realizar: \n\n1.Nuevo Contacto.\n2.Buscar por Nombre.\n3.Mostrar Todos.\n4.Salir.");
		intSelect = sc.nextInt();
		switch(intSelect) {
		case 1:
			System.out.printf("Escribe el nombre del contacto: ");
			listNombres.add(sc.nextLine());
			System.in.read();
			System.out.printf("Ahora igresa su numero: ");
			listNumeros.add(sc.nextLine());
			System.in.read();

		}
		for(int i = 0; i < listNombres.size(); i++) {
		System.out.println("Nombre: " + listNombres.get(i).getName()+"\nNumero" + listNumeros.get(i));
		}
	}

}
