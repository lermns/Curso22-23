package ejerProp.ejer14_17;

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

    private static boolean verificar(int intEmpNo){
        Connection con2 = conectar();
        String sql = "select emp_no from emple where emp_no = ?";
        boolean blnVerifi = false;
        try{PreparedStatement preparedStatement = con2.prepareStatement(sql);
            preparedStatement.setInt(1, intEmpNo);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                con2.close();
                blnVerifi = true;
            }else {
                con2.close();
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return blnVerifi;
    }
    
    public static void create(Empleado emple) {
        Connection con = conectar();
        
        String sql = "INSERT INTO emple (EMP_NO, APELLIDO, OFICIO, DIR,  FECHA_ALT, SALARIO, COMISION, DEPT_NO) " +
                     "             VALUES ( ?,      ?,        ?,    ?,        ?,        ?,        ?,       ?  )";

        try {
            if(verificar(emple.getIntEmpNo())) {

                PreparedStatement sentencia = con.prepareStatement(sql);
                sentencia.setInt(1, emple.getIntEmpNo());
                sentencia.setString(2, emple.getStrApellido().toUpperCase());
                sentencia.setString(3, emple.getStrOficio().toUpperCase());
                sentencia.setInt(4, emple.getIntDir());
                sentencia.setDate(5, Date.valueOf(LocalDate.now()));
                sentencia.setInt(6, emple.getIntSalario());
                sentencia.setInt(7, emple.getIntComision());
                sentencia.setInt(8, emple.getIntDeptNo());

                sentencia.executeUpdate();
                con.close();
            }else {
                System.out.println("El empleado " + emple.getIntEmpNo() + " ya existe en la base de datos.");
                con.close();
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar.");
        }
    }
}
