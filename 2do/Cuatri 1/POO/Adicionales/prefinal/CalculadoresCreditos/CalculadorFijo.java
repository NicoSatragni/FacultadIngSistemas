package prefinal.CalculadoresCreditos;
import prefinal.Taller;

public class CalculadorFijo implements CalculadorCreditos{
    private double valorFijo;

    public CalculadorFijo(double valor) {
        this.valorFijo = valor;
    }

    @Override
    public double calculate(Taller t) {
        return this.valorFijo;
    }
}
