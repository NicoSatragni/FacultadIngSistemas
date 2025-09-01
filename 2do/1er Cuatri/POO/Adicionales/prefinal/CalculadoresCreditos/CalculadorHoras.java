package prefinal.CalculadoresCreditos;

import prefinal.Taller;

public class CalculadorHoras implements CalculadorCreditos{
    
    @Override
    public double calculate(Taller t) {
        return t.getCantHoras();
    }
}
