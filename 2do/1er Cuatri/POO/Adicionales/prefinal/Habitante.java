package prefinal;

import java.util.ArrayList;

public class Habitante {
    private String nombre;
    private Especializacion especialidad;
    private ArrayList<TalleresRendidos> TalleresR = new ArrayList<>();
    
    public Habitante(String nombre, Especializacion especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.TalleresR = new ArrayList<TalleresRendidos>();
    }
    
    public boolean aprobo(Taller t) {
        for (TalleresRendidos taller : TalleresR) {
            if (taller.getTaller().getNombre().equalsIgnoreCase(t.getNombre())) {
                if(taller.isAprobado()) return true;
                
                return false;
            }
        }
        return false;
    }
}
