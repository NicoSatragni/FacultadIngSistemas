package ej5;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Pelicula> peliculas;
    private PoliticaRentabilidad politica;

    public Catalogo(PoliticaRentabilidad politica) {
        this.peliculas = new ArrayList<>();
        this.politica = politica;
    }

    public String agregarPelicula(Pelicula pelicula) {
        if (politica.esRentable(pelicula)) {
            peliculas.add(pelicula);
            return "Pelicula agregada ocn exito!";
        }
        return "Pelicula no es rentable! No se agrego.";
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public void setPolitica(PoliticaRentabilidad politica) {
        this.politica = politica;
    }

    

}
