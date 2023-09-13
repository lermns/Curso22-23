package tema12.ejerciciosResueltos.ejercicioResuelto12_16;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
        //la letra es la clave y el académico es el valor
		Map<Character, Academico> academia = new TreeMap<>();
        
        //datos de los cinco académicos
        for (int intCont = 0; intCont < 5; intCont++) {
            System.out.print("Letra: ");
            Character chrLetra = new Scanner(System.in).nextLine().charAt(0);
            System.out.print("Nombre: ");
            String nombre = new Scanner(System.in).nextLine();
            System.out.print("Año de ingreso: ");
            int ingreso = new Scanner(System.in).nextInt();
            nuevoAcademico(academia, new Academico(nombre, ingreso), chrLetra);
        }
        System.out.println("Orden por letra: " + academia);//con la clave
        
        //uso la estructura ideal para este caso
        Set<Academico> conjuntoSinLetra = new TreeSet<>(academia.values());//con Comparable
        System.out.println("Por nombre sin letra: " + conjuntoSinLetra);
        Comparator<Academico> comparadorIngresos = new Comparator<>() {
            @Override
            public int compare(Academico o1, Academico o2) {
                return o1.getAnioIngreso() - o2.getAnioIngreso();
            }
        };
        conjuntoSinLetra = new TreeSet<>(comparadorIngresos);
        conjuntoSinLetra.addAll(academia.values());
        System.out.println("Por año sin letra: " + conjuntoSinLetra);

        //con un arrayList
        List<Map.Entry<Character, Academico>> listaConLetra = new ArrayList<>(academia.entrySet());
        Collections.sort(listaConLetra, new Comparator<>() {//con clase anónima
									            @Override
									            public int compare(Map.Entry<Character, Academico> o1, Map.Entry<Character, Academico> o2) {
									                return o1.getValue().getAnioIngreso() - o2.getValue().getAnioIngreso();
									            }
									        });
        System.out.println("Orden por año de ingreso: " + listaConLetra);

        Collections.sort(listaConLetra, new Comparator<>() {//cambio de comparador
								            @Override
								            public int compare(Map.Entry<Character, Academico> o1,
								                    Map.Entry<Character, Academico> o2) {
								                return o1.getValue().compareTo(o2.getValue());
								            }
								        });
        System.out.println("Orden por nombre: " + listaConLetra);
    }

    static boolean nuevoAcademico(Map<Character, Academico> academia, Academico nuevo, Character chrLetra) {
        boolean blnDevolver = false;
        
        if (Character.isAlphabetic(chrLetra)) {
            academia.put(chrLetra, nuevo);
            blnDevolver = true;
        } else 
            System.out.println("Letra no válida");
        
        return blnDevolver;
    }
}
