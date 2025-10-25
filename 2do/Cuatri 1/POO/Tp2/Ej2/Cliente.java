import java.util.ArrayList;

public class Cliente {

    private String nombre;
    private String dni;
    private ArrayList<CajaAhorro> cuentas = new ArrayList<CajaAhorro>();

    public Cliente(String nombre, String dni){

        if (!dni.matches("\\d{8}")) {
            throw  new IllegalArgumentException("Debe ser un DNI valido. de 8 digitos.");
        }
        this.nombre = nombre;
        this.dni = dni;
    }


    public String extraer(double monto, int nroCuenta){

        for (CajaAhorro cuenta : this.cuentas){
            if(cuenta.getNroCuenta() == nroCuenta){
                return cuenta.extraer(monto);
            }
        }
        return "\nNo existe una cuenta tuya con ese numero de cuenta.";
    }

    public String abrirCuenta(String tipo, double saldoInicial){
        return abrirCuenta(tipo, saldoInicial, 0);
    }

    public String abrirCuenta(String tipo, double saldoInicial, double descubierto){
        if(tipo.equalsIgnoreCase("ca")){
            this.cuentas.add(new CajaAhorro(this, saldoInicial));
            return "\nSe abrio una cuenta de ahorro con exito.";
        } else if(tipo.equalsIgnoreCase("cc")){
            this.cuentas.add(new CuentaCorriente(this, saldoInicial, descubierto));
            return "\nSe abrio una cuenta corriente con exito.";
        }
        return "\nTipo de cuenta no valido. Cuenta NO creada.";
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDni() {
        return dni;
    }


    public void setDni(String dni) {
        this.dni = dni;
    }


    public ArrayList<CajaAhorro> getCuentas() {
        return cuentas;
    }


    public void setCuentas(ArrayList<CajaAhorro> cuentas) {
        this.cuentas = cuentas;
    }


    
}
