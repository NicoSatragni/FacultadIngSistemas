package rec2024.comparadores;

import java.util.Comparator;

import rec2024.Pregunta;

public class ComparadorPuntaje implements Comparator<Pregunta>{

    @Override
    public int compare(Pregunta t, Pregunta t1) {
        return (t.getPuntaje() - t1.getPuntaje());
    }
}
