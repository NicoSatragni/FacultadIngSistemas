import Pregunta;

package Criterios;
public class CriterioNot implements Criterio{
    Criterio c;
    
    @Override
    public boolean cumple(ElementoEvaluacion e) {
        return !c.cumple(p);
    }
}
