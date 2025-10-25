import Pregunta;

package Criterios;
public class CriterioConcepto implements Criterio{
    String conceptoBuscado;

    @Override
    public boolean cumple(ElementoEvaluacion e) {
        for (String concepto : p.getConceptos()) {
            if(concepto.equalsIgnoreCase(conceptoBuscado))
                return true;
        }
        return false;
    }
}
