package tema12.ejerciciosResueltos.ejercicioResuelto12_11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Socio> socios = new TreeSet<>();
        int intOpcion; 
        String strDni;

        try ( ObjectInputStream in = new ObjectInputStream( new FileInputStream("src/tema12/ejerciciosResueltos/ejercicioResuelto12_11/socios.dat"))) {
        	socios = (TreeSet<Socio>)in.readObject(); 
        } catch (IOException ex) { System.out.println("Lista de socios vacía"); 
        } catch (ClassNotFoundException ex) { }; 
        
        do { 
        	System.out.println("1.Alta"); 
        	System.out.println("2.Baja"); 
        	System.out.println("3.Modificación"); 
        	System.out.println("4.Listado por dni"); 
        	System.out.println("5.Listado por antiguedad"); 
        	System.out.println("6.Salir"); 
        	System.out.print("\nIntroducir opción: "); 
        	intOpcion = new Scanner(System.in).nextInt(); 
        	
        	switch (intOpcion) { 
	        	case 1 -> { 
	        		System.out.print("dni: "); 
	        		strDni = new Scanner(System.in).next(); 
	        		alta(socios, strDni); 
	        	}
	        	case 2 -> { 
	        		System.out.print("dni socio: "); 
	        		strDni = new Scanner(System.in).next(); 
	        		socios.remove(new Socio(strDni)); 
	        	}
	        	case 3 -> { 
	        		System.out.print("dni: "); 
	        		strDni = new Scanner(System.in).next(); 
	        		socios.remove(new Socio(strDni)); 
	        		System.out.print("dni socio: "); 
	        		strDni = new Scanner(System.in).nextLine(); 
	        		alta(socios, strDni); 
	        	}
	        	case 4 -> System.out.println(socios); 
	        	case 5 -> { 
	        		Comparator<Socio> comparadorAntiguedad = new Comparator<>() { 
	        			@Override 
	        			public int compare(Socio o1, Socio o2) { 
	        				return o2.antiguedad() - o1.antiguedad(); 
	        			}
	        		};
		        	Set<Socio> tsArrSocios = new TreeSet<>(comparadorAntiguedad); 
		        	tsArrSocios.addAll(socios); 
		        	System.out.println(tsArrSocios); 
	        	} 
        	} 
        }while (intOpcion != 6); 
        
        try ( ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("src/tema12/ejerciciosResueltos/ejercicioResuelto12_11/socios.dat"))) { 
        	out.writeObject(socios); 
        } catch (IOException e) { System.out.println(e);} 
         
    }
        
    static boolean alta(Set<Socio> socios, String strDni) { 
    	String strNombre;
    	String strFechaAlta;
    	
    	System.out.print("nombre: "); 
    	strNombre = new Scanner(System.in).next(); 
    	System.out.print("fecha de alta: "); 
    	strFechaAlta = new Scanner(System.in).nextLine(); 
    	return socios.add(new Socio(strDni, strNombre, strFechaAlta)); 
    } 
}
