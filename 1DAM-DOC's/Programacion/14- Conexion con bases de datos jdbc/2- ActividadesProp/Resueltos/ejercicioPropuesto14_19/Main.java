package tema14.ejerciciosPropuestos.ejercicioPropuesto14_19;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scnLeer = new Scanner(System.in);
		Integer intOrigen = null;
		Integer intDestino = null;

        while(intOrigen==null)
        	try {
		        System.out.print("Indica la oficina origen: ");
		        intOrigen = scnLeer.nextInt()%100;
        	}catch(Exception e) {}
        
        while(intDestino==null)
        	try {
		        System.out.print("Indica la oficina destino: ");
		        intDestino = scnLeer.nextInt()%100;
        	}catch(Exception e) {}
        
        scnLeer.close();
        
        EmpleadoDAO.cambiaOficina(intOrigen, intDestino);
	}

}
