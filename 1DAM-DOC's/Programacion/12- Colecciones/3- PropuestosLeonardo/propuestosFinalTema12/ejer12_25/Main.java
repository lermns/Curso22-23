package ejerProps.ejer12_25;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String [] args){
        /*C:/Users/Usuario/IdeaProjects/Tema12/src/ejerProps/ejer12_25/club.dat (direccion casa)*/
        final String ARCHIVO="D:/Tema13/untitled/src/ejer_Prop/ejer12_25/club.dat";//direccion clase
        int intOpc;
        Map<String, Socio> mapa1 = new HashMap<>();
        //cargarDatos(mapa1);

        try(ObjectInputStream leer = new ObjectInputStream(new FileInputStream(ARCHIVO))){
            mapa1 = (Map<String, Socio>) leer.readObject();
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        do {
            intOpc = menu();
            switch (intOpc){
                case 1 -> altaSocio(mapa1);
                case 2 -> bajaSocio(mapa1);
                case 3 -> modificacionSocio(mapa1);
                case 4 -> ordenApodo(mapa1);
                case 5 -> ordenAntiguedad(mapa1);
                case 6 -> ordenPreeAnio(mapa1);
            }
        }while (intOpc!=7);

        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(ARCHIVO))){
            escribir.writeObject(mapa1);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }


    }

    private static int menu() {
        Integer intgMenu=null;
        do {

            System.out.println("\t\tMenú" +
                    "\n1. Alta Socio." +
                    "\n2. Baja Socio." +
                    "\n3. Modificación Socio." +
                    "\n4. Listar Socios por apodo." +
                    "\n5. Listar Socios por antiguedad." +
                    "\n6. Listar Socios con alta anterior a un año determinado." +
                    "\n7. Salir.");
            try {intgMenu = new Scanner(System.in).nextInt();} catch (Exception e) {}
        }while (intgMenu==null && (intgMenu<1 || intgMenu>7));
        return intgMenu;
    }
    private static void altaSocio(Map<String, Socio> mapa1) {
        System.out.println("Escribe el apodo del nuevo Socio a crear:");
        String strApodo = new Scanner(System.in).nextLine();
        System.out.println("Escribe el nombre del nuevo Socio: ");
        String strNombre = new Scanner(System.in).nextLine();
        System.out.println("Escribe la fecha de alta del Socio siguiendo este formato \"YYYY-MM-DD\": ");
        String strFechaAlt = new Scanner(System.in).nextLine();
        mapa1.put(strApodo, new Socio(strNombre, strFechaAlt));
    }
    private static void bajaSocio(Map<String, Socio> mapa1) {
        if(!mapa1.isEmpty()) {
            Set<String> claves = mapa1.keySet();
            System.out.println("Apodos de los Socios dados de alta: \n" + claves);
            System.out.println("Escriba el apodo del Socio que desea dar de baja: ");
            String strBaja = new Scanner(System.in).nextLine();
            if (mapa1.containsKey(strBaja)) {
                mapa1.remove(strBaja);
                System.out.println("El Socio " + strBaja + " ha sido dado de baja.\n");
            } else
                System.out.println("El apodo " + strBaja + " no se encuentra en el registro.\n");
        }else
            System.out.println("La lista de Socios esta vacia.");
    }
    private static void modificacionSocio(Map<String, Socio> mapa1) {
        int intOpc=0;
        if (!mapa1.isEmpty()){
            Set<String> claves = mapa1.keySet();
            System.out.println("Apodos de los Socios dados de alta: \n" + claves);
            System.out.println("Escriba el apodo del Socio del que quiere modificar sus datos: ");
            String strApodo = new Scanner(System.in).nextLine();
            if (mapa1.containsKey(strApodo)) {
                do {
                    intOpc = menu(strApodo);

                    switch (intOpc) {
                        case 1 -> modificarApodo(mapa1, strApodo);
                        case 2 -> modificarNombre(mapa1, strApodo);
                        case 3 -> modificacionFechaAlta(mapa1, strApodo);
                    }
                }while (intOpc !=4 && (intOpc <1 || intOpc >3));
            } else
                System.out.println("El apodo " + strApodo + " no existe en el registro.\n");
        }else
            System.out.println("La lista de Socios esta vacia.");
    }
    private static int menu(String strApodo) {
        int intMenu = 0;
        do {
            System.out.println("¿Que datos quiere modificar de " + strApodo + " ?\n" +
                    "1. Modificar apodo.\n" +
                    "2. Modificar nombre.\n" +
                    "3. Modificar fecha de alta.\n" +
                    "4. Salir");
            try {intMenu = new Scanner(System.in).nextInt();} catch (Exception e) {}
        } while (intMenu != 4 && (intMenu < 1 || intMenu > 3));
        return intMenu;
    }
    private static void modificarApodo(Map<String, Socio> mapa1, String strApodo) {
            Socio socioMod = mapa1.get(strApodo);

            System.out.println("Inserte el nuevo apodo: ");
            String strApodoMod = new Scanner(System.in).nextLine();

            mapa1.remove(strApodo);
            mapa1.put(strApodoMod, socioMod);
        System.out.println("El apodo se modifico correctamente.");
    }
    private static void modificarNombre(Map<String, Socio> mapa1, String strApodo) {
        Socio socioMod = mapa1.get(strApodo);
        System.out.println("Escriba el nuevo nombre del socio: \n" +
                socioMod.getStrNombre());
        socioMod.setStrNombre(new Scanner(System.in).nextLine());

        mapa1.replace(strApodo, socioMod);
        System.out.println("El nombre del Socio se cambio correctamente");
    }
    private static void modificacionFechaAlta(Map<String, Socio> mapa1, String strApodo) {
        Socio socioMod = mapa1.get(strApodo);
        System.out.println("Escriba la nueva fecha de alta del Socio "+socioMod.getStrNombre()+" en este formato \"YYYY-MM-DD\": \n" +
                socioMod.getFechaAlta());
        String strFechaAltMod = new Scanner(System.in).nextLine();
        socioMod.setFechaAlta(LocalDate.parse(strFechaAltMod));
        System.out.println("Modificación realizada.");
    }
    private static void ordenApodo(Map<String, Socio> mapa1) {
        SortedMap<String, Socio> ordenPorKey = new TreeMap<>(mapa1);
        System.out.println(ordenPorKey);
    }
    private static void ordenAntiguedad(Map<String, Socio> mapa1) {
        Collection<Socio> sociosDatos = mapa1.values();
        Set<Socio>ordenFechaAlta = new TreeSet<>(new Comparator<Socio>() {
            @Override
            public int compare(Socio o1, Socio o2) {
                return o1.getFechaAlta().compareTo(o2.getFechaAlta());
            }
        });
        ordenFechaAlta.addAll(sociosDatos);
        System.out.println(ordenFechaAlta);
    }
    private static void ordenPreeAnio(Map<String, Socio> mapa1) {
        System.out.println("Escriba el año para mostrar los Socios dados de alta anterior a esta, usar el formato \"YYYY\"");
        LocalDate fechaComp = LocalDate.parse(new Scanner(System.in).nextLine()+"-01-01");

        for(Map.Entry<String, Socio> ordenFecha : mapa1.entrySet()){
            if(ordenFecha.getValue().getFechaAlta().compareTo(fechaComp)<0){
                System.out.println(ordenFecha);
            }
        }
    }
    private static void cargarDatos(Map<String, Socio> mapa1) {
        mapa1.put("s", new Socio("susana", "2010-02-20"));
        mapa1.put("b", new Socio("beto", "2002-05-21"));
        mapa1.put("a", new Socio("ana", "2007-07-11"));
        mapa1.put("j", new Socio("juan", "2018-04-24"));
        mapa1.put("l", new Socio("leo", "1999-07-01"));
        mapa1.put("i", new Socio("ian", "2023-12-09"));
    }

}








