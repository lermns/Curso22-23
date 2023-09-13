package tema12.ejerciciosResueltos.ejercicioResuelto12_09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        
        System.out.print("Introducir número: ");
        Integer intNum = new Scanner(System.in).nextInt();
        while (intNum >= 0) {
            lista.add(intNum);
            System.out.print("Introducir número: ");
            intNum = new Scanner(System.in).nextInt();
        }
        System.out.println(lista);
        System.out.print("Índices de valores pares: ");
        
        for (int intCont = 0; intCont < lista.size(); intCont++) {
            if (lista.get(intCont) % 2 == 0) {
                System.out.print(intCont + " ");
                lista.set(intCont, lista.get(intCont) * 100);
            }
        }
        System.out.println("");
        System.out.println(lista);
    }

}
