package ej5.criterios;

import ej5.Pelicula;

public class CriterioTitulo implements CriterioBusqueda{
    private String palabra;

    public CriterioTitulo(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Pelicula pelicula){
        return pelicula.getTitulo().toLowerCase().contains(this.palabra);
    }
}
