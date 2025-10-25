package A2;

public class CondicionPrecio implements CondicionBusqueda{
    private int precio;

    public CondicionPrecio(int precio) {
        this.precio = precio;
    }

    public boolean cumple(Medicamento med) {
        return precio > med.getPrecio(); 
    }
}
