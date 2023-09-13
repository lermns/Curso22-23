package tema6;

import java.util.Scanner;

public class EjerciciosPropuestos613Arrays{
	public static void main (String[]args) {
		Scanner scnLn = new Scanner (System.in);
		String strFraseC, strFraseCompilada = "";

		
		System.out.println("Inserte su sentencia en C (Recuerda que para comentar algo utilice:  /* inserte un comentario aquí */ ");
		strFraseC = scnLn.nextLine();
		scnLn.close();
		
		char chrFraseCopia[] = strFraseC.toCharArray();
		
		for (int intCont = 0,intCont2,intCont3; intCont < chrFraseCopia.length; intCont++) {
			//busco el /*
			for (intCont2 = intCont; intCont2 < chrFraseCopia.length-1 && !(chrFraseCopia[intCont2]=='/' && chrFraseCopia[intCont2+1]=='*'); intCont2++) ;
			if(intCont2 >= chrFraseCopia.length-1)
				intCont2=chrFraseCopia.length;
			
			intCont=intCont2;//para no volver a pasar por valores anteriormente mirados
			
			//busco el */ y si existe me quedo en el /
			for (intCont3 = intCont2+2; intCont3 < chrFraseCopia.length-1 && !(chrFraseCopia[intCont3]=='*' && chrFraseCopia[intCont3+1]=='/'); intCont3++) ;
			intCont3++;
			
			//guardo todo lo que no esté entre /* y */ en la cadena strFraseCompilada
			strFraseCompilada = "";
			for (int intCont4 = 0; intCont4 < chrFraseCopia.length; intCont4++) {
				if(intCont4<intCont2 || intCont4>intCont3)
					strFraseCompilada+=chrFraseCopia[intCont4];
			}
			//paso la cadena strFraseCompilada al array de caracteres
			chrFraseCopia=strFraseCompilada.toCharArray();
		}
		strFraseCompilada = String.valueOf(chrFraseCopia);
		System.out.println("[100%] ¡Compilación terminada!");
		System.out.println(strFraseCompilada);	
	}
}   