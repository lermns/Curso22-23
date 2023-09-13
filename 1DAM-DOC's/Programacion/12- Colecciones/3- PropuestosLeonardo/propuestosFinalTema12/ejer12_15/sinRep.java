package ejerProps.ejer12_15;


import java.util.ArrayList;
import java.util.List;

public class sinRep {
    public static <T> List<T> reverse(List<T> lista) {
        List<T> listaSinRepeticiones = new ArrayList<>();
        for (T elemento : lista) {
            if (!listaSinRepeticiones.contains(elemento)) {
                listaSinRepeticiones.add(elemento);
            }
        }
        return listaSinRepeticiones;
    }
}