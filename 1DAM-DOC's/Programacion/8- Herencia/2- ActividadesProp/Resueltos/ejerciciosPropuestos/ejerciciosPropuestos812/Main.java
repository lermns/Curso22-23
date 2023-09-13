package tema8.ejerciciosPropuestos.ejerciciosPropuestos812;

package tema8.ejerciciosPropuestos.ejerciciosPropuestos812;

public class Main {
	public static void main(String[] args) {
		Caja embalaje = new Caja(4,3,2,"c/Luis Braille",Unidad.CM);
	
		System.out.println("Volumen de la caja: " + embalaje.getVolumen());
		embalaje.setEtiqueta("Esto es una prueba de más de 30 caracteres");
		System.out.println(embalaje);
		System.out.println("Esto es una prueba de más de 30 caracteres".substring(0,3));
	}
}