package rec2024.condiciones;

import rec2024.ElementoEvaluacion;

public class CondicionPuntajeM implements Condicion {
    private int puntaje;

    @Override
    public boolean cumple(ElementoEvaluacion e) {
        return e.getPuntaje() > puntaje;
    }
}
