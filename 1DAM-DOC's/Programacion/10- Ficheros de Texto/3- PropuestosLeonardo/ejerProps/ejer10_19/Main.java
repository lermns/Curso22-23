package ficherosDeTexto.ejerProps.ejer10_19;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// Abre fichero de entrada
        File archivoEntrada = new File("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_19/marcoAurelio.txt");
        Scanner scanner;
        try {
            scanner = new Scanner(archivoEntrada);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el fichero de entrada.");
            return;
        }
        
        // Abre fichero de salida
        File archivoSalida = new File("C:/CURSO/Programación/ficherosDeTexto/src/ficherosDeTexto/ejerProps/ejer10_19/marcoAurelioCod.txt");
        PrintWriter writer;
        try {
            writer = new PrintWriter(archivoSalida);
        } catch (FileNotFoundException e) {
            System.out.println("No se ha podido crear el fichero de salida.");
            scanner.close();
            return;
        }
        
        // Lee el texto del fichero de entrada letra por letra y lo codifica
        while (scanner.hasNextLine()) {
            String linea = scanner.nextLine();
            for (char letra : linea.toCharArray()) {
                if (letra == ' ') { // si es un espacio en blanco, escribir un espacio en blanco
                    writer.print(' ');
                } else {
                    String letraCodificada = buscarSustituto(letra);
                    writer.print(letraCodificada);
                }
            }
            writer.println();
        }   
        System.out.println("El texto ha sido codificado correctamente.");
        // Cierra ficheros
        scanner.close();
        writer.close();
        }
    
    private static String buscarSustituto(char letra) {
        for (MapaChar letraEnum : MapaChar.values()) {
            if (Character.toUpperCase(letra) == letraEnum.name().charAt(0)) {
                return letraEnum.getSustituto();
            }
        }
        return "";
    }
}
