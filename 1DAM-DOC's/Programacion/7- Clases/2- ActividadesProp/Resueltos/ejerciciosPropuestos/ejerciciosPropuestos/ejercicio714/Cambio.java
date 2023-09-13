package tema7.ejerciciosPropuestos.ejercicio714;

public class Cambio {
	private static final double[] rlnArrValores= {500,200,100,50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01};
		
	public static void darCambio(double rlnCambio) {
		for(int intCont=0, intMonedas=0;intCont<Cambio.rlnArrValores.length && rlnCambio>0; intCont++) {
			intMonedas=(int) (rlnCambio/Cambio.rlnArrValores[intCont]);
			if(intMonedas>0) {
				rlnCambio%=Cambio.rlnArrValores[intCont];
				System.out.println(intMonedas + " de " + Cambio.rlnArrValores[intCont] + "€ resto " + rlnCambio);
			}
		}
	}
}
