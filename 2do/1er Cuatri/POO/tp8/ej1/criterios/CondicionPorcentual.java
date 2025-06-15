package ej1.criterios;

import ej1.Alumno;
import ej1.Curso;

public class CondicionPorcentual implements CondicionAprobacion {
    private double prc;

    public CondicionPorcentual(double prc) {
        this.prc = prc;
    }

    @Override
    public boolean aprueba(Curso c, Alumno a) {
        return c.getCantCursos() * prc <= a.getRendidos().size();
    }
}
