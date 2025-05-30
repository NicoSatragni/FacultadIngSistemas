package ej5.criterios;
import ej5.Pelicula;

public class CriterioNoDirector implements CriterioBusqueda {
    private String palabra;

    public CriterioNoDirector(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Pelicula pelicula){
        return !pelicula.getDirector().equalsIgnoreCase(this.palabra);
    }
}
