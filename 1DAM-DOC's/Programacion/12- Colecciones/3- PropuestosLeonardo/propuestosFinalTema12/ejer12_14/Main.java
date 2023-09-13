package ejerProps.ejer12_14;


import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int intNum;
        Contenedor<Integer> cont1 = new Contenedor<>(new Integer[0]);
        cont1.insertarAlFinal(15);
        cont1.insertarAlFinal(30);
        cont1.insertarAlFinal(45);
        cont1.insertarAlFinal(60);
        cont1.insertarAlFinal(75);
        cont1.insertarAlFinal(90);

        System.out.println(cont1);

        System.out.println("Dame el indice del numero que quieres ver: ");
        intNum = new Scanner(System.in).nextInt();

        System.out.println(cont1.getIndice(intNum-1));


    }
}
