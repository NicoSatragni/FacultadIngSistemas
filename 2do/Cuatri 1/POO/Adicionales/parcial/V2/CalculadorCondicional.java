package V2;

import V2.condiciones.Condicion;

public class CalculadorCondicional implements Calculador {
    private final Condicion c;
    private final Calculador ca1, ca2;

    public CalculadorCondicional(Condicion c, Calculador ca1, Calculador ca2) {
        this.c = c;
        this.ca1 = ca1;
        this.ca2 = ca2;
    }

    @Override
    public double calculate(GuardiaCamaleon g) {
        return c.cumple(g) ? ca1.calculate(g) : ca2.calculate(g);
    }
}
