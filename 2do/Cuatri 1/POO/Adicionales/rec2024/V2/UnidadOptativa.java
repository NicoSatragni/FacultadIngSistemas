
public class UnidadOptativa extends Unidad {
    
    public double getPuntaje() {
        double max = -1;
        for (ElementoEvaluacion elemento : this.hijos) {
            double temp = elemento.getPuntaje();
            if(temp > max)
                max = temp;
        }
        return max;
    }

    public double getTiempoEst() {
        double max = -1;
        for (ElementoEvaluacion elemento : this.hijos) {
            double temp = elemento.getTiempoEst();
            if(temp > max)
                max = temp;
        }
        return max;
    }
}
