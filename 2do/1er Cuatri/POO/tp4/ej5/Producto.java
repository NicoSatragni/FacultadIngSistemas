public class Producto {


    private int codProducto;
    private int cant;
    private double precio;
    private String nombre;
    private String categoria;
    private String gravamen;
    private int minimoPermitido;

    public Producto(int cant,double precio,String nombre, String categroria, String gravamen, int codProducto, int minimoPermitido){
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.cant = cant;
        this.precio = precio;
        this.categoria = categoria;
        this.gravamen = gravamen;
        this.minimoPermitido = minimoPermitido; 
    }

    public boolean enMinimo() {
        return enMinimoPrc(1);
    }

    public boolean enMinimoPrc(double prc) {
        return this.cant <= this.minimoPermitido*prc;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getGravamen() {
        return gravamen;
    }

    public void setGravamen(String gravamen) {
        this.gravamen = gravamen;
    }



    public int getCodProducto() {
        return codProducto;
    }



    public void setCodProducto(int codProducto) {
        this.codProducto = codProducto;
    }



    public int getCant() {
        return cant;
    }



    public void setCant(int cant) {
        this.cant = cant;
    }

    

}