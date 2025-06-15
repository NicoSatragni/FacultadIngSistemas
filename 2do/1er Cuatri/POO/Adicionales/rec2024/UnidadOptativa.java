package rec2024;

public class UnidadOptativa extends UnidadEvaluacion {


    @Override
    public int getPuntaje() {
        int max = 0;
        for (ElementoEvaluacion elemento : contenido) {
            if (elemento.getPuntaje() > max) {
                max = elemento.getPuntaje();
            }
        }
        return max;
    }

    @Override
    public double tiempoEstimado() {
        double max = 0;
        for (ElementoEvaluacion elemento : contenido) {
            if (elemento.getPuntaje() > max) {
                max = elemento.getPuntaje();
            }
        }
        return max;
    }


    
    
}
