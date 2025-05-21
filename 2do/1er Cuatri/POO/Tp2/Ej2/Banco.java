import java.util.ArrayList;
public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.clientes = clientes;
    }

    public String agregarCliente(Cliente cliente){
        this.clientes.add(cliente);
        return "\nCliente agregado existosamente.";
    }

    public String eliminarCliente(Cliente cliente){
        this.clientes.remove(cliente);
        return "\nCliente eliminado exitosamente.";
    }

    public String crearCuenta(String tipo, double saldoInicial, String dni){
        return crearCuenta(tipo, saldoInicial, 0, dni);
    }
    
    public String crearCuenta(String tipo, double saldoInicial, double descubierto, String dni){
        for (Cliente cliente : this.clientes){
            if(cliente.getDni().equals(dni)){
                return cliente.abrirCuenta(tipo, saldoInicial, descubierto);
            }
        }
        return "\nNo existe un cliente con ese DNI.";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }


}
