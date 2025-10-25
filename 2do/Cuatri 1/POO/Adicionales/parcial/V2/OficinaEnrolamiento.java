package V2;

import java.util.ArrayList;
import java.util.Collections;

public class OficinaEnrolamiento {
    private final ArrayList<GuardianMental> guardianes;

    public OficinaEnrolamiento() {
        this.guardianes = new ArrayList<>();
    }

    public void agregarGuardian(GuardianMental g) {
        if (g == null) return;
        this.guardianes.add(g);
        System.out.println("Antes sort: " + guardianes);
        Collections.sort(this.guardianes);
        System.out.println("Despues sort: " + guardianes + "\n");
    }

    public ArrayList<GuardianMental> getGuardianes() {
        return new ArrayList<>(guardianes);
    }
}