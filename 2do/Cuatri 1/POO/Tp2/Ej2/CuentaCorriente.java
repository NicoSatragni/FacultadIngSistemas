public class CuentaCorriente extends CajaAhorro{
    
    private Cliente cliente;
    
    private double descubierto;
    
    public CuentaCorriente(Cliente cliente, double descubierto) {
        super(cliente);
        this.descubierto = -descubierto;

    }
    public CuentaCorriente(Cliente cliente, double saldo, double descubierto) {
        super(cliente, saldo);
        this.descubierto = -descubierto;
    }

    @Override
    protected boolean puedeExtraer(double monto){
        return (this.saldo - monto) >= this.descubierto;
    }

    @Override
    protected String mensajeExtExitosa(double monto){
        if (this.saldo  < 0){
            return "\nUsted extrajo " + monto + " de su cuenta, Utilizando su descubierto.\nSu saldo ahora es: " + (this.saldo - this.descubierto) + " y su descubierto restante es: " + (this.descubierto - this.saldo);
        } else{
            return "\nUsted extrajo " + monto + " de su cuenta. Su saldo ahora es: " + this.saldo;
        }
    }

    @Override
    protected String mensajeError(double monto){
        return "\nSaldo insuficiente para realizar esta operacion. \nUsted quiso extraer: " + monto + " de su cuenta, y posee: " + this.saldo + " y un descubierto de: " + this.descubierto + " total: " + (this.saldo - this.descubierto);
    }

}
