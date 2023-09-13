package tema14.ejerciciosResueletos.ejercicioResuelto14_11;

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
