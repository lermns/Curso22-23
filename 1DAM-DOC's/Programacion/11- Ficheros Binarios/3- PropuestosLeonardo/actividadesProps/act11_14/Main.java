package actividadesProps.act11_14;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String strPalabra;

        System.out.println("Escriba la palabra a guardar: ");
        strPalabra = new Scanner(System.in).nextLine();

        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_14/frase.dat"))){
            escribir.writeObject(strPalabra);
        }catch(IOException e){
            System.out.println("No se puede encontrar el archivo");
        }

        try(ObjectInputStream leer = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_14/frase.dat"))){
            String strFrase;
            strFrase = (String) leer.readObject();
            System.out.println(strFrase);
        }catch(IOException | ClassNotFoundException e){
            System.out.println("No se ha encontrado el archivo a leer");
        }
    }
}
