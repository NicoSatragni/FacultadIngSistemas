import java.util.ArrayList;


public class Tarea extends ElemProyecto {
    protected ArrayList<String> requisitos;
    protected int duracion;
    protected double costoHora;
    
    public Tarea(String nombre, ArrayList<String> requisitos, int duracion, double costoHora) {
        super(nombre);
        this.requisitos = new ArrayList<>(requisitos);
        this.duracion = duracion;
        this.costoHora = costoHora;
    }

    @Override
    public ElemProyecto getCopia(Condicion c) {
        if (c.cumple(this))
            return new Tarea(this.nombre, this.requisitos, this.duracion, this.costoHora);
        return null;
    }

    @Override
    public double getCosto() {
        return this.costoHora * duracion;
    }

    @Override
    public double getDuracion() {
        return this.duracion;
    }

    @Override
    public Tarea getTareaMayCosto() {
        return this;
    }    
    
}
