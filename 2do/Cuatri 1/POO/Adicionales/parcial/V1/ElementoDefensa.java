package parcial;
import java.util.ArrayList;
import parcial.condiciones.Condicion;

public abstract class ElementoDefensa {
    protected String nombre;

    public String getNombre() {
        return nombre;
    }


    public abstract double getEnergia();
    public abstract double getRapidez();
    public abstract ArrayList<String> getTalentos();
    public abstract ArrayList<Guardian> getElementos(Condicion c);
}
