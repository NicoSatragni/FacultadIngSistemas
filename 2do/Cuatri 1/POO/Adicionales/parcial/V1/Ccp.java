package parcial;

import java.util.ArrayList;

public class Ccp extends Patrulla {

    @Override
    public double getEnergia() {
        double max = 0;
        for (ElementoDefensa e : internos) {
            double x = e.getEnergia();
            max = x > max ? x : max;
        }
        return max;
    }

    @Override
    public double getRapidez() {
        return internos.get(0).getRapidez();
    }
    
    @Override
    public ArrayList<String> getTalentos() {
        // TODO Auto-generated method stub
        return null;
    }
}
