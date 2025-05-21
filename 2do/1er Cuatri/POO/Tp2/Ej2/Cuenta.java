

public class Cuenta {
    
    private static int ultimoNroCuenta = 9999;
    protected Cliente cliente;
    protected int nroCuenta;
    protected double saldo;

    public Cuenta(Cliente cliente){
        this(cliente, 0);
    }
    public Cuenta(Cliente cliente, double saldoInicial){
        this.cliente = cliente;
        this.nroCuenta = ++ultimoNroCuenta;
        this.saldo = saldoInicial;
    }


    public static int getUltimoNroCuenta() {
        return ultimoNroCuenta;
    }
    public static void setUltimoNroCuenta(int ultimoNroCuenta) {
        Cuenta.ultimoNroCuenta = ultimoNroCuenta;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public int getNroCuenta() {
        return nroCuenta;
    }
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }



    
}
