package ejerProps.ejer12_22;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args){
        Set<String> listaNombres = new LinkedHashSet<>();
        String strNombre;

        System.out.println("Introduzca los nombres: \n" +
                "Para salir escriba fin/FIN");
        do{
            strNombre=new Scanner(System.in).nextLine();

            if(!strNombre.equals("fin") && !strNombre.equals("FIN")){
                listaNombres.add(strNombre);

            }
        }while(!strNombre.equals("fin") && !strNombre.equals("FIN"));

        System.out.println(listaNombres);
    }
}
