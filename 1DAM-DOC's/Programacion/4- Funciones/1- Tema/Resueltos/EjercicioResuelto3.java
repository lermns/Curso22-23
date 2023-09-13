package tema4;

public class EjercicioResuelto3 {
	/*************************************************************
	 * 
	 * @param byte bytEleccion -> 1 devuelve area y 2 el volumen *
	 * @param int intRadio -> de la base del cilindro			 *
	 * @param int intAltura -> del cilindro						 *
	 *************************************************************/
	public static double areaVolumenCilindro(byte bytEleccion, int intRadio, int intAltura) {
		double rlnVuelta=0;//variable que devolvemos
		
		switch(bytEleccion) {
			case 1->rlnVuelta=2*Math.PI*intRadio*(intRadio+intAltura);
			case 2->rlnVuelta=Math.PI*intRadio*intRadio*intAltura;
			default ->System.out.println("Elección no válida");
		}
		return rlnVuelta;
	}
	
	public static void main(String[] args) {
		double rlnArea = areaVolumenCilindro((byte)1,2,3);
		System.out.println("Area del cilindro: "+ rlnArea);
		System.out.println("Volumen del cilindro: "+ areaVolumenCilindro((byte)2,2,3));

	}

}
