package Comparadores;
import java.util.Comparator;

import Pregunta;

public class ComparadorEnunciado implements Comparator<Pregunta>{
    @Override
    public int compare(Pregunta p, Pregunta p2) {
        return p.getEnunciado().compareToIgnoreCase(p2.getEnunciado());
    }
}
