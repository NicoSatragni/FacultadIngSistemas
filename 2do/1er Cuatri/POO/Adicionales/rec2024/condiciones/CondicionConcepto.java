package rec2024.condiciones;

import rec2024.ElementoEvaluacion;

public class CondicionConcepto implements Condicion {
    private String palabra;

    @Override
    public boolean cumple(ElementoEvaluacion e) {
        for (String concepto : e.getConceptos()) {            
            if(concepto.equalsIgnoreCase(palabra)){
                return true;
            }
        }
        return false;
    }
}
