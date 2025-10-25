package ej5.criterios;

import ej5.Pelicula;

public class CriterioDuracionMenor implements CriterioBusqueda {
    private int duracion;

    public CriterioDuracionMenor(int duracion) {
        this.duracion = duracion;
    }

    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracion() < duracion; 
    }
}
