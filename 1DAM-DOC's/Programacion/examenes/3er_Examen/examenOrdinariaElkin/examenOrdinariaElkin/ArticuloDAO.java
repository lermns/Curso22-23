package examenOrdinariaMio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ArticuloDAO {
	private static Connection conecta() {
		Connection con = null;

		String url = "jdbc:mysql://localhost/examen1";
		try {
			con = DriverManager.getConnection(url, "root", "");
		} catch (SQLException ex) {System.out.println("Error al conectar al SGBD.");}

		return con;
	}
	
	public static void mostrar() {
		 Connection con;
		 
		 if((con= conecta())!=null)
			 try (Statement st = con.createStatement()){
				 ResultSet rs = st.executeQuery("select id, nombre, precio from articulos");
				 System.out.println("id \t nombre \t precio");
				 while(rs.next()) {
					 System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
				 }
			 } catch (SQLException e) {e.printStackTrace();}
	}

	public static Articulo buscar(int intArticulo) {
		Connection con;
		Articulo objArticulo=null;
		 
		 if((con= conecta())!=null)
			 try (Statement st = con.createStatement()){
				 ResultSet rs = st.executeQuery("select id, nombre, suministrador, precio from articulos where id=" + intArticulo);
				 if(rs.next()) 
						objArticulo = new Articulo(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4));
			} catch (SQLException e) {e.printStackTrace();}
		
		 return objArticulo;
	}

}
