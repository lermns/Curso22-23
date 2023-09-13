package ejerProp.ejer14_22;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Depart> list1;

        System.out.println("ingrese el numero del departamento: ");
        int intDept = new Scanner(System.in).nextInt();

        list1 = DepartDAO.read(intDept);

        System.out.println(list1);

    }
}
