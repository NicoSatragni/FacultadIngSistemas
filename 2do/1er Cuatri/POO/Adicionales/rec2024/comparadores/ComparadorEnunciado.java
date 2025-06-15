package rec2024.comparadores;
import java.util.Comparator;

import rec2024.Pregunta;

public class ComparadorEnunciado implements Comparator<Pregunta> {
    
    public int compare(Pregunta p1, Pregunta p2) {
        return p1.getEnunciado().compareTo(p2.getEnunciado());
    }
}
