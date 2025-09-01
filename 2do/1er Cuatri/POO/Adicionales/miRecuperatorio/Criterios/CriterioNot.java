package miRecuperatorio.Criterios;
import miRecuperatorio.Tarea;

public class CriterioNot implements Criterio{
    
    private Criterio c;

    public CriterioNot(Criterio c) {
        this.c = c;
    }

    @Override
    public boolean Cumple(Tarea t) {
        return !c.Cumple(t);
    }
}
