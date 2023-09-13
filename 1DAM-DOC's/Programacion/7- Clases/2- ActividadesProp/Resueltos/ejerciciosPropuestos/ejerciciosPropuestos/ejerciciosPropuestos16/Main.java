package tema7.ejerciciosPropuestos.ejerciciosPropuestos16;

public class Main {

   public static void main(String[] args) {
      Punto punto1 = new Punto(1, 4);
      Punto punto2 = new Punto(3, 3);
      
      punto1.desplazaX(1);
      punto1.desplazaY(-2);
      punto1.muestra();
      
      System.out.println("Distancia: " + punto1.distanciaEuclidea(punto2));
   }
}
