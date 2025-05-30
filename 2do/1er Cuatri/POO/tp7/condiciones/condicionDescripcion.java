package tp7.condiciones;
import tp7.Noticia;
public class condicionDescripcion implements CondicionBusqueda {
    private int longitud;

    public condicionDescripcion(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean cumple(Noticia n) {
        return n.getDescripcion().size() >= longitud; 
    } 
}