package parcial2.Calculadores;

import parcial2.Poni;

public class CalculadorPM implements Calculador{

    public CalculadorPM() {
    }

    @Override
    public double calculate(Poni p) {
        return p.getPoderMagico();
    }
}
