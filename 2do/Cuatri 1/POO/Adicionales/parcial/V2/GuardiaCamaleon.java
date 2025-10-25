package V2;

public class GuardiaCamaleon extends GuardianMental {

    private Calculador c;

    public GuardiaCamaleon(String nombre, double energia, double rapidez, java.util.ArrayList<String> talentos, Calculador c) {
        super(nombre, energia, rapidez, talentos);
        this.c = c;
    }

    public void setCalculador(Calculador c) {
        this.c = c;
    }

    @Override
    public double getRapidezPensamiento() {
        if (c == null) return super.getRapidezPensamiento();
        return c.calculate(this);
    }

}
