package ej5.criterios;
import ej5.Pelicula;


public class CriterioAnd implements CriterioBusqueda {
    private CriterioBusqueda c1;
    private CriterioBusqueda c2;

    public CriterioAnd(CriterioBusqueda c1, CriterioBusqueda c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Pelicula pelicula) {
        return c1.cumple(pelicula) && c2.cumple(pelicula);
    }
}
