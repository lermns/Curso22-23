package tema7.ejerciciosResueltos.ejerciciosResueltos703;

//ya ten�a la clase en los ejercicios anteriores como public
public class CuentaCorriente {
	String strDni;
	public String strNombre;
	private double rlnSaldo;
	
	
	
	public CuentaCorriente(String strDni, String strNombre) {
		this(strDni,strNombre, 0);
	}

	public CuentaCorriente(String strDni, String strNombre, double rlnSaldo) {
		this.strDni = strDni;
		this.strNombre = strNombre;
		this.rlnSaldo = rlnSaldo;
	}

	public CuentaCorriente(String strDni, double rlnSaldo) {
		this(strDni,"",rlnSaldo);
	}

	boolean sacarDinero(double rlnCantidad) {
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
	void ingresarDinero(double rlnCantidad) {
		rlnSaldo+=rlnCantidad;
	}
	
	//sobrecarga directa del m�todo toString por eclipse	
	@Override
	public String toString() {
		return "CuentaCorriente [strDni=" + strDni + ", strNombre=" + strNombre + ", rlnSaldo=" + rlnSaldo + "]";
	}	

}
