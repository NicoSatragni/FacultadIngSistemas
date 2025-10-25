
public class CriterioPesoMayor implements Criterio {
    private int pesoMin;

    public CriterioPesoMayor(int pesoMin) {
        this.pesoMin = pesoMin;
    }

    @Override
    public boolean cumple(Articulo e) {
        return e.getPeso() > pesoMin;
    }
}
