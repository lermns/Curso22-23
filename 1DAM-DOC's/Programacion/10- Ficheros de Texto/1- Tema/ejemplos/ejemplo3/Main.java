package tema10.ejemplos.ejemplo3;

public class Main {
	public static void main(String[] args) {
		  metodo2();
		  System.out.println("Se sale el método 3 en el return" + metodo3());
		}

		public static void metodo() throws ArithmeticException {
		  int intA=-3,intB=0;

		  intA/=intB;
		  System.out.println("División: " + intA);
		}

		public static void metodo2() {
		  try {
			metodo();
		  }
		  catch(ArithmeticException expAritmetica) {
			System.out.println("División entre 0 capturada en método 2");
		  } 
		}

		public static int metodo3() {
		  try {
			System.out.println("Entra en el método 3");
			return 1;//comprobamos que se sale desde esta posición
		  }
		  catch(Exception ex) {
			System.out.println("Excepción capturada en método 3");
		  }
		  finally {
			System.out.println("Ejecución del finally en método 3");
		  }

		  return 2;//Lanza el finally al terminar el try
		}

}
