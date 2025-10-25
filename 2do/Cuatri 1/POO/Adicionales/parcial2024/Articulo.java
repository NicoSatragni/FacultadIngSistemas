

public class Articulo extends ElementoMuseo {

    private String descripcion;
    private double peso;
    private double precio;


    

    public Articulo(String nombre, String descripcion, double peso, double precio) {
        super(nombre);
        this.descripcion = descripcion;
        this.peso = peso;
        this.precio = precio;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public int getCantidadArt() {
        return 1;
    }

    @Override
    public Articulo getArtMayorPrecio() {
        return this;
    }

    @Override
    public ElementoMuseo getCopia(Criterio c) {
        if(c.cumple(this))
            return new Articulo(this.getNombre(), this.descripcion, this.peso, this.precio);
        return null;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPeso() {
        return peso;
    }
    
}
