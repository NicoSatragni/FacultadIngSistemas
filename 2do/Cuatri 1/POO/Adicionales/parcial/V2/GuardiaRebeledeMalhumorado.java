package V2;

import java.util.ArrayList;

public class GuardiaRebeledeMalhumorado extends GuardianMental {
    private final double redPensamiento;
    private final double divEnergia;

    public GuardiaRebeledeMalhumorado(String nombre, double energia, double rapidez, ArrayList<String> talentos, double redPensamiento, double divEnergia) {
        super(nombre, energia, rapidez, talentos);
        this.redPensamiento = redPensamiento;
        this.divEnergia = divEnergia;
    }

    // convenient constructors for the two variants:
    public static GuardiaRebeledeMalhumorado rebelde(String nombre, double energia, double rapidez, ArrayList<String> talentos) {
        return new GuardiaRebeledeMalhumorado(nombre, energia, rapidez, talentos, 20.0, 5.0);
    }

    public static GuardiaRebeledeMalhumorado malhumorado(String nombre, double energia, double rapidez, ArrayList<String> talentos) {
        return new GuardiaRebeledeMalhumorado(nombre, energia, rapidez, talentos, 35.0, 9.0);
    }

    @Override
    public double getEnergiaEmocional() {
        return super.getEnergiaEmocional() / divEnergia;
    }

    @Override
    public double getRapidezPensamiento() {
        return super.getRapidezPensamiento() - redPensamiento;
    }

    @Override
    public ArrayList<String> getTalentosPsiquicos() {
        ArrayList<String> base = super.getTalentosPsiquicos();
        ArrayList<String> out = new ArrayList<>();
        if (!base.isEmpty()) out.add(base.get(0));
        return out;
    }

}
