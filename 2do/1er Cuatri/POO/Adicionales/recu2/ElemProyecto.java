public abstract class ElemProyecto {
    protected String nombre;

    public ElemProyecto(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String n) {
        this.nombre = n;
    }

    public abstract double getDuracion();
    public abstract double getCosto();
    public abstract Tarea getTareaMayCosto();
    public abstract ElemProyecto getCopia(Condicion c);
}
