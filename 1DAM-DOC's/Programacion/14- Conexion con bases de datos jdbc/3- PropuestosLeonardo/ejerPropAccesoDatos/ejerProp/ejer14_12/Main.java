package ejerProp.ejer14_12;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        String usuario = "root";
        String password = "admin";
        String url = "jdbc:mysql://localhost:3306/prueba";
        String sql = "select * from depart";
        Collection<String> lista = new ArrayList<>();

        try(Connection connection = DriverManager.getConnection(url, usuario, password);
            PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int intDepart = resultSet.getInt(1);
                String strNombre = resultSet.getString(2);
                String strLocalidad = resultSet.getString(3);
                String strDep = "Departamento: " + intDepart +
                                " | Nombre: " + strNombre +
                                " | Localidad: " + strLocalidad + "\n";
                lista.add(strDep);
            }
            System.out.println(lista);

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
