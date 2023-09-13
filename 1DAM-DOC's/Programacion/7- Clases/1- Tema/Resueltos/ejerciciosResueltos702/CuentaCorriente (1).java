package tema7.ejerciciosResueltos.ejerciciosResueltos702;

public class CuentaCorriente {
	String strDni;
	String strNombre;
	double rlnSaldo;
	
	
	
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
	}

	public CuentaCorriente(String strDni, double rlnSaldo) {
		super();
		this.strDni = strDni;
		this.rlnSaldo = rlnSaldo;
	}

	private boolean sacarDinero(double rlnCantidad) {
		boolean blnDevolver=false;
		
		if(rlnCantidad<=this.rlnSaldo) {
			this.rlnSaldo-=rlnCantidad;
			blnDevolver=true;
			System.out.println("Saldo después de sacar dinero " + this.rlnSaldo);
		}else
			System.out.println("No tienes saldo para sacar " + rlnCantidad + "\nTu saldo actual es: " + this.rlnSaldo);

		return blnDevolver;
	}
	
	//en este caso no voy a usar this
	private void ingresarDinero(double rlnCantidad) {
		rlnSaldo+=rlnCantidad;
	}
	
	//sobrecarga directa del método toString por eclipse	
	@Override
	public String toString() {
		return "CuentaCorriente [strDni=" + strDni + ", strNombre=" + strNombre + ", rlnSaldo=" + rlnSaldo + "]";
	}

	public static void main(String[] args) {
		CuentaCorriente cuenta1=new CuentaCorriente("1234","Pepe",400);
		CuentaCorriente cuenta2=new CuentaCorriente("56789",200);
		
		System.out.println("Cuenta1:");
		System.out.println("Se puede sacar 300€ de la cuenta1? " + cuenta1.sacarDinero(300));
		cuenta1.ingresarDinero(2000);
		System.out.println("Se ingresan 2000€ en la cuenta1 y queda: " + cuenta1.toString());
		
		System.out.println("\n\nCuenta2:");
		System.out.println("Se puede sacar 300€ de la cuenta2? " + cuenta2.sacarDinero(300));
		cuenta2.ingresarDinero(2000);
		System.out.println("Se ingresan 2000€ en la cuenta2 y queda: " + cuenta2.toString());
	}

	



	

}
