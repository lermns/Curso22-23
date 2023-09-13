package actividadesProps.act11_11;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        System.out.println("Dame un numero natural: ");
        double dblNum = new Scanner(System.in).useLocale(Locale.US).nextDouble();

        try(ObjectOutputStream escrbir = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_11/archivo.dat"))){
            escrbir.writeObject(dblNum);
        }catch (IOException e){
            System.out.println("El archivo no se ha encontrado");
        }

    }
}
