package examenOrdinariaMio;

public class Cliente extends Persona {
	private String strPassword;
	
	public Cliente(String strNif, String strPassword) {
		if(strNif.length()==8 && strNif.chars().allMatch( Character::isDigit ))//solo si es número de 8 dígitos
			this.intNif = Integer.parseInt(strNif);
		if(strPassword.length()<15 && strPassword.length()>0)
			this.strPassword = strPassword;
	}

	public Integer getNif() {
		return this.intNif;
	}

	public String getPassword() {
		return this.strPassword;
	}

	public String getNombre() {
		return this.strNombre;
	}

	public String getDireccion() {
		return this.strDireccion;
	}

	public void setNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public void setPassword(String strPassword) {
		this.strPassword = strPassword;
	}

	@Override
	public String toString() {
		return "Cliente [Nif=" + this.intNif + ", Nombre=" + this.strNombre + ", Password=" + this.strPassword
				+ ", Direccion=" + this.strDireccion + "]";
	}
	
	
}
