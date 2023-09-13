package ejerProp.ejer14_18;

import java.sql.*;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

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
        Connection con = conectar();
        String sql = "select emp_no from emple where emp_no = ?";
        boolean blnVerifi = false;
        try{PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setInt(1, intEmpNo);

            ResultSet resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                con.close();
                blnVerifi = true;
            }else {
                con.close();
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return blnVerifi;
    }

    private static boolean departExist(int intDeptNo){
        Connection con = conectar();
        String sql = "select dept_no from emple";
        boolean blnVeriDept = false;
        ArrayList<Integer> listDept = new ArrayList<>();

        try{PreparedStatement preparedStatement = con.prepareStatement(sql);

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                int intDep = resultSet.getInt("dept_no");
                listDept.add(intDep);
            }

            if(listDept.contains(intDeptNo)){
                con.close();
                blnVeriDept = true;
            }else {
                con.close();
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
        return blnVeriDept;
    }
    
    public static void create(Empleado emple) {
        Connection con = conectar();
        
        String sql = "INSERT INTO emple (EMP_NO, APELLIDO, OFICIO, DIR,  FECHA_ALT, SALARIO, COMISION, DEPT_NO) " +
                     "             VALUES ( ?,      ?,        ?,    ?,        ?,        ?,        ?,       ?  )";

        try {
            if(verificar(emple.getIntEmpNo()) && departExist(emple.getIntDeptNo())) {

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
                if(!verificar(emple.getIntEmpNo())){
                    System.out.println("el empleado con numero: " + emple.getIntEmpNo() + " ya existe.");
                    con.close();
                }else if(!departExist(emple.getIntDeptNo())){
                    System.out.println("El numero de departamento: " + emple.getIntDeptNo() + " no existe en la base de datos.");
                    con.close();
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al insertar.");
        }
    }
}
