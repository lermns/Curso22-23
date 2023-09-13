package tema7.ejerciciosResueltos.ejerciciosResueltos710.personal;

public class Mecanico {
	private String strNombre;
	private String strTelefono;
	private enum Especialidad{FRENOS, HIDRAULICA, ELECTRICIDAD, MOTOR};
	private Especialidad especialidadMecanico;
	
	
	public Mecanico(String strNombre, String strTelefono, String strEspecialidad) {
		this.strNombre = strNombre;
		this.strTelefono = strTelefono;
		this.especialidadMecanico = Especialidad.valueOf(strEspecialidad);
	}
}
