package tema11.ejerciciosResueltos.ejercicioResuelto11_08;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ResgistroTemperatura implements Serializable {
	private double rlnTemperatura;
	private LocalDateTime fechaRegistro;
	


	public ResgistroTemperatura(double rlnTemperatura) {
		this.rlnTemperatura = rlnTemperatura;
		this.fechaRegistro = LocalDateTime.now();
	}



	@Override
	public String toString() {
		return " [" + this.fechaRegistro + ", " +this.rlnTemperatura + "ºC]";
	}


}
