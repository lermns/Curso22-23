package tema8.ejerciciosPropuestos.ejerciciosPropuestos824;

import tema8.ejerciciosPropuestos.ejerciciosPropuestos823.Poligono;

public class Main {

	public static void main(String[] args) {
		Poligono[] figuras = {new Triangulo(2), new Cuadrado(2)};

		for(Poligono fig:figuras)
			System.out.println(fig);
	}

}
