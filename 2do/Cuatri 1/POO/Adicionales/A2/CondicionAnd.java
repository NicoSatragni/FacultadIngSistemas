package A2;

public class CondicionAnd implements CondicionBusqueda {
    private CondicionBusqueda c1;
    private CondicionBusqueda c2;

    public CondicionAnd(CondicionBusqueda c1, CondicionBusqueda c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public boolean cumple(Medicamento med) {
        return c1.cumple(med) && c2.cumple(med);
    }
}
