package tema7.ejerciciosResueltos.ejerciciosResueltos710;

import tema7.ejerciciosResueltos.ejerciciosResueltos710.maquinaria.*;
import tema7.ejerciciosResueltos.ejerciciosResueltos710.personal.JefeEstacion;
import tema7.ejerciciosResueltos.ejerciciosResueltos710.personal.Maquinista;
import tema7.ejerciciosResueltos.ejerciciosResueltos710.personal.Mecanico;

public class Main {

	public static void main(String[] args) {
		Mecanico mecanicoEncargado = new Mecanico("Pepe", "912345678","MOTOR");
		Locomotora objLocomotora = new Locomotora(1234, 1500, 2023, mecanicoEncargado);
		Maquinista maquinistaEncargado = new Maquinista("Juan", "9876J", 2000, "maquinista de carrera");
		Tren objTren = new Tren(objLocomotora, maquinistaEncargado);
		JefeEstacion jefe = new JefeEstacion("pepe", "1234");

		System.out.println("fecha " + jefe.getFechaNombramiento());
		objTren.annadirVagon();
		objTren.annadirVagon();
		System.out.println(objTren.toString());
		
	}

}
