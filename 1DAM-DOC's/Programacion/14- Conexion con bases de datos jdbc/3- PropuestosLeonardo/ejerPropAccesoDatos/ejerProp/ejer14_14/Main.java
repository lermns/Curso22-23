package ejerProp.ejer14_14;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/prueba";
        String sql = "select * from emple where fecha_alt between ? and ?";

        try(Connection connection = DriverManager.getConnection(url, usuario, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){
            System.out.println("Escriba una fecha inicial, formato(YYYY-MM-DD).");
            String strFecha = new Scanner(System.in).nextLine();
            System.out.println("Escriba la otra fecha, formato(YYYY-MM-DD).");
            String strFecha2 = new Scanner(System.in).nextLine();
            //1991-12-02 // 1992-01-24
            preparedStatement.setString(1, strFecha);
            preparedStatement.setString(2, strFecha2);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int intNum = resultSet.getInt(1);
                String strApellido = resultSet.getString(2);
                Date dateFecha = resultSet.getDate(5);
                int intSalario = resultSet.getInt(6);

                System.out.println("------------------");
                System.out.println("Número de empleado: " + intNum +
                        "\nApellido: " + strApellido +
                        "\nFecha Alta: " + dateFecha +
                        "\nSalario: " + intSalario);
                System.out.println("------------------");
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
