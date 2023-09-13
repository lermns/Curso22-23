package tema7.ejerciciosPropuestos.ejerciciosPropuestos17;

public class Cifrado {

	public static String cesar(String strTexto, int intDesplazamiento) {
		String strDevolver="";
		
		//lo he mirado todo como minúsculas, si quiero mirar las dos puedo duplicar con .isLowerCase(..)
		for(int intCont=0; intCont<strTexto.length();intCont++)
			strDevolver+=(char)((strTexto.charAt(intCont)+3)>'z'?(strTexto.charAt(intCont)+3)%'z'+'a'-1:(strTexto.charAt(intCont)+3));
		
		return strDevolver;
	}

}
