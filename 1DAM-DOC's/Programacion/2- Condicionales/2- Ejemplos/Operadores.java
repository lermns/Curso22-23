public class Operadores{
	public static void main(String[] args) {
		double rlnAux; //para ejercicios donde necesite un real
		
		//Operador asignación
		int intNum = 2;  //  a la variable num le asigna el valor 2
		String strNombre = "Juan"; // a la variable nombre le asigna el valor Juan
		boolean blnVerdad = true;  // a la variable verdad le asigna true
		System.out.println("Asignación intNum: " + intNum + "  strNombre: " + strNombre + " blnVerdad:  " + blnVerdad);
		intNum = 2;
		intNum += 3;
		System.out.println("\tSuma 2 += 3: " + intNum);
		intNum = 3;
		intNum -= 2;
		System.out.println("\tDiferencia 3 -= 2: " + intNum);
		intNum = 2;
		intNum *= 3;
		System.out.println("\tProducto 2 *= 3: " + intNum);
		intNum = 2;
		intNum /= 3;
		System.out.println("\tCociente 2 /= 3: " + intNum);
		intNum = 2;
		intNum %= 3;
		System.out.println("\tResto 2 %= 3: " + intNum);
		//Operador ternario
		strNombre = intNum>5?"Aprobado":"Suspenso";
		System.out.println("\n\tTernario nota con un 2: " + strNombre);
		intNum=7;
		strNombre = intNum>5?"Aprobado":"Suspenso";
		System.out.println("\tTernario nota con un 7: " + strNombre);

		//Operadores Aritméticos
		System.out.println("\nOperadores Aritméticos:");
		System.out.println("\tSuma 2 + 2 = " + (2+2));
		System.out.println("\tResta 4 - 2 = "+ (4-2));
		System.out.println("\tMultiplicación 4 * 3 = " + (4*3));
		System.out.println("\tDivisión 4 / 3 = " + (4/3));
		System.out.println("\tResto división 5 % 3 = " + (5%3) +
						   " Resto división 5.5 % 2.3 = " + (5.5%2.3));
		intNum=3;
		System.out.println("\tIncremento con prefijo del valor 3 = " + ++intNum);
		intNum=3;
		System.out.println("\tIncremento con postfijo del valor 3 = " + intNum++);
		
		//Operadores Relacionales
		System.out.println("\n\tEs 4 > 3 = " + (4>3));
		System.out.println("\tEs 4 < 3 = " + (4<3));
		System.out.println("\tEs 4 >= 4 = " + (4>=4));
		System.out.println("\tEs 4 <= 5 = " + (4<=5));
		System.out.println("\tEs 4 == 3 = " + (4==3));
		System.out.println("\tEs 4 == 4 = " + (4==4));
		System.out.println("\tEs 4 != 3 = " + (4!=3));
		System.out.println("\tEs 4 != 4 = " + (4!=4));
		
		//Operadores logícos
		System.out.println("\n\tEs 4 > 3 && 5 < 7 " + (4>3&&5<7));
		System.out.println("\tEs 4 < 3 && 5 < 7 " + (4<3&&5<7));
		System.out.println("\tEs 4 < 3 && 7 / 0 > 5 " + (4<3&&7/0>5));
		//System.out.println("\tEs 4 < 3 && 7 / 0 > 5 " + (4>3&&7/0>5));
		System.out.println("\tEs 4 < 3 || 5 < 7 " + (4<3||5<7));
		System.out.println("\tEs 4 < 3 || 5 > 7 " + (4<3||5>7));
		System.out.println("\tEs 4 < 3 || 7 / 0 > 5 " + (4>3||7/0>5));
		//System.out.println("\tEs 4 < 3 || 7 / 0 > 5 " + (4<3||7/0>5));
		System.out.println("\tLo contrario de la expresión anterior " + (!(4<3||5>7)));
		
		//Operadores a nivel de bit
		System.out.println("\n\t10 AND 12 a nivel de bit " + (10&12)); //1010 and 1100
		System.out.println("\t10 OR 12 a nivel de bit " + (10|12));
		System.out.println("\t10 XOR 12 a nivel de bit " + (10^12));
		System.out.println("\t10 desplazados a la izquierda (añadir) dos bits " + (10<<2));
		System.out.println("\t10 desplazados a la derecha (quitar) dos bits " + (10>>2));
		System.out.println("\t10 desplazados a la derecha en CA2 dos bits " + (10>>>2));
		System.out.println("\t10 desplazados a la derecha en CA2 dos bits " + (-1>>>2));
		
		//Errores del cálculo
		rlnAux = 1.0/10 + 2.0/10; //el resultado debería ser 3/10
		rlnAux *= 10; //ahora el resultado debería ser 3
		System.out.println("\nValor de la operación (1.0/10.0 + 2.0/10.0) * 10 = " + rlnAux);
		
	}
}