package tema12.ejerciciosResueltos.ejercicioResuelto12_14;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Registro implements Serializable {
    private LocalTime hora;
    private double rlnTemperatura;

    public Registro(double rlnTemperatura) {
        this.rlnTemperatura = rlnTemperatura;
        this.hora = LocalTime.now();
    }

    public double getTemperatura() {
		return rlnTemperatura;
	}

	public boolean equals(Object o) {
        return hora.equals(((Registro) o).hora);
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.
                ofLocalizedTime(FormatStyle.MEDIUM).
                withLocale(Locale.getDefault());
        return "Registro{" + "hora=" + hora.format(f)
                + ", temperatura=" + rlnTemperatura + "°C}\n";
    }
}
