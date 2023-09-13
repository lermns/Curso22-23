package tema12.ejerciciosPropuestos.ejercicioPropuesto11_11;

import tema12.ejerciciosResueltos.ejercicioResuelto12_02.Socio;

public class Main {

    public static void main(String[] args) {
        Contenedor<Integer> objContenedor = new Contenedor<>(new Integer[0]);
        
        for (int intCont = 0; intCont < 30; intCont++)
            objContenedor.insertarAlFinal((int) (Math.random()*10+1));
        
        System.out.println("Sin ordenar: " + objContenedor);
        objContenedor.ordenar();
        System.out.println("Ordenado: " + objContenedor);
    }

}
