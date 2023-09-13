package tema14.ejerciciosPropuestos.ejercicioPropuesto14_15;

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
        String[] strArray = {"Número empleado", "Apellido", "Oficio", "Director", "Salario", "Comisión", "Departamento"};
        Scanner scnLeer = new Scanner(System.in);

        try (Connection conexion = DriverManager.getConnection(url, usuario, password);
            Statement sql = conexion.createStatement()) {
        	System.out.println("Datos del nuevo empleado");
        	for(int intCont=0; intCont<strArray.length; intCont++) {
        		System.out.print(strArray[intCont] + ": ");
        		strArray[intCont] = scnLeer.nextLine();
        	}
        	
        	if(sql.executeUpdate("insert into emple(EMP_NO,  	   APELLIDO,             OFICIO,               DIR,            FECHA_ALT,     SALARIO,          COMISION,         DEPT_NO) " +
        						 "values (" + strArray[0] + ", '"+ strArray[1] + "', '"+ strArray[2] + "', "+ strArray[3] + ", curdate(),'" + strArray[4] + "' , "+ strArray[5] + ", "+ strArray[6] + ")")==1)
        		System.out.println("Se han insertado con éxito el nuevo usuario ");
		} catch (SQLTimeoutException toe) {System.out.println("Time Out con la conexión a la BD");
		}catch (SQLException e) {e.printStackTrace();}
        
        scnLeer.close();
	}

}
