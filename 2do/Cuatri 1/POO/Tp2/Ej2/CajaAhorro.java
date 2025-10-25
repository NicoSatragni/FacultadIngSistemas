

public class CajaAhorro  extends Cuenta{

    public CajaAhorro(Cliente cliente){
        this(cliente, 0);
    }
    public CajaAhorro(Cliente cliente, double saldo){
        super(cliente, saldo);
    }


    //Extraccion
    protected String extraer(double monto){
        if(puedeExtraer(monto)){
            debitar(monto);
            return mensajeExtExitosa(monto);
        } else{
            return mensajeError(monto);
        }
    }

    //Metodos extraccion

        protected String mensajeExtExitosa(double monto){
            return "\nUsted extrajo " + monto + " de su cuenta. Su saldo ahora es: " + this.saldo;
        }

        protected boolean puedeExtraer(double monto){
            return this.saldo >= monto ? true : false;
        }

        protected String mensajeError(double monto){
            return "\nSaldo insuficiente para realizar esta operacion. Usted quiso extraer: " + monto + " de su cuenta, y posee: " + this.saldo;
        }    
        
        protected void debitar(double monto){
            this.saldo -= monto;
        }

    //Fin extraccion

    public String depositar(double monto){
        this.saldo += monto;
        return "\nDeposito exitoso.";
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Cliente getCliente(){
        return this.cliente;
    }
}
