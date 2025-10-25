package parcial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Earm extends Patrulla {


    public Earm(String nombre, ArrayList<ElementoDefensa> internos) {
        this.nombre = nombre;
        this.internos = new ArrayList<>(internos);
    }

    @Override
    public double getEnergia() {
        double sum = 0;
        for (ElementoDefensa elementoDefensa : internos) {
            sum += elementoDefensa.getEnergia();
        }
        return sum;
    }

    @Override
    public double getRapidez() {
        double max = 0;
        for (ElementoDefensa elemento : this.internos) {
            double x = elemento.getRapidez();
            max = x > max ? x : max;
        }
        return max;
    }
}
