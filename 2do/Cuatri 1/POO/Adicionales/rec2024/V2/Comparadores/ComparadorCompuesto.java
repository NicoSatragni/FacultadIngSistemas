package Comparadores;
import java.util.Comparator;

import Pregunta;

public class ComparadorCompuesto implements Comparator<Pregunta> {
    
    private Comparator<Pregunta> primero, segundo;

    @Override
    public int compare(Pregunta p1, Pregunta p2) {
        int cmp = primero.compare(p1, p2);
        if(cmp != 0)
            return cmp;
            return segundo.compare(p1, p2);
    }

    
}
