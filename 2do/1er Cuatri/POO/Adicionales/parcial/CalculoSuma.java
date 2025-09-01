package parcial;

public class CalculoSuma implements Calculador {
    private final Calculador c1, c2;

    public CalculoSuma(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calculate(Guardian g) {
        return c1.calculate(g) + c2.calculate(g);
    }
}
