package aaa.act11_20;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        final String strArchivo = "src/aaa/act11_20/Datos.bin";
        Cliente[] cliTabla = new Cliente[0];
        int intOpc;
        
        //leo los datos de los clientes
        try(ObjectInputStream leer = new ObjectInputStream(new FileInputStream(strArchivo))) {
        	cliTabla = (Cliente[]) leer.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println("No se ha podido leer los datos de los clientes");
        }
        
        //trabajo con la lista de clientes
        do {
            intOpc = menu();

            switch (intOpc) {
                case 1 -> cliTabla = aniadirCliente(cliTabla);
                case 2 -> modificarDatos(cliTabla);
                case 3 -> cliTabla=darBaja(cliTabla);
                case 4 -> listarClientes(cliTabla);
            }
        }while (intOpc!=0);
        
        //guardo los clientes en el archivo
        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(strArchivo))) {
        	escribir.writeObject(cliTabla);
        }catch (IOException e){
            System.out.println("No se han podido guardar los datos de los clientes en el archivo");
        }
    }

	private static void listarClientes(Cliente[] cliTabla){
		System.out.println("Los siguiente clientes: ");
		for(int intCont=0; intCont<cliTabla.length; intCont++) {
			System.out.println(intCont + " " + cliTabla[intCont]);
		}
	}

	private static Cliente[] aniadirCliente(Cliente[] cliTabla) {
		System.out.println("Introduce el ID: ");
		int intID = new Scanner(System.in).nextInt();
		System.out.println("Introduce el nombre: ");
		String strNombre = new Scanner(System.in).nextLine();
		System.out.println("Introduce el teléfono: ");
		int intTelf = new Scanner(System.in).nextInt();


		Cliente cliente1 = new Cliente(intID, strNombre, intTelf);

		cliTabla = Arrays.copyOf(cliTabla, cliTabla.length + 1);
		cliTabla[cliTabla.length - 1] = cliente1;
		System.out.println("Se ha registrado el cliente en la lista " + (cliTabla.length - 1));
		return cliTabla;
	}

	private static int menu() {
		Integer intNum=null;
		
		do {
			System.out.println("\t\tMenú\n" +
			        "0. Salir.\n" +
			        "1. Añadir nuevo cliente.\n" +
			        "2. Modificar Datos.\n" +
			        "3. Dar de baja cliente.\n" +
			        "4. Listar los clientes");
			try {intNum = new Scanner(System.in).nextInt();} catch (Exception e) {}
		}while(intNum==null && (intNum<0 || intNum>4));
		
		return intNum;
	}

    public static void modificarDatos(Cliente[] cliTabla){
    	 int intEdit=0;
    	 Integer intCliente=null;
    	 
    	listarClientes(cliTabla);
    	do {
    		System.out.println("Ingrese la posicion del cliente a modificar: ");
        	
    		try {intCliente = new Scanner(System.in).nextInt();} catch (Exception e) {}
    	}while(intCliente==null && (intCliente<0 || intCliente>cliTabla.length));
    	
    	do {
    		System.out.println("1. Editar ID.\n" +
    				"2. Editar Nombre.\n" +
    				"3. Editar Teléfono.\n" +
    				"4. Salir");
    		intEdit = new Scanner(System.in).nextInt();

    		switch (intEdit) {
	    		case 1 -> {
	    			System.out.println("Escriba el nuevo ID: ");
	    			int intNewID = new Scanner(System.in).nextInt();
	    			cliTabla[intCliente].setIntID(intNewID);
	    		}
	    		case 2 -> {
	    			System.out.println("Esccriba el nuevo nombre: ");
	    			String strNuevoNom = new Scanner(System.in).nextLine();
	    			cliTabla[intCliente].setStrNombre(strNuevoNom);
	    		}
	    		case 3 -> {
	    			System.out.println("Escriba el nuevo teléfono: ");
	    			int intNewFono = new Scanner(System.in).nextInt();
	    			cliTabla[intCliente].setIntTelf(intNewFono);
	    		}
    		}
    	}while (intEdit!=4);
        
    }
    public static Cliente[] darBaja(Cliente[] cliTabla){
   	 	Integer intCliente=null;

    	listarClientes(cliTabla);
    	do {
    		System.out.println("Ingrese la posicion del cliente a borrar: ");
        	
    		try {intCliente = new Scanner(System.in).nextInt();} catch (Exception e) {}
    	}while(intCliente==null && (intCliente<0 || intCliente>cliTabla.length));        
       
    	for (int i = intCliente-1; i < cliTabla.length - 1; i++) {
    		cliTabla[i] = cliTabla[i + 1];
    	}
    	System.out.println("se ha borrado..\n");
        return Arrays.copyOf(cliTabla, cliTabla.length-1);
    }
}
