package tema7.ejerciciosPropuestos.ejercicio715;

public class Calendario {
	private int intAnno;
	private int intMes;
	private int intDia;

	public Calendario(int intAnno, int intMes, int intDia) {
		if(Calendario.fechaOK(intDia, intMes, intAnno)) {
			this.intAnno = intAnno;
			this.intMes = intMes;
			this.intDia = intDia;
		}else
			System.out.println("La fecha introducida " + intDia + "/" + intMes + "/" + intAnno + " no es correcta, objeto vacío creado");
	}

	public void incrementarDia() {
		this.intDia++;
		if(!Calendario.fechaOK(this.intDia, this.intMes, this.intAnno)) {//si la fecha no es correcta es que me he pasado, dejo el d�a en 1 e incremento el mes
			this.intDia=1;
			this.incrementarMes();
		}
	}

	public void incrementarMes() {
		this.intMes++;
		if(this.intMes>12) {//si el mes es mayor de 12, lo dejo  1 e incremento el a�o
			this.intMes=1;
			this.incrementarAño(1);
		}		
	}

	public void incrementarAño(int intCantidad) {
		this.intAnno+=intCantidad;
		if(this.intAnno==0)//lo de que el año 0 no existio...
			this.intAnno=1;
	}

	private static boolean fechaOK(int intDia, int intMes, int intAnno) {
		boolean blnDevuelve=false;
		
		if(intDia>0 && intMes>0 && intMes<13) {//comprobamos que el d�a y mes sean mayor de 0 y el mes menor de 13
			if(((intMes==4 || intMes==6 || intMes==9 || intMes==11) && intDia<31) || //si es un mes de 30 d�as
			   (intMes==2 && (intDia<29 ||(intDia==29 && Calendario.bisiesto(intAnno)))) || //si es febrero
			   ((intMes==1 || intMes==3 || intMes==5 || intMes==7|| intMes==8 || intMes==10 || intMes==12) && intDia<32))//si es un mes de 31
					blnDevuelve=true;
		}
		
		return blnDevuelve;
	}

	private static boolean bisiesto(int intAnno) {//es bisiesto si es divisible entre 4 y no entre 100 o
		return (intAnno%4==0 && intAnno%100!=0) || (intAnno%100==0 && intAnno%400==0);//si es divisible entre 100 y 400
	}

	public void mostrar() {
		System.out.println( this.intDia + "/" + this.intMes + "/" + this.intAnno);
	}

	public boolean equals(Calendario fecha) {
		return this.intAnno==fecha.intAnno && this.intDia==fecha.intDia && this.intMes==fecha.intMes;
	}

	public int getIntDia() {
		return this.intDia;
	}
	
	
}
