package tema7.ejerciciosPropuestos.ejercicio711;

public class MarcaPagina {
	private int intPaginaLeida;

	public int getIntPaginaLeida() {
		return intPaginaLeida;
	}

	public void incrementarPaginaLeida() {
		this.intPaginaLeida++;
	}

	public void comenzarPrincipio() {
		this.intPaginaLeida=0;
	}

	
	public String toString() {
		return "MarcaPagina [intPaginaLeida=" + intPaginaLeida + "]";
	}
	
}
