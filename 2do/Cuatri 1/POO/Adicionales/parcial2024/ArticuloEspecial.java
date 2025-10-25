
public class ArticuloEspecial extends Articulo {

    private int unidadesConocidas;
    private Criterio c;
    private int precioT, precioF;
    
    



    public ArticuloEspecial(String nombre, String descripcion, double peso, double precio, int unidadesConocidas,
            Criterio c, int precioT, int precioF) {
        super(nombre, descripcion, peso, precio);
        this.unidadesConocidas = unidadesConocidas;
        this.c = c;
        this.precioT = precioT;
        this.precioF = precioF;
    }





    @Override
    public double getPrecio() {
        return c.cumple(this) ? precioT : precioF;
    }
}
