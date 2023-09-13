package tema14.ejerciciosPropuestos.ejercicioPropuesto14_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnLeer = new Scanner(System.in);
		Integer intMayor = null;
		List<Oficina> listaOficinas = OficinaDAO.listarOficinas();
        
		if(listaOficinas.size()>0) {
			while(intMayor==null)
	        	try {
			        System.out.print("Indica el número de oficina desde el que quieras mostrar: ");
			        intMayor = scnLeer.nextInt()%100;
	        	}catch(Exception e) {}
			
			for(Oficina objOficina:listaOficinas)
				if(objOficina.getNumDepartamento()>=intMayor)
			        System.out.println(objOficina);
		}
        
        scnLeer.close();
	}

}
