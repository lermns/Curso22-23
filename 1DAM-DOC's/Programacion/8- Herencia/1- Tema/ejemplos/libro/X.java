package tema8.ejemplos.libro;

public class X {//todos los atributos son visibles dentro de la propia clase
	private int intA;//invisible fuera de la clase
	int intB;//visiblidad por defecto. Visible para clases vecinas y heredadas
	protected int intC;//visible para heredadas aunque sean externas
	public int intD;//visiblidad completa vecinos, heredados y externas 
					//(en estas últimas hay que importar la clase)
}
