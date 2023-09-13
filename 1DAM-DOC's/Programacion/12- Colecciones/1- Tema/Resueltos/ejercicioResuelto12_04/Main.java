package tema12.ejerciciosResueltos.ejercicioResuelto12_04;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> arrListNumeros = new ArrayList<>();
        Integer intNum;
        
        System.out.print("Introducir entero: ");
        intNum = new Scanner(System.in).nextInt();
        while (intNum >= 0) {
            arrListNumeros.add(intNum);
            System.out.print("Introducir entero: ");
            intNum = new Scanner(System.in).nextInt();
        }
        
        System.out.println("Lista completa: " + arrListNumeros);
        System.out.print("Pares: ");
        for (Integer intValor : arrListNumeros) {
            if (intValor % 2 == 0) {
                System.out.print(intValor + " ");
            }
        }
        System.out.println("");
        for (Iterator<Integer> intIterador = arrListNumeros.iterator(); intIterador.hasNext();) {
            intNum = intIterador.next();
            if (intNum % 3 == 0) {
                intIterador.remove();
            }
        }
        System.out.println("No múltiplos de 3: " + arrListNumeros);
    }

}
