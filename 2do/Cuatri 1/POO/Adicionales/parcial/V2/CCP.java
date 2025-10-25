package V2;

public class CCP extends Escuadron {

    @Override
    public double getEnergiaEmocional() {
        double max = 0;
        for (ElementoDefensa e : miembros) {
            if (e == null) continue;
            double temp = e.getEnergiaEmocional();
            max = temp > max ? temp : max;
        }
        return max;
    }

    @Override
    public double getRapidezPensamiento() {
        if (this.miembros == null || this.miembros.isEmpty())
            return 0;
        return this.miembros.get(0).getRapidezPensamiento();
    }
}
