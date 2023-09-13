package actividadesProps.act11_18;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String [] args){
        boolean blnSalir = false;
        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_18/firmas.dat"));
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream("C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_18/firmas.dat"))){

            String[] strTablaNombres = new String[0];
            String[] sinRepetidos = new String[0];
            Set<String> setNoRep;

            while(blnSalir==false) {
                System.out.println("Libro de Firmas: \n" +
                                   "1. Mostrar Nombre de Firmas.\n" +
                                   "2. Añadir nuevo Nombre.\n" +
                                   "3. Salir");
                int intNum = new Scanner(System.in).nextInt();

                switch (intNum) {
                    case 1 -> {
                        for(String nombres : sinRepetidos){
                            escribir.writeObject(nombres);
                        }
                        while (leer!=null) {
                            System.out.println(leer.readObject());
                        }
                    }
                    case 2 -> {
                        System.out.println("Escribe el nombre a insertar: ");
                        String strNombre = new Scanner(System.in).nextLine();//guardamos el nombre en la variable

                        if (!Objects.equals(strNombre, "") || !Objects.equals(strNombre, " ")) {//
                            strTablaNombres = Arrays.copyOf(strTablaNombres, strTablaNombres.length+1);//ampliamos la longitud del array
                            strTablaNombres[strTablaNombres.length-1]=strNombre;
                            setNoRep = new HashSet<>(Arrays.asList(strTablaNombres));
                            sinRepetidos = setNoRep.toArray(new String[0]);
                            Arrays.sort(sinRepetidos);
                        }else {
                            System.out.println("No se puede escribir un espacio o vacio como nombre");
                        }
                    }
                    case 3 -> {
                        System.out.println("Lista finalizada!");
                        blnSalir = true;
                    }
                    default -> blnSalir = true;
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
