package V2;

public class EscuadronAccRapida extends Escuadron {

    @Override
    public double getEnergiaEmocional() {

        double sum  = 0;
        for (ElementoDefensa e : this.miembros) {
            if (e == null) continue;
            sum += e.getEnergiaEmocional();
        }
        return sum;
    }

    @Override
    public double getRapidezPensamiento() {
        double max = 0;
        for (ElementoDefensa e : miembros) {
            if (e == null) continue;
            double temp = e.getRapidezPensamiento();
            max = temp > max ? temp : max;
        }
        return max;
    }

}
