package V2;

public class CalculadroSum implements Calculador {
    private final Calculador c1, c2;

    public CalculadroSum(Calculador c1, Calculador c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double calculate(GuardiaCamaleon g) {
        return c1.calculate(g) + c2.calculate(g);
    }
}
