package parcial2;

import java.util.List;

public class PoniFuerte extends Poni {
    double mult;

    public PoniFuerte(String nombre, double poderMagico, double velocidad, List<String> habilidades, double mult) {
        super(nombre, poderMagico, velocidad, habilidades);
        this.mult = mult > 0 ? mult : mult*(-1);
    }

    @Override
    public double getPoderMagico() {
        return super.getPoderMagico() * this.mult;
    }

    @Override
    public double getVelocidad() {
        return super.getVelocidad() * this.mult;
    }
}
