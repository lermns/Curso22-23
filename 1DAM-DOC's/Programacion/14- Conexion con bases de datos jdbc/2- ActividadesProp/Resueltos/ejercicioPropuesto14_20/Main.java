package tema14.ejerciciosPropuestos.ejercicioPropuesto14_20;

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
		Integer intEmpleado = null;

        while(intEmpleado==null)
        	try {
		        System.out.print("Indica el número de empleado a eliminar: ");
		        intEmpleado = scnLeer.nextInt()%10000;
        	}catch(Exception e) {}
        
        scnLeer.close();
        
        EmpleadoDAO.eliminaEmpleado(intEmpleado);
	}

}
