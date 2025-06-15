package ej1.criterios;
import ej1.Curso;
import java.util.ArrayList;

public class CriterioPClave implements Criterio{
    private ArrayList<String>  pClave;

    CriterioPClave(ArrayList<String> cl) {
        this.pClave = cl;
    }

    @Override
    public boolean cumple(Curso c) {
        return c.getPClave().containsAll(pClave);
    };

}
