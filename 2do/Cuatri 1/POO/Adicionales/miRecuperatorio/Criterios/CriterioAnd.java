package miRecuperatorio.Criterios;

import miRecuperatorio.Tarea;

public class CriterioAnd implements Criterio{
    protected Criterio c1,c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean Cumple(Tarea t) {
        return c1.Cumple(t) && c2.Cumple(t);
    }
}
