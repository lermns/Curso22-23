package tema12.ejerciciosPropuestos.ejercicioPropuesto11_13;

import java.util.Arrays;
import java.util.Collections;

class Contenedor<T extends Comparable<T>> { //T tiene que tener implementada la interfaz comparable

    private T[] arrObjetos;

    public Contenedor(T[] arrObjetos) {
        this.arrObjetos = arrObjetos;
    }

    public void insertarAlFinal(T nuevo) {
        arrObjetos = Arrays.copyOf(arrObjetos, arrObjetos.length + 1);
        arrObjetos[arrObjetos.length - 1] = nuevo;
    }

    public void insertarAlPrincipio(T nuevo) {
        arrObjetos = Arrays.copyOf(arrObjetos, arrObjetos.length + 1);
        System.arraycopy(arrObjetos, 0, arrObjetos, 1, arrObjetos.length - 1);
        arrObjetos[0] = nuevo;
    }

    public T extraerDelFinal() {
        T objDevolver = null;
        
        if (arrObjetos.length > 0) {
            objDevolver = arrObjetos[arrObjetos.length - 1];
            arrObjetos = Arrays.copyOf(arrObjetos, arrObjetos.length - 1);
        }
        
        return objDevolver;
    }

    public T extraerDelPrincipio() {
        T objDevolver = null;
        
        if (arrObjetos.length > 0) {
            objDevolver = arrObjetos[0];
            arrObjetos = Arrays.copyOfRange(arrObjetos, 1, arrObjetos.length);
        }
        return objDevolver;
    }

    public void ordenar() {
        Arrays.sort(arrObjetos, Collections.reverseOrder());
    }

    public T get(int intIndice) {
    	return arrObjetos[intIndice];
    }
    @Override
    public String toString() {
        return Arrays.deepToString(arrObjetos);
    }
}
