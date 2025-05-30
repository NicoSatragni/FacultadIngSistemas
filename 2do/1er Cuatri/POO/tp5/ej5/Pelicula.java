package ej5;

public class Pelicula {
    private String titulo, sinopsis, director, generos[], actores[];
    private int estreno, duracion, edadMin;
    
    public Pelicula(String titulo, String sinopsis, String director, String[] generos, String actores[], int estreno, int duracion, int edadMin) {
        this.titulo = titulo;
        this.sinopsis = sinopsis;
        this.director = director;
        this.generos = generos;
        this.actores = actores;
        this.estreno = estreno;
        this.duracion = duracion;
        this.edadMin = edadMin;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public String getDirector() {
        return director;
    }

    public String[] getGeneros() {
        return generos;
    }

    public String[] getActores() {
        return actores;
    }

    public int getEstreno() {
        return estreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMin() {
        return edadMin;
    }


    
}