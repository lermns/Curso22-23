package tema10.ejerciciosPropuestos.ejercicioPropuesto10_21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Agenda {
	private Persona[] listado;
	private int intCantidad;

	public Agenda() {
		String[] arrStrElemento = null;
		String strCadena = null;
		BufferedReader br = null;
		
		this.listado = new Persona[0];
		this.intCantidad=0;
		
		try {
			br = new BufferedReader(new FileReader("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_21/guarda.txt"));
		} catch (IOException e) {}
		if(br!=null) {
			try {
				strCadena = br.readLine();
			} catch (IOException e) {}
			while(strCadena!=null) {
				arrStrElemento=strCadena.split(":");
				this.aniadePersona(arrStrElemento[0],arrStrElemento[1]);
				try {
					strCadena = br.readLine();
				} catch (IOException e) {}
			}
			try {
				br.close();
			} catch (IOException e) {}
		}
	}

	public void aniadePersona(String strNombre, String strTelefono) {
		if(this.intCantidad==20)
			System.out.println("La agenda está llena y no se puden meter más personas");
		else if(buscar(strNombre)) 
				System.out.println("Ya existe una persona con el nombre " + strNombre);
			 else {
				this.listado = Arrays.copyOf(this.listado, this.listado.length+1);
				this.listado[this.listado.length-1] = new Persona(strNombre, strTelefono);
				this.intCantidad++;
			 }
	}

	private boolean buscar(String strNombre) {
		int intCont=0;
		
		while (intCont<this.listado.length && !this.listado[intCont].equals(strNombre))
			intCont++;
		return intCont<this.listado.length;//si lo ha encontrado ser� menor que la logitud del array
	}

	@Override
	public String toString() {
		Arrays.sort(this.listado);
		return Arrays.toString(listado);
	}

	public void mostrarPrincipio(String strCadena) {
		for(int intCont=0; intCont<this.listado.length; intCont++) {
			if(strCadena.equals(listado[intCont].getStrNombre().substring(0,strCadena.length())))
				System.out.println(intCont + " " + listado[intCont]);
		}
		
	}

	public void guardar() {
		BufferedWriter bw = null;
		if(this.intCantidad>0) {
			try {
				bw = new BufferedWriter(new FileWriter("src/tema10/ejerciciosPropuestos/ejercicioPropuesto10_21/guarda.txt"));
			} catch (IOException e) {
				System.out.println("No se ha podido guardar los datos, fallo de escritura");
			}
			if(bw!=null) {
				for(int intCont=0; intCont<this.listado.length; intCont++) {
					try {
						bw.write(this.listado[intCont].guarda());
						bw.newLine();
					} catch (IOException e) {}
				}
				try {
					bw.close();
				} catch (IOException e) {}
			}
		}
	}

}
