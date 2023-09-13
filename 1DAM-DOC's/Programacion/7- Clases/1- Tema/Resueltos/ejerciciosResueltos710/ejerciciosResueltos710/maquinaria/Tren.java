package tema7.ejerciciosResueltos.ejerciciosResueltos710.maquinaria;

import java.util.Arrays;
import java.util.Scanner;

import tema7.ejerciciosResueltos.ejerciciosResueltos710.personal.Maquinista;

public class Tren {
	private Locomotora locomotora;
	private Vagon[] arrVagon;
	private Maquinista maquinistaEncargado;
	private final static int _NUMMAXIMOVAGONES = 5;
	
	public Tren(Locomotora locomotora, Maquinista maquinistaEncargado) {
		this.locomotora = locomotora;
		this.maquinistaEncargado = maquinistaEncargado;
		this.arrVagon = new Vagon[0];
	}
	
	public void annadirVagon() {
		int intNumIdentific;
		int intCargaMax;
		int intCargaAct;
		String strTipoMercancia;
		Scanner scnLeer = new Scanner(System.in);

		//si no esta lleno de vagones el tren permito insertar mas
		if(Tren._NUMMAXIMOVAGONES>this.arrVagon.length) {
			System.out.print("Dame el número de identificación del nuevo vagón asignado al tren: ");
			intNumIdentific = scnLeer.nextInt();
			System.out.print("Dame la carga máxima del nuevo vag�n: ");
			intCargaMax = scnLeer.nextInt();
			intCargaAct=0;//como es nuevo entiendo que no lleva nada por el momento
			strTipoMercancia="";
			this.arrVagon = Arrays.copyOf(this.arrVagon, this.arrVagon.length+1);
			this.arrVagon[this.arrVagon.length-1] = new Vagon(intNumIdentific, intCargaMax, intCargaAct, strTipoMercancia);
		}
		scnLeer.close();
	}

	@Override
	public String toString() {
		String strDevuelve = "Tren [locomotora=" + locomotora + ", arrVagon=" + Arrays.toString(arrVagon) + ", maquinistaEncargado="
				+ maquinistaEncargado + "]";
		for(Vagon elemento:this.arrVagon)
			strDevuelve += "\n\t" + elemento.toString();
			
		return strDevuelve;
	}

	
}
