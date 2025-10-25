
import java.util.ArrayList;

public abstract class ElemCurso {
    protected String nombre;


    

    public ElemCurso(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double getDuracion();
    public abstract boolean estaAprobado(Habitante h);
    public abstract ArrayList<String> getPClave();
    public abstract ElemCurso getTrayectoFormativo(Habitante h);
    public abstract double getCreditos();
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
