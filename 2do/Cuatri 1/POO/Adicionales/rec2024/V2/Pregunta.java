
import java.util.ArrayList;
import java.util.Comparator;
import Criterios.Criterio;

//enunciado, un puntaje, un tiempo estimado y una lista de conceptos que se evalúan.

public class Pregunta extends ElementoEvaluacion {
    private String enunciado;
    private double tiempoEstimado;
    private double puntaje;
    private ArrayList<String> conceptos;
    
    public Pregunta (String enunciado, int tiempoEstimado, ArrayList conceptos){
        this.enunciado = enunciado;
        this.tiempoEstimado = tiempoEstimado;
        this.conceptos = new ArrayList<>(conceptos);
    }

    @Override
    public double getPuntaje() {
        return this.puntaje;
    };
    @Override
    public double getTiempoEst() {
        return this.tiempoEstimado;
    }

    @Override
    public ArrayList<String> getConceptos() {
        return new ArrayList<String>(this.conceptos);
    }

    @Override
    public ArrayList<Pregunta> getPreguntas(Criterio c, Comparator<Pregunta> comp) {
        ArrayList temp = new ArrayList<>();
        if(c.cumple(this))
            temp.add(this);
        return temp;
    }

    public String getEnunciado() {
        return enunciado;
    }

    
}
