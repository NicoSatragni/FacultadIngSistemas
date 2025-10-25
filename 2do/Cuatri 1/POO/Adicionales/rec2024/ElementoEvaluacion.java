package rec2024;

import java.util.ArrayList;

public abstract class ElementoEvaluacion {
    protected int puntaje;
    protected int tiempo;

    public abstract double tiempoEstimado();
    public abstract int getPuntaje();
    public abstract ArrayList<String> getConceptos();
}
