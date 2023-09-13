package ejerProp.ejer14_15;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/prueba";
        String sql = "insert into emple (emp_no, apellido, oficio, dir, fecha_alt, salario, comision, dept_no) " +
                                " values ( ?,       ?,        ?,    ?,      ?,        ?,        ?,        ?)";

        Scanner sc = new Scanner(System.in);

        try(Connection connection = DriverManager.getConnection(url, usuario, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            System.out.println("Escriba el numero de empleado: ");
            int intNum = new Scanner(System.in).nextInt();

            System.out.println("El apellido del empleado: ");
            String strApellido =  new Scanner(System.in).nextLine().toUpperCase();

            System.out.println("Su oficio: ");
            String strOficio = new Scanner(System.in).nextLine();

            System.out.println("El numero de su director: ");
            int intDir = new Scanner(System.in).nextInt(); sc.nextLine();

            System.out.println("El salario del empleado: ");
            int intSalario = new Scanner(System.in).nextInt();

            System.out.println("Su comision: ");
            int intComision = new Scanner(System.in).nextInt();

            System.out.println("Su numero de departamento: ");
            int intDept = new Scanner(System.in).nextInt();

            preparedStatement.setInt(1, intNum);
            preparedStatement.setString(2, strApellido);
            preparedStatement.setString(3, strOficio);
            preparedStatement.setInt(4, intDir);
            preparedStatement.setDate(5, Date.valueOf(LocalDate.now()));
            preparedStatement.setInt(6, intSalario);
            preparedStatement.setInt(7, intComision);
            preparedStatement.setInt(8, intDept);

            preparedStatement.executeUpdate();

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
