package miRecuperatorio.Criterios;

import miRecuperatorio.Tarea;

public class CriterioEstimacionMin extends CriterioCHoraMayor{
    
    public CriterioEstimacionMin(double min) {
        super(min);
    }

    @Override
    public boolean Cumple(Tarea t) {
        return t.getHorasEst() > this.min ? true : false;
    }
}
