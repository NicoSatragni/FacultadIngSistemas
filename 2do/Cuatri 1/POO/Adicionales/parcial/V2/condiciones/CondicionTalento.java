package V2.condiciones;

import V2.GuardianMental;
import parcial.condiciones.Condicion;

public class CondicionTalento implements Condicion {
    private final String talento;

    public CondicionTalento(String talento) {
        this.talento = talento;
    }

    @Override
    public boolean cumple(GuardianMental e) {
        for (String t : e.getTalentosPsiquicos()) {
            if (t.equalsIgnoreCase(talento)) return true;
        }
        return false;
    }
}
