package ejerProp.ejer14_19;



public class Main {
    public static void main(String[] args) {

        System.out.println(EmpleadoDAO.read(20));
        System.out.println(EmpleadoDAO.read(10));
        EmpleadoDAO.changeDeptNo(10, 20);
        System.out.println(EmpleadoDAO.read(20));
        System.out.println(EmpleadoDAO.read(10));
    }
}
