package ej1.criterios;

public class CriterioMinHoras implements Criterio {
    private int minHoras;

    public CriterioMinHoras(int minHoras) {
        this.minHoras = minHoras;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getHoras() >= minHoras;
    }
}
