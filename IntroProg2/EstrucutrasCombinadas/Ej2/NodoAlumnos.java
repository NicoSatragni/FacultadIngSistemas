//package Ej2;

public class NodoAlumnos {
    private int nLegajo;
    private NodoAlumnos mayores, menores;
    private ListaMaterias materias;

    public NodoAlumnos(int legajo){
        this.nLegajo = legajo;
        this.mayores = null;
        this.menores = null;
        this.materias = new ListaMaterias();
    }

    public int getnLegajo() {
        return nLegajo;
    }

    public void setnLegajo(int nLegajo) {
        this.nLegajo = nLegajo;
    }

    public NodoAlumnos getMayores() {
        return mayores;
    }

    public void setMayores(NodoAlumnos mayores) {
        this.mayores = mayores;
    }

    public NodoAlumnos getMenores() {
        return menores;
    }

    public void setMenores(NodoAlumnos menores) {
        this.menores = menores;
    }

    public ListaMaterias getMaterias() {
        return materias;
    }

    public void setMaterias(ListaMaterias materias) {
        this.materias = materias;
    }


    
}
