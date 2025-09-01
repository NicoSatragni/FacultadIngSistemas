package parcial.condiciones;

import parcial.Guardian;

public class CondicionEnergiaM implements Condicion {

    private double min;

    

    public CondicionEnergiaM(double min) {
        this.min = min;
    }

    @Override
    public boolean cumple(Guardian e) {
        if (e.getEnergia() > min) {
            return true;
        }
        return false;
    }
    
}
