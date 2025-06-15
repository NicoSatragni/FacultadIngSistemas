package ej1.criterios;
import ej1.Curso;

public class CriterioPrecioMenor implements Criterio {
    private double precio;

    public CriterioPrecioMenor(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getPrecio() < precio;
    }
}
