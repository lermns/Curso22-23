package tema6;

public class PruebasTema6Character {

	public static void main(String[] args) {
		System.out.println("compara cadenas" + "hola".compareTo("hoaa"));

		char chr0='0', chrEspacio=' ', chra='a', chrB='B', chrPorCiento='%';
		System.out.println("¿Son un dígitos los siguientes caracteres?  Character.isDigit( ) "); 
		System.out.println("  " + chr0 + " " + Character.isDigit(chr0));
		System.out.println("  " + chra + " " + Character.isDigit(chra));
		System.out.println("  " + chrPorCiento + " " + Character.isDigit(chrPorCiento));
		
		System.out.println("¿\nSon un letras los siguientes caracteres?  Character.isLetter( ) "); 
		System.out.println("  " + chr0 + " " + Character.isLetter(chr0));
		System.out.println("  " + chra + " " + Character.isLetter(chra));
		System.out.println("  " + chrPorCiento + " " + Character.isLetter(chrPorCiento));

		System.out.println("\n¿Son números o letras los siguientes caracteres?  Character.isLetterOrDigit( ) "); 
		System.out.println("  " + chr0 + " " + Character.isLetterOrDigit(chr0));
		System.out.println("  " + chra + " " + Character.isLetterOrDigit(chra));
		System.out.println("  " + chrPorCiento + " " + Character.isLetterOrDigit(chrPorCiento));

		System.out.println("\n¿Son un letras minusculas los siguientes caracteres?  Character.isLowerCase( ) "); 
		System.out.println("  " + chrB + " " + Character.isLowerCase(chrB));
		System.out.println("  " + chra + " " + Character.isLowerCase(chra));
		System.out.println("  " + chrPorCiento + " " + Character.isLowerCase(chrPorCiento));

		System.out.println("\n¿Son un letras mayúsculas los siguientes caracteres?  Character.isUpperCase( ) "); 
		System.out.println("  " + chrB + " " + Character.isUpperCase(chrB));
		System.out.println("  " + chra + " " + Character.isUpperCase(chra));
		System.out.println("  " + chrPorCiento + " " + Character.isUpperCase(chrPorCiento));
		
		System.out.println("\n¿Son un espacio en blanco los siguientes caracteres?  Character.isWhitespace( ) "); 
		System.out.println("  " + chr0 + " " + Character.isWhitespace(chr0));
		System.out.println("  " + chrEspacio + " " + Character.isWhitespace(chrEspacio));
		System.out.println("  " + chrPorCiento + " " + Character.isWhitespace(chrPorCiento));

		System.out.println("\nSi es un caracter, se convierte a minúscula  Character.toLowerCase( ) "); 
		System.out.println("  " + chrB + " " + Character.toLowerCase(chrB));
		System.out.println("  " + chra + " " + Character.toLowerCase(chra));
		System.out.println("  " + chrPorCiento + " " + Character.toLowerCase(chrPorCiento));

		System.out.println("\nSi es un caracter, se convierte a mayúscula  Character.toUpperCase( ) "); 
		System.out.println("  " + chrB + " " + Character.toUpperCase(chrB));
		System.out.println("  " + chra + " " + Character.toUpperCase(chra));
		System.out.println("  " + chrPorCiento + " " + Character.toUpperCase(chrPorCiento));

		String strCadena1="Hola Mundo", strCadena2="HOLA MUNDO", strCadena3="un", strBlancos="   Esto   es   una   prueba   ";
		System.out.println("\nSon iguales las cadenas \"" + strCadena1 + "\" y \"" + strCadena2 + "\" " + strCadena1.equals(strCadena2));
		System.out.println("Son iguales, sin tener en cuenta las mayúsculas las cadenas \"" + strCadena1 + "\" y \"" + strCadena2 + "\" strCadena1.equalsIgnoreCase(strCadena2) " + strCadena1.equalsIgnoreCase(strCadena2));
		System.out.println("Se encuentra en la cadena \"" + strCadena1 + "\" posición 6 la cadena \"" + strCadena3 + "\" en la posición 0, siendo dos caracteres iguales strCadena1.regionMatches(6, strCadena3, 0, 2)" + strCadena1.regionMatches(6, strCadena3, 0, 2));
		System.out.println("Orden alfabético de las cadenas \"" + strCadena1 + "\" y \"" + strCadena3 + "\" strCadena1.compareTo(strCadena2) " + strCadena1.compareTo(strCadena2));
		System.out.println("Orden alfabético de las cadenas \"" + strCadena1 + "\" y \"" + strCadena3 + "\" strCadena1.compareToIgnoreCase(strCadena2) " + strCadena1.compareToIgnoreCase(strCadena2));

		System.out.println("Concatenar las cadenas \"" + strCadena1 + "\" y \"" + strCadena3 + "\" strCadena1.concat(strCadena2) " + strCadena1.concat(strCadena2));
		System.out.println("Concatenar las cadenas \"" + strCadena1 + "\" y \"" + strCadena3 + "\" usando \"" + strCadena1+strCadena2);
		System.out.println("Caracter 5 de la cadena \"" + strCadena1 + "\" charAt(5)" + strCadena1.charAt(5));
		System.out.println("Subcadena de la cadena \"" + strCadena1 + "\" desde la posición 5 substring(5)" + strCadena1.substring(5));
		System.out.println("Subcadena de la cadena \"" + strCadena1 + "\" desde la posición 5 y 3 caracteres substring(5,3)" + strCadena1.substring(5,8));
		System.out.println("Quital los espacios en blanco de la cadena \"" + strBlancos + "\" " + strBlancos.strip() + "\"");
		System.out.println("Quital los espacios en blanco del principio de la cadena \"" + strBlancos + "\"" + strBlancos.stripLeading() + "\"");
		System.out.println("Quital los espacios en blanco del final de la cadena \"" + strBlancos + "\"" + strBlancos.stripTrailing() + "\"");
	}

}
