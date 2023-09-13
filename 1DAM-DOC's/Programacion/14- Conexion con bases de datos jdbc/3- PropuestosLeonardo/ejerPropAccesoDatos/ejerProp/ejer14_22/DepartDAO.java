package ejerProp.ejer14_22;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

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

    public static ArrayList<Depart> read(int intIdent) {//
        String sql = "SELECT dept_no, loc " +
                "FROM depart";
        ArrayList<Depart> list1 = new ArrayList<>();

        try {
            Connection con = conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int intDeptNo = resultSet.getInt("dept_no");
                String strLoc = resultSet.getString("loc");

                Depart emp1 = new Depart(intDeptNo, strLoc);
                list1.add(emp1);
            }

            Iterator<Depart> iter = list1.iterator();
            while (iter.hasNext()) {
                Depart emp = iter.next();
                if (emp.getIntDeptNo() <= intIdent) {
                    iter.remove();
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }
        return list1;
    }
}
