package parcial2.Calculadores;

import parcial2.Poni;

public class CalculadorSuma implements Calculador{
    Calculador c1, c2;

    public CalculadorSuma(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }
    
    @Override
    public double calculate(Poni p) {
        return c1.calculate(p) + c2.calculate(p);
    }
}
