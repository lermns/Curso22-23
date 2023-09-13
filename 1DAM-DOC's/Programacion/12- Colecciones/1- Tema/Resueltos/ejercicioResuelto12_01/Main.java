package tema12.ejerciciosResueltos.ejercicioResuelto12_01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String strArray[] = {};
        System.out.println(Arrays.toString(strArray));
        strArray = guardar("pepe", strArray);
        strArray = guardar("maría", strArray);
        System.out.println(Arrays.toString(strArray));
    }

    static <T> T[] guardar(T elem, T[] strArray) {
        T[] strArrCopia = Arrays.copyOf(strArray, strArray.length + 1);
        strArrCopia[strArrCopia.length - 1] = elem;
        return strArrCopia;
    }
}
