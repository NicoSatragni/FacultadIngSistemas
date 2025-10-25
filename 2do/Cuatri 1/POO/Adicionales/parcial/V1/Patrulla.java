package parcial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import parcial.condiciones.Condicion;

public abstract class Patrulla extends ElementoDefensa {
    
    protected ArrayList<ElementoDefensa> internos;

    public ArrayList<ElementoDefensa> getInternos() {
        return new ArrayList<>(internos);
    }

    @Override
    public ArrayList<String> getTalentos() {
        Set<String> talentos = new HashSet<>();
        for (ElementoDefensa elementoDefensa : internos) {
            talentos.addAll(elementoDefensa.getTalentos());
        }
        return new ArrayList<>(talentos);
    }

    public ArrayList<Guardian> getElementos(Condicion c) {
        ArrayList<Guardian> aux = new ArrayList<Guardian>();
        for (ElementoDefensa e : internos) {
            aux.addAll(e.getElementos(c));
        }
        return aux;
    }
}
