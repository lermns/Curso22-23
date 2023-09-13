package tema10.ejemplos.ejemplo2;

public class Main {

	public static void main(String[] args) {
		int[] intArray = new int[10];
		
		try {
			for(int intCont=0; intCont>-1; intCont++) 
				intArray[intCont]=intCont;
		} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Fuera del margen del array");
			}
		
		for(int intValor:intArray)
			System.out.println(intValor);

	}

}
