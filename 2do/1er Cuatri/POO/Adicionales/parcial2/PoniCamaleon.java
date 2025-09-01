package parcial2;

import java.util.List;

import parcial2.Calculadores.Calculador;

public class PoniCamaleon extends Poni {
    private Calculador c;
    public PoniCamaleon(String nombre, double poderMagico, double velocidad, List<String> habilidades, Calculador c) {
        super(nombre, poderMagico, velocidad, habilidades);
        this.c = c;
    }

    @Override
    public double getVelocidad() {
        return this.c.calculate(this);
    }

    public void setCalculador(Calculador c) {
        this.c = c;
    }

}
