package prefinal;

public class EspecializacionOpt extends Especializacion{
    private double div;

    public EspecializacionOpt(double div, String nombre) {
        super(nombre);
        this.div = div;
    }

    @Override
    public double getCreditos() {
        return super.getCreditos()/this.div;
    }
}
