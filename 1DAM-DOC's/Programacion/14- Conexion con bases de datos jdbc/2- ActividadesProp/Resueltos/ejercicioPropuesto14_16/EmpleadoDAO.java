package tema14.ejerciciosPropuestos.ejercicioPropuesto14_16;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class EmpleadoDAO {
	 public static void inserta(Empleado objEmpleado) {
		 Connection con;
		 
		 if(objEmpleado!=null) {
			 if((con = conecta())!=null)
				 try {
					Statement st = con.createStatement();
					st.executeUpdate("insert into Emple (EMP_NO, 					       APELLIDO, 							OFICIO, 						DIR, 							FECHA_ALT, 								SALARIO, 							COMISION, 							DEPT_NO	) " +
		                    		 "VALUES (" + objEmpleado.getIntEMP_NO() + ", '" + objEmpleado.getStrAPELLIDO() + "', '" + objEmpleado.getStrOFICIO() + "', " + objEmpleado.getIntDIR() + ", '" + objEmpleado.getFECHA_ALT() + "', " + objEmpleado.getIntSALARIO() + ", " + objEmpleado.getIntCOMISION() + ", " + objEmpleado.getIntDEPT_NO() +")");
				} catch (SQLException e) {e.printStackTrace();}
		 }
	 }

	    private static Connection conecta() {
	        Connection con = null;

	        String url = "jdbc:mysql://localhost/java";
	        try {
	            con = DriverManager.getConnection(url, "root", "");
	        } catch (SQLException ex) {System.out.println("Error al conectar al SGBD.");}

	        return con;
	    }
	
}
