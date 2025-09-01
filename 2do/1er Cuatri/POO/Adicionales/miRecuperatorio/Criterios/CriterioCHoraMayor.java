package miRecuperatorio.Criterios;
import miRecuperatorio.Tarea;
public class CriterioCHoraMayor implements Criterio{
    protected double min;

    public CriterioCHoraMayor(double min) {
        this.min = min;
    }

    public boolean Cumple(Tarea t) {
        return (t.getPrecioHora() > min) ? true : false;
    }
}
