package ej1.criterios;

import ej1.Curso;

public class MinPalabrasC implements Criterio {
    
    private int min;

    public MinPalabrasC(int min) {
        this.min = min;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getPClave().size() >= min;
    }
}