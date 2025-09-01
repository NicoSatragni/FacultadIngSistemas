package parcial2;

import java.util.ArrayList;
import java.util.Collections;

public class OficinaReclutamiento {
    private ArrayList<Poni> reclutamiento;

    public OficinaReclutamiento() {
        this.reclutamiento = new ArrayList<>();
    }

    public void agregarPoni(Poni p) {
        this.reclutamiento.add(p);
        Collections.sort(reclutamiento);
    }
}
