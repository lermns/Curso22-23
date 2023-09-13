package tema12.ejerciciosPropuestos.ejercicioPropuesto12_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] strArrAlumnos = {"pepe","juan","nicolas","godofredo","alcestes","eudes","clotario","agnan","ana"};
		List<String> lista = Arrays.asList(strArrAlumnos);
		
		strArrAlumnos =null;
		System.out.println(repartoAlumnos(lista,4));
	}

	public static List<List<String>> repartoAlumnos(List<String> lista, int intNumGrupos){
		List<List<String>> listaGrupos = new ArrayList<>();
		List<String> grupo = new ArrayList<>();
		int intLista=0;
		
		for(int intCont=0; intCont<intNumGrupos; intCont++)//para cada grupo añado una lista
			listaGrupos.add(new ArrayList<>());
		
		for(String strAlumno:lista) {//para cada alumno de la lista
			listaGrupos.get(intLista).add(strAlumno);//lo añado a la lista pertinente
			intLista++;
			intLista%=intNumGrupos;
		}
		
		return listaGrupos;
	}
}
