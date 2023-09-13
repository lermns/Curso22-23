package tema12.ejerciciosPropuestos.ejercicioPropuestoto12_28;
import java.util.Objects;

public class Carta implements Comparable<Carta> {//si no meto comparable no puedo usar sort

	private final static String[] STRVALOR = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
	private final static String[] STRPALO = {"bastos", "copas", "espadas", "oros"};
  
  private String strNumero;
  private String strPalo;

  public Carta() {
    this.strNumero = STRVALOR[(int)(Math.random()*10)];
    this.strPalo = STRPALO[(int)(Math.random()*4)];
  }
  
  public String getNumero() {
    return strNumero;
  }

  public String getPalo() {
    return strPalo;
  }

  @Override
  public String toString() {
    return this.strNumero + " de " + this.strPalo;
  }
  
  @Override
  public boolean equals(Object obj) {
	  if (obj == null || //si el objeto con el que me quiero comparar es nulo o no es de mi clase
    	this.getClass() != obj.getClass()) 
		  return false; 

    if (Objects.equals(this.strNumero, ((Carta)obj).strNumero) &&
    	Objects.equals(this.strPalo, ((Carta)obj).strPalo))
      return true;
    
    return false;
  }

	@Override
	public int compareTo(Carta objCarta) {
		if (this.strPalo.equals(objCarta.getPalo())) //si el palo es igual, comparo por n�mero
		    //si no miro el �ndice me dir� que cinco es menor de tres y cuatro (onden cadena)  
			return Carta.indice(this.strNumero).compareTo(Carta.indice(objCarta.getNumero()));
		else // si no es igual, devuelvo cual es mayor
		      return this.strPalo.compareTo(objCarta.getPalo());
	}

	/*Devuelve el valor del �ndice de la cadena del n�mero*/
	private static Integer indice(String strNumero) {
		int intCont;
		for(intCont=0; intCont<Carta.STRVALOR.length && !Carta.STRVALOR[intCont].equals(strNumero);intCont++);
		if(intCont==Carta.STRVALOR.length)
			return null;
		else
			return intCont;
	}
}

