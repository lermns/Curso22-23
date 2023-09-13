package tema14.ejerciciosPropuestos.ejercicioPropuesto14_23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

	public static void modificarOficinas() {
		Oficina objOficina;
		Connection con;
		Scanner scnLeer = new Scanner(System.in);
		String strLeido;
		boolean blnCambiado;

		if((con= conecta())!=null)
			try (Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)){
				ResultSet rs = st.executeQuery("SELECT DEPT_NO, DNOMBRE, LOC from depart");
				while(rs.next()) {
					blnCambiado=false;
					objOficina = new Oficina(rs.getInt("DEPT_NO"), rs.getString("DNOMBRE"), rs.getString("LOC"));
					System.out.println("\nPara la siguiente oficina " + objOficina);
					System.out.println("Indica los datos que quieras cambiar o pulsa intro");
					do {
						System.out.print("Número de oficina: ");
						strLeido=scnLeer.nextLine();
					}while(strLeido.length()>2);
					if(strLeido.length()==2 && Character.isDigit(strLeido.charAt(0)) && Character.isDigit(strLeido.charAt(1))) {
						rs.updateInt("DEPT_NO", Integer.parseInt(strLeido));
						blnCambiado = true;
					}
					System.out.print("Nombre de la oficina: ");
					strLeido=scnLeer.nextLine();
					if(strLeido.substring(0, Math.min(strLeido.length(), 14)).length()>0) {
						rs.updateString("DNOMBRE", strLeido);
						blnCambiado = true;
					}
					System.out.print("Localidad de la oficina: ");
					strLeido=scnLeer.nextLine();
					if(strLeido.substring(0, Math.min(strLeido.length(), 14)).length()>0) {
						rs.updateString("LOC", strLeido);
						blnCambiado = true;
					}
					if(blnCambiado == true)
						rs.updateRow();
				}
			} catch (SQLException e) {e.printStackTrace();}
		scnLeer.close();
	}
}
