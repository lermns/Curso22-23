package tema14.ejerciciosResueletos.ejercicioResuelto14_11;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Alumno objAlumno;
        Date hoy = new Date();
        System.out.println(hoy);
        
        objAlumno = new Alumno(996, "Pepe", hoy, 6.7, "1A");
        AlumnoDAO.create(objAlumno);
        objAlumno = new Alumno(997, "Ana", hoy, 7.8, "2A");
        AlumnoDAO.create(objAlumno);
        objAlumno = new Alumno(998, "Luis", hoy, 8.9, "1B");
        AlumnoDAO.create(objAlumno);
        
        //DAO
        objAlumno = AlumnoDAO.read(996);
        System.out.println(objAlumno);
        
        
        
        objAlumno.setNombre("Ana María Pérez García");
        objAlumno.setNotaMedia(10.0);
        AlumnoDAO.update(objAlumno);
        
        objAlumno = AlumnoDAO.read(996);
        AlumnoDAO.delete(objAlumno.getId());        
    }
}
