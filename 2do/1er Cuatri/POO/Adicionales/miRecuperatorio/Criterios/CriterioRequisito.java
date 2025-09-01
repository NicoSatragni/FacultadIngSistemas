package miRecuperatorio.Criterios;
import miRecuperatorio.Tarea;

public class CriterioRequisito implements Criterio{
    private String requisito;

    @Override
    public boolean Cumple(Tarea t) {
        for (String reqString : t.getRequisitos()) {
            if (this.requisito.equalsIgnoreCase(reqString)) {
                return true;
            }
        }
        return false;
    }
}
