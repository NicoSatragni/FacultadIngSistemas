package parcial2.Criterios;

import parcial2.Poni;

public class CriterioVelIgual implements Criterio {
    private double vel;

    public CriterioVelIgual(double velMin) {
        this.vel = velMin;
    }

    @Override
    public boolean cumple(Poni p) {
        return p.getVelocidad() == this.vel;
    }
}