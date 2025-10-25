package A2;

public class CondicionCompuesta implements CondicionBusqueda {
    private CondicionBusqueda condicionComp;

    public CondicionCompuesta(CondicionBusqueda condicionComp) {
        this.condicionComp = condicionComp;
    }

    public boolean cumple(Medicamento med) {
        return condicionComp.cumple(med);
    }

    public CondicionBusqueda agregarCondicion(CondicionBusqueda nueva){
        if (condicionComp != null) {
            condicionComp = new CondicionAnd(condicionComp, nueva);
        }
        return nueva;
    }
}
