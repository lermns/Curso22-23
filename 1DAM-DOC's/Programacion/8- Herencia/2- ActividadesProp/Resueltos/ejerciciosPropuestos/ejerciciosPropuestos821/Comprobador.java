package tema8.ejerciciosPropuestos.ejerciciosPropuestos821;

import java.util.Arrays;

public class Comprobador {
	public static boolean esNumero (Object ob) {
		return (ob!=null && ob.getClass().getSuperclass().getName().equals("java.lang.Number"));
		//return (ob!=null && ob instanceof Number);
		//return (ob!=null && "ByteIntegerFloatDoubleLong".contains(ob.getClass().getName().replace('.', ':').split(":")[2]));
	}
	
	private static boolean esCadena (Object ob) {
		return (ob!=null && "String".contains(ob.getClass().getName().replace('.', ':').split(":")[2]));
	}
	
	public static boolean sumar (Object a, Object b) {
		boolean blnDevolver = true;
		
		if(esNumero(a) && esNumero(b))//si son números imprimo la suma
			System.out.print((Double.parseDouble(a.toString())+Double.parseDouble(b.toString())) + " ");
		else if(esCadena(a) && esCadena(b))//si son cadenas
				System.out.print((String)a + (String)b + " ");
			 else {
				System.out.print("No sumables ");
				blnDevolver = false;
			 }
			
		return blnDevolver;
	}
}
