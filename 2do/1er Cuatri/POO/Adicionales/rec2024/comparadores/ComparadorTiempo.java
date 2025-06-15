package rec2024.comparadores;

import java.util.Comparator;
import rec2024.Pregunta;

public class ComparadorTiempo implements Comparator<Pregunta>{

    @Override
    public int compare(Pregunta t, Pregunta t1) {
        if (t.tiempoEstimado() < t1.tiempoEstimado()) {
            return -1;
        } else if (t.tiempoEstimado() > t1.tiempoEstimado()) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
