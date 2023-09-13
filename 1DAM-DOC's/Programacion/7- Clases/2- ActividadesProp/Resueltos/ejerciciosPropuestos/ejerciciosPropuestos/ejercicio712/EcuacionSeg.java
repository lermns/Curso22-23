package tema7.ejerciciosPropuestos.ejercicio712;

public class EcuacionSeg {
	private double rlnA;
	private double rlnB;
	private double rlnC;
	
	public EcuacionSeg(double rlnA, double rlnB, double rlnC) {
		super();
		this.rlnA = rlnA;
		this.rlnB = rlnB;
		this.rlnC = rlnC;
	}

	public boolean positivoDiscriminante() {
		return this.discriminante()<0?false:true;
	}

	private double discriminante() {
		return this.rlnB*this.rlnB-(4*this.rlnA*this.rlnC);
	}
	
	public void setRlnC(double rlnC) {
		this.rlnC = rlnC;
	}

	public void setRlnA(double rlnA) {
		this.rlnA = rlnA;
	}

	public void setRlnB(double rlnB) {
		this.rlnB = rlnB;
	}
	
	public double[] resultado() {
		double[] rlnDevuelve= {};
		if(this.discriminante()==0) {
			rlnDevuelve= new double[1];
			rlnDevuelve[0]=-this.rlnB/(2*this.rlnA);
		}else if(this.positivoDiscriminante()){
					rlnDevuelve= new double[2];
					rlnDevuelve[0]=(Math.sqrt(this.discriminante())-this.rlnB)/(2*this.rlnA);
					rlnDevuelve[1]=(-Math.sqrt(this.discriminante())-this.rlnB)/(2*this.rlnA);
			  }
			
		return rlnDevuelve;
	}
	
	private static String signo(double rlnNumero) {
		String strNumero="";
		
		//convierto el número a una cadena con el signo, salvo si es 1 o -1 que no dejo nada
		if(rlnNumero<0 && rlnNumero!=-1.0)
			strNumero=Double.toString(-rlnNumero);
		else if(rlnNumero>0 && rlnNumero!=1.0)
				strNumero=Double.toString(rlnNumero);
		
		return rlnNumero<0?("-" + strNumero):("+" + strNumero);
	}
	
	public void impimirResultado() {
		double[] rlnDevuelve=this.resultado();
		
		System.out.println("Resultado de la ecuación " + EcuacionSeg.signo(this.rlnA) + "x" + (char)178 + EcuacionSeg.signo(this.rlnB) + "x" + EcuacionSeg.signo(this.rlnC) + this.rlnC);
		if(rlnDevuelve.length==0)
			System.out.println("La ecuación no tiene solución real");
		else if(rlnDevuelve.length==1)
				System.out.println("Resultado x: " + rlnDevuelve[0]);
			 else {
				System.out.println("Resultado x1: " + rlnDevuelve[0]);
				System.out.println("Resultado x2: " + rlnDevuelve[1]);
			 }
	}
}
