package tema8.ejerciciosPropuestos.ejerciciosPropuestos822;

import java.util.Arrays;

public class Prueba {
	private static int intCont=0;
	
	@Override
	public void finalize() {
		System.out.println("Objeto eleiminado " + this + " número: " + Prueba.intCont++);
		if(Prueba.intCont == 10)
			System.exit(0);
	}
}
