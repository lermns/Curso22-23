package aaa.act11_20;

import java.io.Serializable;

public class Cliente implements Serializable {
    private int intID;
    private String strNombre;
    private int intTelf;

    public Cliente(int intID, String strNombre, int intTelf){
        this.intID = intID;
        this.strNombre = strNombre;
        this.intTelf = intTelf;
    }

    public int getIntID(){
        return intID;
    }

    public void setIntID(int intID) {
        this.intID = intID;
    }

    public void setIntTelf(int intTelf) {
        this.intTelf = intTelf;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrNombre(){
        return strNombre;
    }
    public int getIntTelf(){
        return intTelf;
    }

    public void mostrarDetalles(){
        System.out.println("Nombre " + getStrNombre() + ", ID: " + getIntID() + ", Teléfono: " + getIntTelf());
    }

	@Override
	public String toString() {
		return "ID=" + intID + ", Nombre=" + strNombre + ", Teléfono=" + intTelf ;
	}
    
}
