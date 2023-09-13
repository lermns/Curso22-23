package ejerProp.ejer14_19;

import ejerResueltos.ejer14_11.Alumno;

import java.sql.*;
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

    public static void changeDeptNo(int BeforeDeptNo, int AfterDeptNo) {
        String strSQL = "UPDATE emple " +
                "SET dept_no = ? WHERE dept_no = ?";
        try {
            Connection con = conectar();
            PreparedStatement preparedStatement = con.prepareStatement(strSQL);

            preparedStatement.setInt(1, BeforeDeptNo);
            preparedStatement.setInt(2, AfterDeptNo);

            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un alumno.");
        }
    }
    public static ArrayList<Empleado> read(int intDept) {
        String sql = "SELECT emp_no, apellido, dept_no " +
                "FROM emple where dept_no = ?";
        ArrayList<Empleado> list1 = new ArrayList<>();
        try {
            Connection con = conectar();
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setInt(1, intDept);

            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int intEmp = resultSet.getInt("emp_no");
                String strApellido = resultSet.getString("apellido");
                int intDeptNo = resultSet.getInt("dept_no");

                Empleado emp1 = new Empleado(intEmp, strApellido, intDeptNo);
                list1.add(emp1);
            }

        } catch (SQLException ex) {
            System.out.println("Error al consultar un alumno.");
        }
        return list1;
    }
}
/*7499	ARROYO	VENDEDOR	7698	1990-02-20	1500	390	30
7521	SALA	VENDEDOR	7698	1991-02-22	1625	650	30
7566	JIMENEZ	DIRECTOR	7839	1991-04-02	2900		20
7654	MARTIN	VENDEDOR	7698	1991-09-29	1600  1020	30
7698	NEGRO	DIRECTOR	7839	1991-05-01	3005		30
7782	CEREZO	DIRECTOR	7839	1991-06-09	2885		10
7788	GIL	ANALISTA	7566	1991-11-09	3000		    20
7839	REY	PRESIDENTE		1991-11-17	4100		        10
7844	TOVAR	VENDEDOR	7698	1991-09-08	1350	0	30
7876	ALONSO	EMPLEADO	7788	1991-09-23	1430		20
7900	JIMENO	EMPLEADO	7698	1991-12-03	1335		30
7902	FERNANDEZ	ANALISTA	7566	1991-12-03	3000	20
7934	MUÑOZ	EMPLEADO	7782	1992-01-23	1690		10
7070	Ramos	DEV	7369	2023-05-21	2500	250	        20
1010	DIAZ	NIÑO	7070	2023-05-21	1200	60	    20
9090	BARRENOZO	MAMÁ	7070	2023-05-22	2000	130	20*/