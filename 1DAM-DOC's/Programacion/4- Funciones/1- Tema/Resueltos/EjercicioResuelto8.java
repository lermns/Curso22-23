package tema4;

public class EjercicioResuelto8 {
	public static double calculadora(byte bytEleccion, int intNum1, int intNum2) {
		double rlnVuelta=0;//variable que devolvemos
		
		switch(bytEleccion) {
			case 1->rlnVuelta=intNum1+intNum2;
			case 2->rlnVuelta=intNum1-intNum2;
			case 3->rlnVuelta=intNum1*intNum2;
			case 4->rlnVuelta=intNum1/intNum2;
			default ->System.out.println("Elección no válida");
		}
		return rlnVuelta;
	}
	
	public static void main(String[] args) {
		System.out.println("Resultado: "+ calculadora((byte)3,2,3));

	}

}
