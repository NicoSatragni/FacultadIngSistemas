
import java.util.ArrayList;

public class Taller extends ElemCurso {
    protected double calificacionMin;
    protected double duracion;
    protected ArrayList<String> pClave;
    protected Calculator c;

    

    public Taller(String nombre, double calificacionMin, double duracion, ArrayList<String> pClave, Calculator c) {
        super(nombre);
        this.calificacionMin = calificacionMin;
        this.duracion = duracion;
        this.pClave = pClave;
        this.c = c;
    }

    @Override
    public boolean estaAprobado(Habitante h) {
        return h.estaAprobado(this);
    }
    
    @Override
    public double getCreditos() {
        return c.calculate(this);
    }

    @Override
    public double getDuracion() {
        return this.duracion;
    }

    @Override
    public ArrayList<String> getPClave() {
        return new ArrayList<String>(this.pClave);
    }

    @Override
    public ElemCurso getTrayectoFormativo(Habitante h) {
        if(this.estaAprobado(h))
            return null;
        return this;
    }

    public double getNotaMin() {
        return this.calificacionMin;
    }

    

}
