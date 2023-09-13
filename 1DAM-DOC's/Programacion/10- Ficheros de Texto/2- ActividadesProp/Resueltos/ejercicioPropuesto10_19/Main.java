package tema10.ejerciciosPropuestos.ejercicioPropuesto10_19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      final char[] ABECEDARIO = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      final char[] CODIFICADOR = leeCodificador(ABECEDARIO.length);
      
      if(CODIFICADOR!=null) {
	      System.out.print("Introduzca el fichero a codificar: ");
	      codificaFichero(ABECEDARIO, CODIFICADOR, new Scanner(System.in).nextLine());
      }
   }

   private static void codificaFichero(final char[] ABECEDARIO, final char[] CODIFICADOR, String strFichero) {
	   FileReader fr = null;
	   BufferedWriter bw = null;
	   int intCaracterLee;
	   char chrCaracterCodificado;
	   boolean blnFlag;
	   
	   try {
		   fr = new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_19/" + strFichero);
	   } catch (FileNotFoundException e) {	
		   System.out.println("No existe el fichero " + strFichero);
	   }
	   if(fr!=null) {
		   try {
			   bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_19/codec_" + strFichero));
		   } catch (IOException e) {	
			   System.out.println("No se ha podido escribir el fichero codificado");
		   }
		   if(bw!=null) {
			   try {
				   intCaracterLee = fr.read();
				   while(intCaracterLee!=-1) {
					   blnFlag = Character.isUpperCase((char)intCaracterLee)?true:false;
					   chrCaracterCodificado=codifica(ABECEDARIO,CODIFICADOR, Character.toLowerCase((char)intCaracterLee));
					   if(blnFlag)
						   chrCaracterCodificado=Character.toUpperCase(chrCaracterCodificado);
					   bw.write(chrCaracterCodificado);
					   intCaracterLee = fr.read();
				   }
				   bw.close();
				   fr.close();
				} catch (IOException e) {
					System.out.println("Error en la codificación");
				}
		   }
	   }
   }

   private static char[] leeCodificador(int intLongitudAbecedario) {
	   BufferedReader br = null;
	   String strLinea = null;

	   try {
		   br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_19/codec.txt"));
	   } catch (FileNotFoundException e) {	
		   System.out.println("No existe el fichero codec.txt");
	   }
	   if(br!=null) {
		   try {
			   strLinea = br.readLine();
			   br.close();
		   } catch (IOException e) {}
	   if(strLinea==null) 
		   System.out.println("No se ha encontrado el sistema de codificación en codec.txt");
	   else if(strLinea.length()!=intLongitudAbecedario)
		   strLinea=null;
	   }

	   return strLinea==null?null:strLinea.toCharArray();
   }

   static char codifica(char conjunto1[], char conjunto2[], char c) {
	   final String conj1 = String.valueOf(conjunto1); 
	   char codificado; 
	   int pos = conj1.indexOf(c); 
	   if (pos == -1) { 
		   codificado = c; 
	   } else {
		   codificado = conjunto2[pos]; 
	   }
	   return codificado;
   }
}
