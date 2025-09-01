package prefinal.CalculadoresCreditos;

import prefinal.Taller;

public class CalculadorCredPorHora implements CalculadorCreditos{
    private double creditos;
    private double horas;

    public CalculadorCredPorHora(double creditos, double horas) {
        this.creditos = creditos;
        this.horas = horas;
    }

    @Override
    public double calculate(Taller t) {
        return ((t.getCantHoras()/this.horas)*creditos);
    }
}
