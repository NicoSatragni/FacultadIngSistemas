package ej1.criterios;
import ej1.Alumno;
import ej1.Curso;
public interface CondicionAprobacion {
    public boolean aprueba(Curso c, Alumno a);
}
