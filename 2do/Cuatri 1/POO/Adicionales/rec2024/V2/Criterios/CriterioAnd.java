import Pregunta;

package Criterios;
public class CriterioAnd implements Criterio {
    Criterio c, c2;
    @Override
    public boolean cumple(ElementoEvaluacion e) {
        return c.cumple(p) && c2.cumple(p);
    }
}
