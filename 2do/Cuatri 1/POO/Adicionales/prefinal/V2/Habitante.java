
import java.util.ArrayList;

public class Habitante {
    private String nombre, especialidad;
    private ArrayList<TallerRendido> cRendidos;

    public Habitante(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cRendidos = new ArrayList<TallerRendido>();
    }


    public boolean estaAprobado(Taller c) {
        for (TallerRendido t : cRendidos) {
            if(!t.getTallerR().equals(c))
                continue;
            if(t.getCalificacion() >= c.getNotaMin())
                return true;
        }
        return false;
    }

    
}
