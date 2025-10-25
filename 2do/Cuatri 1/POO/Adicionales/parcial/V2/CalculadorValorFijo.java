package V2;

public class CalculadorValorFijo implements Calculador {
    private final double valorFijo;

    public CalculadorValorFijo(double valorFijo) {
        this.valorFijo = valorFijo;
    }

    @Override
    public double calculate(GuardiaCamaleon g) {
        return valorFijo;
    }
}
