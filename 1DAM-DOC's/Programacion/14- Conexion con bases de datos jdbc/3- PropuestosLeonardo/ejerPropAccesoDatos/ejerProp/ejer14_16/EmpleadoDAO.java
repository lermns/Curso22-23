package ejerProp.ejer14_16;

import java.sql.*;
import java.time.LocalDate;

public class EmpleadoDAO {

    static private Connection conectar() {
        Connection con=null;

        String url = "jdbc:mysql://localhost:3306/prueba";
        try {
            con = DriverManager.getConnection(url, "root", "admin");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }
    
    public static void create(Empleado emple) {
        Connection con = conectar();
        
        String sql = "INSERT INTO emple (EMP_NO, APELLIDO, OFICIO, DIR,  FECHA_ALT, SALARIO, COMISION, DEPT_NO) " +
                     "             VALUES ( ?,      ?,        ?,    ?,        ?,        ?,        ?,       ?  )";

        try {
                PreparedStatement sentencia = con.prepareStatement(sql);
                sentencia.setInt(1, emple.getIntEmpNo());
                sentencia.setString(2, emple.getStrApellido().toUpperCase());
                sentencia.setString(3, emple.getStrOficio().toUpperCase());
                sentencia.setInt(4, emple.getIntDir());
                sentencia.setDate(5, java.sql.Date.valueOf(LocalDate.now()));
                sentencia.setInt(6, emple.getIntSalario());
                sentencia.setInt(7, emple.getIntComision());
                sentencia.setInt(8, emple.getIntDeptNo());

                sentencia.executeUpdate();
                con.close();

        } catch (SQLException ex) {
            System.out.println("Error al insertar.");
        }
    }
}
