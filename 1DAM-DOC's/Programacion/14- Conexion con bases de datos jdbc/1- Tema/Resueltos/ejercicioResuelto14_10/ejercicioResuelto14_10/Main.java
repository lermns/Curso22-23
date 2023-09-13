package tema14.ejerciciosResueletos.ejercicioResuelto14_10;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Alumno objAlumno;
        Date hoy = new Date();
        System.out.println(hoy);
        
        objAlumno = new Alumno(990, "Pepe", hoy, 6.7, "1A");
        objAlumno.create();
        objAlumno = new Alumno(991, "Ana", hoy, 7.8, "2A");
        objAlumno.create();
        objAlumno = new Alumno(992, "Luis", hoy, 8.9, "1B");
        objAlumno.create();
        
        //DAO
        objAlumno = Alumno.read(991);
        System.out.println(objAlumno);
        
        //CRUD
        objAlumno = new Alumno(990);
        objAlumno.read();
        System.out.println(objAlumno);
        
        objAlumno.setNombre("Ana Mar�aa P�rez Garc�a");
        objAlumno.setNotaMedia(10.0);
        objAlumno.update();
        
        objAlumno = Alumno.read(992);
        objAlumno.delete();        
    }
}
