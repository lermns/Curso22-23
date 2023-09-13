package ejerProps.ejer12_19;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String strFrase;
        String[] strCadena;
        ArrayList<String> listaPalabras = new ArrayList<>();
        ArrayList<String> listaSinRepetidos = new ArrayList<>();
        ArrayList<String> listaRepetidos = new ArrayList<>();

        System.out.println("Escriba la frase: ");
        strFrase = new Scanner(System.in).nextLine();
        strCadena = strFrase.split(" ");

        for(String cadena: strCadena){
            listaPalabras.add(cadena);
        }

        System.out.println(listaPalabras);

        for (String intCadena : listaPalabras) {
            if (!listaSinRepetidos.contains(intCadena)) {
                listaSinRepetidos.add(intCadena);
            }
            else if(!listaRepetidos.contains(intCadena)){
                listaRepetidos.add(intCadena);
                listaSinRepetidos.remove(intCadena);
            }
        }
        System.out.println("\nLista con repetidos:\n"+
                            listaRepetidos);
        System.out.println("\nLista sin repetidos:\n"+
                            listaSinRepetidos);
    }
}
