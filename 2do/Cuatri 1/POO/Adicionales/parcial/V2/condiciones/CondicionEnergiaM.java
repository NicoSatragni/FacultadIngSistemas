package V2.condiciones;

import V2.GuardianMental;

public class CondicionEnergiaM implements Condicion {
    private final double min;

    public CondicionEnergiaM(double min) {
        this.min = min;
    }

    @Override
    public boolean cumple(GuardianMental e) {
        return e.getEnergiaEmocional() > min;
    }
}
