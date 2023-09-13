package ejerProps.ejer12_26;

import java.util.*;

public class Main {
    public static void main(String [] args){
        List<String> listaGrupos = new ArrayList<>();
        int intNumGrup;
        String strNombres;

        System.out.println("Ingrese la cantidad de grupos que habra para repartir a los alumnos: ");
        intNumGrup = new Scanner(System.in).nextInt();
        System.out.println("Ahora ingrese los nombres de los alumnos a añadir, para salir escriba \"fin\"");
        do{
            strNombres = new Scanner(System.in).nextLine();
            if(!strNombres.equals("fin")){
                listaGrupos.add(strNombres);
            }
        }while(!strNombres.equals("fin"));

        List<List<String>> gruposAlum = repartoAlumnos(listaGrupos, intNumGrup);

        /*System.out.println(gruposAlum);*/

        for (int i = 0; i < intNumGrup; i++) {
            System.out.println("Grupo " + (i + 1) + " : " + gruposAlum.get(i));
        }
    }


    public static List<List<String>> repartoAlumnos(List<String> lista, int intNumGrupos){
        List<List<String>> grupoAlum = new ArrayList<>();
        int intGrupo=0;

        for(int i = 0; i< intNumGrupos; i++){
            grupoAlum.add(new ArrayList<String>());
        }
        Collections.shuffle(lista);

        for(String alumno:lista){
            grupoAlum.get(intGrupo).add(alumno);
            intGrupo = (intGrupo+1) % intNumGrupos;
        }
        return grupoAlum;
    }
}
