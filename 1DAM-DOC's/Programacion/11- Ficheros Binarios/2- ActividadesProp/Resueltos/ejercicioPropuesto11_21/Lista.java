package tema11.ejerciciosPropuestos.ejercicioPropuesto11_21;

import java.io.Serializable;
import java.util.Arrays;

public class Lista implements Serializable{//para poder guardarlas

    private Object[] arrLista;

    Lista() {
        arrLista = new Object[0];
    }

    void insertarPrincipio(Object nuevo) {
        arrLista = Arrays.copyOf(arrLista, arrLista.length + 1);
        System.arraycopy(arrLista, 0, arrLista, 1, arrLista.length - 1);
        arrLista[0] = nuevo;
    }

    void insertarFinal(Object nuevo) {
        arrLista = Arrays.copyOf(arrLista, arrLista.length + 1);
        arrLista[arrLista.length - 1] = nuevo;
    }

    void insertarFinal(Lista otraLista) {
        int tamIni = arrLista.length;//tamaño inicial tabla
        arrLista = Arrays.copyOf(arrLista, arrLista.length + otraLista.arrLista.length);
        System.arraycopy(otraLista.arrLista, 0, arrLista, tamIni, otraLista.arrLista.length);
    }

    /*El primer parámetro es el índice del lugar donde queremos 
    insertar el valor del segundo parámetro*/
    void insertar(int intPosicion, Object nuevo) {
        arrLista = Arrays.copyOf(arrLista, arrLista.length + 1);
        System.arraycopy(arrLista, intPosicion, arrLista, intPosicion + 1,
                arrLista.length - intPosicion - 1);
        arrLista[intPosicion] = nuevo;
    }

    Object eliminar(int intIndice) {
        Object objDevolver = null;
        
        if (intIndice >= 0 && intIndice < arrLista.length) {
            objDevolver = arrLista[intIndice];
            for (int intCont = intIndice + 1; intCont < arrLista.length; intCont++) {
                arrLista[intCont - 1] = arrLista[intCont];
            }
            arrLista = Arrays.copyOf(arrLista, arrLista.length - 1);
        }
        return objDevolver;
    }

    Object get(int intIndice) {
        Object objDevolver = null;
        
        if (intIndice >= 0 && intIndice < arrLista.length) {//índice válido
            objDevolver = arrLista[intIndice];
        }
        return objDevolver;
    }

    int buscar(Object claveBusqueda) {
        int intIndice = -1;
        
        for (int i = 0; i < arrLista.length && intIndice == -1; i++) {
            if (arrLista[i].equals(claveBusqueda)) {
                intIndice = i;
            }
        }
        return intIndice;
    }

    @Override
    public String toString() {//mostramos la tabla
        return Arrays.deepToString(arrLista);
    }
}
