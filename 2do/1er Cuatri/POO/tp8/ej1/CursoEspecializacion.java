package ej1;
import ej1.criterios.Criterio;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;


public class CursoEspecializacion extends Curso{

    private ArrayList<Curso> subCursos;
    private Criterio cAprobacion;

    public CursoEspecializacion(String nombre, int precio, ArrayList<String> pClave, Criterio cAprobacion) {
        super(nombre, precio, pClave);
        this.subCursos = new ArrayList<>();
        this.cAprobacion = cAprobacion;
    }

    
    
    @Override
    public double getPrecio() {
        double sum = 0;
        for (Curso c : subCursos) {
            sum += c.getPrecio();
        }
        return sum;
    }
    
    @Override
    public ArrayList<String> getPClave() {
        Set<String> t = new LinkedHashSet<>();
        
        for (Curso c : subCursos) {
            t.addAll(c.getPClave());
        }
        return new ArrayList<>(t);
    }
    
    @Override
    public int getHoras() {
       int sum = 0;
        for (Curso c : subCursos) {
            sum += c.getHoras();
        }
        return sum;
    }

    @Override
    public boolean alumnoAprobado(Alumno a) {
        for (Curso cur : subCursos) {
            if (!cur.alumnoAprobado(a)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public double getPrecioAlumno(Alumno a) {
        double sum = 0;

        for (Curso c : subCursos) {
            if (!c.alumnoAprobado(a)) {
                sum += c.getPrecio();
            }
        }
        return sum;
    }

    @Override
    public int getCantCursos() {
        int sum = 0;
        for (Curso c : this.subCursos) {
            sum += c.getCantCursos();
        }
        return sum; 
    }

    @Override
    public Curso getMasCaro() {
        Curso max = this;
        for (Curso c : subCursos) {
            max = c.getMasCaro().getPrecio() > max.getPrecio() ? c : max;
        }
        return max;
    }

    @Override
    public ArrayList<Curso> buscar(Criterio c) {
        ArrayList<Curso> cursos = new ArrayList<>();
        for (Curso curso : subCursos) {
            cursos.addAll(curso.buscar(c));
        }
        return cursos;
    }
    
}
