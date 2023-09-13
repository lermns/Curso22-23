package tema12.ejerciciosResueltos.ejercicioResuelto12_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Pila<Integer> objPila = new Contenedor<>(new Integer[0]);
        Scanner scnLeer = new Scanner(System.in);
        Integer intNum;
        
        System.out.print("Introducir entero positivo (-1 para terminar): ");
        intNum = scnLeer.nextInt();
        while (intNum != -1) {
            objPila.push(intNum);
            System.out.print("Introducir entero positivo (-1 para terminar): ");
            intNum = scnLeer.nextInt();
        }
        
        System.out.print("Desapilamos: ");
        intNum = objPila.pop();
        while (intNum != null) {
            System.out.print(intNum + " ");
            intNum = objPila.pop();
        }
        System.out.println("");
    }

}


