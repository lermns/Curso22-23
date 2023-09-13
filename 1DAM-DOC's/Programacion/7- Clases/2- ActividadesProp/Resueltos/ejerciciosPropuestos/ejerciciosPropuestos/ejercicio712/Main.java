package tema7.ejerciciosPropuestos.ejercicio712;

public class Main {

	public static void main(String[] args) {
		//EcuacionSeg ecuacion = new EcuacionSeg(1,-5,6);
		EcuacionSeg ecuacion = new EcuacionSeg(1,6,9);
		
		
		ecuacion.impimirResultado();
		ecuacion.setRlnB(6);
		ecuacion.setRlnC(9);
		ecuacion.impimirResultado();
		ecuacion.setRlnA(3);
		ecuacion.impimirResultado();

	}

}
