package ejerProps.ejer12_14;


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

    public T getIndice(int intIndice){
        return arrObjetos[intIndice];
    }

    @Override
    public String toString() {
        return Arrays.deepToString(arrObjetos);
    }
}