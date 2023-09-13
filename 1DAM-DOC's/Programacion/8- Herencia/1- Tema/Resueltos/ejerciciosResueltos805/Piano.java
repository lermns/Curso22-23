package tema8.ejerciciosResueltos.ejerciciosResueltos805;

import tema8.ejerciciosResueltos.ejerciciosResueltos804.*;

public class Piano extends Instrumento{

	@Override
	public void interpretar() {
		for(Nota nota:this.partitura) {
			switch(nota){
				case DO -> System.out.print("DO ");
				case RE -> System.out.print("Re ");
				case MI -> System.out.print("mI ");
				case FA -> System.out.print("FA ");
				case SOL -> System.out.print("SoL ");
				case LA -> System.out.print("lA ");
				case SI -> System.out.print("SI ");
			}
		}
		
	}

}
