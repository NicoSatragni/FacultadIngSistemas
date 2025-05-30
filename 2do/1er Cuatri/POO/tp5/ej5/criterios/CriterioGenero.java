package ej5.criterios;
import ej5.Pelicula;

public class CriterioGenero implements CriterioBusqueda {

    private String palabra;

    public CriterioGenero(String palabra) {
        this.palabra = palabra;
    }



    @Override
    public boolean cumple(Pelicula pelicula) {
        for (String genero : pelicula.getGeneros()) {
            if (genero.contains(palabra)) {
                return true;
            }
        }
        return false;
    }
    

    
}
