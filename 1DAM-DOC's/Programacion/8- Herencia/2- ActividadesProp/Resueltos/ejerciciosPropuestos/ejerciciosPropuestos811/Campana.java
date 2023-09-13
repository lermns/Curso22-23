package tema8.ejerciciosPropuestos.ejerciciosPropuestos811;

import tema8.ejerciciosResueltos.ejerciciosResueltos804.Instrumento;
import tema8.ejerciciosResueltos.ejerciciosResueltos804.Nota;

public class Campana extends Instrumento{

	@Override
	public void interpretar() {
		for(Nota nota:this.partitura) {
			switch(nota){
				case DO -> System.out.print("DODONG ");
				case RE -> System.out.print("ReDONG ");
				case MI -> System.out.print("mIDONG ");
				case FA -> System.out.print("FADONG ");
				case SOL -> System.out.print("SoLDONG ");
				case LA -> System.out.print("lADONG ");
				case SI -> System.out.print("SIDONG ");
			}
		}
		
	}

}