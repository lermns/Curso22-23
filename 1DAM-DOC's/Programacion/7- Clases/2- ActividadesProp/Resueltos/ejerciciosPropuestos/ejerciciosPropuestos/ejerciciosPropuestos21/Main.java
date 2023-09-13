package tema7.ejerciciosPropuestos.ejerciciosPropuestos21;

public class Main {

   public static void main(String[] args) {
      Conjunto objConjunto1 = new Conjunto();
      Conjunto objConjunto2 = new Conjunto();
      
      
      for (int i = 0; i < 10; i++) {
         objConjunto1.insertar(i);
      }
      System.out.print("c1: ");
      objConjunto1.mostrar();
      for (int i = 0; i < 10; i++) {
         objConjunto2.insertar(i + 5);
      }
      System.out.print("c2: ");
      objConjunto2.mostrar();
      objConjunto1.eliminarConjunto(objConjunto2);
      System.out.print("c1: ");
      objConjunto1.mostrar();
   }
}
