package ejerProps.ejer12_20;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        int intOpc;

        SuperCola<Integer> cola1 = new SuperCola();
        SuperCola<Integer> cola2 = new SuperCola();

        cargarDatosEnColas(cola1, cola2);

        do {
            intOpc = menu();

            switch (intOpc){
                case 1 -> aniadirCola1(cola1);
                case 2 -> aniadirCola2(cola2);
                case 3 -> desEnColar1(cola1, cola2);
                case 4 -> desEnColar2(cola2, cola1);
            }
        }while (intOpc!=5);
        finPrograma(cola1, cola2);
    }



    private static int menu() {
        Integer intgMenu=null;
        do {
            System.out.println("\t\tMenú.\n" +
                    "1. Encolar en cola1.\n" +
                    "2. Encolar en cola2.\n" +
                    "3. DesEncolar de cola1.\n" +
                    "4. DesEncolar de cola2.\n" +
                    "5. Salir");
            try {intgMenu = new Scanner(System.in).nextInt();} catch (Exception e) {}
        }while (intgMenu==null && (intgMenu<1 || intgMenu>5));
        return intgMenu;
    }
    private static void aniadirCola1(SuperCola<Integer> cola1) {
        int intCola1 = 0;
        do {
            System.out.println("Ingrese el numero a enColar en cola1: \n"+
                               "Para salir inserte -1.");
            try{intCola1 = new Scanner(System.in).nextInt();}catch (Exception e){
                System.out.println("No se ha insertado un valor válido.");
            }
            if(intCola1!=-1) {
                cola1.enColar(intCola1);
            }
        }while (intCola1!=-1);
        System.out.println("cola1:" + cola1);
    }
    private static void aniadirCola2(SuperCola<Integer> cola2) {
        int intCola2 = 0;
        do {
            System.out.println("Ingrese el numero a enColar en cola2: \n"+
                               "Para salir inserte -1.");
            try{intCola2 = new Scanner(System.in).nextInt();}catch (Exception e){
                System.out.println("No se ha insertado un valor válido.");
            }
            if(intCola2!=-1) {
                cola2.enColar(intCola2);
            }
        }while (intCola2!=-1);
        System.out.println("cola2:" + cola2);
    }

    private static void desEnColar1(SuperCola<Integer> cola1, SuperCola<Integer> cola2) {
        if (!cola1.isEmpty()) {
            cola1.desEncolar();
            System.out.println("cola1:" + cola1);
        }else if(!cola2.isEmpty()){
            cola2.desEncolar();
            System.out.println("cola2:" + cola2);
        }else{
            System.out.println("Las 2 colas estan vacias.");
        }
    }
    private static void desEnColar2(SuperCola<Integer> cola2, SuperCola<Integer> cola1) {
        if (!cola2.isEmpty()) {
            cola2.desEncolar();
            System.out.println("cola2:" + cola2);
        }else if(!cola1.isEmpty()){
            cola1.desEncolar();
            System.out.println("cola1:" + cola1);
        }else{
            System.out.println("Las 2 colas estan vacias.");
        }
    }
    private static void cargarDatosEnColas(SuperCola<Integer> cola1, SuperCola<Integer> cola2) {
        cola1.enColar(10);
        cola1.enColar(90);
        cola1.enColar(20);
        cola1.enColar(80);
        cola1.enColar(30);
        cola1.enColar(70);

        cola2.enColar(100);
        cola2.enColar(900);
        cola2.enColar(200);
    }
    private static void finPrograma(SuperCola<Integer> cola1, SuperCola<Integer> cola2) {
        if(!cola1.isEmpty() || !cola2.isEmpty()) {
            System.out.println("cola1: " + cola1 +
                               "\ncola2: " + cola2 +
                               "\nFin del programa");
        }else
            System.out.println("Fin del programa");
    }
}
