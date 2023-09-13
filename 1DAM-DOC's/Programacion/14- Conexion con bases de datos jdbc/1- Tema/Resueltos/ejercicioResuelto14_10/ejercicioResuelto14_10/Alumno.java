package tema14.ejerciciosResueletos.ejercicioResuelto14_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Alumno {
    private final int TAM_NOMBRE = 30; 
    private int intID; 
    private String strNombre;
    private Date fNacimiento;
    private double rlnNotaMedia;
    private String strCurso; 

    public Alumno(int intID) {
        this.intID = intID;
    }
    
    public Alumno(int intID, String strNombre, Date fNacimiento, double rlnNotaMedia, String strCurso) {
        this.intID = intID;
        setNombre(strNombre);
        this.fNacimiento = fNacimiento;
        this.rlnNotaMedia = rlnNotaMedia;
        this.strCurso = Alumno.setCurso(strCurso);
    }

    static private Connection conexion() {
        Connection con=null;

        String url = "jdbc:mysql://localhost:3306/Instituto";
        try {
            con = DriverManager.getConnection(url, "root", "admin");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }
    
    public void create() {
        Connection con = conexion();
        
        String sql = "INSERT INTO Alumnos (num, nombre, fnac, media, curso) " +
                     "             VALUES ( ?,    ?,     ?,     ?,     ?  )";

        try {
            PreparedStatement sentencia = con.prepareStatement(sql);
            sentencia.setInt(1, this.intID);
            sentencia.setString(2, this.strNombre);
            sentencia.setDate(3, new java.sql.Date(this.fNacimiento.getTime()));
            sentencia.setDouble(4, this.rlnNotaMedia);
            sentencia.setString(5, this.strCurso);
            
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
            Connection con = conexion();
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
    
    public void read() {
        String strSQL = "SELECT *" +
	                    "FROM Alumnos " +
	                    "WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement ps = con.prepareStatement(strSQL);

            ps.setInt(1, this.intID); 

            ResultSet rs = ps.executeQuery();

            if (rs.next()) { 
                this.strNombre = rs.getString("nombre");
                this.fNacimiento = rs.getDate("fNac");
                this.rlnNotaMedia = rs.getDouble("media");
                this.strCurso = rs.getString("curso");
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }
    }
    
    public void update() {
        String strSQL = "UPDATE Alumnos " +
                     "SET nombre=?, fNac=?, media=?, curso=? " +
                     "WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement ps = con.prepareStatement(strSQL);

            ps.setString(1, this.strNombre); 
            ps.setDate(2, (java.sql.Date)this.fNacimiento); 
            ps.setDouble(3, this.rlnNotaMedia); 
            ps.setString(4, this.strCurso); 
            ps.setInt(5, intID); 

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un alumno.");
        }
    }
    
    public void delete() {
        String strSQL = "DELETE FROM Alumnos " +
                   		"WHERE num = ?";
        try {
            Connection con = conexion();
            PreparedStatement ps = con.prepareStatement(strSQL);

            ps.setInt(1, this.intID); 

            ps.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un alumno.");
        }
    }
    
    
    public int getId() {
        return this.intID;
    }

    public void setId(int intID) {
        this.intID = intID;
    }

    public String getNombre() {
        return this.strNombre;
    }

    public void setNombre(String strNombre) {
        this.strNombre = strNombre.length()>TAM_NOMBRE?strNombre.substring(0, TAM_NOMBRE):strNombre;
    }

    public Date getfNacimiento() {
        return this.fNacimiento;
    }

    public void setfNacimiento(Date fNacimiento) {
        this.fNacimiento = fNacimiento;
    }

    public double getNotaMedia() {
        return this.rlnNotaMedia;
    }

    public void setNotaMedia(double rlnNotaMedia) {
        this.rlnNotaMedia = rlnNotaMedia;
    }

    public String getCurso() {
        return this.strCurso;
    }

    public static String setCurso(String strCurso) {
        return strCurso.substring(0, Math.min(2, strCurso.length()));//por si no tiene dos caracteres
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + intID + ", nombre=" + strNombre + 
               ", fecha de nacimiento=" + fNacimiento + ", notaMedia=" + rlnNotaMedia + 
               ", curso=" + strCurso + '}';
    } 
}
