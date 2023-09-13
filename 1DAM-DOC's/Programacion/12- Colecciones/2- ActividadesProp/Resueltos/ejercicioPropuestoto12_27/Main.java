package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_27;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		TreeMap <String,String> tmVerbos = new TreeMap<String,String>();
		int intAciertos = 0;
		int intTotal=0;
		char chrContinuar = 's';
		Scanner scnLeer = new Scanner(System.in);
		
		tmVerbos.put("be", "was");
		tmVerbos.put("beat", "beat");
		tmVerbos.put("begin", "began");
		tmVerbos.put("bend", "bent");
		tmVerbos.put("bite", "bit");
		
		System.out.println("Pon el pasado simple de los siguientes verbos");
		for(Map.Entry<String, String> verbo:tmVerbos.entrySet()) {
			System.out.println(verbo.getKey());
			if(verbo.getValue().equalsIgnoreCase(scnLeer.nextLine()))
				intAciertos++;
		}
		System.out.println("Has tenido " + intAciertos +" aciertos y " + (5-intAciertos) + " fallos");
		
		//n aleatorios
		String[] arrStrClaves = (String[]) tmVerbos.keySet().toArray(new String[0]);
		do {
			int intAux = (int)(Math.random()*(arrStrClaves.length-1));
			System.out.println("Pon el pasado simple de " + arrStrClaves[intAux]);
			if(tmVerbos.get(arrStrClaves[intAux]).equalsIgnoreCase(scnLeer.nextLine()))
				intAciertos++;
			System.out.println("Quieres continuar (s,n)");
			chrContinuar = scnLeer.nextLine().charAt(0);
			intTotal++;
		}while(chrContinuar=='s');
		System.out.println("Has tenido " + intAciertos +" aciertos y " + (intTotal-intAciertos) + " fallos");
	}

}
