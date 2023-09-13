package tema10.ejerciciosPropuestos.ejercicioPropuesto10_21;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int intOpc;
		String strNombre, strTelefono;
		Agenda listin = new Agenda();
		
		do {
			intOpc = menu();
			switch (intOpc) {
					case 1->{
						System.out.println("Dame el nombre ");
						strNombre = new Scanner(System.in).nextLine();
						System.out.println("Dame el teléfono ");
						strTelefono = new Scanner(System.in).nextLine();
						listin.aniadePersona(strNombre, strTelefono);
					}
					case 2->{
						System.out.println("Dame el pincipio de los nombres que quieras mostrar");
						strNombre = new Scanner(System.in).nextLine();
						listin.mostrarPrincipio(strNombre);
					}
					case 3->System.out.println(listin);
					case 4-> listin.guardar();
			}
		}while(intOpc!=4);


	}

	private static int menu() {
		int intDevolver=0;
		
		do {
			System.out.println("1. Nuevo Contacto \n" +
							   "2. Buscar por nombre\n" +
							   "3. Mostrar todos\n" +
							   "4. Salir");
			try {
				intDevolver=new Scanner(System.in).nextInt();
			}catch(Exception e) {}
			
		}while(intDevolver<1 || intDevolver>4);
		return intDevolver;
	}

}
