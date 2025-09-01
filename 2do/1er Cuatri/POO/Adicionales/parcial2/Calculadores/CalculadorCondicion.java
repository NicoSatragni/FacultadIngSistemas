package parcial2.Calculadores;

import parcial2.Poni;
import parcial2.Criterios.Criterio;

public class CalculadorCondicion implements Calculador {
    private Criterio criterio;
    private Calculador valorT,valorF;

    

    public CalculadorCondicion(Criterio c, Calculador v1, Calculador v2) {
        this.criterio = c;
        this.valorT = v1;
        this.valorF = v2;
    }



    @Override
    public double calculate(Poni p) {
        return this.criterio.cumple(p) ? valorT.calculate(p) : valorF.calculate(p);
    }
}
