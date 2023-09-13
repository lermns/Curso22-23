package tema4;

public class EjercicioResuelto2 {
	public static void imprimeNumerosEntreDos(int intNum1, int intNum2) {
		int intMayor=intNum1>intNum2?intNum1:intNum2;
		int intMenor=intNum1<intNum2?intNum1+1:intNum2+1;
		
		while(intMenor<intMayor)
			System.out.println(intMenor++);
	}
	
	public static void main(String[] args) {
		imprimeNumerosEntreDos(2,7);

	}

}
