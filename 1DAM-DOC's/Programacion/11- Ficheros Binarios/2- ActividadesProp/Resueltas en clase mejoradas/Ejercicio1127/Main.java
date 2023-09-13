package aaa.Ejercicio1127;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class Main {
	public static void main (String [] args) {
		String strRuta1 = "src/aaa/Ejercicio1127/Directorio1";
		String strRuta2 = "src/aaa/Ejercicio1127/Directorio2";
		
		//Vamos a crear un método que nos permita copiar el contenido del directorio 2 en el 1.
		copiarDirectorio(strRuta1, strRuta2);
		System.out.println("Se ha copiado el contenido del directorio2 en el directorio1.");
	}
	
	public static void copiarDirectorio(String strRuta1, String strRuta2) {
		try {
			//Obtenemos el contenido del directorio 1 y del 2.
			File f1 = new File(strRuta1); //No lo puedo meter en el try, porque me dice que lo tengo que cerrar obligatoriamente con ;
			File f2 = new File(strRuta2);
			
			//Ahora, verificaremos que el directorio1 exista, si no, no podremos continuar.
			if (!f1.exists()) {
				System.out.println("El directorio destino no existe");
				return;
			}
			//Hacemos lo mismo con el directorio2, así no tendremos ningún problema.
			if (!f2.exists()) {
				System.out.println("El directorio origen no existe");
				return;
			}
			//Ahora, voy a hacer que me devuelva la lista de archivos y directorios que estén contenidos en el directorio2, para hacerme una idea de lo que tengo que mandar copiar.
			File[] archivosCopiar = f2.listFiles();
			//System.out.println("[CONTENIDO DEL DIRECTORIO2:]\n" + Arrays.toString(archivosCopiar));
			//Copiamos en el directorio1 todos los archivos
			for (File valor : archivosCopiar) {
				//Cogemos ahora el nombre del archivo, y luego crearemos la ruta donde lo queremos copiar
				String strNombre = valor.getName();
				String rutaArchivoDestino = strRuta1 + File.separator + strNombre;
                
				//Ahora, nos situamos en ambos directorios.
				Path origen = valor.toPath();
                Path destino = new File(rutaArchivoDestino).toPath();
                
                //Ahora clasificaremos que tipo de archivo es (fichero o directorio)
                if(valor.isDirectory()) {
                	Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING); //He tenido que buscar como hacerlo pues no sabía de este comando.
                }
                if (valor.isFile()){
                	Files.copy(origen, destino, StandardCopyOption.REPLACE_EXISTING); //He tenido que buscar como hacerlo pues no sabía de este comando.
                }
                
                //Ahora, listaremos el contenido del directorio1 para comprobar que se ha copiado todo exitosamente dentro de él.
                File[] archivosDir1 = f1.listFiles();
                System.out.println("[CONTENIDO DEL DIRECTORIO1:]\n" +Arrays.toString(archivosDir1));
			}
		}catch(IOException e) {
			System.out.println("Error al copiar los archivos en el directorio");
		}
	}
}