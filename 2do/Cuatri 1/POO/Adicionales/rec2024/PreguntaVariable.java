package rec2024;

import java.util.ArrayList;

public class PreguntaVariable extends Pregunta{
    
    private int divisor;

    public PreguntaVariable(String enunciado, int puntaje, int tiempo, ArrayList<String> conceptos, int divisor) {
        super(enunciado, puntaje, tiempo, conceptos);
        this.divisor = divisor;
    }






    @Override
    public double tiempoEstimado() {
        int cantCon = this.getConceptos().size();
        return super.tiempoEstimado() * cantCon / this.divisor;
    }
}
