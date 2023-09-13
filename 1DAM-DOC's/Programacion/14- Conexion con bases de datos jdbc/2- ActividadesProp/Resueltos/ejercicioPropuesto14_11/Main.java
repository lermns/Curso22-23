package tema14.ejerciciosPropuestos.ejercicioPropuesto14_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/java";
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
            Statement sql = conexion.createStatement()) {
        	System.out.println("Datos de empleados");
        	ResultSet rs = sql.executeQuery("Select * from emple");
        	while(rs.next()) {
        		System.out.println(rs.getString("emp_no") + "\t" + 
			        			   rs.getString("apellido") + "\t" +
			        			   rs.getString("oficio") + "\t" + 
			        			   rs.getString("dir") + "\t" + 
			        			   rs.getString("fecha_alt") + "\t" + 
			        			   rs.getString("salario") + "\t" +
			        			   rs.getString("comision") + "\t" +
			        			   rs.getString("dept_no") );
        	}
		} catch (SQLTimeoutException toe) {System.out.println("Time Out con la conexión a la BD");}
        catch (SQLException e) {e.printStackTrace();}
	}

}
