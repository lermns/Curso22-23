import java.util.Scanner;

public class Dia {
	/* Programa que muestra en letra el día de la semana pasado por teclado*/
	public static void main(String[] args) {
		Scanner scLeer = new Scanner(System.in); //para la entrada de datos 
		int intDia; //números a comparar
		
		System.out.print("Dame el día de la semana: ");
		intDia = scLeer.nextInt();
		
		switch(intDia) {
			case 1:{
					System.out.print("Lunes");
					break;
			  		}

			case 2:{
					System.out.print("Martes");
					break;
			  		}
			case 3:{
					System.out.print("Miércoles");
					break;
			  		}
			case 4:{
					System.out.print("Jueves");
					break;
			  		}
			case 5:{
					System.out.print("Viernes");
					break;
					}
			case 6:{
					System.out.print("Sábado");
					break;
			  		}
			case 7:{
					System.out.print("Domingo");
					break;
			  		}
			default:
					System.out.print("Valor leido no válido");
		}
	}

}