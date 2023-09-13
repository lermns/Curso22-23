package tema9.ejerciciosResueltos.ejercicioResuelto906;

import java.util.Scanner;

public interface Cola {
	public Integer pop();
	public void push(int intElemento);
	
	default void encolarMultiple() {
		Scanner scnLeer = new Scanner(System.in);
		Integer intNum, intElemento;

		System.out.println("Inserción múltiple");
		System.out.print("Dame el elemento a insertar: ");
		intElemento = scnLeer.nextInt();		
		System.out.print("Dame el número de veces que quieres insertar el elemento: ");
		intNum = scnLeer.nextInt();
		scnLeer.close();
		
		for (int intCont=0; intCont<intNum; intCont++)
			this.push(intElemento);
	}
	
}
