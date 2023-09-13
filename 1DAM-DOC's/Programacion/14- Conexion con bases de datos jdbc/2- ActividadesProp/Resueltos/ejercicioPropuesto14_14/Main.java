package tema14.ejerciciosPropuestos.ejercicioPropuesto14_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/java";
        String strFechMin=null, strFechMax=null;
        Scanner scnLeer = new Scanner(System.in);
        LocalDate fecha;
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
            Statement sql = conexion.createStatement()) {
        	
        	do {
	        	try{
	        		System.out.print("Fecha mínima de entrada del empleado: ");
	        		strFechMin=scnLeer.nextLine();
	        		fecha = LocalDate.parse(strFechMin);
	        	}catch(Exception e) {System.out.println("Fecha incorrecta, usar formato yyyy/mm/dd");}
        	}while(strFechMin==null);
        	
        	do {
	        	try{
	        		System.out.print("Fecha máxima de entrada del empleado: ");
	        		strFechMax=scnLeer.nextLine();
	        		fecha = LocalDate.parse(strFechMax);
	        	}catch(Exception e) {System.out.println("Fecha incorrecta, usar formato yyyy/mm/dd");}
        	}while(strFechMax==null);
        	
        	ResultSet rs = sql.executeQuery("Select * from emple where fecha_alt between " + strFechMin + " and " + strFechMax);
        	System.out.println("Select * from emple where fecha_alt between '" + strFechMin + "' and '" + strFechMax + "'");
        	while(rs.next()) {
        		System.out.println(rs.getString("apellido") + "\t" + rs.getString("fecha_alt"));
        	}
		} catch (SQLTimeoutException toe) {System.out.println("Time Out con la conexión a la BD");}
        catch (SQLException e) {e.printStackTrace();}
        scnLeer.close();
	}

}
