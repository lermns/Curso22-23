package tema12.ejerciciosPropuestos.ejercicioPropuesto11_12;

import java.util.Comparator;

import tema12.ejerciciosResueltos.ejercicioResuelto12_02.Socio;

public class Main {

    public static void main(String[] args) {
        Contenedor<Integer> objContenedor = new Contenedor<>(new Integer[0]);
        
        for (int intCont = 0; intCont < 30; intCont++)
            objContenedor.insertarAlFinal((int) (Math.random()*10+1));
        
        System.out.println("Sin ordenar: " + objContenedor);
        objContenedor.ordenar(new Comparator<Integer>() {
												@Override
												public int compare(Integer o1, Integer o2) {
													return o1-o2;
												}
									        });
        System.out.println("Ordenado: " + objContenedor);
    }

}
