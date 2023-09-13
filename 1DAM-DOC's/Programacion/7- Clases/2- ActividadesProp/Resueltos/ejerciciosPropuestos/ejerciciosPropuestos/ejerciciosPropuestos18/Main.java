package tema7.ejerciciosPropuestos.ejerciciosPropuestos18;

public class Main {

   public static void main(String[] args) {
      Cola objCola = new Cola();
      for (int intCont = 1; intCont <= 10; intCont++) {
         objCola.push(intCont);
      }
      
      System.out.println("Sacamos los elementos de la Cola");
      for (int intCont = 1; intCont <= 12; intCont++) {
         System.out.println(objCola.pop());
      }
   }
}
