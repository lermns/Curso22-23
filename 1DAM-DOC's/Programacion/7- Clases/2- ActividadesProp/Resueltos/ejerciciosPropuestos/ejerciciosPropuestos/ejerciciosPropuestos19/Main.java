package tema7.ejerciciosPropuestos.ejerciciosPropuestos19;

public class Main {

   public static void main(String[] args) {
      Pila objPila = new Pila();
      for (int intCont = 1; intCont <= 10; intCont++) {
         objPila.push(intCont);
      }
      
      System.out.println("Sacamos los elementos de la Cola");
      for (int intCont = 1; intCont <= 12; intCont++) {
         System.out.println(objPila.pop());
      }
   }
}
