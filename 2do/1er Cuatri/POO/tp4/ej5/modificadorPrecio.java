public abstract class modificadorPrecio{
    protected String codigo;
    protected double valor;

    public modificadorPrecio(String codigo, double valor){
        this.codigo = codigo;
        this.valor = valor;
    }

    public double abstract aplicar(double precio);
}