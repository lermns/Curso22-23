package tema7.ejerciciosPropuestos.ejercicio715;

public class Main {
	public static void main(String[] args) {
		Calendario fecha = new Calendario(2022,12,31);
		
		if(fecha.getIntDia()==0)
			fecha=null;
		else {
			fecha.mostrar();
			fecha.incrementarDia();
			fecha.mostrar();
			fecha.incrementarMes();
			fecha.mostrar();
			fecha.incrementarAño(2);
			fecha.mostrar();
		}
	}
}
