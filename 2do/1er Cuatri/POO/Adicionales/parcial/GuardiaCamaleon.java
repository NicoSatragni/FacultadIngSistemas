package parcial;

public class GuardiaCamaleon extends Guardian implements Calculador{
    private Calculador calculador;
    
    
    public void setCalculador(Calculador calculador) {
        this.calculador = calculador;
    }
    
    @Override
    public double getRapidez() {
        return calculador.calculate(this);
        
    }
}
