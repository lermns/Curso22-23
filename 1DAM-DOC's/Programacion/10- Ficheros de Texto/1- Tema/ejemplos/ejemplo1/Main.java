package tema10.ejemplos.ejemplo1;

public class Main {

	public static void main(String[] args) {
		int intA=5, intB=0;
		
		try {
			System.out.println(intA/intB);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
