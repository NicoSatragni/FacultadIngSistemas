package rec2024;

import java.util.ArrayList;

public abstract class UnidadEvaluacion extends ElementoEvaluacion {
    protected ArrayList<ElementoEvaluacion> contenido;


    public UnidadEvaluacion() {
        this.contenido = new ArrayList<ElementoEvaluacion>();
    }
    
    @Override
    public ArrayList<String> getConceptos() {
        ArrayList<String> rslt = new ArrayList<>();

        for (ElementoEvaluacion elemento : contenido) {
            rslt.addAll(elemento.getConceptos());
        }
        return rslt;
    }

    public void addElemento(ElementoEvaluacion e) {
        this.contenido.add(e);
    }
}
