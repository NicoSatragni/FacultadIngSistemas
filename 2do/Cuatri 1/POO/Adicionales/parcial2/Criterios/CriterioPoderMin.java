package parcial2.Criterios;

import parcial2.Poni;

public class CriterioPoderMin implements Criterio {
    private double podMin;

    public CriterioPoderMin(double podMin) {
        this.podMin = podMin;
    }

    @Override
    public boolean cumple(Poni p) {
        return p.getPoderMagico() > podMin;
    }
}
