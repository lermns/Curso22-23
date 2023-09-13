package tema14.ejerciciosResueletos.ejercicioResuelto14_11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class AlumnoDAO {

    static private Connection conectar() {
        Connection con=null;

        String url = "jdbc:mysql://localhost:3306/Instituto";
        try {
            con = DriverManager.getConnection(url, "root", "admin");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }
    
    public static void create(Alumno alum) {
        Connection con = conectar();
        
        String sql = "INSERT INTO Alumnos (num, nombre, fnac, media, curso) " +
                     "             VALUES ( ?,    ?,     ?,     ?,     ?  )";

        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, alum.getId());
            sentencia.setString(2, alum.getNombre());
            sentencia.setDate(3, new java.sql.Date(alum.getfNacimiento().getTime()));
            sentencia.setDouble(4, alum.getNotaMedia());
            sentencia.setString(5, alum.getCurso());
            
            sentencia.executeUpdate();
            
            con.close(); 
        } catch (SQLException ex) {
            System.out.println("Error al insertar.");
        }
    }
    
    static public Alumno read(int intID) {
        Alumno objAlumno = null;
        String strSQL = "SELECT *" +
                   		"FROM Alumnos " +
                   		"WHERE num = ?";
        try {
            Connection con = conectar();
            PreparedStatement sentencia = con.prepareStatement(strSQL);

            sentencia.setInt(1, intID); 

            ResultSet rs = sentencia.executeQuery();

            if (rs.next()) { 
                String strNombre = rs.getString("nombre");
                Date fNacimiento = rs.getDate("fNac");
                Double rlnNotaMedia = rs.getDouble("media");
                String strCurso = rs.getString("curso");
                
                objAlumno = new Alumno(intID, strNombre, fNacimiento, rlnNotaMedia, strCurso);
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }

        return objAlumno; 
    }
    
        
    public static void update(Alumno alum) {
        String strSQL = "UPDATE Alumnos " +
                     "SET nombre=?, fNac=?, media=?, curso=? " +
                     "WHERE num = ?";
        try {
            Connection con = conectar();
            PreparedStatement ps = con.prepareStatement(strSQL);

            ps.setString(1, alum.getNombre()); 
            ps.setDate(2, (java.sql.Date)alum.getfNacimiento()); 
            ps.setDouble(3, alum.getNotaMedia()); 
            ps.setString(4, alum.getCurso()); 
            ps.setInt(5, alum.getId()); 

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un alumno.");
        }
    }
    
    public static void delete(int intID) {
        String strSQL = "DELETE FROM Alumnos " +
                   		"WHERE num = ?";
        try {
            Connection con = conectar();
            PreparedStatement ps = con.prepareStatement(strSQL);

            ps.setInt(1, intID); 

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un alumno.");
        }
    }
}
