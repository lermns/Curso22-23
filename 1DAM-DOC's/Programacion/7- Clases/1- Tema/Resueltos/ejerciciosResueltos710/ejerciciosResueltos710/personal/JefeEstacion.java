package tema7.ejerciciosResueltos.ejerciciosResueltos710.personal;

import java.util.Date;

public class JefeEstacion {
	private String strNombre;
	private final String strDni;
	private Date fechaNombramiento;
	
	public JefeEstacion(String strNombre, String strDni) {
		this.strNombre = strNombre;
		this.strDni = strDni;
		this.fechaNombramiento = new Date();
	}

	public Date getFechaNombramiento() {
		return fechaNombramiento;
	}
	
}
