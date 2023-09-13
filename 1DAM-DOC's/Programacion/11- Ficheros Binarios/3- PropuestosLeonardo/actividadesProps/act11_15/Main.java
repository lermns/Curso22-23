package actividadesProps.act11_15;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String [] args) throws IOException {
        int[] intTabla = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] intTabla2;
        int[] intTablaPar, intTablaPar2 = new int[0];
        int[] intTablaImpar, intTablaImpar2 = new int[0];

        try(ObjectOutputStream escribirNum = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_15/enteros.dat"));
            ObjectInputStream leerNum = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_15/enteros.dat"));
            ObjectOutputStream escribirPar = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_15/pares.dat"));
            ObjectOutputStream escribirImpar = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_15/impares.dat"));
            ObjectInputStream leerPares = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_15/pares.dat"));
            ObjectInputStream leerImpares = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_15/impares.dat"))){

            escribirNum.writeObject(intTabla);
            intTabla2 = (int[]) leerNum.readObject();

            System.out.println(Arrays.toString(intTabla2));
            for(int Num : intTabla2){
                if(Num%2==0){
                    intTablaPar2 = Arrays.copyOf(intTablaPar2, intTablaPar2.length+1);
                    intTablaPar2[intTablaPar2.length-1] = Num;
                }else{
                    intTablaImpar2 = Arrays.copyOf(intTablaImpar2, intTablaImpar2.length+1);
                    intTablaImpar2[intTablaImpar2.length-1] = Num;
                }
            }
            escribirPar.writeObject(intTablaPar2);
            escribirImpar.writeObject(intTablaImpar2);

            intTablaPar = (int[]) leerPares.readObject();
            intTablaImpar = (int[]) leerImpares.readObject();

            System.out.println(Arrays.toString(intTablaPar));
            System.out.println(Arrays.toString(intTablaImpar));

        }catch(IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
