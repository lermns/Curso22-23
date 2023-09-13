package aplicacion11.pkg25;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Carga {

    public static void main(String[] args) {
        //Ejecutar esta parte comentada para crear los ficheros
       Integer[] intArray1 = {1, 4, 5, 7, 9};
        Integer[] intArray2 = {2, 3, 5, 9, 11};
        Integer[] intArray3 = {1, 2, 4, 6};
        Integer[] intArray4 = {4, 5, 8, 9, 12};
        final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_24/";

        try ( ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream(PATH + "f1"));  
                ObjectOutputStream o2 = new ObjectOutputStream(new FileOutputStream(PATH + "f2"));  
                ObjectOutputStream o3 = new ObjectOutputStream(new FileOutputStream(PATH + "f3"));  
                ObjectOutputStream o4 = new ObjectOutputStream(new FileOutputStream(PATH + "f4"))) {

            o1.writeObject(intArray1);
            o2.writeObject(intArray2);
            o3.writeObject(intArray3);
            o4.writeObject(intArray4);
            
        } catch (IOException ex) {
            System.out.println("Error de escritura de los archivos");
        }
       
    }

}
