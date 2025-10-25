import Criterios.Criterio;

public class UnidadSecuencial extends Unidad {

    @Override
    public double getPuntaje() {
        double puntaje = 0;
        for (ElementoEvaluacion elemento : this.hijos) {
            puntaje += elemento.getPuntaje();
        }
        return puntaje;
    }

    @Override
    public double getTiempoEst() {
        double tEst = 0;
        for (ElementoEvaluacion elemento : this.hijos) {
            tEst += elemento.getTiempoEst();
        }
        return tEst;
    }
}
