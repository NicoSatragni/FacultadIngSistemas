package parcial2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Escuadra extends ElemDefensa {
    protected ArrayList<ElemDefensa> miembros;


    public Escuadra(List<ElemDefensa> m) {
        this.miembros = new ArrayList<>(m);
    }

    @Override
    public ArrayList<String> getHabilidades() {
        Set<String> rtn = new HashSet<>(); 
        for (ElemDefensa miembro : this.miembros) {
            rtn.addAll(miembro.getHabilidades());
        }
        return new ArrayList<>(rtn);
    }

    
}
