package tema14.ejerciciosResueletos.ejercicioResueleto14_01;

import java.sql.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/java";
        final String INCREMENTO = "100"; 
        int intColumnas;
        int intEmpleado;
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
            Statement sql = conexion.createStatement()) {
        	System.out.println("Indica el número del alumno que quieres eliminar");
        	intEmpleado = new Scanner(System.in).nextInt();
        	intColumnas=sql.executeUpdate("delete from emple" +
        						 		  " where emp_no=" + intEmpleado);
        	System.out.println("Se ha eliminado con éxito " + intColumnas + " empleado");
		} catch (SQLTimeoutException toe) {System.out.println("Time Out con la conexión a la BD");}
        catch (SQLException e) {e.printStackTrace();}
	}
}
