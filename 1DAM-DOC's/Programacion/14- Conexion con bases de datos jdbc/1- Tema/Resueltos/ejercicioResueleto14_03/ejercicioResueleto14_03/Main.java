package tema14.ejerciciosResueletos.ejercicioResueleto14_03;

import java.sql.*;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/java";
        final String INCREMENTO = "100"; 
        int intColumnas;
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
            Statement sql = conexion.createStatement()) {
        	intColumnas=sql.executeUpdate("update emple" +
        						 " set salario = salario + " + INCREMENTO +
        						 " where dept_no=20");
        	System.out.println("Se han modificado con éxito " + intColumnas + " columnas");
		} catch (SQLTimeoutException toe) {System.out.println("Time Out con la conexión a la BD");}
        catch (SQLException e) {e.printStackTrace();}
	}
}
