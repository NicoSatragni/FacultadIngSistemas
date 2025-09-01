package prefinal;
import java.util.ArrayList;

public abstract class ElementoCurso {
    protected String nombre;
    
    public ElementoCurso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public abstract double getDuracion();

    public abstract boolean aprobo(Habitante h);

    public abstract Taller getTallerMayDuracion();

    public abstract ElementoCurso getCopiaSinAprobar(Habitante h);
    
    public abstract double getCreditos();
    
    public abstract ArrayList<String> getPalabrasClaves();
}