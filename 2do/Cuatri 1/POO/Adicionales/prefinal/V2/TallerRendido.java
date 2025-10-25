
import java.time.LocalDate;

public class TallerRendido {
    private Taller tallerR;
    private LocalDate fecha;
    private double calificacion;
    public TallerRendido(Taller tallerR, LocalDate fecha, double calificacion) {
        this.tallerR = tallerR;
        this.fecha = fecha;
        this.calificacion = calificacion;
    }
    public Taller getTallerR() {
        return tallerR;
    }
    public void setTallerR(Taller tallerR) {
        this.tallerR = tallerR;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public double getCalificacion() {
        return calificacion;
    }
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    
}
