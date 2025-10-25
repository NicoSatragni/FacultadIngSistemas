package Comparadores;

import java.util.Comparator;

import Pregunta;

public class ComparadorTiempo implements Comparator<Pregunta> {
    
    @Override
    public int compare(Pregunta arg0, Pregunta arg1) {
        return arg0.getTiempoEst() - arg1.getTiempoEst();
    }
}
