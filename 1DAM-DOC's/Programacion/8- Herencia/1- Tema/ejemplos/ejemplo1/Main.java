package tema8.ejemplos.ejemplo1;

public class Main {

	public static void main(String[] args) {
		Persona prueba = new Persona("María", 22, "5678");
		Informatico programador = new Informatico("Pepe", 24, 1, "1234", "Programación", 0);

		//programador = prueba; no se si la persona es informático, por eso da error
		//programador = (Informatico)prueba; //le obligo a que sea informático y así si que me deja

		System.out.println(programador);
		prueba=programador;
		System.out.println(prueba);

	}

}
