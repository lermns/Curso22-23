package tema12.ejerciciosResueltos.ejercicioResuelto12_16;

public class Academico implements Comparable<Academico> {

    private String strNombre;
    private int intAnioIngreso;

    public Academico(String strNombre, int intAnioIngreso) {
        this.strNombre = strNombre;
        this.intAnioIngreso = intAnioIngreso;
    }

    public int getAnioIngreso() {
		return intAnioIngreso;
	}

	@Override
    public int compareTo(Academico o) {
        return this.strNombre.compareTo(o.strNombre);
    }

    @Override
    public String toString() {
        return "Academico{" + "nombre=" + strNombre + ", año de ingreso=" + intAnioIngreso + "}\n";
    }
}
