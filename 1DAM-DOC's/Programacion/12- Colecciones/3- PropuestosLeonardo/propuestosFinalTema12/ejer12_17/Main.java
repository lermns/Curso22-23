package ejerProps.ejer12_17;

public class Main {
    public static void main(String [] args){

        Cola<String> cola1 = new Cola<>();

        cola1.enColar("Juan");
        cola1.enColar("Sebastian");
        cola1.enColar("William");
        cola1.enColar("Ademar");

        System.out.println(cola1.verCola()+": nombre que se encuentra en la cola\n");

        while (!cola1.isEmpty()){
            System.out.println(cola1.desEncolar());
        }
        System.out.println("\n\n");
        Cola<Integer> cola2 = new Cola<>();

        cola2.enColar(80);
        cola2.enColar(90);
        cola2.enColar(10);
        cola2.enColar(40);
        cola2.enColar(100);

        System.out.println(cola2.verCola()+": número que se encuentra en la cola\n");

        while (!cola2.isEmpty()){
            System.out.println(cola2.desEncolar());
        }
    }
}
