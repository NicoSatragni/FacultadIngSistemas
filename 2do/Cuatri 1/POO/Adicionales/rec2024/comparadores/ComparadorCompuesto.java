package rec2024.comparadores;

import java.util.Comparator;

import rec2024.Pregunta;

public class ComparadorCompuesto implements Comparator<Pregunta>{
    
    private Comparator<Pregunta> c1, c2;

    @Override
    public int compare(Pregunta p1, Pregunta p2) {
        int result = c1.compare(p1, p2);

        if (result == 0) {
            return c2.compare(p1, p2);
        }
        return result;
    }
}
