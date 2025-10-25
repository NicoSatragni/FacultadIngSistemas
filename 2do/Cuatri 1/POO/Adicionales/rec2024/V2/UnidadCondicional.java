import Criterios.Criterio;
import ElementoEvaluacion;

public class UnidadCondicional extends UnidadSecuencial {
    
    private Criterio c;

    @Override
    public void agregarElementos(ElementoEvaluacion e) {
        if(c.cumple(e))
            super.agregarElementos(e);
    }

    
}
