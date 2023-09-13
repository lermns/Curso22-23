package actividadesProps.act11_17;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String strArchivo = "C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_17/archivoLista.dat";

        try (ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(strArchivo))) {
            String strLinea = null;
            do {
                System.out.println("Escribe una linea de texto");
                strLinea = new Scanner(System.in).nextLine();
                if (!Objects.equals(strLinea, "")) {
                    escribir.writeObject(strLinea);
                }
            } while (!Objects.equals(strLinea, ""));


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


        try (ObjectInputStream leer = new ObjectInputStream(new FileInputStream(strArchivo))) {

            while(true) {
                String strCadena = (String) leer.readObject();
                if (!Objects.equals(strCadena, null)) {
                    System.out.println(strCadena);
                }
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
