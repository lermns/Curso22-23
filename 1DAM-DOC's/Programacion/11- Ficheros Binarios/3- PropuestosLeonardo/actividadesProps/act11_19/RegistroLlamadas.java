package actividadesProps.act11_19;

import java.io.Serializable;
import java.time.LocalDate;

public class RegistroLlamadas  implements Serializable {
    private LocalDate fecha;
    private int cantidadLlamadas;

    public RegistroLlamadas(LocalDate fecha, int cantidadLlamadas){
        this.fecha = fecha;
        this.cantidadLlamadas = cantidadLlamadas;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public int getCantidadLlamadas(){
        return cantidadLlamadas;
    }

    public void mostrarDatos(){
        System.out.println("Cantidad de llamadas: " + getCantidadLlamadas() + ", Fecha: " + getFecha());
    }


}
