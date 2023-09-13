package tema14.ejerciciosResueletos.ejemploRSUpdate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class ResultSetUpdate {

	public static void main(String[] args) {
		Scanner scnLeer = new Scanner(System.in);
		String strDepartamento;
		String strSalario;

		
		
		try {
			Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "admin");//se establece la conexi�n
		
			Statement sql = conexion.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet. CONCUR_UPDATABLE);
			
			String strCadena = "SELECT * from emple";
			ResultSet rs = sql.executeQuery(strCadena); 
			while(rs.next()) {
				System.out.println("*"+rs.getString("apellido") + "*" + (rs.getInt("salario")<1500));
				
				if(rs.getInt("salario")<1500) {
					rs.updateString("apellido", "Cambiado");
					rs.updateInt("salario", (int)(rs.getInt("salario")*1.1));
					rs.updateRow();
				}
				
				System.out.println("#"+rs.getString("apellido") + "#");

			}
			rs.beforeFirst();
			System.out.println("\n Dos");
			while(rs.next()) 
				System.out.println(rs.getString("apellido"));
			
			//insertamos un nuevo registro
		      rs.moveToInsertRow();
		      
		      rs.updateInt("EMP_NO", 7940);
		      rs.updateInt("DEPT_NO", 20);
		      rs.updateString("APELLIDO", "nuevo");
		      rs.updateDate("FECHA_ALT", (java.sql.Date) new java.sql.Date(2023 ,05 ,10));
		       
		      rs.insertRow();
		       
		      rs.moveToCurrentRow();
		      conexion.close();
		} catch (SQLException e) {
			// TODO Bloque catch generado autom�ticamente
			e.printStackTrace();
		}

	}

}
