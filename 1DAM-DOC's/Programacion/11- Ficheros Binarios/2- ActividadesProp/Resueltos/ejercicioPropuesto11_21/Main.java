package tema11.ejerciciosPropuestos.ejercicioPropuesto11_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class Main {

	public static void main(String[] args)  {
		final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_21/";
		Lista listaClientes = new Lista();
		Cliente objCliente, claveBusqueda;
        int intOpcion;
        String strId;
        String strNombre;
        String strTelefono;
        int intIndice;
        boolean blnEncontrado = false;
        
        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH + "clientes.dat"))) {
        	listaClientes = (Lista) in.readObject();
        } catch (IOException ex) {
            System.out.println("lista vacía");
        } catch (ClassNotFoundException ex) {}
        
        /*Gestión de clientes: */
        do {
            System.out.println("1. Añadir cliente");
            System.out.println("2. Modificar datos cliente");
            System.out.println("3. Baja de cliente");
            System.out.println("4. Listar clientes");
            System.out.println("5. Salir");
            System.out.print("\nIntroducir opción: ");
            intOpcion = new Scanner(System.in).nextInt();
            System.out.println("");
            switch (intOpcion) {
                case 1 -> {
                    System.out.print("id: ");
                    strId = new Scanner(System.in).next();
                    System.out.print("nombre: ");
                    strNombre = new Scanner(System.in).nextLine();
                    System.out.print("teléfono: ");
                    strTelefono = new Scanner(System.in).next();
                    objCliente = new Cliente(strId, strNombre, strTelefono);
                    listaClientes.insertarFinal(objCliente);
                }
                case 2 -> {
                    System.out.print("id: ");
                    strId = new Scanner(System.in).next();
                    claveBusqueda = new Cliente(strId);

                    intIndice = listaClientes.buscar(claveBusqueda);

                    if (intIndice != -1) {//cliente encontrado
                        System.out.print("nombre: ");
                        strNombre = new Scanner(System.in).nextLine();
                        System.out.print("teléfono: ");
                        strTelefono = new Scanner(System.in).next();
                        ((Cliente) listaClientes.get(intIndice)).setStrNombre(strNombre);
                        ((Cliente) listaClientes.get(intIndice)).setStrTelefono(strTelefono);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                }
                case 3 -> {
                    System.out.print("id: ");
                    strId = new Scanner(System.in).next();
                    claveBusqueda = new Cliente(strId);
                    intIndice = listaClientes.buscar(claveBusqueda);
                    if (intIndice != -1) {//cliente encontrado
                        listaClientes.eliminar(intIndice);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                }
                case 4 -> {
                    System.out.println(listaClientes);
                }
            }
        } while (intOpcion != 5);
        
        /*Al salir guardamos los datos: */
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH + "clientes.dat"))) {
            out.writeObject(listaClientes);
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }
    }

}
