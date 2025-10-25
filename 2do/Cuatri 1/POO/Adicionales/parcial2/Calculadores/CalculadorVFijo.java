package parcial2.Calculadores;
import parcial2.Poni;

public class CalculadorVFijo implements Calculador {
    double vFijo;

    public CalculadorVFijo(double vFijo) {
        this.vFijo = vFijo;
    }

    @Override
    public double calculate(Poni p) {
        return vFijo;
    }

}
