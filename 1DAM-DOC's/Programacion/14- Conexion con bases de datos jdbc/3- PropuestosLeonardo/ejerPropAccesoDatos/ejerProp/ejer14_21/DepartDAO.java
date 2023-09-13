package ejerProp.ejer14_21;

import java.sql.*;
import java.util.ArrayList;

public class DepartDAO {

    private static Connection conectar() {
        Connection con=null;

        String url = "jdbc:mysql://localhost:3306/prueba";
        try {
            con = DriverManager.getConnection(url, "root", "admin");
        } catch (SQLException ex) {
            System.out.println("Error al conectar al SGBD.");
        }

        return con;
    }

    public static ArrayList<Depart> read() {
        String sql = "SELECT dept_no, dnombre, loc " +
                "FROM depart";
        ArrayList<Depart> list1 = new ArrayList<>();
        try {
            Connection con = conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int intDeptNo = resultSet.getInt("dept_no");
                String strDnombre = resultSet.getString("dnombre");
                String strLoc = resultSet.getString("loc");

                Depart emp1 = new Depart(intDeptNo, strDnombre, strLoc);
                list1.add(emp1);
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }
        return list1;
    }
}
