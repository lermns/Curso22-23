package tema14.ejerciciosPropuestos.ejercicioPropuesto14_18;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class EmpleadoDAO {
	 public static void inserta(Empleado objEmpleado) {
		 Connection con;
		 
		 if(objEmpleado!=null)
			 if(OficinaDAO.busca(objEmpleado.getIntDEPT_NO())==null)
				 System.out.println("No existe el departamento");
			 else{
				 if((con = conecta())!=null)
					 try {
						Statement st = con.createStatement();
						
						if(busca(objEmpleado.getIntEMP_NO(),con)!=null)
							System.out.println("El empleado ya existe");
						else
							st.executeUpdate("insert into Emple (EMP_NO, 					       APELLIDO, 							OFICIO, 						DIR, 							FECHA_ALT, 								SALARIO, 							COMISION, 							DEPT_NO	) " +
				                    		 "VALUES (" + objEmpleado.getIntEMP_NO() + ", '" + objEmpleado.getStrAPELLIDO() + "', '" + objEmpleado.getStrOFICIO() + "', " + objEmpleado.getIntDIR() + ", '" + objEmpleado.getFECHA_ALT() + "', " + objEmpleado.getIntSALARIO() + ", " + objEmpleado.getIntCOMISION() + ", " + objEmpleado.getIntDEPT_NO() +")");
					} catch (SQLException e) {e.printStackTrace();}
			 }
	 }
	 
	 public static Empleado busca(int intEMP_NO) {
		 return busca(intEMP_NO, null);
	 }
	 
	 public static Empleado busca(int intEMP_NO, Connection con) {
		 Empleado objEmpleado=null;
		 
		 if(con==null)//si no me ha pasado la conexión
			 con = conecta();
		 
		 if(con!=null)
			 try {
					Statement st = con.createStatement();
					ResultSet rs = st.executeQuery("select * from emple where emp_no=" + intEMP_NO);
					if(rs.next()) {
						objEmpleado = new Empleado(rs.getInt("EMP_NO"), rs.getString("APELLIDO"), rs.getString("OFICIO"), rs.getInt("DIR"), rs.getString("FECHA_ALT"), rs.getInt("SALARIO"), rs.getInt("COMISION"), rs.getInt("DEPT_NO"));
					}
				} catch (SQLException e) {e.printStackTrace();}
		 
		 return objEmpleado;
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
