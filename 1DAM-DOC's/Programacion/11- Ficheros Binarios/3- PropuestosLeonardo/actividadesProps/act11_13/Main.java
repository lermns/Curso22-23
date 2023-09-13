package actividadesProps.act11_13;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        double[] dblTabla = {10.1, 11.2, 12.3, 13.4, 14.5, 15.6, 16.7, 17.8, 18.9, 19.10, 20.20};
        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_13/numeros.dat"))){
            for (int i=0; i< dblTabla.length; i++) {
                double dblNum = dblTabla[i];
                escribir.writeDouble(dblNum);
            }
        }catch(IOException e){
            System.out.println("No se encuentra el archivo para escribir");
        }
        try(ObjectInputStream leer = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_13/numeros.dat"))){
            double[] dblTabla2 = new double[dblTabla.length];
            for(int i=0; i < dblTabla.length; i++) {
                dblTabla2[i] = leer.readDouble();
            }
            System.out.println(Arrays.toString(dblTabla2));
        }catch(IOException e){
            System.out.println("No se encuentra el archivo para leer");
        }
    }
}
