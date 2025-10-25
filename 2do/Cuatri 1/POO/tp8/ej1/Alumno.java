package ej1;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<CursoR> rendidos;


    public Alumno(String nombre, ArrayList<CursoR> rendidos) {
        this.nombre = nombre;
        this.rendidos = rendidos;
    }


    public double getNota(Curso c) {
        double max = 0;
        for (CursoR cursoR : rendidos) {
            if (cursoR.getCurso().equals(c) && cursoR.getNota() > max) {
                max = cursoR.getNota();
            }
        }
        return max;
    }

    public ArrayList<CursoR> getRendidos() {
        return new ArrayList<CursoR>(this.rendidos);
    }

    
}
