package parcial;
import parcial.condiciones.Condicion;
import java.util.ArrayList;

public class SistDefensa {
    private ArrayList<ElementoDefensa> elementos;

    public SistDefensa(ArrayList<ElementoDefensa> elementos) {
        this.elementos = elementos;
    }
    public ArrayList<Guardian> getElementos(Condicion c) {
        ArrayList<Guardian> aux = new ArrayList<Guardian>();
        for (ElementoDefensa e : elementos) {
            aux.addAll(e.getElementos(c));
        }
        return aux;
    }

}