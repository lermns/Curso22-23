package tema12.ejerciciosResueltos.ejercicioResuelto12_15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> existencias = new TreeMap<>();
        int intOpcion;

        try ( ObjectInputStream in = new ObjectInputStream(new FileInputStream("existencias.dat"))) {
            existencias = (TreeMap<String, Integer>) in.readObject();
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {System.out.println("Error en la lectura");}
        
        do {
            System.out.println("1.Alta producto");
            System.out.println("2.Baja producto");
            System.out.println("3.Cambio stock de producto");
            System.out.println("4.Listar existencias");
            System.out.println("5.Salir");
            System.out.print("\nIntroducir opción: ");
            intOpcion = new Scanner(System.in).nextInt();
            switch (intOpcion) {
                case 1 -> {
                    System.out.print("Código producto: ");
                    String strCodigo = new Scanner(System.in).nextLine();
                    if (!existencias.containsKey(strCodigo)) {
                        existencias.put(strCodigo, 0);
                    } else {
                        System.out.println("El producto ya existe");
                    }
                }
                case 2 -> {
                    System.out.print("Código producto: ");
                    String strCodigo = new Scanner(System.in).nextLine();
                    existencias.remove(strCodigo);
                }
                case 3 -> {
                    System.out.print("Código producto: ");
                    String strCodigo = new Scanner(System.in).nextLine();
                    System.out.print("Nuevo stock: ");
                    int intStock = new Scanner(System.in).nextInt();
                    existencias.put(strCodigo, intStock);
                }
                case 4 -> {
                    System.out.println(existencias);
                }
            }
        } while (intOpcion != 5);
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("existencias.dat"))) {
            out.writeObject(existencias);
        } catch (IOException ex) {
            System.out.println("Error en la escritura");
        }
    }
}
