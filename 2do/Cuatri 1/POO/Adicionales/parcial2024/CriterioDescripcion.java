
public class CriterioDescripcion implements Criterio {
    String frase;

    public CriterioDescripcion(String frase) {
        this.frase = frase.toLowerCase();
    }

    @Override
    public boolean cumple(Articulo a) {
        return a.getDescripcion().toLowerCase().contains(frase);
    }

}
