package ej5.criterios;
import ej5.Pelicula;



public class CriterioActor implements CriterioBusqueda{
    private String palabra;

    public CriterioActor(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Pelicula pelicula){
        for (String actor : pelicula.getActores()) {
            if(actor.equalsIgnoreCase(palabra)) {
                return true;
            }
        }
        return false;
    }
}
