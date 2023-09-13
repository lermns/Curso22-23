package w;

import java.util.Arrays;
import java.util.Scanner;

public class EjercicioPropuesto16 {
	
	public static void main(String[] args) {
		boolean[][] blnArrayTablero; //tablero de juego
		int intCasillas;//Numero de casillas del tablero
		Scanner scnLeer= new Scanner(System.in);
		
		System.out.print("¿Cuantas casillas quieres que tenga el tablero? ");
		intCasillas=scnLeer.nextInt();
		blnArrayTablero = new boolean[intCasillas][intCasillas];
		
		rellenaPintaTablero(blnArrayTablero);
		
		int intPosOrigen, intPosDestino;
		System.out.print("¿Desde donde te querrías mover (casilla origen)? ");
		intPosOrigen=scnLeer.nextInt();	
		System.out.print("¿A donde te querrías mover (casilla destino)? ");
		intPosDestino=scnLeer.nextInt();
		
		if(blnArrayTablero[intPosOrigen][intPosDestino] ||
				encuentraCamino(blnArrayTablero,intPosOrigen,intPosDestino))
			System.out.print("Se puede ir de la casilla " + intPosOrigen + " a la casilla " + intPosDestino);
		else
			System.out.print("Imposible ir de la casilla " + intPosOrigen + " a la casilla " + intPosDestino);
	}

	private static boolean encuentraCamino(boolean[][] blnArrayTablero, int intPosOrigen, int intPosDestino) {
		boolean blnExisteCamino=false;		
		int[] intArrDestinosPosibles=new int[1];
		boolean[] blnArrComprobados=new boolean[1];//lugares que ya he comprobado el destino
		
		intArrDestinosPosibles[0]=intPosOrigen;//Puede llegar a origen por ahora
		
		//se mira desde cada una de las posiciones donde podemos llegar a que otra podríamos llegar
		do {
			//paso por los valores que puedo comprobar y si no se han comprobado lo hago
			for(int intIndice=0; intIndice<intArrDestinosPosibles.length; intIndice++) {
				if(blnArrComprobados[intIndice]==false) {//si no se ha comprobado miramos todo lo comprobable desde el
					blnArrComprobados[intIndice]=true; //meto el elemento
					for(int intIndiceComprobar=0, intPosicionInsertar; intIndiceComprobar<blnArrayTablero[0].length; intIndiceComprobar++) {
						if(blnArrayTablero[intArrDestinosPosibles[intIndice]][intIndiceComprobar]) {//Si se puede llegar a ese destino
							intPosicionInsertar=Arrays.binarySearch(intArrDestinosPosibles, intIndiceComprobar);//miro si el destino ya lo tengo comprobado
							if(intPosicionInsertar<0) {//si no esta el elemento lo insertamos en orden
								intPosicionInsertar=-intPosicionInsertar-1;
								intArrDestinosPosibles=Arrays.copyOf(intArrDestinosPosibles, intArrDestinosPosibles.length+1);
								System.arraycopy(intArrDestinosPosibles, intPosicionInsertar, intArrDestinosPosibles, intPosicionInsertar+1, intArrDestinosPosibles.length-(intPosicionInsertar+1));
								intArrDestinosPosibles[intPosicionInsertar]=intIndiceComprobar;
								blnArrComprobados=Arrays.copyOf(blnArrComprobados, intArrDestinosPosibles.length);//tienen que tener la misma dimensión
								System.arraycopy(blnArrComprobados, intPosicionInsertar, blnArrComprobados, intPosicionInsertar+1, intArrDestinosPosibles.length-(intPosicionInsertar+1));
								blnArrComprobados[intPosicionInsertar]=false;
							}
						}							
					}
				}
			}
			System.out.println("Destinos alcanzables " + Arrays.toString(intArrDestinosPosibles));
		}while(seguirComprobandoDestinos(blnArrComprobados));
		return blnExisteCamino;
	}
	
	//devuelve false si no esta todo comprobado en el array
	private static boolean seguirComprobandoDestinos(boolean[] blnArrComprobados) {
		boolean blnEncontrado=true;
		int intIndice;//para el recorrido del array
		
		for(intIndice=0; intIndice<blnArrComprobados.length && blnArrComprobados[intIndice]; intIndice++);
		if(intIndice<blnArrComprobados.length)//si hemos salido del bucle sin llegar al final es que es falso
				blnEncontrado=false;
		
		return blnEncontrado;
	}

	private static void rellenaPintaTablero(boolean[][] blnArrayTablero) {
		for(int intIndiceY=0; intIndiceY<blnArrayTablero[0].length;intIndiceY++)
			System.out.print("\t" + intIndiceY);
		System.out.println();
		
		for(int intIndiceX=0; intIndiceX<blnArrayTablero.length;intIndiceX++) {
			System.out.print(intIndiceX);
			for(int intIndiceY=0; intIndiceY<blnArrayTablero[0].length;intIndiceY++) {
				if(intIndiceX==intIndiceY ||Math.random()>0.5)
					blnArrayTablero[intIndiceX][intIndiceY]=true;
				else 
					blnArrayTablero[intIndiceX][intIndiceY]=false;
				System.out.print("\t" + blnArrayTablero[intIndiceX][intIndiceY]);
			}
			System.out.println();
		}
	}

}
