package aplicacion11.pkg25;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_25/";
        String[] strFicheros = {"f1", "f2", "f3", "f4"};
        ObjectInputStream[] in = new ObjectInputStream[4];//creo un array de flujos
        Integer[][] intArrTablas = new Integer[4][];//es bidimensional, primera dimensión indica que fichero es y el segundo el valor concreto
        
        try {
            System.out.print("Introducir número entero: ");
            Integer num = new Scanner(System.in).nextInt();
            //Accedemos a los ficheros y leemos las tablas de números:
            for (int intCont = 0; intCont < in.length; intCont++) {
                in[intCont] = new ObjectInputStream(new FileInputStream(PATH + strFicheros[intCont]));
                intArrTablas[intCont] = (Integer[]) in[intCont].readObject();
                //buscamos el número en las tablas
                int indice = Arrays.binarySearch(intArrTablas[intCont], num);
                if (indice >= 0) {
                    System.out.println(num + " está en el fichero " + intCont + " con índice " + indice);
                }
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Error en la lectura de los ficheros");
        }
        //Cerramos los ficheros:
        for (ObjectInputStream entrada : in) {
            if (entrada != null) {
                try {
                    entrada.close();
                }catch (IOException ex) {
                    System.out.println(ex);
                }
            }    
        }
    }

}
