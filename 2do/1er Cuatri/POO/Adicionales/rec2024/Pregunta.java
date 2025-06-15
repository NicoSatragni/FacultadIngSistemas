package rec2024;

import java.util.ArrayList;

public class Pregunta extends ElementoEvaluacion {
    private String enunciado;
    private ArrayList<String> conceptos;
    
    public Pregunta(String enunciado, int puntaje, int tiempo, ArrayList<String> conceptos) {
        this.enunciado = enunciado;
        this.puntaje = puntaje;
        this.tiempo = tiempo;
        this.conceptos = conceptos;
    }

    @Override
    public int getPuntaje() {
        return this.puntaje;
    }

    @Override
    public double tiempoEstimado() {
        return this.tiempo;
    }

    @Override
    public ArrayList<String> getConceptos() {
        return this.conceptos;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public void setConceptos(ArrayList<String> conceptos) {
        this.conceptos = conceptos;
    }

    

    
}
