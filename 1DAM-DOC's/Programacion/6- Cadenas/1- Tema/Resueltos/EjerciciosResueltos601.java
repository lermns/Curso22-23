package tema6.ejerciciosResueltos;

public class EjerciciosResueltos601 {

	public static void main(String[] args) {
		for(int intCont=0;intCont<0x181;intCont++) {
			System.out.print("\\u" + Integer.toHexString(intCont) + " " + (char)intCont + "\t");
			if(intCont%8==0)
				System.out.println();
		}

	}

}
