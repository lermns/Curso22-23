package actividadesProps.act11_16;


import java.io.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main2 {
    public static void main(String [] args){
        String[] strTablaNombres = {"juan", "Ana", "Julia"};
        String strArchivo="C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_16/nombres.bin";

        try(ObjectOutputStream escribir1 = new ObjectOutputStream(new FileOutputStream(strArchivo));
            ObjectInputStream leer1 = new ObjectInputStream(new FileInputStream(strArchivo))){

            for(String cadena : strTablaNombres){
                escribir1.writeObject(cadena);
            }
            try {
                while (true) {
                    System.out.println(leer1.readObject());
                }
            } catch (EOFException e){
                System.out.println("fichero terminado");
            } catch (ClassNotFoundException e){
                System.out.println("No se puede encontrar la clase");
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(ObjectOutputStream escribir2 = new ObjectOutputStream(new FileOutputStream(strArchivo, true))){
            String strNombre;
            do {
                System.out.println("escribe más nombres: ");
                strNombre = new Scanner(System.in).nextLine();

                if (!Objects.equals(strNombre, "fin")) {
                    escribir2.writeObject(strNombre);
                }

            } while (!Objects.equals(strNombre, "fin"));

        }catch (IOException e){
            System.out.println("Eror primera escritura " + e.getMessage());
        }

        try(ObjectInputStream leer2 = new ObjectInputStream(new FileInputStream(strArchivo))){

            while (true) {
                System.out.println(leer2.readObject());
            }

        }catch (EOFException e){
            System.out.println("fin de fichero");
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error dos " + e.getMessage());
            e.printStackTrace();
        }
    }
}
