
public class CriterioPrecioMayor implements Criterio {
    private int minPrecio;

    public CriterioPrecioMayor(int minPrecio) {
        this.minPrecio = minPrecio;
    }

    @Override
    public boolean cumple(Articulo e) {
        return e.getPrecio() > minPrecio;
    }

    
}
