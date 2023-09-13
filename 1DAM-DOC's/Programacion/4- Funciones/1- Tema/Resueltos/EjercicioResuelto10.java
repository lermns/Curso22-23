package tema4;

import java.util.Scanner;

public class EjercicioResuelto10 {
	public static double iterativa(double rlnNum, int intNum) {
		double rlnPotencia=1;
		for(;intNum>0;intNum--)
			rlnPotencia*=rlnNum;
		return rlnPotencia;
	}
	
	public static double recursiva(double rlnNum, int intNum) {
		if(intNum>0) {
			System.out.println("llama recursiva(" + rlnNum + ", " + (intNum-1) + ")");
			return(recursiva(rlnNum,intNum-1)*rlnNum);
		}
		else
			return 1;
	}
	
	public static void main(String[] args) {
		int intExponente;
		double rlnBase;
		Scanner scnLeer = new Scanner(System.in);
		
		System.out.println("Dame la base");
		rlnBase=scnLeer.nextDouble();
		do {
			System.out.println("Dame el exponente");
			intExponente=scnLeer.nextInt();
		}while(intExponente<0);
		
		scnLeer.close();
		
		System.out.println("Resultado iterativo: "+ iterativa(rlnBase, intExponente));
		System.out.println("Resultado recursivo: "+ recursiva(rlnBase, intExponente));
	}

}
