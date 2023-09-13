package tema8.ejerciciosPropuestos.ejerciciosPropuestos818;

public class ColaDoble extends Cola {
	public void encolarPrincipio(int intElem) {
		this.insertarPrincipio(intElem);
	}
	
	public Integer desencolarFinal() {
		Integer intDevolver = null;
		
		if(this.elementos()>0) {
			intDevolver = this.elemento(this.elementos()-1);
			this.eliminarPosicion(this.elementos()-1);
		}
		return(intDevolver);
	}
}
