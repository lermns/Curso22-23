package ejerProps.ejer12_23;


import java.util.*;

public class Main {
    public static void main(String[]args){
        Set<String> listaNombres = new TreeSet<>();
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
