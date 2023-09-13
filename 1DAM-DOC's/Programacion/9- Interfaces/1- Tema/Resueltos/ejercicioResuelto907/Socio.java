package tema9.ejerciciosResueltos.ejercicioResuelto907;

import java.util.Objects;

public class Socio implements Comparable{
	private int intId;
	private String strNombre;
	
	public Socio(int intId, String strNombre) {
		this.intId = intId;
		this.strNombre = strNombre;
	}


	public int compareTo(Object o) {
		return (this.strNombre.compareTo(((Socio)o).strNombre))==0?this.intId-((Socio)o).intId:this.strNombre.compareTo(((Socio)o).strNombre);
	}

	@Override
	public String toString() {
		return "Socio [intId=" + intId + ", strNombre=" + strNombre + "]";
	}
	
}
