package tp4.ej1;

public abstract class Elemento{
    protected String nombre;
    protected int recurso;

    public Elemento( String nombre, int recurso ) {
        this.nombre = nombre;
        this.recurso = recurso;
    }

    public String getNombre() {
        return this.nombre;
    }
    
    public int getRecurso() {
        return this.recurso;
    }

    public abstract boolean vaAntes(Elemento actual);

}