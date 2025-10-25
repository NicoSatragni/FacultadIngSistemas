package V2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import V2.condiciones.Condicion;

public abstract class Escuadron extends ElementoDefensa {
    protected ArrayList<ElementoDefensa> miembros = new ArrayList<>();

    public void agregarMiembro(ElementoDefensa e) {
        if (e != null) this.miembros.add(e);
    }

    @Override
    public ArrayList<String> getTalentosPsiquicos() {
        Set<String> temp = new LinkedHashSet<String>();
        for (ElementoDefensa miembro : this.miembros) {
            if (miembro == null) continue;
            for (String t : miembro.getTalentosPsiquicos()) {
                temp.add(t);
            }
        }
        return new ArrayList<String>(temp);
    }

    @Override
    public ArrayList<GuardianMental> buscarGuardianes(Condicion c) {
        Set<GuardianMental> set = new LinkedHashSet<>();
        for (ElementoDefensa miembro : this.miembros) {
            if (miembro == null) continue;
            List<GuardianMental> encontrados = miembro.buscarGuardianes(c);
            if (encontrados != null) set.addAll(encontrados);
        }
        return new ArrayList<GuardianMental>(set);
    }
}