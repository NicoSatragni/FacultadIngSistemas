import Pregunta;

package Criterios;
public class CriterioTiempEstMenor implements Criterio {
    double tiempoMax;

    @Override
    public boolean cumple(ElementoEvaluacion e) {
        return p.getTiempoEst() < tiempoMax;
    }
}
