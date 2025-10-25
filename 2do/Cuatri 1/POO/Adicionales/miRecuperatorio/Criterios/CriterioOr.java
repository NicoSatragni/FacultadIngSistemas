package miRecuperatorio.Criterios;

import miRecuperatorio.Tarea;

public class CriterioOr extends CriterioAnd {
    
    public CriterioOr(Criterio c1, Criterio c2) {
        super(c1, c2);
    }

    @Override
    public boolean Cumple(Tarea t) {
        return c1.Cumple(t) || c2.Cumple(t);
    }
}
