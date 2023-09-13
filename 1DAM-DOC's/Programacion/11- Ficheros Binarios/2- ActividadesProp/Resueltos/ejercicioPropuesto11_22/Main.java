package tema11.ejerciciosPropuestos.ejercicioPropuesto11_22;

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
        Lista listaEmpleados = new Lista();
        Empleado objEmpleado, empleadoBusqueda;
        int intOpcion;
        String strDni;
        String strNombre;
        double rlnSueldo;
        int intIndice;
     

        /*Cargamos la lista de empleados: */
        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream(PATH + "empleados.dat"))) {
            listaEmpleados = (Lista) in.readObject();
        } catch (IOException ex) {
            System.out.println("lista vacía");
        } catch (ClassNotFoundException ex) {}
        
        /*Gestión de empleados: */
        do {
            System.out.println("1. Añadir empleado");
            System.out.println("2. Modificar datos empleado");
            System.out.println("3. Baja de empleado");
            System.out.println("4. Listar empleados");
            System.out.println("5. Salir");
            System.out.print("\nIntroducir opción: ");
            intOpcion = new Scanner(System.in).nextInt();
            System.out.println("");
            switch (intOpcion) {
                case 1 -> {
                    System.out.print("dni: ");
                    strDni = new Scanner(System.in).next();
                    System.out.print("nombre: ");
                    strNombre = new Scanner(System.in).nextLine();
                    System.out.print("sueldo: ");
                    rlnSueldo = new Scanner(System.in).nextDouble();
                    objEmpleado = new Empleado(strDni, strNombre, rlnSueldo);
                    listaEmpleados.insertarFinal(objEmpleado);
                }
                case 2 -> {
                    System.out.print("dni: ");
                    strDni = new Scanner(System.in).next();
                    empleadoBusqueda = new Empleado(strDni);

                    intIndice = listaEmpleados.buscar(empleadoBusqueda);

                    if (intIndice != -1) {//empleado encontrado
                        System.out.print("nombre: ");
                        strNombre = new Scanner(System.in).nextLine();
                        System.out.print("sueldo: ");
                        rlnSueldo = new Scanner(System.in).nextDouble();
                        ((Empleado) listaEmpleados.get(intIndice)).nombre = strNombre;
                        ((Empleado) listaEmpleados.get(intIndice)).sueldo = rlnSueldo;
                    } else {
                        System.out.println("Empleado no encontrado");
                    }
                }
                case 3 -> {
                    System.out.print("dni: ");
                    strDni = new Scanner(System.in).next();
                    empleadoBusqueda = new Empleado(strDni);
                    intIndice = listaEmpleados.buscar(empleadoBusqueda);
                    if (intIndice != -1) {//cliente encontrado
                        listaEmpleados.eliminar(intIndice);
                    } else {
                        System.out.println("Empleado no encontrado");
                    }
                }
                case 4 -> {
                    System.out.println(listaEmpleados);
                }
            }
        } while (intOpcion != 5);
        
        /*Al salir guardamos los datos: */
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(PATH + "empleados.dat"))) {
            out.writeObject(listaEmpleados);
        } catch (IOException ex) {
            System.out.println("Fallo al escribir");
        }
    }

}
