package A2;

public class CondicionLaboratorio implements CondicionBusqueda {
    private String palabra;

    public CondicionLaboratorio(String palabra) {
        this.palabra = palabra;
    }

    public boolean cumple(Medicamento med) {
        return palabra.equalsIgnoreCase(med.getLaboratorio());
    }
}
