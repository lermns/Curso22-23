package tema7.ejerciciosResueltos.ejerciciosResueltos705;

//ya ten�a la clase en los ejercicios anteriores como public
public class CuentaCorriente {
	String strDni;
	public String strNombre;
	private double rlnSaldo;
	private static String strNombreBanco = "Banco IES Luis Braille";
	private Gestor gestor;
	
	public static String getStrNombreBanco() {
		return strNombreBanco;
	}

	public static void setStrNombreBanco(String strNombreBanco) {
		CuentaCorriente.strNombreBanco = strNombreBanco;
	}

	public CuentaCorriente(String strDni, String strNombre) {
		this(strDni, strNombre, 0, null);
	}

	public CuentaCorriente(String strDni, String strNombre, double rlnSaldo, Gestor gestor) {
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.rlnSaldo = rlnSaldo;
		this.gestor =gestor;
	}

	public CuentaCorriente(String strDni, double rlnSaldo) {
		this(strDni, "", rlnSaldo, null);
	}

	boolean sacarDinero(double rlnCantidad) {
		boolean blnDevolver=false;
		
		if(rlnCantidad<=this.rlnSaldo) {
			this.rlnSaldo-=rlnCantidad;
			blnDevolver=true;
			System.out.println("Saldo despu�s de sacar dinero " + this.rlnSaldo);
		}else
			System.out.println("No tienes saldo para sacar " + rlnCantidad + "\nTu saldo actual es: " + this.rlnSaldo);

		return blnDevolver;
	}
	
	//en este caso no voy a usar this
	void ingresarDinero(double rlnCantidad) {
		rlnSaldo+=rlnCantidad;
	}
	
	//sobrecarga directa del método toString por eclipse	
	@Override
	public String toString() {
		String strAux;
		
		if(this.gestor==null)
			strAux="nulo";
		else
			strAux=this.gestor.toString();
		
		return "CuentaCorriente [strNombreBanco=" + CuentaCorriente.strNombreBanco + ", strDni=" + this.strDni + ", strNombre=" + this.strNombre + ", rlnSaldo=" + this.rlnSaldo + ", gestor= "+ strAux + "]";
		//return "CuentaCorriente [strNombreBanco=" + CuentaCorriente.strNombreBanco + ", strDni=" + this.strDni + ", strNombre=" + this.strNombre + ", rlnSaldo=" + this.rlnSaldo + ", gestor= "+ (this.gestor==null?"nulo":this.gestor.toString()) + "]";
	}
}
