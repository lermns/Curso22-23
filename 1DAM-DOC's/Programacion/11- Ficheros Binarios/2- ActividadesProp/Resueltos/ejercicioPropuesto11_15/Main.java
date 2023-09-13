package tema11.ejerciciosPropuestos.ejercicioPropuesto11_15;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;


public class Main {

	public static void main(String[] args) {
				
		try(ObjectInputStream fInput = new ObjectInputStream(new FileInputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_15/numeros.dat"));
			ObjectOutputStream fOutPares = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_15/pares.dat"));
			ObjectOutputStream fOutImpares = new ObjectOutputStream(new FileOutputStream("src/tema11/ejerciciosPropuestos/ejercicioPropuesto11_15/impares.dat"))){
			
			try {
				for(int intValor;true;) {
					intValor= fInput.readInt();
					if(intValor%2==0) {
						fOutPares.writeInt(intValor);
						System.out.println("par " + intValor);
					}else{
						fOutImpares.writeInt(intValor);
						System.out.println("impar " + intValor);
					}
				}
			}catch (EOFException eof){System.out.println("No hay más números");}
		} catch (IOException e) {System.out.println("Error de lectura");}
	}

}
