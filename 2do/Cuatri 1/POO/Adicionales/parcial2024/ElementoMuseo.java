
public abstract class ElementoMuseo {
    protected String nombre;

    public ElementoMuseo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public abstract double getPrecio();
    public abstract int getCantidadArt();
    public abstract Articulo getArtMayorPrecio();
    public abstract ElementoMuseo getCopia(Criterio c);

}