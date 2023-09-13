package tema11.ejerciciosPropuestos.ejercicioPropuesto11_23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
	        Integer[] intArray1 = {3, 5, 7, 2, 8, 9};
	        Integer[] intArray2 = {4, 7, 9, 0, 1, 5, -1};
	        Integer[] intArray3;
	        final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_23/";
	        
	        try ( ObjectOutputStream o1 = new ObjectOutputStream(new FileOutputStream(PATH + "fichero1"));  
	                ObjectOutputStream o2 = new ObjectOutputStream(new FileOutputStream(PATH + "fichero2"))) {
	            o1.writeObject(intArray1);
	            o2.writeObject(intArray2);
	        } catch (IOException ex) {
	            System.out.println(ex);
	        }
	        
	        intArray3 = fusionar(PATH + "fichero1", PATH + "fichero2");
	        System.out.println(Arrays.toString(intArray3));
	    }

	    static Integer[] fusionar(String strFichero1, String strFichero2) {
	        Integer[] listaFusionada = null;
	        Integer[] lista1 = null;
	        Integer[] lista2 = null;
	        
	        try ( ObjectInputStream in1 = new ObjectInputStream(new FileInputStream(strFichero1)); 
	              ObjectInputStream in2 = new ObjectInputStream(new FileInputStream(strFichero2))) {
	            lista1 = (Integer[]) in1.readObject();
	            lista2 = (Integer[]) in2.readObject();
	        } catch (IOException | ClassNotFoundException ex) {
	            System.out.println(ex);
	        }
	        
	        if(lista1!=null && lista2!=null) {
	            listaFusionada = new Integer[lista1.length + lista2.length];
	            System.arraycopy(lista1, 0, listaFusionada, 0, lista1.length);
	            System.arraycopy(lista2, 0, listaFusionada, lista1.length, lista2.length);
	            Arrays.sort(listaFusionada);
	        }
	        
	        return listaFusionada;
	    }
	}
