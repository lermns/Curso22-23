package tema10.ejerciciosPropuestos.ejercicioPropuesto10_16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {

	public static void main(String[] args)  {
		int intMenu = 0;
		Scanner scnLeer = new Scanner(System.in);
		
		do {
			intMenu = menu(scnLeer);
			
			switch(intMenu) {
				case 1->mostrar();
				case 2->insertar(scnLeer);
			}
		}while(intMenu!=0);
		
		scnLeer.close();
/*		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_15/numeros.txt"));
		} catch (FileNotFoundException e) {	
				System.out.println("No existe el fichero numeros.txt");
			}
		
		if(br != null) {
			while(br!=null) {
				try {
					intNum = Integer.parseInt(br.readLine());
				} catch (NumberFormatException e) {
					try {
						if(br.readLine()==null) {
							br.close();
							br=null;
						}
					} catch (Exception e1) {}
				} catch (IOException ie) {}
				if(intMayor==null) {
					intMayor = intNum;
					intMenor = intNum;
				}else {
					if(intMayor < intNum)
						intMayor = intNum;
					if(intMenor > intNum)
						intMenor = intNum;
				}
			}
			System.out.println("Número mayor: " + intMayor + " número menor: " + intMenor);
			
		}*/
	}

	private static void insertar(Scanner scnLeer) {
		String strNombreNuevo;
		
		System.out.print("Dime el nombre a insertar en el libro de firmas: ");
		strNombreNuevo = scnLeer.nextLine();
		if(bucarFirma(strNombreNuevo))
			System.out.println("La firma ya existía");
		else 
			insertar(strNombreNuevo);
	}

	private static void insertar(String strNombreNuevo) {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_16/firmas.txt", true));
		} catch (IOException e) {	
				System.out.println("Fallo de escritura en el fichero firmas.txt");
			}
		
		if(bw!=null) {
			try {
				bw.newLine();
				bw.write(strNombreNuevo);
				bw.close();
			} catch (IOException e) {	
				System.out.println("Fallo de escritura en el fichero firmas.txt");
			}
		}
	}

	private static boolean bucarFirma(String strNombreNuevo) {
		boolean blnDevolver = false;
		BufferedReader br = null;
		String strLinea = null;
		
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_16/firmas.txt"));
		} catch (FileNotFoundException e) {	
				System.out.println("No existe el fichero firmas.txt");
			}
		
		if(br != null) {
			do {
				try {
					strLinea = br.readLine();
				} catch (IOException ie) {}
			}while(strLinea!=null && !strLinea.toLowerCase().equals(strNombreNuevo.toLowerCase()));
			if(strLinea!=null && strLinea.toLowerCase().equals(strLinea.toLowerCase()))
				blnDevolver = true;
			try {
				br.close();
			} catch (IOException e) {}
		}
		
		return blnDevolver;
	}

	private static void mostrar() {
		BufferedReader br = null;
		String strLinea = null;
		
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_16/firmas.txt"));
		} catch (FileNotFoundException e) {	
				System.out.println("No existe el fichero firmas.txt");
			}
		
		if(br != null) {
			try {
				strLinea = br.readLine();
			} catch (IOException ie) {}
			while(strLinea!=null) {
				System.out.print(strLinea + " ");
				try {
					strLinea = br.readLine();
				} catch (IOException ie) {}
			}
			System.out.println("\n");
			try {
				br.close();
			} catch (IOException e) {}
		}
	}

	private static int menu(Scanner scnLeer) {
		int intDevolver = -1;
		
		do {
			System.out.println("\nElige una opción \n" +
					   		   "0.- Salir \n" +
					   		   "1.- Mostrar firmas \n" +
					   		   "2.- Insertar nueva firma");
			try {
				intDevolver = Integer.parseInt(scnLeer.nextLine());
			} catch (Exception e) {}
		}while(intDevolver<0 || intDevolver>2);
		return intDevolver;
	}

}
