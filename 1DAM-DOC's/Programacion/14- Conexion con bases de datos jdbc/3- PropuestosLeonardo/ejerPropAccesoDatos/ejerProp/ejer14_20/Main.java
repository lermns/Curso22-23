package ejerProp.ejer14_20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Empleado emp = new Empleado(7934);

        EmpleadoDAO.delete(emp.getIntEmpNo());*/

        System.out.println("ingrese el numero del empleado para borrarlo de la base de datos.");
        int intEmpNo = new Scanner(System.in).nextInt();
        EmpleadoDAO.delete(intEmpNo);

    }
}
