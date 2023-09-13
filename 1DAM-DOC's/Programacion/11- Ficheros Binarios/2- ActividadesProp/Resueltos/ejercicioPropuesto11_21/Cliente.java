package tema11.ejerciciosPropuestos.ejercicioPropuesto11_21;

import java.io.Serializable;
import java.util.Objects;

public class Cliente implements Serializable{

    final String strId;//el id es inmutable
    private String strNombre;
    private String strTelefono;

    public Cliente(String strId) {//Constructor para las búsquedas
        this.strId = strId;
    }

    public Cliente(String strId, String strNombre, String strTelefono) {
		super();
		this.strId = strId;
		this.strNombre = strNombre;
		this.strTelefono = strTelefono;
	}

	/*Identificación generada por netbeans basada en el id*/
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.strId, other.strId)) {
            return false;
        }
        return true;
    }

    public void setStrNombre(String strNombre) {
		this.strNombre = strNombre;
	}

	public void setStrTelefono(String strTelefono) {
		this.strTelefono = strTelefono;
	}

	@Override
    public String toString() {
        return "Cliente{" + "id=" + strId + ", nombre=" + strNombre
                + ", telefono=" + strTelefono + "}\n";
    }

}
