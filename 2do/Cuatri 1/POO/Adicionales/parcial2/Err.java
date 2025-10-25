package parcial2;

import java.util.ArrayList;

public class Err extends Escuadra {
    
    public Err(ArrayList<ElemDefensa> miembros) {
        super(miembros);
    }

    @Override
    public double getVelocidad() {
        double max = -1;
        for (ElemDefensa elemDefensa : miembros) {
            max = elemDefensa.getVelocidad() >= max ? elemDefensa.getVelocidad() : max;
        }
        return max;
    }

    @Override
    public double getPoderMagico() {
        double sum = 0;
        for (ElemDefensa elemDefensa : miembros) {
            sum += elemDefensa.getPoderMagico();
        }
        return sum;
    }

    
}
