package parcial;

public class CalculoEnergia implements Calculador{
    @Override
    public double calculate(Guardian g) {
        return g.getEnergia();
    }
}
