package V2.condiciones;

import V2.GuardianMental;

public class CondicionRapidezIgual implements Condicion {
    private final double rapidezBuscada;

    public CondicionRapidezIgual(double rapidezBuscada) {
        this.rapidezBuscada = rapidezBuscada;
    }

    @Override
    public boolean cumple(GuardianMental e) {
        return Double.compare(e.getRapidezPensamiento(), rapidezBuscada) == 0;
    }
}
