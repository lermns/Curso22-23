package tema6.ejerciciosPropuestos;

import java.util.Arrays;
import java.util.Scanner;

public class EjerciciosPropuestos614 {

	public static void main(String[] args) {
		String[] strArrAgendaTlf= {};//Agenda de teléfonos
		Scanner scnLeer=new Scanner(System.in);
		char chrOpc;

		do {
			chrOpc=menu(scnLeer);
			switch(chrOpc) {
			case 'a'->strArrAgendaTlf=anadir(strArrAgendaTlf,scnLeer);
			case 'b'->buscarNombre(strArrAgendaTlf,scnLeer);
			case 'c'->listar(strArrAgendaTlf);
			}
		}while(chrOpc!='d');
		scnLeer.close();
	}

	private static void listar(String[] strArrAgendaTlf) {
		for(int intCont=0;intCont<strArrAgendaTlf.length;intCont++) 
			System.out.println("Nombre: " + strArrAgendaTlf[intCont].split(":")[0] 
								+ "\tTeléfono: " + strArrAgendaTlf[intCont].split(":")[1]);
		System.out.println();
	}

	private static void buscarNombre(String[] strArrAgendaTlf, Scanner scnLeer) {
		String strNombre;
		int intPos;
		
		do {//leo el nombre, que no sea vacío 
			System.out.print("Dame el nombre: ");
			strNombre=scnLeer.nextLine();
			if(strNombre.length()>9)
				strNombre=strNombre.substring(0,9);
			intPos=buscar(strNombre, strArrAgendaTlf);
		}while(strNombre.length()==0);
		
		//contesto si lo ha encontrado
		if(intPos>=0)
			System.out.println("\tTeléfono: " + strArrAgendaTlf[intPos].split(":")[1] + "\n");
		else
			System.out.println("El nombre solicitado no existe en la agenda\n");
	}

	private static String[] anadir(String[] strArrAgendaTlf, Scanner scnLeer) {
		
		String strNombre, strTelefono;
		int intPos;

		do {//leo el nombre, que no sea vacío ni lo tenga ya
			System.out.print("Dame el nombre: ");
			strNombre=scnLeer.nextLine();
			if(strNombre.length()>9)
				strNombre=strNombre.substring(0,9);
			intPos=buscar(strNombre, strArrAgendaTlf);
		}while(strNombre.length()==0 || intPos>=0);
		intPos=-intPos-1;
		
		do {//leo el teléfono, que sea un número de 9 dígitos que empieza por 9 o 6
			System.out.print("Dame el teléfono: ");
			strTelefono=scnLeer.nextLine();
		}while(strTelefono.length()!=9 ||
				!(strTelefono.charAt(0)=='9' || strTelefono.charAt(0)=='6'));
		
		
		//añado el elemento a la agenda
		strArrAgendaTlf=Arrays.copyOf(strArrAgendaTlf, strArrAgendaTlf.length+1);
		System.arraycopy(strArrAgendaTlf, intPos, strArrAgendaTlf, intPos+1, strArrAgendaTlf.length-(intPos+1));
		strArrAgendaTlf[intPos]=strNombre+":"+strTelefono;
		
		return strArrAgendaTlf;
	}

	private static int buscar(String strNombre, String[] strArrAgendaTlf) {
		int intIndice;
		
		for(intIndice=0; intIndice<strArrAgendaTlf.length &&
				strArrAgendaTlf[intIndice].split(":")[0].compareTo(strNombre)<0;intIndice++);
		
		//si no lo ha encontrado devolver el índice en negativo
		if(intIndice>=strArrAgendaTlf.length ||
			!strArrAgendaTlf[intIndice].split(":")[0].equals(strNombre))
			intIndice=-(intIndice+1);
		return intIndice;
	}

	private static char menu(Scanner scnLeer) {
		char chrOpc;

		do {
			System.out.println("a)	Añadir un nuevo contacto (nombre y teléfono).\n"
							+ "b)	Buscar el teléfono de un contacto a partir de su nombre.\n"
							+ "c)	Mostrar la información de todos los contactos ordenados alfabéticamente mediante el nombre.\n"
							+ "d)	Salir del programa");
			chrOpc=scnLeer.nextLine().charAt(0);
		}while(chrOpc<'a' || chrOpc>'d');
		
		return chrOpc;
	}

	
}