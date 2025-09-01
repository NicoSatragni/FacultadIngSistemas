package prefinal.CalculadoresCreditos;

import prefinal.Taller;

public class CalculadorSuma implements CalculadorCreditos{
    private CalculadorCreditos calculador1;
    private CalculadorCreditos calculador2;

    public CalculadorSuma(CalculadorCreditos calc1, CalculadorCreditos calc2) {
        this.calculador1 = calc1;
        this.calculador2 = calc2;
    }

    @Override
    public double calculate(Taller t) {
        return this.calculador1.calculate(t) + this.calculador2.calculate(t);
    }
}
