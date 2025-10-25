
import java.util.ArrayList;
import java.util.Comparator
import Criterios.Criterio;
import java.util.Collections;

public abstract class Unidad extends ElementoEvaluacion {
    
    protected ArrayList<ElementoEvaluacion> hijos;

    @Override
    public ArrayList getConceptos() {
        java.util.Set conceptos = new java.util.LinkedHashSet<ElementoEvaluacion>();
        
        for (ElementoEvaluacion hijo : this.hijos) {
            conceptos.addAll(hijo.getConceptos());
        }
        return new ArrayList<>(conceptos);
    }
    
    @Override
    public ArrayList<Pregunta> getPreguntas(Criterio c, Comparator<Pregunta> comp) {
        ArrayList preg = new ArrayList<Pregunta>();
        for (ElementoEvaluacion elemento : this.hijos) {
            preg.addAll(elemento.getPreguntas(c, comp));
        }
        preg.sort(comp);
        return preg;
    }

    public void agregarElementos(ElementoEvaluacion e) {
        this.hijos.add(e);
    }
}
