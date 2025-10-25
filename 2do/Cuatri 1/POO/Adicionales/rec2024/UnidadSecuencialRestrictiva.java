package rec2024;

import rec2024.condiciones.Condicion;

public class UnidadSecuencialRestrictiva extends UnidadSecuencial{
    Condicion c;

    @Override
    public void addElemento(ElementoEvaluacion e) {
        if (c.cumple(e)) {   
            super.addElemento(e);
        }
    }
}
