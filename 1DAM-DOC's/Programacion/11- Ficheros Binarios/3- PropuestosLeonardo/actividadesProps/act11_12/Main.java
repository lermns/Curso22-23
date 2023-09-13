package actividadesProps.act11_12;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {
    public static void main(String [] args){
        double dblNum = 0;
        try(ObjectInputStream leer = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_11/archivo.dat"))){
            dblNum = (double) leer.readObject();
        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        System.out.println(dblNum);
    }
}
