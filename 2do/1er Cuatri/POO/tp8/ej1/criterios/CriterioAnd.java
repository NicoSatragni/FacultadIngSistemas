package ej1.criterios;
import ej1.Curso;
public class CriterioAnd implements Criterio {
    
    private Criterio c1, c2;

    public CriterioAnd(Criterio c1, Criterio c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean cumple(Curso c) {
        return c1.cumple(c) && c2.cumple(c);
    }
}
