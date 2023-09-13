package actividadesProps.act11_22;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class Empleado implements Serializable {
    private String strDNI;
    private String strNombre;
    private double dblSueldo;

    public Empleado(String strDNI, String strNombre, double dblSueldo){
        this.strDNI = strDNI;
        this.strNombre = strNombre;
        this.dblSueldo = dblSueldo;
    }

    public void setStrDNI(String strDNI) {
        this.strDNI = strDNI;
    }

    public String getStrDNI() {
        return strDNI;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setDblSueldo(double dblSueldo) {
        this.dblSueldo = dblSueldo;
    }

    public double getDblSueldo() {
        return dblSueldo;
    }

    public void mostrarDatos() {
        System.out.println("Dni: " + getStrDNI() + ", Nombre: " + getStrNombre() + ", Sueldo: " + getDblSueldo());
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) { // comprobar si son el mismo objeto en memoria
            return true;
        }

        if (!(obj instanceof Empleado)) { // comprobar si es de la misma clase
            return false;
        }

        Empleado empleado = (Empleado) obj; // conversión explícita
        return Objects.equals(strNombre, empleado.strNombre) && Objects.equals(strDNI, empleado.strDNI) && Objects.equals(dblSueldo, empleado.dblSueldo); // comparación de atributos
    }

}
