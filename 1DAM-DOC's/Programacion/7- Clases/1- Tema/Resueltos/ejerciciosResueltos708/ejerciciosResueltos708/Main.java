package tema7.ejerciciosResueltos.ejerciciosResueltos708;

public class Main {

	public static void main(String[] args) {
		RadioFM radio1 = new RadioFM();
		RadioFM radio2 = new RadioFM(200);
		
		System.out.print("radio con frecuencia por defecto ");
		radio1.display();
		System.out.print("radio con frecuencia inicial 200 ");
		radio2.display();
		System.out.print("radio baja frecuencia de ");
		radio1.display();
		radio1.down();
		radio1.display();
		
		System.out.print("radio sube frecuencia ");
		radio2.display();
		radio2.up();
		radio2.display();

	}

}
