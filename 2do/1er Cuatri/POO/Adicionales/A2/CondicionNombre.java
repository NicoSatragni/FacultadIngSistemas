package A2;

public class CondicionNombre implements CondicionBusqueda {
    private String palabra;

    public CondicionNombre(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Medicamento med) {
        return med.getNombre().contains(this.palabra);
    }
}