package tema8.ejemplos.libro;

public class Empleado extends Persona {
	double rlnSalario;
	
	@Override //se sustituye al método de la clase padre
	void mostrarDatos() {
		System.out.println(this.strNombre);
		System.out.println(this.btyEdad);
		System.out.println(this.rlnEstatura);
		System.out.println(this.rlnSalario);
	}
}
