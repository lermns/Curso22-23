package ejerProps.ejer12_11;

import java.util.Collections;

public class Main {
    public static void main(String[]args){
        Contenedor<Integer> contNums = new Contenedor<>(new Integer[0]);

        for (int intCont = 0; intCont < 30; intCont++) {
            contNums.insertarAlFinal((int) (Math.random() * 10+1));
        }
        System.out.println(contNums);
        contNums.ordenar();
        System.out.println(contNums);
    }
}
