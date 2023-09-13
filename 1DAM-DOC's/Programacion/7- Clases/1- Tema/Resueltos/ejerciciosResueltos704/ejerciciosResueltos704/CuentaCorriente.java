package tema7.ejerciciosResueltos.ejerciciosResueltos704;

//ya ten�a la clase en los ejercicios anteriores como public
public class CuentaCorriente {
	String strDni;
	public String strNombre;
	private double rlnSaldo;
	private static String strNombreBanco;
	
	
	public static String getStrNombreBanco() {
		return strNombreBanco;
	}

	public static void setStrNombreBanco(String strNombreBanco) {
		CuentaCorriente.strNombreBanco = strNombreBanco;
	}

	public CuentaCorriente(String strDni, String strNombre) {
		super();
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.rlnSaldo=0;
	}

	public CuentaCorriente(String strDni, String strNombre, double rlnSaldo) {
		super();
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.rlnSaldo = rlnSaldo;
		//doy nombre por defecto
		if(strNombreBanco == null)
			CuentaCorriente.strNombreBanco="Banco IES Luis Braille";
	}

	public CuentaCorriente(String strDni, double rlnSaldo) {
		super();
		this.strDni = strDni;
		this.rlnSaldo = rlnSaldo;
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
	
	//sobrecarga directa del m�todo toString por eclipse	
	@Override
	public String toString() {
		return "CuentaCorriente [strNombreBanco=" + CuentaCorriente.strNombreBanco + ", strDni=" + this.strDni + ", strNombre=" + this.strNombre + ", rlnSaldo=" + this.rlnSaldo + "]";
	}

	public static void main(String[] args) {
		CuentaCorriente cuenta1=new CuentaCorriente("1234","Pepe",400);
		CuentaCorriente cuenta2=new CuentaCorriente("56789",200);
		
		System.out.println("Cuenta1:");
		System.out.println("Se puede sacar 300� de la cuenta1? " + cuenta1.sacarDinero(300));
		cuenta1.ingresarDinero(2000);
		System.out.println("Se ingresan 2000� en la cuenta1 y queda: " + cuenta1.toString());
		
		System.out.println("\n\nCuenta2:");
		System.out.println("Se puede sacar 300� de la cuenta2? " + cuenta2.sacarDinero(300));
		cuenta2.ingresarDinero(2000);
		System.out.println("Se ingresan 2000� en la cuenta2 y queda: " + cuenta2.toString());
		
		//acceso a los atributos de las cuentas
		System.out.println("Intento sacar el saldo de la cuenta1 directamente " + cuenta1.rlnSaldo);

	}

	



	

}
