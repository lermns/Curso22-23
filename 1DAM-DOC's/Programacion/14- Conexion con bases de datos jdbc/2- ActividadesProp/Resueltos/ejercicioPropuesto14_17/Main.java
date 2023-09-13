package tema14.ejerciciosPropuestos.ejercicioPropuesto14_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Empleado objEmpleado = new Empleado(7369, 
        		"pepe", 
        		"Programador en Java", 
        		123, 
        		"2023-05-18", 
        		2000, 
        		200, 
        		20);
        
        EmpleadoDAO.inserta(objEmpleado);
	}

}
