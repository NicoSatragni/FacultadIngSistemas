package parcial;

public class CalculoFijo implements Calculador {
    private double valor;

    public CalculoFijo(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculate(Guardian g) {
        return valor;
    }

}
