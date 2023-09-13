package aaa.e1415;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main (String [] args) {
		String strUsuario = "root";
		String strContraseña = "admin";
		String strURL = "jdbc:mysql://localhost:3306/java";
		Scanner scnLn = new Scanner (System.in);
		/*String[] strArrDatos = {"apellido", "oficio", "número"};
		for(int intCont=0; intCont<strArrDatos.length; intCont++) {
			System.out.print("Dame el " + strArrDatos[intCont] + " del empleado: ");
			strArrDatos[intCont] = scnLn.nextLine();
		}*/
			
		System.out.println("Inserte el NÚMERO del empleado:");
		Empleado objEmpleado = new Empleado(Integer.parseInt(scnLn.nextLine()));
		System.out.println("Inserte el oficio del empleado:");
		objEmpleado.setOFICIO(scnLn.nextLine());
		System.out.println(objEmpleado);

		try (Connection c = DriverManager.getConnection(strURL, strUsuario, strContraseña); 
				Statement s = c.createStatement()) {
			
			//Ahora, queremos añadir un empleado desde 0, tendremos que meter todos sus datos, menos la fecha de entrada, que será la actual:
			System.out.println("Inserte el apellido del empleado:");
			String strApellido = scnLn.nextLine();
			System.out.println("Inserte el oficio del empleado:");
			String strOficio = scnLn.nextLine();
			System.out.println("Inserte el NÚMERO del empleado:");
			int intNum = scnLn.nextInt();
			System.out.println("Inserte el numero del director del empleado:");
			int intDIR = scnLn.nextInt();
			System.out.println("Inserte el SALARIO del empleado:");
			int intSalario = scnLn.nextInt();
			System.out.println("Inserte la comisión del empleado:");
			int intCom = scnLn.nextInt();
			System.out.println("Inserte el número de departamento del empleado:");
			int intDept = scnLn.nextInt();
			scnLn.close();
			
			//Creamos la variable de la fecha de forma que sea la fecha actual.
			LocalDate fecha = LocalDate.now(); //Si lo hago de esta forma, no puede ser de tipo date, tiene que ser localdate.
			
			//Una vez insertados todos los datos, lo que haremos será insertarlos directamente a través de una sentencia, no hará falta crear ningún objeto ni nada como el DAO.
			String strSentencia = "INSERT INTO emple VALUES (" + intNum + ", '" + strApellido + "', '" + strOficio + "', "
			+ intDIR + ", '" + fecha + "', " + intSalario + ", " + intCom + ", " + intDept + ")";
			/*CUIDADO CON LAS STRINGS, VARCHAR2, VA ENTRE '', ERROR TÍPICO*/
			
			//Ahora metemos directamente la sentencia a través del execute.
			s.executeUpdate(strSentencia); //Añadimos la sentencia.
			//Sería una insercción rápida y sencilla.
			
		} catch (SQLException e) {
			System.out.println("Error de conexión a la base de datos.");
			e.printStackTrace();
		}
	}
}