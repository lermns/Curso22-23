package ejerProp.ejer14_20;

import java.sql.*;
import java.time.LocalDate;

public class EmpleadoDAO {

    private static  Connection conectar() {
        Connection con=null;

        String url = "jdbc:mysql://localhost:3306/prueba";
        try {
            con = DriverManager.getConnection(url, "root", "admin");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }

    public static void delete(int intEmpNo) {
        String sql = "DELETE FROM emple " +
                "WHERE emp_no = ?";
        try {
            Connection con = conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, intEmpNo);

            if(!verificar(intEmpNo)) {

                preparedStatement.executeUpdate();
                System.out.println("borrado con exito.");
            }else {
                System.out.println("el numero de empleado " + intEmpNo + " no se encuentra en la base de datos.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al eliminar un alumno.");
        }
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
}
