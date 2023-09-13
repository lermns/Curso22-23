package tema4.propuestos;

import java.util.Scanner;

public class EjercicioPropuesto17 {
	public static int sumaAmigos(int intNum) {
		int intAcumulador = 0;
		
		for(int intCont=1;intCont<intNum;intCont++)
			if(intNum%intCont==0)
				intAcumulador += intCont;
		
		return intAcumulador;
	}
	
	public static void main(String[] args) {
		int intNumero1, intNumero2;
		
		System.out.println("Dame un Numero");
		intNumero1 = new Scanner(System.in).nextInt();
		System.out.println("Dame un Numero");
		intNumero2 = new Scanner(System.in).nextInt();
		
		if(sumaAmigos(intNumero1)==intNumero2 && sumaAmigos(intNumero2)==intNumero1)
			System.out.println("Los números " + intNumero1 + " y " + intNumero2 + " son amigos");
		else

			System.out.println("Los números " + intNumero1 + " y " + intNumero2 + " no son amigos");
	}

}
