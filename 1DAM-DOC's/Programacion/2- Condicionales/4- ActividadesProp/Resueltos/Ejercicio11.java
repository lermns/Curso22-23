package tema2;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		byte bty1, bty2, bty3, bty4;//dígitos del número
		short shrNum;//número dado por el usuario
		Scanner scnLeer = new Scanner(System.in);
		

		System.out.print("Dame el número ");
		shrNum = scnLeer.nextShort();

		bty1 = (byte) (shrNum / 1000);
		bty2 = (byte) ((shrNum/100) % 10);
		bty3 = (byte) ((shrNum/10) % 10);
		bty4 = (byte) (shrNum % 10);
		
		if((shrNum>=1000 && bty1==bty4  && bty2==bty3)	|| //con 4 cifras c1=c4 y c2=c3
		   (shrNum>=100  && shrNum<1000 && bty2==bty4)	|| //con 3 cifras c2=c4
		   (shrNum>=10   && shrNum<100  && bty3==bty4))	   //con 2 cifras c3=c4
			System.out.println("Es capicua");
		else
			System.out.println("No es capicua");
	}

}
