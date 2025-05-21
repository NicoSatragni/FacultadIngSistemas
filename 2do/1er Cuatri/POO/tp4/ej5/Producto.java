

public class Producto {

    static private int codProducto;

    public static int getCodProducto() {
        return codProducto;
    }

    public static void setCodProducto(int codProducto) {
        Producto.codProducto = codProducto;
    }
    private int cant;
    private double precio;
    private String nombre;
    private String categoria;
    private int gravamen;

    public Producto(int cant,double precio,String nombre, String categroria, int gravamen){
        this.codProducto = ++codProducto;
        this.cant = cant;
        this.precio = precio;
        this.nombre = nombre;
        this.categoria = categoria;
        this.gravamen = gravamen;
    }

    public int getStock() {
        return cant;
    }

    public void ActualizarStock(int cant) {
        this.cant += cant;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

}