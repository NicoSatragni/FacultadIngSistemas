public class Renglon {
    // private String nomProd;
    // private int cantidad;
    // private double precioUnitario;
    private double totalProd;
    private Producto producto;
    private double impNac;
    private double impProv;
    private double descuento;

    // public Renglon(String nomProd, int cantidad, double precioUnitario, double impNac, double impProv, double descuento) {
    public Renglon(Producto producto, double impNac, double impProv, double descuento) {
        // this.nomProd = producto.getNombre();
        // this.cantidad = producto.getCant();
        // this.precioUnitario = producto.getPrecio();
        this.producto = producto;
        this.impNac = impNac;
        this.impProv = impProv;
        this.descuento = -this.producto.getPrecio() * descuento;
        this.totalProd = this.producto.getCant() * (this.producto.getPrecio() + this.impNac + this.impProv + this.descuento);

    }

    @Override
    public String toString() {
        return "\n\n  " + producto.getNombre()  + "              Precio= " + producto.getPrecio() + "\n Cantidad=" + producto.getCant()
                +"\n imp Nacional=" + impNac + "  Prov=" + impProv + " Dcto= " + this.descuento +  "\n       subTotal= " + totalProd;
    }

    public String getNomProd() {
        return this.producto.getNombre();
    }

    public int getCantidad() {
        return this.producto.getCant();
    }

    public double getPrecioUnitario() {
        return this.producto.getPrecio();
    }

    public double getTotalProd() {
        return totalProd;
    }

    public double getImpNac() {
        return impNac;
    }

    public double getImpProv() {
        return impProv;
    }

    public double getDescuento() {
        return descuento;
    }    
}