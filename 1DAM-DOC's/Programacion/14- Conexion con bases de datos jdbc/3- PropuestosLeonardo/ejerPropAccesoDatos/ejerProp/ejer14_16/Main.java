package ejerProp.ejer14_16;

public class Main {

    public static void main(String[] args) {

        Empleado emple1;

        emple1 = new Empleado(7070, "Ramos", "DEV", 7369, 2500, 250, 20);
        EmpleadoDAO.create(emple1);//Se llama a la clase porque su metodo es estatico.
    }
}
