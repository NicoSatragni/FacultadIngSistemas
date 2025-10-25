package V2;

import java.util.ArrayList;
import java.util.Objects;

import V2.condiciones.Condicion;

public class GuardianMental extends ElementoDefensa implements Comparable<GuardianMental> {
    private final String nombre;
    private final double energiaEmocional;
    private final double rapidezPensamiento;
    private final ArrayList<String> talentosPsiquicos;

    public GuardianMental(String nombre, double energiaEmocional, double rapidezPensamiento, ArrayList<String> talentosPsiquicos) {
        this.nombre = Objects.requireNonNull(nombre);
        this.energiaEmocional = energiaEmocional;
        this.rapidezPensamiento = rapidezPensamiento;
        // inicializar copia defensiva de talentos
        this.talentosPsiquicos = talentosPsiquicos == null ? new ArrayList<>() : new ArrayList<>(talentosPsiquicos);
    }

    @Override
    public double getEnergiaEmocional() {
        return this.energiaEmocional;
    }

    @Override
    public double getRapidezPensamiento() {
        return this.rapidezPensamiento;
    }

    @Override
    public ArrayList<String> getTalentosPsiquicos() {
        return new ArrayList<String>(this.talentosPsiquicos);
    }

    @Override
    public ArrayList<GuardianMental> buscarGuardianes(Condicion c) {
        ArrayList<GuardianMental> rtn = new ArrayList<GuardianMental>();
        if (c != null && c.cumple(this))
            rtn.add(this);
        return rtn;
    }

    @Override
    public int compareTo(GuardianMental g) {
        // ordenar DESC por energia, si empata DESC por rapidez, si empata DESC por cantidad de talentos
        int cmp = Double.compare(g.getEnergiaEmocional(), this.getEnergiaEmocional());
        if (cmp != 0) return cmp;
        cmp = Double.compare(g.getRapidezPensamiento(), this.getRapidezPensamiento());
        if (cmp != 0) return cmp;
        return Integer.compare(g.getTalentosPsiquicos().size(), this.getTalentosPsiquicos().size());
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return String.format("%s [E=%.2f, R=%.2f, T=%d]",
            nombre,
            getEnergiaEmocional(),
            getRapidezPensamiento(),
            getTalentosPsiquicos().size());
    }
}
