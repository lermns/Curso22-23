package ejerProp.ejer14_13;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/prueba";
        String sql = "select * from depart where loc = ?";
        String sql1 = "select * from emple where dept_no = ?";
        String strLoc;
        int intDept = 0;

        try(Connection connection = DriverManager.getConnection(url, usuario, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1)){

            System.out.println("Escriba la localidad para ver a los empleados que trabajan alli.");
            strLoc = new Scanner(System.in).nextLine().toUpperCase();
            preparedStatement.setString(1, strLoc);

            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()){
                intDept = resultSet.getInt(1);
                String strDnombre = resultSet.getString(2);
                String strLocalidad = resultSet.getString(3);

                System.out.println("Departamento: " + intDept +
                        "\nNombre: " + strDnombre +
                        "\nLocalidad: " + strLocalidad + "\n");
            }else{
                System.out.println("no se encontro departamentos para la localidad especificada.");
                return;
            }

            preparedStatement1.setInt(1, intDept);
            ResultSet resultSet1 = preparedStatement1.executeQuery();

            while(resultSet1.next()){
                int intNum = resultSet1.getInt(1);
                String strApellido = resultSet1.getString(2);
                String strOficio = resultSet1.getString(3);
                int intDir = resultSet1.getInt(4);
                Date dateFecha = resultSet1.getDate(5);
                int intSalario = resultSet1.getInt(6);
                int intComision = resultSet1.getInt(7);
                int intDept1 = resultSet1.getInt(8);

                System.out.println("------------------");
                System.out.println("Número de empleado: " + intNum +
                        "\nApellido: " + strApellido +
                        "\nOficio: " + strOficio +
                        "\nDireccion: " + intDir +
                        "\nFecha Alta: " + dateFecha +
                        "\nSalario: " + intSalario +
                        "\nComision: " + intComision +
                        "\nDepartamento: " + intDept1);
                System.out.println("------------------");

            }


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
