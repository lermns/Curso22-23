package ejerProps.ejer12_12;

import java.util.Arrays;
import java.util.Comparator;

public class Contenedor<T extends Comparable<T>> { //T tiene que tener implementada la interfaz comparable
    //

    private T[] arrObjetos;//Un array de genericos T

    public Contenedor(T[] arrObjetos) {//Constructor
        this.arrObjetos = arrObjetos;
    }

    public void insertarAlFinal(T nuevo) {
        arrObjetos = Arrays.copyOf(arrObjetos, arrObjetos.length + 1);
        arrObjetos[arrObjetos.length - 1] = nuevo;
    }

    public void ordenar(Comparator<T> c) {
        Arrays.sort(arrObjetos, c);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(arrObjetos);
    }
}
