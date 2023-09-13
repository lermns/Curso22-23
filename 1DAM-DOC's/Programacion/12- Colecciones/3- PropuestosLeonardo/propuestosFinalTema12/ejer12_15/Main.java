package ejerProps.ejer12_15;


import java.util.Arrays;
import java.util.List;

import static ejerProps.ejer12_15.sinRep.reverse;

public class Main {
    public static void main(String[]args){

        List<Integer> lista = Arrays.asList(15, 30, 75, 15, 90, 45, 30);
        System.out.println(lista);

        List<Integer> listaSinRepeticiones = reverse(lista);
        System.out.println(listaSinRepeticiones);

    }


}
