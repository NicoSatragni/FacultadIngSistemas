public class Renglon {
    private String nomProd;
    private int cantidad;
    private double precioUnitario;
    private double totalProd;
    private double impNac;
    private double impProv;
    private double descuento;

    public Renglon(String nomProd, int cantidad, double precioUnitario, double impNac, double impProv, double descuento) {
        this.nomProd = nomProd;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.impNac = impNac;
        this.impProv = impProv;
        this.descuento = -this.precioUnitario * descuento;
        this.totalProd = this.cantidad * (this.precioUnitario + this.impNac + this.impProv + this.descuento);
    }

    @Override
    public String toString() {
        return "\n\n  " + nomProd  + "              Precio= " + precioUnitario + "\n Cantidad=" + cantidad
                +"\n imp Nacional=" + impNac + "  Prov=" + impProv + " Dcto= " + this.descuento +  "\n       subTotal= " + totalProd;
    }

    public String getNomProd() {
        return nomProd;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
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