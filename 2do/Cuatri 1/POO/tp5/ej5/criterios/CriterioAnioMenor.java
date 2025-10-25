package ej5.criterios;

import ej5.Pelicula;

public class CriterioAnioMenor implements CriterioBusqueda {
    private int anio;

    public CriterioAnioMenor(int anio) {
        this.anio = anio;
    }

    public boolean cumple(Pelicula pelicula) {
        return pelicula.getEstreno() < anio;
    }
}
