package ejerProp.ejer14_17;

public class Main {

    public static void main(String[] args) {

        Empleado emple1;

        emple1 = new Empleado(1010, "Diaz", "niño", 7070, 1200, 60, 20);
        EmpleadoDAO.create(emple1);//Se llama a la clase porque su metodo es estatico.
    }
}
