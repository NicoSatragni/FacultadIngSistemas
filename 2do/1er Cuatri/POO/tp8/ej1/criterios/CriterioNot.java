package ej1.criterios;

public class CriterioNot implements Criterio {
    private Criterio c;

    public CriterioNot(Criterio c) {
        this.c = c;
    }

    @Override
    public boolean cumple(curso c) {
        return !this.c.cumple(c);
    }
}
