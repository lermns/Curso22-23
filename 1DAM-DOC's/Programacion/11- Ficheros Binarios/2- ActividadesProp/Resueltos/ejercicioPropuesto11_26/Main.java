package tema9;
/**
 * Utilizando un fichero aleatorio, realiza un programa que le muestre 
 * al usuario un men� con las siguientes opciones:
 *   � A�adir n�meros de tipo double al principio del fichero.
 *   � A�adir n�meros de tipo double al final del fichero.
 *   � Mostrar el fichero creado.
 *   � Sustituir un n�mero indicado por el usuario por otro n�mero que 
 *     tambi�n indique el usuario.
 * 
 */
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;
 
 
public class Main{
 
    private static int menu(Scanner scnLeer) {
		int intOpcion;
		do {
			System.out.println("1.- A�adir numeros de tipo double al principio del fichero");
		    System.out.println("2.- A�adir numero de tipo double al final del fichero.");
		    System.out.println("3.- Mostrar el fichero creado.");
		    System.out.println("4.- Sustituir un n�mero indicado por otro numero");
		    System.out.println("5.- Salir del programa");
		    try {
		    	intOpcion = Integer.parseInt(scnLeer.nextLine());
		    }catch(NumberFormatException nfe) {intOpcion=0;}
		}while(intOpcion<1 || intOpcion>5);
		return intOpcion;
	}
 
    public static void crearFichero(char chrOpcion, Scanner scnLeer) {
        RandomAccessFile raf = null;
        try {
            File fichero = new File("fichero.obj");//se podr�a pedir el nombre al usuario
            raf = new RandomAccessFile(fichero, "rw");
            annadirNum(raf, chrOpcion, scnLeer);
            
        } catch (Exception e) {
            System.out.println("No se ha podido abrir el fichero");
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {}
        }
 
    }
 
    public static void annadirNum(RandomAccessFile raf, char chrOpcion, Scanner scnLeer) throws Exception {
        double rlnNumero;
        System.out.println("Introduce un numero Double para a�adir al fichero: ");
        rlnNumero = leerDoble(scnLeer);
        
        if(chrOpcion=='p')
        	raf.seek(0);//se coloca en la posici�n 0
        else if(chrOpcion=='f')
        	raf.seek(raf.length());//se coloca en la �ltima posici�n
        
        raf.writeDouble(rlnNumero);
 
    }
 
    public static void leerFichero() {
        RandomAccessFile raf = null;
        try {
            File fichero = new File("fichero.obj");
            raf = new RandomAccessFile(fichero, "r");
            mostrarFichero(raf);
        } catch (Exception e) {
            System.out.println("No se ha podido abrir el fichero");
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e) {}
        }
    }
 
    public static void mostrarFichero(RandomAccessFile raf) throws Exception {
        double rlnNumero;
        raf.seek(0);
        while (true) {
            rlnNumero = raf.readDouble();
            System.out.println(rlnNumero);
        }
    }
 
    public static void sustituirDoubles(Scanner scnLeer) {
        double rlnSustituir, rlnNuevo, rlnNumero;
        int intCont = 0;
 
        RandomAccessFile raf = null;
 
        try {
            File fichero = new File("fichero.obj");
            raf = new RandomAccessFile(fichero, "rw");
            raf.seek(0);
 
            System.out.println("Introduce el valor que desea sustituir");
            rlnSustituir = leerDoble(scnLeer);
 
            System.out.println("Introduce el nuevo valor");
            rlnNuevo = leerDoble(scnLeer);
 
            while (true) {
                rlnNumero = raf.readDouble();
                if (rlnNumero == rlnSustituir) {
                    System.out.println("Encontrado en la posicion " + intCont);
                    raf.seek(intCont * 8);
                    raf.writeDouble(rlnNuevo);
                }
                intCont++;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (raf != null) {
                    raf.close();
                }
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
 
    }
 
    /**
     * Lee los dobles y muestra los errores. Si no puede leer vuelve a pedir el n�mero
     * @param scnLeer
     * @return
     */
    public static double leerDoble(Scanner scnLeer) {
	    Double rlnValor=null;
    	
    	do {	
    		try {
    			rlnValor = Double.parseDouble(scnLeer.nextLine());
		    }catch(NumberFormatException nfe) {
		    	System.out.println("Debes introducir un n�mero, vuelve a introducirlo:");
		    	}
		}while(rlnValor==null);
    	
    	return rlnValor;
    }
    
    public static void main(String[] args) {

        Scanner scnLeer = new Scanner(System.in);
        int intOpcion;
        do {
            intOpcion = menu(scnLeer); //leo la opci�n del men�
 
            switch (intOpcion) {
                case 1: {
                    crearFichero('p', scnLeer);
 
                    break;
                }
                case 2: {
                    crearFichero('f', scnLeer);
 
                    break;
                }
                case 3: {
                    leerFichero();
                    break;
                }
                case 4: {
                    sustituirDoubles(scnLeer);
                    break;
                }
                case 5: {
                    System.out.println("Gracias por usar el programa....");
                    break;
                }
                default: {
                    System.out.println("Opcion no es correcta");
                }
            }
        } while (intOpcion != 5);
    }
 
}