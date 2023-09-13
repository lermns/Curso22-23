package examenOrdinariaMio;

public class Articulo implements Comparable<Articulo>{
	private int intID;
	private String strNombre;
	private int intSuministrador;
	private int intPrecio;
	public Articulo(int intID, String strNombre, int intSuministrador, int intPrecio) {
		super();
		this.intID = intID;
		this.strNombre = strNombre;
		this.intSuministrador = intSuministrador;
		this.intPrecio = intPrecio;
	}
	public int getIntID() {
		return this.intID;
	}
	public String getStrNombre() {
		return this.strNombre;
	}
	public int getIntSuministrador() {
		return this.intSuministrador;
	}
	public int getIntPrecio() {
		return this.intPrecio;
	}
	@Override
	public String toString() {
		return "[ID=" + this.intID + ", Nombre=" + this.strNombre + ", Precio=" + this.intPrecio + "]";
	}
	@Override
	public int compareTo(Articulo art2) {
		return this.intID-art2.getIntID();
	}
}
