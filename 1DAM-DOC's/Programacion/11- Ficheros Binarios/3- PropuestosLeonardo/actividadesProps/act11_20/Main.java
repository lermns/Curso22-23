package actividadesProps.act11_20;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String strArchivo = "E:/Curso/programacion/Tema11/actividadesProps/act11_20/Datos.bin";
        Cliente[] cliTabla = new Cliente[0];
        int intCont=0; boolean blnSalir=true;

        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(strArchivo));
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(strArchivo))) {
        do {
            System.out.println("\t\tMenú\n" +
                    "1. Añadir nuevo cleinte.\n" +
                    "2. Modificar Datos.\n" +
                    "3. Dar de baja cliente.\n" +
                    "4. Listar los clientes");
            int intNum = new Scanner(System.in).nextInt();

            switch (intNum) {
                case 1 -> {

                    System.out.println("Introduce el ID: ");
                    int intID = new Scanner(System.in).nextInt();
                    System.out.println("Introduce el nombre: ");
                    String strNombre = new Scanner(System.in).nextLine();
                    System.out.println("Introduce el teléfono: ");
                    int intTelf = new Scanner(System.in).nextInt();


                    Cliente cliente1 = new Cliente(intID, strNombre, intTelf);

                    cliTabla = Arrays.copyOf(cliTabla, cliTabla.length + 1);
                    cliTabla[cliTabla.length - 1] = cliente1;
                    intCont++;

                    System.out.println("Se ha registrado el cliente en la lista " + intCont);
                }
                case 2 -> {
                    modificarDatos(cliTabla);
                }
                case 3 -> {
                    darBaja(cliTabla);
                    cliTabla=Arrays.copyOf(cliTabla, cliTabla.length-1);
                }
                case 4 ->{
                    System.out.println("Los siguiente clientes: ");
                    for(Cliente cliente : cliTabla) {
                        escribir.writeObject(cliente);
                    }
                    try {
                        while (true) {
                            Cliente cliente1 = (Cliente) leer.readObject();
                            cliente1.mostrarDetalles();
                        }
                    }catch (EOFException e){
                        System.out.println("Se ha terminado de leer el archivo");
                    }
                    System.out.println("Se han registrado");
                    blnSalir=false;
                }
            }
        }while (blnSalir==true);

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }

    public static void modificarDatos(Cliente[] cliTabla){
        System.out.println("Ingrese la posicion del cliente a modificar: ");
        int intNum2 = new Scanner(System.in).nextInt();
        boolean blnSalir=true;
        if (intNum2 > 0) {
            do {
                cliTabla[intNum2 - 1].mostrarDetalles();
                System.out.println("1. Editar ID.\n" +
                        "2. Editar Nombre.\n" +
                        "3. Editar Teléfono.\n" +
                        "4. Salir");
                int intEdit = new Scanner(System.in).nextInt();

                switch (intEdit) {
                    case 1 -> {
                        System.out.println("Escriba el nuevo ID: ");
                        int intNewID = new Scanner(System.in).nextInt();
                        cliTabla[intNum2 - 1].setIntID(intNewID);
                    }
                    case 2 -> {
                        System.out.println("Esccriba el nuevo nombre: ");
                        String strNuevoNom = new Scanner(System.in).nextLine();
                        cliTabla[intNum2 - 1].setStrNombre(strNuevoNom);
                    }
                    case 3 -> {
                        System.out.println("Escriba el nuevo teléfono: ");
                        int intNewFono = new Scanner(System.in).nextInt();
                        cliTabla[intNum2 - 1].setIntTelf(intNewFono);
                    }
                    case 4 -> {
                        blnSalir=false;
                        System.out.println("Saliste...!");
                    }
                }
            }while (blnSalir==true);
        }
    }
    public static void darBaja(Cliente[] cliTabla){
        System.out.println("Seleccione la posicion del cliente al que quiere dar de baja: ");
        int intNum4 = new Scanner(System.in).nextInt();
        if(intNum4>0){
            System.out.println("el siguiente registro: ");
            cliTabla[intNum4-1].mostrarDetalles();
            for (int i = intNum4-1; i < cliTabla.length - 1; i++) {
                cliTabla[i] = cliTabla[i + 1];
            }
            cliTabla[cliTabla.length-1]=null;
            System.out.println("se ha borrado..\n");
        }
    }
}
