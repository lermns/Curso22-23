package tema7.ejerciciosResueltos.ejerciciosResueltos710.maquinaria;

public class Vagon {
	private final int intNumIdentific;
	private int intCargaMax;
	private int intCargaAct;
	private String strTipoMercancia;
	
	public Vagon(int intNumIdentific, int intCargaMax, int intCargaAct, String strTipoMercancia) {
		this.intNumIdentific = intNumIdentific;
		this.intCargaMax = intCargaMax;
		this.intCargaAct = intCargaAct;
		this.strTipoMercancia = strTipoMercancia;
	}

	@Override
	public String toString() {
		return "Vagon [intNumIdentific=" + intNumIdentific + ", intCargaMax=" + intCargaMax + ", intCargaAct="
				+ intCargaAct + ", strTipoMercancia=" + strTipoMercancia + "]";
	}
	
	
}
