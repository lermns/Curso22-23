package ejerProps.ejer12_13;


import java.util.Arrays;

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

    public void ordenar() {
        Arrays.sort(arrObjetos);
    }

    public void reverse() {
        int i = 0;
        int j = arrObjetos.length - 1;
        while (i < j) {
            T num = arrObjetos[i];
            arrObjetos[i] = arrObjetos[j];
            arrObjetos[j] = num;
            i++;
            j--;
        }
    }


    @Override
    public String toString() {
        return Arrays.deepToString(arrObjetos);
    }
}