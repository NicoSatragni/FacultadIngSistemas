
import java.util.ArrayList;

public class ColeccionPrivada extends Coleccion {

    public ColeccionPrivada(String nombre, double valorExtra, ArrayList<ElementoMuseo> articulos) {
        super(null, 0, articulos);
    }

    public ColeccionPrivada(String nombre, double valorExtra) {
        super(null, 0);
    }

    @Override
    public ElementoMuseo getCopia(Criterio c) {
        return null;
    }
    
}
