public class CalcFijo implements Calculator {
    double valor;

    public CalcFijo(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculate(Taller t) {
        return this.valor;
    }
    
    
}
