public class TareaEspecializada extends Tarea {
    private Condicion c;
    double valorT, valorF;

    @Override
    public double getCosto(Condicion c) {
        return (c.cumple(this)) ? valorT : valorF;
    }
}
