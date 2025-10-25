package V2;

public class CalculadorNivEnergia implements Calculador {
    @Override
    public double calculate(GuardiaCamaleon g) {
        return g.getEnergiaEmocional();
    }
}
