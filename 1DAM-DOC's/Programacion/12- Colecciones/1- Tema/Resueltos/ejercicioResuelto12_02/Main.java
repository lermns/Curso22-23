package tema12.ejerciciosResueltos.ejercicioResuelto12_02;

public class Main {

    public static void main(String[] args) {
    	 Integer intNum;
        Contenedor<Integer> objContenedor = new Contenedor<>(new Integer[0]);
        
        for (int intCont = 0; intCont < 20; intCont++) {
            objContenedor.insertarAlFinal((int) (Math.random() * 20));
        }
        System.out.println("Sin ordenar: " + objContenedor);
        objContenedor.ordenar();
        System.out.println("Ordenado: " + objContenedor);
        intNum = objContenedor.extraerDelPrincipio();
        System.out.println("Elemento extraído: " + intNum);
        System.out.println("Después de extraer: " + objContenedor);
    }

}
