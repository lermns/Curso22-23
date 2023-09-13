package actividadesProps.act11_24;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        String strArchivo1 = "C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_24/base.bin";
        String strArchivo2 = "C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_24/nuevo.bin";

        establecerFich(strArchivo1, strArchivo2);
        fusionar(strArchivo1, strArchivo2);
    }


    static void fusionar(String fichero1, String fichero2){
        Integer[] integrTabOrd = new Integer[0];

        try(ObjectInputStream leer1 = new ObjectInputStream(new FileInputStream(fichero1))){

            while (true){
                Integer e = (Integer) leer1.readObject();
                integrTabOrd = Arrays.copyOf(integrTabOrd, integrTabOrd.length+1);
                integrTabOrd[integrTabOrd.length-1] = e;
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream leer2 = new ObjectInputStream(new FileInputStream(fichero2))){

            while (true){
                Integer n = (Integer) leer2.readObject();
                integrTabOrd = Arrays.copyOf(integrTabOrd, integrTabOrd.length+1);
                integrTabOrd[integrTabOrd.length-1] = n;
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        Arrays.sort(integrTabOrd);
        Integer[] integrTab3 = new Integer[0];

        try(ObjectOutputStream escribir3 = new ObjectOutputStream(new FileOutputStream(fichero1));
            ObjectInputStream leer3 = new ObjectInputStream(new FileInputStream(fichero1))){

            for(Integer iNum : integrTabOrd){
                escribir3.writeObject(iNum);
            }

            while(true){
                Integer eNum = (Integer) leer3.readObject();
                integrTab3 = Arrays.copyOf(integrTab3, integrTab3.length+1);
                integrTab3[integrTab3.length-1] = eNum;
            }
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(integrTab3));
    }
    static void establecerFich (String fich1, String fich2) {
        try (ObjectOutputStream escribir1 = new ObjectOutputStream(new FileOutputStream(fich1));
             ObjectOutputStream escribir2 = new ObjectOutputStream(new FileOutputStream(fich2))) {

            Integer[] integrTabNum = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
            Integer[] integrTabNum2 = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18};

            for (Integer i : integrTabNum) {
                escribir1.writeObject(i);
            }
            for (Integer n : integrTabNum2) {
                escribir2.writeObject(n);
            }
            System.out.println(Arrays.toString(integrTabNum));
            System.out.println(Arrays.toString(integrTabNum2));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
