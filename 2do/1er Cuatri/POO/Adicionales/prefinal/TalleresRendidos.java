package prefinal;

import java.time.LocalDate;

public class TalleresRendidos {
    private Taller tallerRendido;
    private LocalDate fecha;
    private double calificacion;

    public TalleresRendidos(Taller tallerRendido, LocalDate fecha, double calificacion) {
        this.tallerRendido = tallerRendido;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }

    public boolean isAprobado() {
        return this.calificacion >= tallerRendido.getCalificacionMinima();
    }

    public Taller getTaller() {
        return this.tallerRendido;
    }
}
