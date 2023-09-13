package tema11.ejerciciosResueltos.ejercicioResuelto11_10;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejemplo de uso de la clase File
 * Listado de los archivos del directorio actual
 *
 */
class Main{
  public static void main(String[] args) {
	  int intOpc;
	  Scanner scnLeer = new Scanner(System.in);
	  File fichero = new File(".");  // se indica la ruta entre comillas
                // el punto (.) es el directorio actual

    
	  do {
	    	intOpc = menu(scnLeer);
	    	switch (intOpc) {
	    		//DESPLAZARSE
	    		case 1: fichero = desplazar(scnLeer, fichero);
	    				break;
	    	    //RENOMBRAR
	    	    case 2: renombrar(scnLeer, fichero);
	    	    		break;
	    	}
	  }while(intOpc!=0);
	      
  }

private static void renombrar(Scanner scnLeer, File fichero) {
	System.out.println("Selecciona el fichero");
			String [] arrFicheros = fichero.list();
			if(arrFicheros.length==0)
				System.out.println("Directorio vacío");
			else {
	    		int intCont=0;
	    		for(String strFichero : arrFicheros) {
	    			System.out.println(intCont + ".- " + strFichero);
	    			intCont++;
	    		}
	    		do {
	    			System.out.println("Selecciona un elemento para renombrar entre 0 y " + (arrFicheros.length-1));
	    			intCont=Integer.parseInt(scnLeer.nextLine());
	    		}while(intCont<0 || intCont>arrFicheros.length);
	    		String strNombreNuevo;
	    		do {
	    			System.out.println("Nombre que quieres dar: ");
	    			strNombreNuevo=scnLeer.nextLine();
	    		}while(strNombreNuevo.length()<1);
	    		(new File(fichero,arrFicheros[intCont])).renameTo(new File(fichero,strNombreNuevo));
			}
}

  /****
   * Permite desplazarse por los directorios
   * @param scnLeer leer datos de teclado
   * @param fichero ubicación actual
   * @return devuelve la ubicación del fichero una vez movido
   */
  private static File desplazar(Scanner scnLeer, File fichero) {
			String[] arrStrListaArchivos = fichero.list();
	  		String strUbicaionAct=(new File(fichero.getAbsolutePath())).getAbsolutePath();
	  		if(strUbicaionAct.charAt(strUbicaionAct.length()-1)=='.')
	  			strUbicaionAct=strUbicaionAct.substring(0,strUbicaionAct.lastIndexOf(File.separatorChar));
	  		ArrayList <String> alDirectorios = new ArrayList();
	  		int intOpc;
	  		System.out.println("Se encuentra en " + strUbicaionAct);
	  		//inserto el diectorio raiz del actual
	  		alDirectorios.add(new File(strUbicaionAct).getParent());
/*$$			System.out.println("0.- " + alDirectorios.get(0));
			int intDirectorios=1;*/
	  		//paso por los subdirectorios
			for(int intCont=0;intCont<arrStrListaArchivos.length;intCont++) { 
	  			//si es un subdirectorio lo muestro y añado al arraylist
				if((new File(strUbicaionAct,arrStrListaArchivos[intCont])).isDirectory()==true) {
/*$$		  			System.out.println(intDirectorios + ".- "+ arrStrListaArchivos[intCont]);
		  			intDirectorios++;*/
		  			alDirectorios.add(arrStrListaArchivos[intCont]);
	  			}
	  		}
			for(int intCont=0; intCont<alDirectorios.size();intCont++)
				System.out.println(intCont + ".- "+ alDirectorios.get(intCont)); //imprimo las opciones
			do {
				System.out.println("Elija el directorio al que quiere ir ente 0 y "+ (alDirectorios.size()-1));/*$$(intDirectorios-1));*/
				intOpc = Integer.parseInt(scnLeer.nextLine());
			}while(intOpc<0 || intOpc>=alDirectorios.size());/*$$intDirectorios);*/
			if(intOpc==0)
				fichero = new File(alDirectorios.get(0));
			else
				fichero = new File(strUbicaionAct + File.separatorChar + alDirectorios.get(intOpc));
			
			System.out.println("Ubicación actual: " + fichero.getAbsolutePath());
	return fichero;
  }

  /**
   * Menú principal de la aplicación
   * @param scnLeer para leer de teclado
   * @return devuelve la opción elegida 1 desplazarse, 2 renombrar, 3 borrar y 0 salir
   */
  private static int menu(Scanner scnLeer) {
		int intOpc=-1;
		do {
		  	System.out.println("1.- Desplazarse \n" +
							   "2.- Renombrar \n" +
							   "3.- Borrar \n" +
							   "0.- Salir");
			try {
				intOpc = Integer.parseInt(scnLeer.nextLine());
			}catch(Exception e) {}
		}while(intOpc<0 || intOpc>3);
		return intOpc;
  }
}
