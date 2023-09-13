package ejerProp.ejer14_18;

public class Main {

    public static void main(String[] args) {

        Empleado emple1;

        emple1 = new Empleado(9090, "Barrenozo", "mamá", 7070, 2000, 130, 20);
        EmpleadoDAO.create(emple1);//Se llama a la clase porque su metodo es estatico.
    }
}
