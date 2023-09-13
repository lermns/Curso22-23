package tema7.ejerciciosResueltos.ejerciciosResueltos709;

public class Bombilla {
	private boolean blnInteruptor;
	private static boolean blnInteruptorGeneral;

	public boolean estaEncendida() {
		return this.blnInteruptor && Bombilla.blnInteruptorGeneral;
	}
	
	public void encender() {
		this.blnInteruptor = true;
	}
	
	public void apagar() {
		this.blnInteruptor = false;
	}
	
	public static void pulsarGeneral() {
		Bombilla.blnInteruptorGeneral = !Bombilla.blnInteruptorGeneral;
	}
}
