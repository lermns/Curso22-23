package tema12.ejerciciosResueltos.ejercicioResuelto12_14;

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
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
        Set<Registro> temperaturas = new LinkedHashSet<>();
        int intOpcion;
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyyMMdd");
        String nombreArchivo = "src/tema12/ejerciciosResueltos/ejercicioResuelto12_14/registros";
        nombreArchivo += LocalDate.now().format(f);
        
        do {
            System.out.println("1.Nuevo registro");
            System.out.println("2.Listar registros del día");
            System.out.println("3.Mostrar estadísticas");
            System.out.println("4.Salir");
            System.out.print("\nIntroducir opción: ");
            intOpcion = new Scanner(System.in).nextInt();
            switch (intOpcion) {
                case 1 -> {
                    System.out.print("Introducir temperatura: ");
                    double rlnTemperatura = new Scanner(System.in).
                            useLocale(Locale.US).nextDouble();
                    temperaturas.add(new Registro(rlnTemperatura));
                }
                case 2 ->
                    System.out.println(temperaturas);
                case 3 -> {
                    Comparator<Registro> c = new Comparator<Registro>() {
                        public int compare(Registro o1, Registro o2) {
                            return (int) Math.signum(o1.getTemperatura()- o2.getTemperatura());
                        }
                    };
                    if(temperaturas.size()>0) {
	                    System.out.println("Máxima: " + Collections.max(temperaturas, c));
	                    System.out.println("Mínima: " + Collections.min(temperaturas, c));
	                    double rlnAcumulador = 0;
	                    for (Registro t : temperaturas) 
	                        rlnAcumulador += t.getTemperatura();
	                   
	                    System.out.println("Media: " + rlnAcumulador / temperaturas.size());
                    }else
                    	System.out.println("No se ha guardado registro y no se pueden dar medias\n");
                }
            }
        } while (intOpcion != 4);
        
        try ( ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(temperaturas);
        } catch (IOException ex) {
            System.out.println("No se pudo guardar el registro de temperatura");
        }

    }
}
