package ej1;
import java.util.ArrayList;

import ej1.criterios.Criterio;

public class CursoIndividual extends Curso{

    private int horas;
    private int notaMin;
    
    public CursoIndividual(String nombre, double precio, ArrayList<String> pClave, int horas, int notaMin) {
        super(nombre, precio, pClave);
        this.horas = horas;
        this.notaMin = notaMin;
    }
    
    @Override
    public double getPrecio() {
        return this.precio;
    }
    
    @Override
    public ArrayList<String> getPClave() {
        return this.pClave;
    }

    @Override
    public int getHoras() {
        return this.horas;
    }
    
    @Override
    public boolean alumnoAprobado(Alumno a) {
        return a.getNota(this) >= this.notaMin;
    }

    @Override
    public double getPrecioAlumno(Alumno a) {
        if (alumnoAprobado(a)) {
            return 0;
        }
        return this.getPrecio();
    }

    @Override
    public int getCantCursos() {
        return 1;
    }

    @Override
    public Curso getMasCaro() {
        return this;
    }
    
    @Override
    public ArrayList<Curso> buscar(Criterio c) {
        ArrayList<Curso> curso = new ArrayList<>();
        if (c.cumple(this)) curso.add(this);
        return curso;
    }

    

    
    
    


}
