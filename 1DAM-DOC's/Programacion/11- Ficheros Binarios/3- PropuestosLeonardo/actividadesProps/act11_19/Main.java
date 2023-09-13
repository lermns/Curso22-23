package actividadesProps.act11_19;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LocalDate fecha = LocalDate.of(2023, 4, 30);
        String archivo = "E:/Curso/programacion/Tema11/actividadesProps/act11_19/numeroLlamadas.dat";
        boolean blnSalir = false;

        try(ObjectOutputStream escribir = new ObjectOutputStream(new FileOutputStream(archivo));
            ObjectInputStream leer = new ObjectInputStream(new FileInputStream(archivo))){
                do {
                    System.out.println("Menú registro de llamadas: \n" +
                            "1. Registrar llamadas totales recibidas el dia de hoy.\n" +
                            "2. Ver registro completo de llamadas.\n" +
                            "3. Salir");

                    int intNum = new Scanner(System.in).nextInt();

                    switch (intNum) {
                        case 1 -> {
                            System.out.println("Ingrese la cantidad de llamadas que se recibio el dia de hoy: " + fecha);
                            int intCant = new Scanner(System.in).nextInt();

                            RegistroLlamadas registro = new RegistroLlamadas(fecha, intCant);

                            escribir.writeObject(registro);

                            fecha = fecha.plusDays(1);
                        }
                        case 2 -> {
                            try {
                                while (true) {
                                    RegistroLlamadas registro1 = (RegistroLlamadas) leer.readObject();
                                    registro1.mostrarDatos();
                                }

                            } catch (EOFException e) {
                                System.out.println("El archivo a llegado a su final!\n");
                            }finally {
                                leer.close();
                            }
                        }
                        default -> {
                            System.out.println("Saliste del registro");
                            blnSalir = true;
                        }
                    }

                }while(blnSalir == false);

        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
