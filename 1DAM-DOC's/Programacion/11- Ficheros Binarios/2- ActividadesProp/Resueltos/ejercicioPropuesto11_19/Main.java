package tema11.ejerciciosPropuestos.ejercicioPropuesto11_19;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	        int[] intArrLlamadas = new int[0];
	        int intOpcion;
	        int intNum;
	        
	        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_19/llamadas.dat"))) {
	            intArrLlamadas = (int[]) in.readObject();
	        } catch (IOException ex) {
	            System.out.println("lista vacía");
	        } catch (ClassNotFoundException ex) {
	            System.out.println(ex);
	        }
	        /*gestión de lista de llamadas: */
	        do {
	            System.out.println("1. Añadir número de llamadas");
	            System.out.println("2. Ver lista números de llamadas");
	            System.out.println("3. Salir");
	            System.out.print("\nIntroducir opción: ");
	            intOpcion = new Scanner(System.in).nextInt();
	            System.out.println("");
	            if (intOpcion == 1) {
	                System.out.print("Nuevo número de llamadas: ");
	                intNum = new Scanner(System.in).nextInt();
	                intArrLlamadas = Arrays.copyOf(intArrLlamadas, intArrLlamadas.length + 1);
	                intArrLlamadas[intArrLlamadas.length - 1] = intNum;
	            } else if (intOpcion == 2) {
	                System.out.println(Arrays.toString(intArrLlamadas));
	            }
	        } while (intOpcion != 3);
	        /*Al salir guardamos los datos: */
	        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_19/llamadas.dat"))) {
	            out.writeObject(intArrLlamadas);
	        } catch (IOException ex) {
	            System.out.println(ex);
	        }
	    }

	}
