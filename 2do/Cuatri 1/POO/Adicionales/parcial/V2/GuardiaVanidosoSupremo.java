package V2;

import java.util.ArrayList;

public class GuardiaVanidosoSupremo extends GuardianMental {
    private final double mult;

    public GuardiaVanidosoSupremo(String nombre, double energia, double rapidez, ArrayList<String> talentos, double mult) {
        super(nombre, energia, rapidez, talentos);
        this.mult = mult;
    }

    @Override
    public double getEnergiaEmocional() {
        return super.getEnergiaEmocional() * mult;
    }

    // FIJATE: debe llamarse exactamente getRapidezPensamiento() para sobrescribir correctamente
    @Override
    public double getRapidezPensamiento() {
        return super.getRapidezPensamiento() * mult;
    }
}
