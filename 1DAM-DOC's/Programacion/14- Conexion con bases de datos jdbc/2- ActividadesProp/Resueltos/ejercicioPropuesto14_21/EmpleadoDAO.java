package tema14.ejerciciosPropuestos.ejercicioPropuesto14_21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class EmpleadoDAO {

	public static void inserta(Empleado objEmpleado) {
		 if(objEmpleado!=null)
			 if(OficinaDAO.busca(objEmpleado.getIntDEPT_NO())==null)
				 System.out.println("No existe el departamento");
			 else{
				 Connection con;
				if((con= conecta())!=null)
					 try (Statement st = con.createStatement()){
						
						if(busca(objEmpleado.getIntEMP_NO())!=null)
							System.out.println("El empleado ya existe");
						else
							st.executeUpdate("insert into Emple (EMP_NO, 					       APELLIDO, 							OFICIO, 						DIR, 							FECHA_ALT, 								SALARIO, 							COMISION, 							DEPT_NO	) " +
				                    		 "VALUES (" + objEmpleado.getIntEMP_NO() + ", '" + objEmpleado.getStrAPELLIDO() + "', '" + objEmpleado.getStrOFICIO() + "', " + objEmpleado.getIntDIR() + ", '" + objEmpleado.getFECHA_ALT() + "', " + objEmpleado.getIntSALARIO() + ", " + objEmpleado.getIntCOMISION() + ", " + objEmpleado.getIntDEPT_NO() +")");
					} catch (SQLException e) {e.printStackTrace();}
			 }
	 }
	 
	 public static Empleado busca(int intEMP_NO) {
		 Empleado objEmpleado=null;
		 Connection con;
		 
			if((con= conecta())!=null)
			 try (Statement st = con.createStatement()){//mejor cerrar los Statements
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

	public static void cambiaOficina(int intOrigen, int intDestino) {
		Empleado objEmpleado;
		Connection con;

		if((con= conecta())!=null)
			try (Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet. CONCUR_UPDATABLE)){
				ResultSet rs = st.executeQuery("SELECT EMP_NO, DEPT_NO from emple where DEPT_NO = " + intOrigen);
				while(rs.next()) {
					//Con la consulta anterior podría haber sacado todos los datos del empleado, 
					//pero como ya lo tengo en otro método, lo cojo de ahí
					//en este caso no pongo emp_no al coger los datos, porque ya lo he indicado
					objEmpleado = EmpleadoDAO.busca(rs.getInt(1));
					System.out.println("Original " + objEmpleado);
					
					//inserción en el registro actual
					rs.updateInt("DEPT_NO", intDestino);
					rs.updateRow();
					
				    //muestro el cambio
				    objEmpleado = EmpleadoDAO.busca(rs.getInt(1));
					System.out.println("Cambiado " + objEmpleado + "\n");
				}
			} catch (SQLException e) {e.printStackTrace();}
		else

			System.out.println("Es null");
	}

	public static void eliminaEmpleado(int intEmpleado) {
		Connection con;
		 
		if((con= conecta())!=null)
			try (Statement st = con.createStatement()){
					st.executeUpdate("Delete from emple where emp_no=" + intEmpleado);
			} catch (SQLException e) {e.printStackTrace();}		
	}
	
}
