public class PreguntaTiempoVariable extends Pregunta {
    
    private int div;

    @Override
    public double getTiempoEst() {
        return super.getTiempoEst() * super.getConceptos().size() / div;
    }

}
