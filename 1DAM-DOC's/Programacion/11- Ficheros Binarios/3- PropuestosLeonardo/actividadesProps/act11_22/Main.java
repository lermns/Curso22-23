package actividadesProps.act11_22;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        String strArchivo ="C:/Users/Usuario/IdeaProjects/Tema11/src/actividadesProps/act11_22/empleados.dat";
        Empleado[] objEmple = {new Empleado("Y4771676H", "Leo", 2850.50),
                               new Empleado("G7267837T", "Ian", 2100.30),
                               new Empleado("S2791822O", "Manu", 1870.20)};

        Empleado[] objEmple1 = new Empleado[0];
        Empleado[] objEmple2 = new Empleado[0];

        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(strArchivo));
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(strArchivo))){

            for(Empleado emp : objEmple){
                escribir.writeObject(emp);
            }
            while (true) {
                Empleado em = (Empleado) leer.readObject();
                objEmple1=Arrays.copyOf(objEmple1, objEmple1.length+1);
                objEmple1[objEmple1.length-1]=em;
            }

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        boolean blnSalir = true;
        do {
            System.out.println("\t\tMENÚ\n" +
                    "1. Alta empleado.\n" +
                    "2. Baja empleado.\n" +
                    "3. Mostrar datos empleado\n" +
                    "4. Listar empleados.\n" +
                    "5. Salir");
            int intNum = new Scanner(System.in).nextInt();

            switch (intNum) {
                case 1 -> {
                    System.out.println("Ingrese el DNI del empleado: ");
                    String strDni = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese el nombre del empleado: ");
                    String strNombre = new Scanner(System.in).nextLine();
                    System.out.println("Ingrese el sueldo base del empleado:");
                    double dblSueldo = new Scanner(System.in).nextDouble();

                    Empleado emp1 = new Empleado(strDni, strNombre, dblSueldo);
                    objEmple1 = Arrays.copyOf(objEmple1, objEmple1.length + 1);
                    objEmple1[objEmple1.length - 1] = emp1;
                }
                case 2 -> {
                    darBaja(objEmple1);
                    objEmple1=Arrays.copyOf(objEmple1, objEmple1.length-1);
                }
                case 3 -> {
                    mostrarDatosEmp(objEmple1);
                    System.out.println();
                }
                case 4 -> {
                    int intCont1=1;
                    for(Empleado emp: objEmple1){
                        System.out.print(intCont1 + ". ");
                        emp.mostrarDatos();
                        intCont1++;
                    }
                    System.out.println();
                }
                case 5 -> {

                    try(ObjectOutputStream escribir2= new ObjectOutputStream(new FileOutputStream(strArchivo))){

                        for (Empleado e : objEmple1){
                            escribir2.writeObject(e);
                        }

                    }catch(IOException e){
                        System.out.println(e.getMessage());
                    }
                    Empleado[] emp1 = new Empleado[0];
                    try(ObjectInputStream leer3 = new ObjectInputStream(new FileInputStream(strArchivo))){

                        while (true) {
                            Empleado e2 = (Empleado) leer3.readObject();
                            emp1 = Arrays.copyOf(emp1, emp1.length+1);
                            emp1[emp1.length-1] = e2;
                        }
                    } catch (IOException | ClassNotFoundException e){
                        System.out.println(e.getMessage());
                    }
                    for (Empleado e3 : emp1){
                        e3.mostrarDatos();
                    }

                    blnSalir=false;
                }
            }
        }while (blnSalir);
    }
    public static void darBaja(Empleado[] emp){
        int intCont = 1;
        for (Empleado e : emp) {
            System.out.println(intCont + ". " + e.getStrNombre());
            intCont++;
        }
        System.out.println("Seleccione el número del empleado al que quiere dar de baja: ");
        int intEmpBorr = new Scanner(System.in).nextInt();

        if(intEmpBorr>0){
            System.out.println("el siguiente registro: ");
            emp[intEmpBorr-1].mostrarDatos();
            for (int i = intEmpBorr-1; i < emp.length - 1; i++) {
                emp[i] = emp[i + 1];
            }
            emp[emp.length-1]=null;
            System.out.println("se ha borrado..\n");
        }
    }
    public static void mostrarDatosEmp(Empleado[] emp){
        int intCont = 1;
        for (Empleado e : emp) {
            System.out.println(intCont + ". " + e.getStrNombre());
            intCont++;
        }
        System.out.println("Seleccione el número del empleado del que desea saber información: ");
        int intEmpBorr = new Scanner(System.in).nextInt();
        if(intEmpBorr>0){
            System.out.println("Datos del empleado: ");
            emp[intEmpBorr-1].mostrarDatos();
        }
    }
}