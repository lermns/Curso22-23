package tema11.ejerciciosPropuestos.ejercicioPropuesto11_20;

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
		final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_20/";
		Cliente[] arrClientes = new Cliente[0];
		Cliente objCliente, claveBusqueda;
        int intOpcion;
        String strId;
        String strNombre;
        String strTelefono;
        int intIndice;
        boolean blnEncontrado = false;
        
        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH + "clientes.dat"))) {
        	arrClientes = (Cliente[]) in.readObject();
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
                    arrClientes = Arrays.copyOf(arrClientes, arrClientes.length + 1);
                    arrClientes[arrClientes.length - 1] = objCliente;
                }
                case 2 -> {
                    System.out.print("id: ");
                    strId = new Scanner(System.in).next();
                    claveBusqueda = new Cliente(strId);
                    //Búsqueda secuencial del cliente
                    for (intIndice = 0; intIndice < arrClientes.length
                            && !blnEncontrado; intIndice++) {
                        if (arrClientes[intIndice].equals(claveBusqueda)) {
                            blnEncontrado = true;
                        }
                    }      
                    if (blnEncontrado) {//cliente encontrado
                        intIndice--;//se ha icrementado una vez de más en el bucle
                        System.out.print("nombre: ");
                        strNombre = new Scanner(System.in).nextLine();
                        System.out.print("teléfono: ");
                        strTelefono = new Scanner(System.in).next();
                        arrClientes[intIndice] = new Cliente(strId, strNombre, strTelefono);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                }
                case 3 -> {
                    System.out.print("id: ");
                    strId = new Scanner(System.in).next();
                    claveBusqueda = new Cliente(strId);
                    //Búsqueda secuencial del cliente
                    for (intIndice = 0; intIndice < arrClientes.length
                            && !blnEncontrado; intIndice++) {
                        if (arrClientes[intIndice].equals(claveBusqueda)) {
                            blnEncontrado = true;
                        }
                    }
                    if (blnEncontrado) {
                        intIndice--;
                        for (int intCont = intIndice; intCont < arrClientes.length - 1; intCont++) {
                            arrClientes[intCont] = arrClientes[intCont + 1];
                        }
                        arrClientes = Arrays.copyOf(arrClientes, arrClientes.length - 1);
                    } else {
                        System.out.println("Cliente no encontrado");
                    }
                }
                case 4 -> {
                    System.out.println(Arrays.deepToString(arrClientes));
                }
            }
        } while (intOpcion != 5);
        /*Al salir guardamos los datos: */
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH + "clientes.dat"))) {
            out.writeObject(arrClientes);
        } catch (IOException ex) {
            System.out.println("Error al escribir");
        }
    }

}
