package tema14.ejerciciosPropuestos.ejercicioPropuesto14_12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLTimeoutException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Oficina> alOficinas = new ArrayList<>();
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/java";
        
        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
            Statement sql = conexion.createStatement()) {
        	System.out.println("Datos de empleados");
        	ResultSet rs = sql.executeQuery("Select * from depart");
        	
        	
        	while(rs.next()) {
        		Oficina of = new Oficina(rs.getInt("dept_no"));
			    of.setStrNombre(rs.getString("dnombre"));
			    of.setStrLocalidad(rs.getString("loc"));
			    alOficinas.add(of);
        	}
		} catch (SQLTimeoutException toe) {System.out.println("Time Out con la conexión a la BD");}
        catch (SQLException e) {e.printStackTrace();}
        
        System.out.println(alOficinas);
	}

}
