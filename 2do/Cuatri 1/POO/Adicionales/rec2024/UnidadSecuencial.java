package rec2024;
public class UnidadSecuencial extends UnidadEvaluacion {

    @Override
    public int getPuntaje() {
        int suma = 0;
        for (ElementoEvaluacion elemento : this.contenido) {
            suma += elemento.getPuntaje();
        }
        return suma;
    }

    @Override
    public double tiempoEstimado() {
        double suma = 0;
        for (ElementoEvaluacion elemento : contenido) {
            suma += elemento.tiempoEstimado();
        }
        return suma;
    }

}
