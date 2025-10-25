import Pregunta;

package Criterios;
public class CriterioPuntaje implements Criterio {
    double puntajeMin;

    @Override
    public boolean cumple(ElementoEvaluacion e) {
        return p.getPuntaje() > puntajeMin;
    }
}
