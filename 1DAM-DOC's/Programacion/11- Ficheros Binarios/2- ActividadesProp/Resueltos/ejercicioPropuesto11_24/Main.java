package tema11.ejerciciosPropuestos.ejercicioPropuesto11_24;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
        Integer[] intArray1 = {3, 5, 7, 2, 8, 9};
        Integer[] intArray2 = {20, 30, 50, -30};
        final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_24/";

        try ( ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream(PATH + "fichero1"));  
        	  ObjectOutputStream o2 = new ObjectOutputStream(new FileOutputStream(PATH + "fichero2"))) {
            o1.writeObject(intArray1);
            o2.writeObject(intArray2);
        } catch (IOException ex) {
            System.out.println("Error en la lectura");
        }

        fusionar(PATH + "fichero1", PATH + "fichero2");

        try ( ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(PATH + "fichero1"))) {
            intArray1 = (Integer[]) in1.readObject();
            System.out.println(Arrays.toString(intArray1));
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error en la escritura");
        }
    }

    static void fusionar(String ficheroBase, String ficheroNuevo) {
        Integer[] listaBase = null, listaNueva = null;
        
        try ( ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(ficheroBase));  
        		ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(ficheroNuevo))) {
            listaBase = (Integer[]) in1.readObject();
            listaNueva = (Integer[]) in2.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error en la lectura dentro de fusionar");
        }
        
        listaBase = Arrays.copyOf(listaBase, listaBase.length + listaNueva.length);
        System.arraycopy(listaNueva, 0, listaBase, listaBase.length - listaNueva.length, listaNueva.length);
        
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ficheroBase))) {
            out.writeObject(listaBase);
        } catch (IOException ex) {
            System.out.println("Error en la escritura dentro de fusionar");
        }
    }

}
