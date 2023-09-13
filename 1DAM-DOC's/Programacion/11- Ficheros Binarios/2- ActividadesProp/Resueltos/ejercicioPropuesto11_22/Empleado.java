package tema11.ejerciciosPropuestos.ejercicioPropuesto11_22;

import java.io.Serializable;

public class Empleado implements Serializable {

    final String dni;
    String nombre;
    double sueldo;

    public Empleado(String dni) {//Para las búsquedas
        this.dni = dni;
    }

    public Empleado(String dni, String nombre, double sueldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public boolean equals(Object o) {
        return dni.equals(((Empleado) o).dni);
    }

    @Override
    public String toString() {
        return "Empleado{" + "dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + "}\n";
    }
    
    

}
