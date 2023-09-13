package examenOrdinariaMio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import tema14.ejerciciosPropuestos.ejercicioPropuesto14_23.Empleado;

public class ClienteDAO {
	private static Connection conecta() {
		Connection con = null;

		String url = "jdbc:mysql://localhost/examen1";
		try {
			con = DriverManager.getConnection(url, "root", "");
		} catch (SQLException ex) {System.out.println("Error al conectar al SGBD.");}

		return con;
	}
	
	public static Cliente confirmar(Cliente objCliente) {
		 Connection con;
		 
			if((con= conecta())!=null)
			 try (Statement st = con.createStatement()){//mejor cerrar los Statements
					ResultSet rs = st.executeQuery("select * from clientes where nif=" + objCliente.getNif());
					if(rs.next() && rs.getInt("nif")==objCliente.getNif() && rs.getString("password").equals(objCliente.getPassword())) {
						objCliente.setNombre(rs.getString("nombre"));
						objCliente.setPassword(rs.getString("password"));
					}
					else
						objCliente=null;
				} catch (SQLException e) {e.printStackTrace();}
		 return objCliente;
	}

}
