import java.util.Scanner;

public class Nota {
	public static void main(String[] args) {
		Scanner scLeer = new Scanner(System.in); //para la entrada de datos 
		double rlnExamen, rlnPracticas; //notas obtenidas por el alumno
		
		System.out.print("Dame la nota del examen: ");
		rlnExamen = scLeer.nextDouble();
		System.out.print("Dame la nota de las prácticas: ");
		rlnPracticas = scLeer.nextDouble();
		
		switch((int)(rlnPracticas*0.3+rlnExamen*0.7)) {
			case 0,1,2,3,4:{
					System.out.println("Suspenso");
					break;
			  		}

			case 5:{
					System.out.println("Aprobado");
					break;
			  		}
			case 6:{
					System.out.println("Bien");
					break;
			  		}
			case 7,8:{
					System.out.println("Notable");
					break;
			  		}
			case 9,10:{
					System.out.println("Sobresaliente");
					break;
					}

			default:
					System.out.println("Valor leido no válido");
		}
		
	}
}
