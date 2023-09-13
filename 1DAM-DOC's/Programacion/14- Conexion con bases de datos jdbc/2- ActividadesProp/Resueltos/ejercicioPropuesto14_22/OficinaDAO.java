package tema14.ejerciciosPropuestos.ejercicioPropuesto14_22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OficinaDAO {
	static public Oficina busca(Integer intNumDepartamento) {
		Connection con;
		Oficina objOficina = null;
		
		if(intNumDepartamento!=null) {
			 if((con = conecta())!=null)
				 try {
					Statement st = con.createStatement();

					ResultSet rs = st.executeQuery("select * from  depart where DEPT_NO =" + intNumDepartamento);
					if(rs.next())
						objOficina = new Oficina(rs.getInt("DEPT_NO"), rs.getString("DNOMBRE"), rs.getString("LOC"));
				} catch (SQLException e) {e.printStackTrace();}
		 }
		
		return objOficina;
	}
	
	private static Connection conecta() {
        Connection con = null;

        String url = "jdbc:mysql://localhost/java";
        try {
            con = DriverManager.getConnection(url, "root", "");
        } catch (SQLException ex) {System.out.println("Error al conectar al SGBD.");}

        return con;
    }

	public static List<Oficina> listarOficinas() {
		Connection con;
		List<Oficina> listaOficinas = new ArrayList<>();
		
		if((con = conecta())!=null)
			try {
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery("select * from  depart");
				while(rs.next())
						listaOficinas.add(new Oficina(rs.getInt("DEPT_NO"), rs.getString("DNOMBRE"), rs.getString("LOC")));
				} catch (SQLException e) {e.printStackTrace();}
		
		return listaOficinas.size()>0?listaOficinas:null;//no es muy necesario, podría devolver el listado simplemente
	}
}
