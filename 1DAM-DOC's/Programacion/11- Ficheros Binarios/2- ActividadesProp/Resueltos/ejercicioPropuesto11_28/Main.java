package tema11.ejerciciosPropuestos.ejercicioPropuesto11_28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;


public class Main {
	
	public static void main(String[] args)  {
		//inicializar();
		mostrarArticulos();
		cambiarPrecios();
		mostrarArticulos();
	}
	
	public static void mostrarArticulos(){
		final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_28/precios.dat";
		double rlnReferencia, rlnPrecio;
		DecimalFormat formatoPrecio = new DecimalFormat("#.##");
		DecimalFormat formatoReferencia = new DecimalFormat("#");

		try(RandomAccessFile archivo = new RandomAccessFile(PATH, "r")){
			System.out.println("Referencia y precios");
			try{
				while(true){
					rlnReferencia = archivo.readDouble();
					rlnPrecio = archivo.readDouble();
					System.out.println("REF. " + formatoReferencia.format(rlnReferencia) + ": " + formatoPrecio.format(rlnPrecio) + "€");
				}
			}catch(EOFException e){}
		}catch(FileNotFoundException e){System.out.println("No existe el archivo");
		}catch(IOException e){System.out.println("Error de lectura");}
	}

	public static void cambiarPrecios(){
		final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_28/precios.dat";
		double rlnValor;

		try(RandomAccessFile archivo = new RandomAccessFile(PATH, "rw")){	               
			try{
				while(true){
					// Modifico con cada dos doubles. Uno es ref. y otro el precio
					rlnValor = archivo.readDouble();
					rlnValor = archivo.readDouble();

					if (rlnValor > 100){
						archivo.seek(archivo.getFilePointer()-8);
						archivo.writeDouble(rlnValor * 1.2);
					}
					if (rlnValor < 100){
						archivo.seek(archivo.getFilePointer()-8);
						archivo.writeDouble(rlnValor * 1.3);
					}
				}
			}catch(EOFException e){
			}catch(IOException e){System.out.println("Error de escritura");}

		} catch (IOException e1) {System.out.println("Error de en la apertura del fichero para su escritura");}
	}

	public static void inicializar(){
		final String PATH = "src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_28/precios.dat";
		double[] rlnArrValores = {1,25.5, 2,166, 3,50.32, 4,12.27, 5,100.5, 6,70.3};

		try(RandomAccessFile archivo = new RandomAccessFile(PATH, "rw")){
			for(int intCont=0; intCont<rlnArrValores.length; intCont++)
				archivo.writeDouble(rlnArrValores[intCont]);

		} catch (IOException e1) {System.out.println("Error de en la apertura del fichero para su carga inicial");}
	}
}