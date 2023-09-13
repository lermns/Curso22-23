package ejerProp.ejer14_11;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/java";
        String sql = "select * from emple";

        try(Connection connection = DriverManager.getConnection(url, usuario, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int intNum = resultSet.getInt(1);
                String strApellido = resultSet.getString(2);
                String strOficio = resultSet.getString(3);
                int intDir = resultSet.getInt(4);
                Date dateFecha = resultSet.getDate(5);
                int intSalario = resultSet.getInt(6);
                int intComision = resultSet.getInt(7);
                int intDept = resultSet.getInt(8);

                System.out.println("------------------");
                System.out.println("Número de empleado: " + intNum +
                                   "\nApellido: " + strApellido +
                                   "\nOficio: " + strOficio +
                                   "\nDireccion: " + intDir +
                                   "\nFecha Alta: " + dateFecha +
                                   "\nSalario: " + intSalario +
                                   "\nComision: " + intComision +
                                   "\nDepartamento: " + intDept);
                System.out.println("------------------");
            }
        }catch (SQLException e){
            System.out.println(e.getErrorCode());
        }
    }
}
