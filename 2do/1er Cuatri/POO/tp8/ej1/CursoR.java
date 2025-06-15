package ej1;
import java.time.LocalDate;

public class CursoR {
    private Curso cursoR;
    private LocalDate fecha;
    private double nota;

    public CursoR(Curso cursoR, double nota) {
        this.cursoR = cursoR;
        this.fecha = LocalDate.now();
        this.nota = nota;
    }

    
    public Curso getCurso() {
        return cursoR;
    }

    public double getNota() {
        return this.nota;
    }
}
