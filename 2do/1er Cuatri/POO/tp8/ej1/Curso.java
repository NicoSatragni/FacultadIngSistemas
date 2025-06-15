package ej1;
import ej1.criterios.Criterio;
import java.util.ArrayList;

public abstract class Curso {
    protected String nombre;
    protected double precio;
    protected ArrayList<String> pClave;

    

    public Curso(String nombre, double precio, ArrayList<String> pClave) {
        this.nombre = nombre;
        this.precio = precio;
        this.pClave = pClave;
    }


    public String getNombre() {
        return nombre;
    }


    public abstract double getPrecio();
    public abstract ArrayList<String> getPClave();
    public abstract int getHoras(); 
    public abstract boolean alumnoAprobado(Alumno a);
    public abstract double getPrecioAlumno(Alumno a);
    public abstract int getCantCursos();
    public abstract Curso getMasCaro();
    public abstract ArrayList<Curso> buscar(Criterio c);

}