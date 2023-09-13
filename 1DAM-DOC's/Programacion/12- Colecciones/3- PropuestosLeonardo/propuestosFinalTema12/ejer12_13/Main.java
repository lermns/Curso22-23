package ejerProps.ejer12_13;

import java.util.*;


public class Main {
    public static void main(String[]args){
        Contenedor<Integer> cont1 = new Contenedor<>(new Integer[0]);

        for(int i = 0; i<20 ; i++){
            cont1.insertarAlFinal((int)(Math.random()*10)+1);
        }
        System.out.println(cont1);

        cont1.ordenar();
        System.out.println(cont1);

        cont1.reverse();
        System.out.println(cont1);

    }
}
