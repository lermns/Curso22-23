package ejerProps.ejer12_16;

import java.io.*;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args){
        final String ARCHIVO ="C:/Users/Usuario/IdeaProjects/Tema12/src/ejerProps/ejer12_16/socios.dat";
        Set<Socio> socio1 = new TreeSet<>();
        int intOpc;

        try ( ObjectInputStream leer = new ObjectInputStream( new FileInputStream(ARCHIVO))) {
            socio1 = (TreeSet<Socio>)leer.readObject();
        } catch (IOException ex) {
            System.out.println("Lista de socios vacía");
        } catch (ClassNotFoundException ex) {}
        do {
            intOpc = menu();
            switch (intOpc) {//trabajo con la lista de Socio
                case 1 -> aniadirSocio(socio1);
                case 2 -> darBaja(socio1);
                case 3 -> modificarDatos(socio1);
                case 4 -> ordenNombre(socio1);
                case 5 -> ordenFechaAlt(socio1);
            }
        }while(intOpc!=0);
        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(ARCHIVO))) {
            escribir.writeObject(socio1);
        }catch (IOException e){
            System.out.println("No se han podido guardar los datos de los clientes en el archivo");
        }
    }


    private static int menu() {
        Integer intgNum=null;
        do{
            System.out.println("\t\tMenú\n" +
                               "1. Alta.\n" +
                               "2. Baja.\n" +
                               "3. Modificación de datos.\n" +
                               "4. Listar por nombre.\n" +
                               "5. Listar por antiguedad.\n");
            try{intgNum = new Scanner(System.in).nextInt();}catch (Exception e){}
        }while (intgNum==null && (intgNum<1 || intgNum>5));

        return intgNum;
    }
    private static Set<Socio> aniadirSocio(Set<Socio> socio1) {
        System.out.println("Introduce el DNI: ");
        String strDNI = new Scanner(System.in).nextLine();
        System.out.println("Introduce el nombre: ");
        String strNombre = new Scanner(System.in).nextLine();
        System.out.println("Introduce la fecha de alta: ");
        String strFechaAlta = new Scanner(System.in).nextLine();


        Socio cliente1 = new Socio(strDNI, strNombre, strFechaAlta);
        socio1.add(cliente1);
        return socio1;
    }
    private static void darBaja(Set<Socio> socio1) {
        String strDni = null;
        System.out.println(socio1);
        System.out.println("Intrduce el DNI del Socio a eliminar: ");
        try{strDni= new Scanner(System.in).nextLine();}catch (Exception e){}
        socio1.remove(new Socio(strDni));
    }
    private static void modificarDatos(Set<Socio> socio1) {
        String strDni = null;
        System.out.println(socio1);
        System.out.println("Introduce el DNI del socio al que desea realizar cambios:");
        try{strDni= new Scanner(System.in).nextLine();}catch (Exception e){}
        for (Socio socio : socio1) {
            if (socio.getStrDni().equals(strDni)) {
                System.out.println(socio);
                System.out.println("introduzca el nuevo DNI del Socio: ");
                socio.setStrDni(new Scanner(System.in).nextLine());
                System.out.println("Introduzca el nuevo Nombre del Socio");
                socio.setStrNombre(new Scanner(System.in).nextLine());
                System.out.println("Introcuce la nueva fecha de alta: ");
                socio.setFechaAlta(LocalDate.parse(new Scanner(System.in).nextLine()));
                System.out.println("Modificación terminada..!");
                break;
            }
        }
    }
    private static void ordenNombre(Set<Socio> socio1) {
        Comparator<Socio> comparadorNombre = new Comparator<>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                return s1.getStrNombre().compareTo(s2.getStrNombre());
            }
        };
        Set<Socio> ordenArrSocios = new TreeSet<>(comparadorNombre);
        ordenArrSocios.addAll(socio1);
        System.out.println(ordenArrSocios);
    }
    private static void ordenFechaAlt(Set<Socio> socios) {
        Comparator<Socio> comparadorAntiguedad = new Comparator<>() {
            @Override
            public int compare(Socio s1, Socio s2) {
                int antiguedad1 = s1.antiguedad();
                int antiguedad2 = s2.antiguedad();
                if (antiguedad1 != antiguedad2) {
                    return antiguedad2 - antiguedad1;
                } else {
                    // Si dos socios tienen la misma antiguedad, comparar por nombre
                    return s1.getStrNombre().compareTo(s2.getStrNombre());
                }
            }
        };
        Set<Socio> ordenArrSocios = new TreeSet<>(comparadorAntiguedad);
        ordenArrSocios.addAll(socios);
        System.out.println(ordenArrSocios);
    }
}
