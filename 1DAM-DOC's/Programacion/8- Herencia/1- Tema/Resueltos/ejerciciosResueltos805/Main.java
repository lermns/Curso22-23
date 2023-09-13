package tema8.ejerciciosResueltos.ejerciciosResueltos805;

import tema8.ejerciciosResueltos.ejerciciosResueltos804.*;

public class Main {
	public static void main(String[] args) {
		Piano musicaPiano = new Piano();
	
		for(int intCont=0;intCont<10; intCont++)
			musicaPiano.add(dameNota());
		
		musicaPiano.interpretar();
	}

	private static Nota dameNota() {
		Nota nota= Nota.DO;
		switch((int)(Math.random()*7)){
			case 1-> nota = Nota.DO;
			case 2-> nota = Nota.RE;
			case 3-> nota = Nota.MI;
			case 4-> nota = Nota.FA;
			case 5-> nota = Nota.SOL;
			case 6-> nota = Nota.LA;
			case 0-> nota = Nota.SI;
		}
		return nota;
	}
}
